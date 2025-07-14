package com.demo.access_modifiers.p1;

public class p1c1 {
    private String privateVar;
    private void privateMethod() {
        System.out.println(privateVar);
    }

    public static void main(String[] args) {
        p1c1 pc11 = new p1c1();
        System.out.println(pc11.privateVar);
    }
}
