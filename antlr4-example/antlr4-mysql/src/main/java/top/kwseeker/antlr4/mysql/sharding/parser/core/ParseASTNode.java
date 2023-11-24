package top.kwseeker.antlr4.mysql.sharding.parser.core;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import top.kwseeker.antlr4.mysql.sharding.api.ASTNode;

import java.util.Collection;
import java.util.LinkedList;

/**
 * 解析后生成的语法树
 */
public class ParseASTNode implements ASTNode {

    //真正的语法树
    private final ParseTree parseTree;
    //词法符号流，通过此流解析生成上面的树
    private final CommonTokenStream tokenStream;


    public ParseASTNode(ParseTree parseTree, CommonTokenStream tokenStream) {
        this.parseTree = parseTree;
        this.tokenStream = tokenStream;
    }

    public ParseTree getRootNode() {
        //ParseTree顶点有两个子节点，index=1的总是`<EOF>`
        return parseTree.getChild(0);
    }

    //参考　＜ANTLR4权威指南＞ 词法符号信道　TODO
    public Collection<Token> getHiddenTokens() {
        Collection<Token> result = new LinkedList<>();
        for (Token each : tokenStream.getTokens()) {
            if (Token.HIDDEN_CHANNEL == each.getChannel()) {
                result.add(each);
            }
        }
        return result;
    }
}
