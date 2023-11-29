package top.kwseeker.antlr4.mysql.sharding.parser.core.visitor;

import org.antlr.v4.runtime.tree.ParseTree;
import top.kwseeker.antlr4.mysql.sharding.parser.sql.common.statement.SQLStatementType;

public enum SQLVisitorRule {
    SELECT("Select", SQLStatementType.DML);

    SQLVisitorRule(String name, SQLStatementType type) {
        this.name = name;
        this.type = type;
    }

    private final String name;
    private final SQLStatementType type;

    public SQLStatementType getType() {
        return type;
    }

    private String getContextName() {
        return name + "Context";
    }

    public static SQLVisitorRule valueOf(final Class<? extends ParseTree> parseTreeClass) {
        String parseTreeClassName = parseTreeClass.getSimpleName();
        for (SQLVisitorRule each : values()) {
            if (each.getContextName().equals(parseTreeClassName)) {
                return each;
            }
        }
        throw new RuntimeException("No SQLVisitorRule for " + parseTreeClassName);
    }
}
