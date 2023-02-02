package com.mahedi.model;

//import jakarta.persistence.*;

//@Entity
//@Table(name = "patient")
public class Patient {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long uuid;
    private long testid;

//    @Column(name="Test_Name")
    private String testName;
//    @Column(name = "patient_Name")
    private String patientName;

    public Patient() {
    }

    public Patient(long id, long uuid, long testid, String testName, String patientName) {
        this.id = id;
        this.uuid = uuid;
        this.testid = testid;
        this.testName = testName;
        this.patientName = patientName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUuid() {
        return uuid;
    }

    public void setUuid(long uuid) {
        this.uuid = uuid;
    }

    public long getTestid() {
        return testid;
    }

    public void setTestid(long testid) {
        this.testid = testid;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", uuid=" + uuid +
                ", testid=" + testid +
                ", testName='" + testName + '\'' +
                ", patientName='" + patientName + '\'' +
                '}';
    }
}
