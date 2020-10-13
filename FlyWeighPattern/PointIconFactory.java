package com.basePackage_khaled.FlyWeighPattern;

import java.util.HashMap;
import java.util.Map;

public class PointIconFactory {
    private Map<PointType,PointIcon> IconMap=new HashMap<>();
    public PointIcon getPointIcon(PointType type){
        if(!IconMap.containsKey(type)){
            PointIcon  NewIcon=new PointIcon(type,null);
            IconMap.put(type,NewIcon);
        }

        return IconMap.get(type);

    }
}
