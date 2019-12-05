package com.jpmc.aggcomp;

public class TeamLeadClass {
    String id, name, dept, project;

/*    public TeamLeadClass(String id, String name, String dept, String project) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.project = project;
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

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }
}
