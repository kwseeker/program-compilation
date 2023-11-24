package top.kwseeker.antlr4.mysql.sharding.infra.database.mysql;

import top.kwseeker.antlr4.mysql.sharding.infra.database.DatabaseType;

public class MySQLDatabaseType implements DatabaseType {

    @Override
    public String getType() {
        return "MySQL";
    }
}
