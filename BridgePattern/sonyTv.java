package com.basePackage_khaled.BridgePattern;

public class sonyTv  implements Device{
    @Override
    public void turnOn() {
        System.out.println("sony tv:turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("sony tv:turn off");

    }

    @Override
    public void setChannel(int channel) {
        System.out.println("sony Tv:set channel");

    }
}
