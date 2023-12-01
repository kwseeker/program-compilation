package top.kwseeker.antlr4.mysql.sharding.parser.sql.common.segment.dml;

import top.kwseeker.antlr4.mysql.sharding.infra.database.DatabaseType;
import top.kwseeker.antlr4.mysql.sharding.parser.sql.common.enums.NullsOrderType;
import top.kwseeker.antlr4.mysql.sharding.parser.sql.common.enums.OrderDirection;
import top.kwseeker.antlr4.mysql.sharding.parser.sql.common.segment.SQLSegment;

import java.util.Optional;

/**
 * order by xxx 语句中的 xxx
 */
public abstract class OrderByItemSegment implements SQLSegment {
    //xxx 在 SQL语句中的起始索引
    private final int startIndex;
    //xxx 在 SQL语句中的结束索引
    private final int stopIndex;
    //升序还是降序
    private final OrderDirection orderDirection;
    //NULL值排序，最前或最后
    private final NullsOrderType nullsOrderType;

    public OrderByItemSegment(int startIndex, int stopIndex, OrderDirection orderDirection, NullsOrderType nullsOrderType) {
        this.startIndex = startIndex;
        this.stopIndex = stopIndex;
        this.orderDirection = orderDirection;
        this.nullsOrderType = nullsOrderType;
    }

    @Override
    public int getStartIndex() {
        return startIndex;
    }

    @Override
    public int getStopIndex() {
        return stopIndex;
    }

    public OrderDirection getOrderDirection() {
        return orderDirection;
    }

    /**
     * Get nulls order type.
     *
     * @return nulls order type
     */
    public Optional<NullsOrderType> getNullsOrderType() {
        return Optional.ofNullable(nullsOrderType);
    }
    
    /**
     * Get nulls order type.
     * 
     * @param databaseType database type
     * @return nulls order type
     */
    //public NullsOrderType getNullsOrderType(final DatabaseType databaseType) {
    //    if (null != nullsOrderType) {
    //        return nullsOrderType;
    //    }
    //    DialectDatabaseMetaData dialectDatabaseMetaData = new DatabaseTypeRegistry(databaseType).getDialectDatabaseMetaData();
    //    return OrderDirection.ASC == orderDirection ? dialectDatabaseMetaData.getDefaultNullsOrderType()
    //            : dialectDatabaseMetaData.getDefaultNullsOrderType().getReversedOrderType();
    //}
}