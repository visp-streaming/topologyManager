package at.tuwien.infosys;

import at.tuwien.infosys.parser.NewTopologyParser;
import entities.operators.Operator;
import entities.operators.ProcessingOperator;
import entities.operators.Sink;
import entities.operators.Source;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

import static org.junit.Assert.assertTrue;


public class ParserTest {

    static Map<String, Operator> topology;

    static Logger logger = LoggerFactory.getLogger(ParserTest.class);

    @BeforeClass
    public static void setUp() {
        NewTopologyParser parser = new NewTopologyParser();

        // TODO: load topology from class path
        //parser.loadTopologyFromClassPath("topologyConfiguration/sequence_v2.conf");
        parser.loadTopologyFromFileSystem("/projects/dsg_practical/code/VISP-Runtime-dev/src/main/resources/topologyConfiguration/sequence_v2.conf");


        logger.info("This topology has been generated:");

        for(Operator o : parser.getTopology().values()) {
            logger.info(o.toString());
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
        Assert.assertEquals(Operator.Size.MEDIUM, topology.get("log").getSize());
    }

    @Test
    public void test_correctInputFormat() {
        for(String location : topology.get("source").getInputFormat()) {
            logger.info(location);
            if(location.equals("sourceData")) {
                assertTrue(true);
                return;
            }
        }
        assertTrue(false);
    }

    @Test
    public void test_allowedLocations() {
        for(Operator.Location location : topology.get("source").getAllowedLocationsList()) {
            if(location.getIpAddress().equals("192.168.0.1")) {
                assertTrue(true);
                return;
            }
        }
        assertTrue(false);
    }

    @Test
    public void test_allowedLocationsResourcePool() {
        for(Operator.Location location : topology.get("source").getAllowedLocationsList()) {
            if(location.getResourcePool().equals("openstackpool")) {
                assertTrue(true);
                return;
            }
        }
        assertTrue(false);
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
