package com.basePackage_khaled.CompositePattern;

public class Squaire implements Component  {
    @Override
    public void render(){
        System.out.println("render shape squaire");
    }

    @Override
    public void move() {
        System.out.println("move squaire");

    }
}
