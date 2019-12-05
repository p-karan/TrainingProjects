package com.training;

import com.training.blz.BLZService;
import com.training.blz.BLZServicePortType;
import com.training.blz.DetailsType;

public class Application {
    public static void main(String[] args) {
        BLZService blzService=new BLZService();
        BLZServicePortType proxy=blzService.getBLZServiceSOAP11PortHttp();
        DetailsType bank=proxy.getBank("73369871");
        System.out.println(bank.getPlz() +" " +bank.getBezeichnung()+" "+bank.getBic()+" "+bank.getOrt());
    }
}
