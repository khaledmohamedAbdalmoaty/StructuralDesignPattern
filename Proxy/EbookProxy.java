package com.basePackage_khaled.Proxy;

public class EbookProxy implements Ebook {
    private  String fileName;
    private RealEbook ebook;

    public EbookProxy(String fileName) {
        this.fileName = fileName;
        ebook=new RealEbook(fileName);
    }


    @Override
    public void show() {
        if(ebook==null){
            ebook=new RealEbook(fileName);
        }
        ebook.show();
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
