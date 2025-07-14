package com.shopybuyproducts.orders;

public class orders {
    public String product;
    public int cost; // in rupees
    public orders (String product, int cost) {
        this.product = product;
        this.cost = cost;
    }

    public void orderPlaced() {
        System.out.println("The order for " + product + " of cost Rs" + cost + " has been placed.");
    }
}
