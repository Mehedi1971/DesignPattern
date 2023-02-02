package com.example.date.entity;

import java.sql.Date;



import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "dates")
@Data
public class Dates {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @Column(name="created_at")
    private Date createdAt;

//    public Dates() {
//    }
//
//    public Dates(long id, String name, Date dob) {
//        this.id = id;
//        this.name = name;
//        this.dob = dob;
//    }
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Date getDob() {
//        return dob;
//    }
//
//    public void setDob(Date dob) {
//        this.dob = dob;
//    }
//
//    @Override
//    public String toString() {
//        return "Dates{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", dob=" + dob +
//                '}';
//    }
}
