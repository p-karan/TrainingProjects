package com.training.beans;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class CDIQualifierApplication {
    public static void main(String[] args) {
        Weld weld=new Weld();
        WeldContainer container=weld.initialize();
        DonorManager mgr=container.instance().select(DonorManager.class).get();
        System.out.println("List of Blood Donors:");
        for(String eachName:mgr.getBloodDonors()){
            System.out.println(eachName);
        }
        System.out.println("List of all Donors:");
        for(String eachDonor:mgr.getAllDonors()){
            System.out.println(eachDonor);
        }

    }

}
