package com.demo.access_modifiers.p2;
import com.demo.access_modifiers.p1.p1c1;
public class p2c1 {
    public static void main(String[] args) {
        p1c1 pc11 = new p1c1();
        System.out.println(pc11.privateVar);
        pc11.privateMethod();
    }
}
