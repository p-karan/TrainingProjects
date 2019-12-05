package com.training.daos;

import com.training.entity.Medicine;
import com.training.ifaces.MyRepository;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

@Getter
@NoArgsConstructor
public class MedicineDao implements MyRepository<Medicine> {

    @Autowired
    private JdbcTemplate template;

    private static String tableName="JPMedicine";

    @Override
    public int add(Medicine medicine) {
        String sql="insert into "+tableName+" values(?,?,?)";
        int rowAdded=this.template.update(sql,medicine.getCode(),medicine.getMedicineName(),medicine.getRatePerUnit());

        return rowAdded;
    }

    @Override
    public List<Map<String,Object>> findAll() {
        String sql="select * from "+tableName;
        return this.template.queryForList(sql);
    }

    @Override
    public Medicine findById(long key) {
        String sql="select * from "+tableName+" where code=?";
        Medicine foundMedicine=this.template.queryForObject(sql, new BeanPropertyRowMapper<Medicine>(Medicine.class),key);

        return foundMedicine;
    }

    @Override
    public int update(Medicine medicine) {
        String sql="update "+tableName+ " set medicineName=? , ratePerUnit=? where code=?";

        int rowUpdated=this.template.update(sql,medicine.getMedicineName(),medicine.getRatePerUnit(),medicine.getCode());

        return rowUpdated;
    }

    @Override
    public int remove(long key) {
        String sql="delete from "+tableName+ " where code=?";
        int rowDeleted=this.template.update(sql,key);
        return rowDeleted;
    }
}

