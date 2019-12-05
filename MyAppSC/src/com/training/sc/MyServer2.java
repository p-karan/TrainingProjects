package com.training.sc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MyServer2 {
    ServerSocket ss;
    Socket socket;
    BufferedReader buff;
    InputStreamReader isr;
    PrintWriter pw;

    public static void main(String[] args) throws Exception {
        MyServer2 obj=new MyServer2();
        obj.ss=new ServerSocket(6541);
        System.out.println("Waiting for client");
        obj.socket=obj.ss.accept();
        System.out.println("Client accepted");
        obj.isr=new InputStreamReader(obj.socket.getInputStream());
        obj.buff=new BufferedReader(obj.isr);
        obj.pw=new PrintWriter(obj.socket.getOutputStream(),true);
        System.out.println("Message from client is "+obj.buff.readLine());
        obj.pw.println("HI Client your data is received!!");
        BasicDataSource ds=new BasicDataSource();
        ds.setUsername("oracle");
        ds.setPassword("oracle123");
        ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        ds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
        try {
            Connection conn=ds.getConnection();
            PreparedStatement pstmt=conn.prepareStatement("select * from emp");
            ResultSet rs=pstmt.executeQuery();
            while(rs.next())
                System.out.println("Employee No: " + rs.getInt(1));
            System.out.println("\n ========================Releasing Connection================\n");
            pstmt.close();
            rs.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


}
}
