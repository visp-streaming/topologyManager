package ac.at.tuwien.infosys.visp.topologyParser;



import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



import static org.junit.Assert.assertTrue;


public class TopologySyntaxTest {
    TopologyParser topologyParser;

    @Before
    public void init() {
        topologyParser = new TopologyParser();
    }


    @Test
    public void test_identicalTopologies_noChanges() {
        TopologyParser.ParseResult pr = topologyParser.parseTopologyFromClasspath("topology_underscore_test.conf");
        assertTrue(pr.topology.containsKey("step1_a"));
        assertTrue(pr.topology.get("step1_a").getConcreteLocation().getResourcePool().equals("openstack_cloud"));
    }


}