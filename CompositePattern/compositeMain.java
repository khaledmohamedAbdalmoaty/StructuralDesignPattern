package com.basePackage_khaled.CompositePattern;

public class compositeMain {
    public static void main(String[] args){
        Cirecle cirecle=new Cirecle();
        Squaire squaire=new Squaire();
        Groups groups=new Groups();
        groups.add(cirecle);
        groups.add(squaire);
        groups.render();
        groups.move();
       // squaire.move();





    }
}





















