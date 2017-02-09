# TopologyParser

This antlr-based parser is used to read configuration files
in the *VISP Topology Description Language* format.

The parser returns a map consisting of
(operator name) => (operator) mappings for the whole topology.

## Changelog

### v1.1

* Added new attributes `expectedDuration`, `scalingCPUThreshold`,
`scalingMemoryThreshold`, `queueThreshold`, `replicationAllowed` and `pinned`.
* More sophisticated logging
* Automatic detection of operators that are not used as sources
