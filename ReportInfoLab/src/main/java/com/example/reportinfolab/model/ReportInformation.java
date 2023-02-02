package com.example.reportinfolab.model;

import jakarta.persistence.*;


@Entity
@Table(name="reportss")
public class ReportInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String rHospitalName;
    private String rHospitalDivision;
    private String rHospitalUpozila;
    private String rHospitalDistrict;
    private String rHospitalReportName;
    private String rHospitalSpeech;
    private String rHospitalLogo1;
//    private String rHospitalLogo2;
//    private String rHospitalLogo3;
//    private String rHospitalLogo4;
//    private String rHospitalLogo5;
//    private String rHospitalLogo6;
//    private String rHospitalLogo7;
//    private String rHospitalLogo8;

    private String rHospitalPhone1;
    private String rHospitalPhone2;
    private String rHospitalEmail;

    public ReportInformation() {
    }

    public ReportInformation(long id, String rHospitalName, String rHospitalDivision, String rHospitalUpozila,
                             String rHospitalDistrict, String rHospitalReportName, String rHospitalSpeech, String rHospitalLogo1
//                             String rHospitalLogo2, String rHospitalLogo3, String rHospitalLogo4, String rHospitalLogo5,
//                             String rHospitalLogo6, String rHospitalLogo7, String rHospitalLogo8
                          , String rHospitalPhone1,
                             String rHospitalPhone2, String rHospitalEmail) {
        this.id = id;
        this.rHospitalName = rHospitalName;
        this.rHospitalDivision = rHospitalDivision;
        this.rHospitalUpozila = rHospitalUpozila;
        this.rHospitalDistrict = rHospitalDistrict;
        this.rHospitalReportName = rHospitalReportName;
        this.rHospitalSpeech = rHospitalSpeech;
        this.rHospitalLogo1 = rHospitalLogo1;
//        this.rHospitalLogo2 = rHospitalLogo2;
//        this.rHospitalLogo3 = rHospitalLogo3;
//        this.rHospitalLogo4 = rHospitalLogo4;
//        this.rHospitalLogo5 = rHospitalLogo5;
//        this.rHospitalLogo6 = rHospitalLogo6;
//        this.rHospitalLogo7 = rHospitalLogo7;
//        this.rHospitalLogo8 = rHospitalLogo8;
        this.rHospitalPhone1 = rHospitalPhone1;
        this.rHospitalPhone2 = rHospitalPhone2;
        this.rHospitalEmail = rHospitalEmail;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getrHospitalName() {
        return rHospitalName;
    }

    public void setrHospitalName(String rHospitalName) {
        this.rHospitalName = rHospitalName;
    }

    public String getrHospitalDivision() {
        return rHospitalDivision;
    }

    public void setrHospitalDivision(String rHospitalDivision) {
        this.rHospitalDivision = rHospitalDivision;
    }

    public String getrHospitalUpozila() {
        return rHospitalUpozila;
    }

    public void setrHospitalUpozila(String rHospitalUpozila) {
        this.rHospitalUpozila = rHospitalUpozila;
    }

    public String getrHospitalDistrict() {
        return rHospitalDistrict;
    }

    public void setrHospitalDistrict(String rHospitalDistrict) {
        this.rHospitalDistrict = rHospitalDistrict;
    }

    public String getrHospitalReportName() {
        return rHospitalReportName;
    }

    public void setrHospitalReportName(String rHospitalReportName) {
        this.rHospitalReportName = rHospitalReportName;
    }

    public String getrHospitalSpeech() {
        return rHospitalSpeech;
    }

    public void setrHospitalSpeech(String rHospitalSpeech) {
        this.rHospitalSpeech = rHospitalSpeech;
    }

    public String getrHospitalLogo1() {
        return rHospitalLogo1;
    }

    public void setrHospitalLogo1(String rHospitalLogo1) {
        this.rHospitalLogo1 = rHospitalLogo1;
    }

//    public String getrHospitalLogo2() {
//        return rHospitalLogo2;
//    }
//
//    public void setrHospitalLogo2(String rHospitalLogo2) {
//        this.rHospitalLogo2 = rHospitalLogo2;
//    }
//
//    public String getrHospitalLogo3() {
//        return rHospitalLogo3;
//    }
//
//    public void setrHospitalLogo3(String rHospitalLogo3) {
//        this.rHospitalLogo3 = rHospitalLogo3;
//    }
//
//    public String getrHospitalLogo4() {
//        return rHospitalLogo4;
//    }
//
//    public void setrHospitalLogo4(String rHospitalLogo4) {
//        this.rHospitalLogo4 = rHospitalLogo4;
//    }
//
//    public String getrHospitalLogo5() {
//        return rHospitalLogo5;
//    }
//
//    public void setrHospitalLogo5(String rHospitalLogo5) {
//        this.rHospitalLogo5 = rHospitalLogo5;
//    }
//
//    public String getrHospitalLogo6() {
//        return rHospitalLogo6;
//    }
//
//    public void setrHospitalLogo6(String rHospitalLogo6) {
//        this.rHospitalLogo6 = rHospitalLogo6;
//    }
//
//    public String getrHospitalLogo7() {
//        return rHospitalLogo7;
//    }
//
//    public void setrHospitalLogo7(String rHospitalLogo7) {
//        this.rHospitalLogo7 = rHospitalLogo7;
//    }
//
//    public String getrHospitalLogo8() {
//        return rHospitalLogo8;
//    }
//
//    public void setrHospitalLogo8(String rHospitalLogo8) {
//        this.rHospitalLogo8 = rHospitalLogo8;
//    }

    public String getrHospitalPhone1() {
        return rHospitalPhone1;
    }

    public void setrHospitalPhone1(String rHospitalPhone1) {
        this.rHospitalPhone1 = rHospitalPhone1;
    }

    public String getrHospitalPhone2() {
        return rHospitalPhone2;
    }

    public void setrHospitalPhone2(String rHospitalPhone2) {
        this.rHospitalPhone2 = rHospitalPhone2;
    }

    public String getrHospitalEmail() {
        return rHospitalEmail;
    }

    public void setrHospitalEmail(String rHospitalEmail) {
        this.rHospitalEmail = rHospitalEmail;
    }

    @Override
    public String toString() {
        return "ReportInformation [id=" + id + ", rHospitalName=" + rHospitalName + ", rHospitalDivision="
                + rHospitalDivision + ", rHospitalUpozila=" + rHospitalUpozila + ", rHospitalDistrict="
                + rHospitalDistrict + ", rHospitalReportName=" + rHospitalReportName + ", rHospitalSpeech="
                + rHospitalSpeech + ", rHospitalLogo1=" + rHospitalLogo1 +
//                ", rHospitalLogo2=" + rHospitalLogo2
//                + ", rHospitalLogo3=" + rHospitalLogo3 + ", rHospitalLogo4=" + rHospitalLogo4 + ", rHospitalLogo5="
//                + rHospitalLogo5 + ", rHospitalLogo6=" + rHospitalLogo6 + ", rHospitalLogo7=" + rHospitalLogo7
//                + ", rHospitalLogo8=" + rHospitalLogo8 +
                ", rHospitalPhone1=" + rHospitalPhone1 + ", rHospitalPhone2="
                + rHospitalPhone2 + ", rHospitalEmail=" + rHospitalEmail + "]";
    }

}
