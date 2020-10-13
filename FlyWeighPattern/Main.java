package com.basePackage_khaled.FlyWeighPattern;

import com.basePackage_khaled.Facade.NotificationService;

import java.util.List;

public class Main {
    public static void main(String[]args){
        PointService pointService=new PointService(new PointIconFactory());
        List<Point> pointList=pointService.getPoints();
        for(Point point :pointList){
            point.addPointToMap();
        }

    }
}
