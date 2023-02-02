package com.example.newdemo.model;

import jakarta.persistence.*;

@Entity
@Table(name="stu")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String logo1;
    private String logo2;
    public Student() {
    }

    public Student(long id, String name, String logo1,String logo2) {
        this.id = id;
        this.name = name;
        this.logo1 = logo1;
        this.logo2 = logo2;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo1() {
        return logo1;
    }

    public void setLogo1(String logo1) {
        this.logo1 = logo1;
    }
    public String getLogo2() {
        return logo2;
    }

    public void setLogo2(String logo12) {
        this.logo2 = logo2;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", logo1='" + logo1 + '\'' +
                ", logo2='" + logo2 + '\'' +
                '}';
    }
}
