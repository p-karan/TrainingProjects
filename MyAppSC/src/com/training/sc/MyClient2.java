package com.training.sc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.time.LocalDate;
import java.util.Scanner;

public class MyClient2 {
    Socket socket;
    BufferedReader buff;
    InputStreamReader isr;
    PrintWriter pw;

    public static void main(String[] args) throws Exception {
        StringBuffer sb= new StringBuffer();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter username: ");
        sb=sb.append(sc.next());
        System.out.println("Enter email");
        sb=sb.append(" "+sc.next());
        System.out.println("Enter phone");
        sb=sb.append(" "+sc.nextLong());
        sb=sb.append(" "+ LocalDate.now());
        MyClient2 obj=new MyClient2();
        obj.socket=new Socket("127.0.0.1",6541);
        obj.isr=new InputStreamReader(obj.socket.getInputStream());
        obj.buff=new BufferedReader(obj.isr);
        obj.pw=new PrintWriter(obj.socket.getOutputStream(),true);
        obj.pw.println(sb);
        System.out.println("Message from server is "+obj.buff.readLine());
    }
}
