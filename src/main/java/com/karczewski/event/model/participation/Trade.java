package com.karczewski.event.model.participation;

public enum Trade {

    TRADE_ONE("Górnictwo"),
    TRADE_TWO("Rolnictwo"),
    TRADE_THREE("Spożywczy");

    private final String trade;

    Trade(final String trade) {
        this.trade = trade;
    }

    @Override
    public String toString() {
        return trade;
    }

}
