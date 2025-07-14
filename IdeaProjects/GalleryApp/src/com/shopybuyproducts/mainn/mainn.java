package com.shopybuyproducts.mainn;

import com.shopybuyproducts.profile.profile;
import com.shopybuyproducts.cart.cart;
import com.shopybuyproducts.offers.offers;
import com.shopybuyproducts.orders.orders;
import com.shopybuyproducts.wishlist.wishlist;
import com.shopybuyproducts.payment.payment;

public class mainn {
    public static void main(String[] args) {
    String prod = "Product X";

    profile prof = new profile(101, "Harsh");
    prof.displayProfile();

    cart c = new cart(prod, 2);
    c.addToCart();

    orders ord = new orders(prod, 1000);
    ord.orderPlaced();

    offers ofr = new offers(1000, prod, 10);
    ofr.displayPercentage();

    wishlist w = new wishlist("Wishlist Product", 2);
    w.addToList();

    payment p = new payment(prod, 1800, 2);
    p.payed();
    }

}
