package com.basePackage_khaled.FlyWeighPattern;
//this is the flyweight class
public class PointIcon {
    private final PointType type;
    private final byte[] icon; //array called icon size of each element is  byte refer to -> icon image

    public PointIcon(PointType type, byte[] icon) {
        this.type = type;
        this.icon = icon;
    }

    public byte[] getIcon() {
        return icon;
    }
    public PointType gettype() {
        return type;
    }
}
