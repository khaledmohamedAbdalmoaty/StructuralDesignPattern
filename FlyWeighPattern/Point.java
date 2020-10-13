package com.basePackage_khaled.FlyWeighPattern;

public class Point {
    private int x;
    private int y;
    private PointIcon Icon;

    public Point(int x, int y,PointIcon pointIcon) {
        this.x = x;
        this.y = y;
        this.Icon=pointIcon;
    }
    public void addPointToMap(){
        //adding point algorithmes
        System.out.printf(" adding %s at (%d,%d) to Map",Icon.gettype(),x,y);
    }
}
