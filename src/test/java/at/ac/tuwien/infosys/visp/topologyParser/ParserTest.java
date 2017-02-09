package at.ac.tuwien.infosys.visp.topologyParser;

import at.ac.tuwien.infosys.visp.common.operators.Operator;
import at.ac.tuwien.infosys.visp.common.operators.ProcessingOperator;
import at.ac.tuwien.infosys.visp.common.operators.Sink;
import at.ac.tuwien.infosys.visp.common.operators.Source;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Map;

public class ParserTest {

    static Map<String, Operator> topology;

    static Logger logger = Logger.getLogger(ParserTest.class);

    @BeforeClass
    public static void setUp() {
        TopologyParser parser = new TopologyParser();

        parser.loadTopologyFromClasspath("sequence_v2.conf");
        logger.debug("This topology has been generated:");

        for(Operator o : parser.getTopology().values()) {
            logger.debug(o.toString());
        }

        ParserTest.topology = parser.getTopology();
    }


    @Test
    public void test_correctType() {
        if (topology != null) {
            Operator op = topology.get("step5");
            String type = op.getType();
            Assert.assertEquals("step5", type);
        }
    }

    @Test
    public void test_correctSource() {
        Assert.assertEquals("step4", topology.get("step5").getSources().get(0).getName());
        Assert.assertEquals("step1", topology.get("step2").getSources().get(0).getName());
        Assert.assertEquals(0, topology.get("source").getSources().size());
    }

    @Test
    public void test_correctSize() {
        Assert.assertEquals(Operator.Size.LARGE, topology.get("step4").getSize());
        Assert.assertEquals(Operator.Size.SMALL, topology.get("step3").getSize());
        Assert.assertEquals(Operator.Size.MEDIUM, topology.get("step5").getSize());
    }

    @Test
    public void test_correctInputFormat() {
         Assert.assertTrue(topology.get("step3").getInputFormat().contains("temperature"));
         Assert.assertTrue(topology.get("step3").getInputFormat().contains("machine1 output data"));
         Assert.assertTrue(topology.get("step3").getInputFormat().contains("sensor 4 output data"));
    }

    @Test
    public void test_allowedLocations() {
        Assert.assertTrue(topology.get("step3").getAllowedLocationsList().contains(new Operator.Location("192.168.0.1", "openstackpool1")));
        Assert.assertTrue(topology.get("step3").getAllowedLocationsList().contains(new Operator.Location("192.168.0.2", "amazoncloud")));
    }

    @Test
    public void test_expectedDuration() {
        Assert.assertEquals(15.2, ((ProcessingOperator)topology.get("step2")).getExpectedDuration(), 0.001);
    }

    @Test
    public void test_scalingCPUThreshold() {
        Assert.assertEquals(20.4, ((ProcessingOperator)topology.get("step2")).getScalingCPUThreshold(), 0.001);
    }

    @Test
    public void test_scalingMemoryThreshold() {
        Assert.assertEquals(55.1, ((ProcessingOperator)topology.get("step2")).getScalingMemoryThreshold(), 0.001);
    }

    @Test
    public void test_queueThreshold() {
        Assert.assertEquals(11.0, ((ProcessingOperator)topology.get("step2")).getQueueThreshold(), 0.001);
    }

    @Test
    public void test_actualLocationIsNotNull() {
        Assert.assertNotNull(topology.get("source").getConcreteLocation());
        Assert.assertNotNull(topology.get("step1").getConcreteLocation());
        Assert.assertNotNull(topology.get("step2").getConcreteLocation());
        Assert.assertNotNull(topology.get("step3").getConcreteLocation());
        Assert.assertNotNull(topology.get("step4").getConcreteLocation());
        Assert.assertNotNull(topology.get("step5").getConcreteLocation());

    }

    @Test
    public void test_isStateful() {
        Assert.assertFalse(topology.get("source").isStateful());
        Assert.assertTrue(topology.get("step2").isStateful());
    }

    @Test
    public void test_nodesHaveCorrectClasses() {
        Assert.assertTrue(topology.get("source") instanceof Source);
        Assert.assertTrue(topology.get("step1") instanceof ProcessingOperator);
        Assert.assertTrue(topology.get("step2") instanceof ProcessingOperator);
        Assert.assertTrue(topology.get("step3") instanceof ProcessingOperator);
        Assert.assertTrue(topology.get("step4") instanceof ProcessingOperator);
        Assert.assertTrue(topology.get("step5") instanceof ProcessingOperator);
        Assert.assertTrue(topology.get("log") instanceof Sink);

        Assert.assertTrue(topology.get("source") instanceof Operator);
        Assert.assertTrue(topology.get("step1") instanceof Operator);
        Assert.assertTrue(topology.get("log") instanceof Operator);

        Assert.assertFalse(topology.get("step3") instanceof Sink);
        Assert.assertFalse(topology.get("step3") instanceof Source);
        Assert.assertFalse(topology.get("source") instanceof ProcessingOperator);
        Assert.assertFalse(topology.get("sink") instanceof ProcessingOperator);

    }


}
