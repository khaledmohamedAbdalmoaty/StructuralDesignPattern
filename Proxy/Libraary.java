package com.basePackage_khaled.Proxy;

import java.util.HashMap;
import java.util.Map;

public class Libraary {
    Map<String,Ebook> bookMap=new HashMap<>();
    public void add(Ebook ebook){
        bookMap.put(ebook.getFileName(),ebook);
    }
    public void openEbook(String fileName){
        Ebook ebook=bookMap.get(fileName);
        ebook.show();


    }


}
