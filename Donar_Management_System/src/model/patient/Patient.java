/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.patient;

import java.util.Date;

/**
 *
 * @author snehal
 */
public class Patient {
    String pname;
    String pusername;
    String ppassword;
    String pstreetname;
    String pcommunity;
    int zipcode;
    String pgender;
    long phonenumber;
    Date pbirth_date;

    public Date getPbirth_date() {
        return pbirth_date;
    }

    public void setPbirth_date(Date pbirth_date) {
        this.pbirth_date = pbirth_date;
    }
    String pbloodgroup;
    String phospital;
    String pemailid;

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public long getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(long phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPusername() {
        return pusername;
    }

    public void setPusername(String pusername) {
        this.pusername = pusername;
    }
    String pdateofbirth;
    public String getPpassword() {
        return ppassword;
    }

    public void setPpassword(String ppassword) {
        this.ppassword = ppassword;
    }

    public String getPstreetname() {
        return pstreetname;
    }

    public void setPstreetname(String pstreetname) {
        this.pstreetname = pstreetname;
    }

    public String getPcommunity() {
        return pcommunity;
    }

    public void setPcommunity(String pcommunity) {
        this.pcommunity = pcommunity;
    }
    String pzipcode;

    public String getPzipcode() {
        return pzipcode;
    }

    public void setPzipcode(String pzipcode) {
        this.pzipcode = pzipcode;
    }

    public String getPgender() {
        return pgender;
    }

    public void setPgender(String pgender) {
        this.pgender = pgender;
    }
    String pphonenumber;
    public String getPphonenumber() {
        return pphonenumber;
    }

    public void setPphonenumber(String pphonenumber) {
        this.pphonenumber = pphonenumber;
    }

    public String getPdateofbirth() {
        return pdateofbirth;
    }

    public void setPdateofbirth(String pdateofbirth) {
        this.pdateofbirth = pdateofbirth;
    }

    public String getPbloodgroup() {
        return pbloodgroup;
    }

    public void setPbloodgroup(String pbloodgroup) {
        this.pbloodgroup = pbloodgroup;
    }

    public String getPhospital() {
        return phospital;
    }

    public void setPhospital(String phospital) {
        this.phospital = phospital;
    }

    public String getPemailid() {
        return pemailid;
    }

    public void setPemailid(String pemailid) {
        this.pemailid = pemailid;
    }

    
}
