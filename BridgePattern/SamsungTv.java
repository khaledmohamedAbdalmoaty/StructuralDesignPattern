package com.basePackage_khaled.BridgePattern;

public class SamsungTv implements Device{
    @Override
    public void turnOn() {
        System.out.println("Samsung:turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("Samsung:turn off");

    }

    @Override
    public void setChannel(int channel) {
        System.out.println("Samsung:set channel number"+channel);

    }
}
