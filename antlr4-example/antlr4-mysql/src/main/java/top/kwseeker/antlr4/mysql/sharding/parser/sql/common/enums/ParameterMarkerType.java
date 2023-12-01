package top.kwseeker.antlr4.mysql.sharding.parser.sql.common.enums;

public enum ParameterMarkerType {
    QUESTION("?"),
    DOLLAR("$");

    private final String marker;

    private ParameterMarkerType(String marker) {
        this.marker = marker;
    }

    public String getMarker() {
        return this.marker;
    }
}
