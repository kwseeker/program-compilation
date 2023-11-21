//antlr4-parse Hello.g4 r -tokens
//hello Arvin
//[@0,0:4='hello',<'hello'>,1:0]
//[@1,6:10='Arvin',<ID>,1:6]
//[@2,12:11='<EOF>',<EOF>,2:0]
grammar Hello;              //定义一个名为 Hello 的语法，与文件名要相同
r  : 'hello' ID ;           //词法规则，结合后面的附加规则这里表示这个规则匹配“忽略空格、Tab、换行、回车后以hello开头紧接着全为小写字母的字符串
//r_hello  : 'hello' ID ;     //规则名字任意
ID : [a-z]+ ;               //ID是什么标签？ 匹配至少一个小写字母组成的标识符
WS : [ \r\t\n]+ -> skip ;   //什么缩写？忽略空格、Tab、换行、回车
