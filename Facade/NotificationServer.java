package com.basePackage_khaled.Facade;

public class NotificationServer {
    public Connection connection(String ipAddress){
        return new Connection();
    }
    public AuthToken authenticate(String Appid,String key){
        return new AuthToken();
    }
    public void send(AuthToken authToken,Message message,String target){
        System.out.println("sending a to "+target);
    }
}
