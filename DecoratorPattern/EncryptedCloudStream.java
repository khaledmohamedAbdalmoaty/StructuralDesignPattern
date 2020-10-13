package com.basePackage_khaled.DecoratorPattern;

public class EncryptedCloudStream implements Stream{
    private Stream stream;
    public EncryptedCloudStream (Stream stream){
          this.stream=stream;
    }
    @Override
    public void write(String data) {
        String hash=encrypted(data);
        stream.write(hash);

    }
    private String encrypted(String data){
        return(data+" ->!! !!!!!1");
    }
}
