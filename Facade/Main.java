package com.basePackage_khaled.Facade;

public class Main {
    public static void main(String[]args){

    String message="what are you doing ...man";
    NotificationService notification=new NotificationService();
    notification.send(message,"1234","kkk","khaled phone","kdfkd");


    }
}
