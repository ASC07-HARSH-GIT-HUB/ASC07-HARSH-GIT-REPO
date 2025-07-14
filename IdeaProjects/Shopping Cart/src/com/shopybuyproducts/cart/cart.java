package com.shopybuyproducts.cart;

public class cart {
    public String product;
    public int quantity;
    public cart(String product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
    public void addToCart() {
        System.out.println(quantity + " " + product + "(s) is(are) added to the cart");
    }
}
