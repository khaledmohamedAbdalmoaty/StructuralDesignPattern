package com.basePackage_khaled.BridgePattern;

import com.basePackage_khaled.FlyWeighPattern.Point;
import com.basePackage_khaled.FlyWeighPattern.PointIconFactory;
import com.basePackage_khaled.FlyWeighPattern.PointService;

import java.util.List;

public class Main {
    public static void main(String[]args){
            RemoteControl Rc=new RemoteControl(new sonyTv());
            //AdvancedRemoteControl ARc=new AdvancedRemoteControl(new sonyTv());
            //Rc.turnOn();
         AdvancedRemoteControl ARc=new AdvancedRemoteControl(new SamsungTv());

         ARc.addChannel(1);
    }
}
