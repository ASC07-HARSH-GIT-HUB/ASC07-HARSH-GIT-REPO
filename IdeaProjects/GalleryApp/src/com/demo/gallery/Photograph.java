package com.demo.gallery;

public class Photograph {
    String name;
    void hang() {
        System.out.println("Hang on the rear wall");
    }
    void changeOrientation(String orientation) {
        System.out.println("Orientation changed to " + orientation);
    }
    boolean illuminate() {
        System.out.println("Switched on");
        return true;
    }
    void autograph() {
        System.out.println("Autograph signed");
    }
}
