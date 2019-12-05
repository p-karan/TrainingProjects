package com.jpmc.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class EmployeeClass {

    String id, name;
    List<JobRole> mList;
    Map<String,List<JobRole>> map;

/*    public EmployeeClass(String id, String name, List<JobRole> mList) {
        this.id = id;
        this.name = name;
        this.mList = mList;
    }

    public EmployeeClass(String id, String name, Map<String, List<JobRole>> map) {
        this.id = id;
        this.name = name;
        this.map = map;
    }*/

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<JobRole> getmList() {
        return mList;
    }

    public void setmList(List<JobRole> mList) {
        this.mList = mList;
    }

    public Map<String, List<JobRole>> getMap() {
        return map;
    }

    public void setMap(Map<String, List<JobRole>> map) {
        this.map = map;
    }

    public void showJobsRoles(){
        System.out.println("For Employee: "+id+","+name);
        for(JobRole mObject: mList)
            System.out.println(mObject.jobId+" "+mObject.jobName+" "+mObject.payScale);
    }

    public void showJobsOpenings(){
        for(String name:map.keySet()){
            List<JobRole> mListJobRole=map.get(name);
            System.out.println("Company: "+name);
            for(JobRole mObject: mListJobRole)
                System.out.println(mObject.jobId+" "+mObject.jobName+" "+mObject.payScale);
            System.out.println("------------------------------------");
        }
    }
}
