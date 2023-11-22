//可以匹配一个加减乘除带括号的算术表达式、一个赋值的加减乘除带括号的算术表达式、或者一个直接'\r\n'、'\n'换行的空行。
//antlr4 -no-listener -visitor -package top.kwseeker.antlr4.examples.calc.autogen -o autogen ExprCalc.g4
grammar ExprCalc;

// r : ...;
prog:   stat+ ;

//r : ... | ... | ... ;
stat:   expr NEWLINE            # printExpr
    |   ID '=' expr NEWLINE     # assign 	  //x y ... z
    |   NEWLINE                 # blank
    ;

//这里的子规则排序是有讲究的，调换顺序可能解析出错误的语法树
expr:   expr ('*'|'/') expr   	# MulDiv	  //(... | ... | ...)，此处('*'|'/')是一个子规则，表示用*或/连接
    |   expr ('+'|'-') expr     # AddSub
    |   INT                     # int
    |   ID                      # id
    |   '(' expr ')'         		# parens    //x y ... z, parens：括号
    ;

MUL :   '*' ;
DIV :   '/' ;
ADD :   '+' ;
SUB :   '-' ;

ID  :   [a-zA-Z]+ ;      // x+
INT :   [0-9]+ ;         // x+
NEWLINE:'\r'? '\n' ;     // x y ... z，可以匹配 '\r\n'、'\n'
WS  :   [ \t]+ -> skip ;