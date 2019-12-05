package com.training.dao;

import com.training.ifaces.MyRepository;
import com.training.entity.Medicine;
import lombok.Getter;


import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter

public class MedicineDao implements MyRepository<Medicine> {


    private static String tableName="JPMedicine";
    Connection con=null;

    public MedicineDao(){
        try {
            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","oracle","oracle123");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int add(Medicine medicine) {
        String sql="insert into "+tableName+" values(?,?,?)";
        PreparedStatement pstmt= null;
        int rowAdded=0;
        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setLong(1,medicine.getCode());
            pstmt.setString(2,medicine.getMedicineName());
            pstmt.setDouble(3,medicine.getRatePerUnit());
            rowAdded=pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowAdded;
    }

    @Override
    public List<Map<Long,Medicine>> findAll() {
        String sql="select * from "+tableName;
        Map<Long,Medicine> medicineMap=new HashMap<>();
        List<Map<Long,Medicine>> medicineList=new ArrayList();
        PreparedStatement pstmt= null;
        try {
            pstmt = con.prepareStatement(sql);
            ResultSet resultSet=pstmt.executeQuery();
            while(resultSet.next()){
                medicineMap.put(resultSet.getLong(1),
                                new Medicine(resultSet.getLong(1),
                                             resultSet.getString(2),
                                             resultSet.getDouble(3))
                        );
            }medicineList.add(medicineMap);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return medicineList;
    }

    @Override
    public Medicine findById(long key) {
        String sql="select * from "+tableName+" where code=?";
        Medicine medicineFound=null;
        PreparedStatement pstmt= null;
                try {
            pstmt = con.prepareStatement(sql);
            pstmt.setLong(1,key);
            ResultSet resultSet=pstmt.executeQuery();
            while(resultSet.next()){
                medicineFound=new Medicine(resultSet.getLong(1),resultSet.getString(2),resultSet.getDouble(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return medicineFound;
    }

    @Override
    public int update(Medicine medicine) {
        String sql="update "+tableName+ " set medicineName=? , ratePerUnit=? where code=?";
        PreparedStatement pstmt= null;
        int rowUpdated=0;
        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1,medicine.getMedicineName());
            pstmt.setDouble(2,medicine.getRatePerUnit());
            pstmt.setLong(3,medicine.getCode());
            rowUpdated=pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowUpdated;
    }

    @Override
    public int remove(long key) {
        String sql = "delete from " + tableName + " where code=?";
        PreparedStatement pstmt = null;
        int rowDeleted = 0;
        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setLong(1, key);
            rowDeleted = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowDeleted;
    }
}

