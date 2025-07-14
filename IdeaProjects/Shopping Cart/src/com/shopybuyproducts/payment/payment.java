package com.shopybuyproducts.payment;

public class payment {
    public String product;
    public int pymnt;
    public int quantity;
    public payment (String product, int pymnt, int quantity) {
        this.product = product;
        this.quantity = quantity;
        this.pymnt = pymnt;
    }
    public void payed(){
        System.out.println("Payment of Rs" + pymnt + " for " + quantity + " " + product + "s successful.");
    }
}
