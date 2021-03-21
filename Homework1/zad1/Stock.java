package com;

public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public String getName() {
        return this.name;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setPreviousClosingPrice(double price) {
        this.previousClosingPrice = price;
    }

    public void setCurrentPrice(double price) {
        this.currentPrice = price;
    }

    public double changePercent() {
        return ((currentPrice - previousClosingPrice)/previousClosingPrice)*100;
    }

}
