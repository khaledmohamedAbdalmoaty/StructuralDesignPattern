package com.basePackage_khaled.Proxy;

public class LoggingProxyEbook implements Ebook{
    private String fileName;
    private RealEbook realEbook;

    public LoggingProxyEbook(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void show() {
        if(realEbook==null){
            realEbook=new RealEbook(fileName);
        }
        System.out.println("logging...");
        realEbook.show();
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
