/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

grammar Groupoid;

group : ID '{' member? ( ',' member )* '}';

member : ID weight position ;

weight : FLOAT ;

position : '(' FLOAT ',' FLOAT ')' ;

ID : ('a' .. 'z' | 'A' .. 'Z' | '0'..'9')+ ;

FLOAT : NUM+ '.' NUM+ ;

NUM : '0'..'9';

WS : [ \t\r\n]+ -> skip ;