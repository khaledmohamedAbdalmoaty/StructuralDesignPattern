package com.basePackage_khaled.DecoratorPattern;

public class SavingCloudStream implements Stream {

    @Override
    public void write(String data){
        System.out.println("Storing " + data);
    }
}
