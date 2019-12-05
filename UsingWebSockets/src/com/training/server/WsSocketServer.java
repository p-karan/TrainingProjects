package com.training.server;


import sun.plugin2.message.Message;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.nio.ByteBuffer;

@ServerEndpoint(value = "/wserver/{location}",decoders = {MyDecoder.class},encoders = {MyEncoder.class})
public class WsSocketServer {

    @OnOpen
    public void open(Session session){
        Partner part=new Partner();
        part.setPartnerCode(101l);
        part.setPartnerName("Ramesh");
        part.setMobileNumber(49494949l);
        try {
            session.getBasicRemote().sendObject(part);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (EncodeException e) {
            e.printStackTrace();
        }
    }

    @OnClose
    public void close(Session session){
        System.out.println("Connection Closed!");
    }

/*    @OnMessage
    public String message(Session session, String message, @PathParam("location") String location){
        System.out.println(session.getId());

        System.out.println("message := "+message);
        String response= message+" from "+location+"\n";


        return response;
    }*/
@OnMessage
    public String handleMessage(Session session, String objctRef, @PathParam("location") String location){
    System.out.println("in on message");
    System.out.println(objctRef);
    String response=objctRef+" from "+location+"\n";
    return response;
    }

    @OnError
    public void error(Throwable e){
        e.printStackTrace();
        System.out.println("Error message called.");
    }
}
