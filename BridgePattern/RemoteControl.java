package com.basePackage_khaled.BridgePattern;

public  class RemoteControl {
    protected Device device;

    protected RemoteControl(Device device) {
        this.device = device;
    }

    public  void turnOn(){
        device.turnOn();
    }
    public  void turnOff(){
        device.turnOff();
    }
}
