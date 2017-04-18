package ac.at.tuwien.infosys.visp.topologyParser;

import ac.at.tuwien.infosys.visp.common.operators.*;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.*;

public class SplitJoinTest {

    static Map<String, Operator> topology;

    static Logger logger = Logger.getLogger(SplitJoinTest.class);

    @BeforeClass
    public static void setUp() {
        logger.info("Running Split-Join Test...");
        TopologyParser parser = new TopologyParser();

        TopologyParser.ParseResult topology = parser.parseTopologyFromClasspath("split_join.conf");
        logger.debug("This topology has been generated:");

        for(Operator o : topology.topology.values()) {
            logger.debug(o.toString());
        }

        SplitJoinTest.topology = topology.topology;
    }


    @Test
    public void test_correctType() {
        if (topology != null) {
            Operator op = topology.get("step2b");
            String type = op.getType();
            Assert.assertEquals("step2b", type);
        }
    }

    @Test
    public void test_correctSource() {
        Assert.assertEquals("split", topology.get("step2a").getSources().get(0).getName());
        Assert.assertEquals(0, topology.get("source").getSources().size());
    }

    @Test
    public void test_pathOrder_returnsCorrectIdentifiers() {
        Assert.assertEquals("step2a", ((Split)topology.get("split")).getPathOrder().get(0));
        Assert.assertEquals("step2b", ((Split)topology.get("split")).getPathOrder().get(1));
    }

    @Test
    public void test_joinHasCorrectNumberOfSources() {
        Assert.assertEquals(2, topology.get("join").getSources().size());
    }

    @Test
    public void test_joinHasCorrectSources() {
        List<String> sources = new ArrayList<>();
        for(Operator s : topology.get("join").getSources()) {
            sources.add(s.getName());
        }

        Assert.assertTrue(sources.contains("step3"));
        Assert.assertTrue(sources.contains("step2b"));
    }

    @Test
    public void test_sinkIsReachable() {
        String sourceId = "source";

        Queue<String> toVisit = new LinkedList<>();
        String currentNode = "log";
        toVisit.add(currentNode);
        while(!toVisit.isEmpty()) {
            currentNode = toVisit.remove();
            if(currentNode.equals(sourceId)) {
                Assert.assertTrue(true);
                return;
            }
            if(topology.get(currentNode).getSources().size() > 0) {
                for(Operator o : topology.get(currentNode).getSources()) {
                    toVisit.add(o.getName());
                }
            }
        }
        Assert.assertTrue("Not able to reach source from sink", false);
    }





}
