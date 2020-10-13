package com.basePackage_khaled.DecoratorPattern;

import com.basePackage_khaled.Adapter.Image;
import com.basePackage_khaled.Adapter.ImageView;
import com.basePackage_khaled.Adapter.avaFilter;
import com.basePackage_khaled.Adapter.avaLibarary;

public class DecorateMain {
    public static void main(String[]args){
       /* EncryptedCloudStream encryptstreamdata=new EncryptedCloudStream();
        //encryptstreamdata.write("khaled abdalmoaty");
        CompressedCloudStream compress=new CompressedCloudStream();
        compress.write("khaled abdalmoaty");*/
        storeCreditCard(new CompressedCloudStream(new EncryptedCloudStream(new SavingCloudStream())));


    }
    public static void storeCreditCard(Stream stream){
            stream.write("123-123-156-179-1059");
    }
}

