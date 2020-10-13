package com.basePackage_khaled.Proxy;

public class RealEbook implements Ebook {
    private String fileName;

    public RealEbook(String fileName) {
        this.fileName = fileName;
        //load(fileName);
    }
    private void load(String fileName){
        System.out.println("loading fileName:"+fileName);
    }
    @Override
    public void show(){
        load(fileName);
        System.out.println("showing the E-book:"+fileName);
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
