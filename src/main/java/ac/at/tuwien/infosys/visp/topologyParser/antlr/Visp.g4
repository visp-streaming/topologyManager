grammar Visp;

configfile : nodeBlock+ ;
nodeBlock  : nodeHead '{' nodeBody '}' ;
nodeHead : newNodeId '=' nodeType '(' ( | sourceNode | sourceNode (',' sourceNode)*) ')' ;
newNodeId : ID ;
sourceNode : ID ;
nodeBody : | statement | statement (',' statement)* ','?;
statement : allowedLocationsStmt | inputFormatStmt | mechanismStmt | typeStmt | outputFormatStmt |
  statefulStmt | concreteLocationStmt | sizeStmt | expectedDurationStmt | scalingCPUThresholdStmt |
  scalingMemoryThresholdStmt | queueThreshold | replicationAllowedStmt | pinnedStmt;
allowedLocationsStmt : 'allowedLocations' '=' LOCATION*;
concreteLocationStmt : 'concreteLocation' '=' LOCATION;
inputFormatStmt : 'inputFormat' '=' STRING+ ;
mechanismStmt : 'mechanism' '=' STRING ;
typeStmt : 'type' '=' STRING ;
outputFormatStmt : 'outputFormat' '=' STRING ;
statefulStmt : 'stateful' '=' BOOLEAN ;
nodeType : SOURCE | OPERATOR | SINK ;
sizeStmt : 'size' '=' sizeType ;
sizeType : ('small' | 'medium' | 'large') ;
expectedDurationStmt : 'expectedDuration' '=' NUMBER ;
scalingCPUThresholdStmt : 'scalingCPUThreshold' '=' NUMBER ;
scalingMemoryThresholdStmt : 'scalingMemoryThreshold' '=' NUMBER ;
queueThreshold : 'queueThreshold' '=' NUMBER ;
replicationAllowedStmt : 'replicationAllowed' '=' BOOLEAN ;
pinnedStmt : 'pinned' '=' BOOLEAN ;
NUMBER : DOUBLE | INT ;
LOCATION : IP_ADDRESS SLASH RESOURCEPOOL ;
SLASH : '/' ;
STAR : '*' ;
BOOLEAN : 'true' | 'false' ;
IP_ADDRESS : OCTET '.' OCTET '.' OCTET '.' OCTET ;
OCTET
  :  DIGIT DIGIT DIGIT
  |  DIGIT DIGIT
  |  DIGIT
  ;
DIGIT :  '0'..'9' ;
SOURCE : 'Source' ;
OPERATOR : 'Operator' ;
SINK : 'Sink' ;
STRING      :   '"' ('\\"'|.)*? '"' | (LETTER | [0-9])+ ;
ID  :   '$' LETTER (LETTER | [0-9])* ;
RESOURCEPOOL : STRING | STAR;


fragment
LETTER : [a-zA-Z] ;
INT :   [0-9]+ ;
fragment DOUBLE :   '0'..'9'+'.''0'..'9'+ ;
PREPROC     :   '#' .*? '\n' -> skip ;
WS          :   [ \t\n\r]+ -> skip ;