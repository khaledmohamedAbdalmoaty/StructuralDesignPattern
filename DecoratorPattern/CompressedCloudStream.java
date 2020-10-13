package com.basePackage_khaled.DecoratorPattern;

public class CompressedCloudStream implements Stream {
    private Stream stream;
    public CompressedCloudStream(Stream stream){
        this.stream=stream;
    }
    @Override
    public void write(String data) {
        String var=compress(data);
        stream.write(var);
    }
    private String compress(String data){
        return data.substring(0,5);
    }
}
