grammar Visp;

configfile : nodeBlock+ ;
nodeBlock  : nodeHead '{' nodeBody '}' ;
nodeHead : newNodeId '=' nodeType '(' ( | sourceNode | sourceNode (',' sourceNode)*) ')' ;
newNodeId : ID ;
sourceNode : ID ;
nodeBody : | statement | statement (',' statement)* ','?;
statement : allowedLocationsStmt | inputFormatStmt | sourceStmt | mechanismStmt | typeStmt | outputFormatStmt | statefulStmt | concreteLocationStmt ;
allowedLocationsStmt : 'allowedLocations' '=' IP_ADDRESS*;
concreteLocationStmt : 'concreteLocation' '=' IP_ADDRESS;
inputFormatStmt : 'inputFormat' '=' STRING ;
sourceStmt : 'source' '=' STRING ;
mechanismStmt : 'mechanism' '=' STRING ;
typeStmt : 'type' '=' STRING ;
outputFormatStmt : 'outputFormat' '=' STRING ;
statefulStmt : 'stateful' '=' BOOLEAN ;
nodeType : SOURCE | OPERATOR | SINK ;
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
STRING      :   '"' ('\\"'|.)*? '"' | (LETTER | [0-9])+;
ID  :   '$' LETTER (LETTER | [0-9])* ;

fragment
LETTER : [a-zA-Z] ;
INT :   [0-9]+ ;

PREPROC     :   '#' .*? '\n' -> skip ;
WS          :   [ \t\n\r]+ -> skip ;