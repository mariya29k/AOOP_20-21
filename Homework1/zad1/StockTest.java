package com;


public class StockTest {
    public static void main(String[] args) {
        Stock stock = new Stock("YES", "VASE");
        System.out.println(stock);

        stock.setPreviousClosingPrice(50);
        stock.setCurrentPrice(70);

        System.out.printf("\nStock previous price: %.2f", stock.getPreviousClosingPrice());
        System.out.printf("\nStock current price: %.2f", stock.getCurrentPrice());
        System.out.printf("\nStock change percent: %.2f", stock.changePercent());


    }
}
