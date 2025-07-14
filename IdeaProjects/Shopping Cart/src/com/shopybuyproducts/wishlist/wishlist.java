package com.shopybuyproducts.wishlist;

public class wishlist {
    public String wishlistProduct;
    public int quantity;
    public wishlist(String wishlistProduct, int quantity) {
        this.wishlistProduct = wishlistProduct;
        this.quantity = quantity;
    }
    public void addToList() {
        System.out.println(quantity + " " + wishlistProduct + " added to Wishlist.");
    }
}
