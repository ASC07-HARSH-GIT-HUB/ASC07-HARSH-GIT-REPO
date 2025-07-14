package com.shopybuyproducts.profile;

public class profile {
    public int userId;
    public String userName;
    public profile(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }
    public void displayProfile() {
        System.out.println("User Id: " + userId);
        System.out.println("User Name: " + userName);
    }
}
