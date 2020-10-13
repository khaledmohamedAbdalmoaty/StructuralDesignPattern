package com.basePackage_khaled.Adapter;

public class ImageView {
    private Image image;
    public void  getImage(Image imgage){
        this.image=image;
    }
    public void apply(Filter filter){
        filter.apply(image);
    }
}
