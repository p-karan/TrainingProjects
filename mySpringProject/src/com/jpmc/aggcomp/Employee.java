package com.jpmc.aggcomp;

public class Employee {
    private int id;
    private String name;
    ManagerClass manager;
    TeamLeadClass teamLead;

    public Employee() {
        System.out.println("def cons");
    }

    public Employee(int id) {
        this.id = id;
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Employee(int id, String name, ManagerClass manager, TeamLeadClass teamLead) {
        this.id = id;
        this.name = name;
        this.manager = manager;
        this.teamLead = teamLead;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ManagerClass getManager() {
        return manager;
    }

    public void setManager(ManagerClass manager) {
        this.manager = manager;
    }

    public TeamLeadClass getTeamLead() {
        return teamLead;
    }

    public void setTeamLead(TeamLeadClass teamLead) {
        this.teamLead = teamLead;
    }

    void show(){
        System.out.println(id+" "+name);
    }

    void show1(){
        System.out.println(id+" "+name);
        System.out.println("Manager Class: "+manager.id+" "+manager.name+" "+manager.dept);
        System.out.println("TeamLead Class: "+teamLead.id+" "+teamLead.name+" "+teamLead.dept+" "+teamLead.project);
    }
}
