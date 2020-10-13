package com.basePackage_khaled.FlyWeighPattern;

import java.util.ArrayList;
import java.util.List;

public class PointService {
    private PointIconFactory IconfromFactory;

    public PointService(PointIconFactory iconfromFactory) {
        IconfromFactory = iconfromFactory;
    }

    public List<Point> getPoints(){
        List<Point >PointList=new ArrayList<>();
        Point point=new Point(1,2,IconfromFactory.getPointIcon(PointType.Cafe));
        PointList.add(point);
        return PointList;

    }


}
