package ac.at.tuwien.infosys.visp.topologyParser;


import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;


public class TopologyWriteTest {
    TopologyParser topologyParser;

    @Before
    public void init() {
        topologyParser = new TopologyParser();
    }


    @Test
    public void test_identicalTopologies_noChanges() throws IOException {
        TopologyParser.ParseResult pr = topologyParser.parseTopologyFromClasspath("split_join_sequence.conf");
        assertTrue(pr.topology.containsKey("step2"));
        String outPath = topologyParser.generateTopologyFile(pr.topology);

        String content = new String(Files.readAllBytes(Paths.get(outPath)));

        String[] split = content.split("Split");
        String[] split2 = split[1].split("}");
        assertTrue(split2[0].contains("pathOrder"));
        assertFalse(split2[0].contains("concreteLocation"));
    }


}