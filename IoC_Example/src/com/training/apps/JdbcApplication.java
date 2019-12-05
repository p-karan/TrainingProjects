package com.training.apps;

import com.training.beans.Medicine;
import com.training.config.DbConfig;
import com.training.ifaces.MyRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public class JdbcApplication {

    public static void main(String[] args) {
        Logger log= Logger.getAnonymousLogger();
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(DbConfig.class);
        Medicine crocin=ctx.getBean(Medicine.class);

        crocin.setCode(2021);
        crocin.setMedicineName("T.Crocynn");
        crocin.setRatePerUnit(12.00);

        MyRepository<Medicine> dao=ctx.getBean(MyRepository.class);
        //int rowAdded=dao.add(crocin);
        //log.info(Integer.toString(rowAdded)+ " Added");
        List<Map<String,Object>> rows=dao.findAll();
        for(Map<String,Object> eachRow:rows){
            System.out.println(eachRow.get("code"));
            System.out.println(eachRow.get("medicineName"));
            System.out.println(eachRow.get("ratePerUnit"));
        }

/*        Medicine med=dao.findById(2020);
        System.out.println("Row identified :"+ med);*/

        int rowDeleted=dao.remove(2020);
        log.info(Integer.toString(rowDeleted)+ " Deleted");


/*
        int rowUpdated=dao.update(crocin);
        log.info(Integer.toString(rowUpdated)+ " updated");
*/

    }

}
