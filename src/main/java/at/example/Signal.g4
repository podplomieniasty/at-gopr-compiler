grammar Signal;

/*
 * Target grammar is
 * Name: d4 ^ (w1 v w2) => {route: "Name", difficulty: 4, alarm: 'E5'}
 * or
 * d4 ^ (w1 v w2) => json of signals on designated routes
 */

prog                : line EOF;
line                : route AND parenthesis_expr ;
route               : DIFFICULTY ;
parenthesis_expr    : '(' expr ')' ;
expr                : weather_condition
                    | weather_condition OTHER expr ;
weather_condition   : WEATHER
                    | AVALANCHE ;


/*
 * Lexer rules
 */

fragment W      : ('W'|'w') ;
fragment F      : ('F'|'f') ;
fragment T      : ('T'|'t') ;
fragment R      : ('R'|'r') ;
fragment A      : ('A'|'a') ;
fragment D      : ('D'|'d') ;

WEATHER         : ( W | F | T | R ) WEATHER_LEVEL ;
DIFFICULTY      : D DIFFICULTY_LEVEL;
AVALANCHE       : A AVALANCHE_LEVEL ;

DIFFICULTY_LEVEL    : [1-4] ;
WEATHER_LEVEL       : [1-3] ;
AVALANCHE_LEVEL     : [1-5] ;
AND                 : '^' ;
OTHER               : 'v' ;
WS                  : [ \t\n\r]+ -> skip ;
NEWLINE             : ('\r'? '\n' | '\r')+ ;
