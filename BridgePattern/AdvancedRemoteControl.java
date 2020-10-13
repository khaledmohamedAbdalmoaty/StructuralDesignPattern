package com.basePackage_khaled.BridgePattern;

public  class AdvancedRemoteControl extends RemoteControl{

    protected AdvancedRemoteControl(Device device) {
        super(device);
    }
    public void addChannel(int number){
        device.setChannel(number);
    }
}
