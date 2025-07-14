package com.demo.gallery;

class Gallery {
    public static void main (String[] args) {
        Photograph hdPhoto;
        hdPhoto = new Photograph();
        hdPhoto.name = "Nandi Hills";
        System.out.println(hdPhoto.name);
        hdPhoto.hang();
        hdPhoto.changeOrientation("Landscape");
        boolean isIlluminated = hdPhoto.illuminate();
        if (isIlluminated) {
            System.out.println("Glowing Photo");
        }
        hdPhoto.autograph();
    }
}
