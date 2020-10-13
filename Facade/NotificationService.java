package com.basePackage_khaled.Facade;

public class NotificationService {
    public void send(String message,String ipAddress,String key,String target,String Appid){
        NotificationServer server=new NotificationServer();
        Connection connection=server.connection(ipAddress);
        AuthToken authentication=server.authenticate(Appid,key);
        server.send(authentication,new Message(message),target);
        connection.disConnect();
    }
}
