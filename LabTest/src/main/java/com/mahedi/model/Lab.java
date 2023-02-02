package com.mahedi.model;

import jakarta.persistence.*;

@Entity
@Table(name = "lab")
public class Lab {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String testname;
    private boolean checkbox;

    public Lab() {
    }

    public Lab(long id, String testname, boolean checkbox) {
        this.id = id;
        this.testname = testname;
        this.checkbox = checkbox;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTestname() {
        return testname;
    }

    public void setTestname(String testname) {
        this.testname = testname;
    }

    public boolean isCheckbox() {
        return checkbox;
    }

    public void setCheckbox(boolean checkbox) {
        this.checkbox = checkbox;
    }

    @Override
    public String toString() {
        return "Lab{" +
                "id=" + id +
                ", testname='" + testname + '\'' +
                ", checkbox=" + checkbox +
                '}';
    }
}
