
import org.apache.commons.dbcp2.BasicDataSource;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.*;
import java.time.LocalDate;
import java.util.StringTokenizer;

public class MyServer2 {
    ServerSocket ss;
    Socket socket;
    BufferedReader buff;
    InputStreamReader isr;
    PrintWriter pw;

    public static void main(String[] args) throws Exception {
        String name="" ,email="", phone="", dateTime="";
        MyServer2 obj=new MyServer2();
        obj.ss=new ServerSocket(6541);
        System.out.println("Waiting for client");
        obj.socket=obj.ss.accept();
        System.out.println("Client accepted");
        obj.isr=new InputStreamReader(obj.socket.getInputStream());
        obj.buff=new BufferedReader(obj.isr);
        obj.pw=new PrintWriter(obj.socket.getOutputStream(),true);
        StringTokenizer str=new StringTokenizer(obj.buff.readLine()," ");
        while(str.hasMoreTokens()) {
            name = str.nextToken();
            email = str.nextToken();
            phone = str.nextToken();
            dateTime = str.nextToken();
        }
        long phone2=Long.parseLong(phone);
        LocalDate time=LocalDate.parse(dateTime);
        obj.pw.println("HI Client your data is received!!");
        BasicDataSource ds=new BasicDataSource();
        ds.setUsername("oracle");
        ds.setPassword("oracle123");
        ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        ds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
        try {
            Connection conn=ds.getConnection();
            PreparedStatement pstmt=conn.prepareStatement("insert into user1 values (?,?,?,?)");
            pstmt.setString(1,name);
            pstmt.setString(2,email);
            pstmt.setLong(3,phone2);
            pstmt.setDate(4, Date.valueOf(time));
            int i=pstmt.executeUpdate();
                       System.out.println("\n ========================Releasing Connection================\n");
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


}

