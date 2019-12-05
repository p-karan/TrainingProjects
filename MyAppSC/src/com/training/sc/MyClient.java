package com.training.sc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class MyClient {
    Socket socket;
    BufferedReader buff;
    InputStreamReader isr;
    PrintWriter pw;

    public static void main(String[] args) throws Exception {
        MyClient obj=new MyClient();
        obj.socket=new Socket("192.168.1.185",6541);
        obj.isr=new InputStreamReader(obj.socket.getInputStream());
        obj.buff=new BufferedReader(obj.isr);
        obj.pw=new PrintWriter(obj.socket.getOutputStream(),true);
        obj.pw.println("Sending data from Karan");
        System.out.println("Message from server is "+obj.buff.readLine());
    }
}
