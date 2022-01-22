package io.gauee.numismatist.items.model;

public enum AlloyType {
    Gold("Au"),
    Silver("Ag");

    private final String symbol;

    AlloyType(String symbol) {
        this.symbol = symbol;
    }
}
