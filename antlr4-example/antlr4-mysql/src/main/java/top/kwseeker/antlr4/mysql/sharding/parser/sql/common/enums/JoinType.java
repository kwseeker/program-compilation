package top.kwseeker.antlr4.mysql.sharding.parser.sql.common.enums;

public enum JoinType {
    //联结分类：
    //内联结（MySQL INNER, CROSS 都是内联结，完全等效）自然内联结也归到这个类型了
    INNER, CROSS,
    //使用逗号联结，也是内联结
    COMMA,
    //外联结（两种：左外联结、右外联结）自然左外联结、自然右外联结也归到这个类型了
    LEFT, RIGHT,
    //全外联结, Access、MariaDB、MySQL、Open Office Base、SQLite不支持 FULL OUTER JOIN 语法
    FULL
}