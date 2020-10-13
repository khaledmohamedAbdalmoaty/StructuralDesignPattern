package com.basePackage_khaled.Proxy;

public class Main {
    public static void main(String []args){
        Libraary libraary=new Libraary();
        String[]arr={"a","b","c"};
        for(String element:arr){
            libraary.add(new LoggingProxyEbook(element));
        }
       libraary.openEbook("a");
        libraary.openEbook("b");

    }
}
