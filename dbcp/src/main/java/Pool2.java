import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Pool2 {

    public static void main(String[] args) {
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
