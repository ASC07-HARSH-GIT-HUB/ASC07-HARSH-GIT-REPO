package com.shopybuyproducts.offers;

public class offers {
    public int actualPrice;
    public String product;
    public int discountPercentage;
    public offers (int actualPrice, String product, int discountPercentage) {
        this.actualPrice = actualPrice;
        this.product = product;
        this.discountPercentage = discountPercentage;
    }
    public void displayPercentage() {
        System.out.println("After discount on the product " + product + " of " + actualPrice + " rupees is " + (actualPrice * (discountPercentage/100)) + "Rupees.");
    }
}
