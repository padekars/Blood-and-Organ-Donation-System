/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.donor;

import java.util.Date;

/**
 *
 * @author snehal
 */
public class Donor {
    String dname;
    String dusername;
    String dpassword;
    String dstreetname;
    String dcommunity;
    int dzip;
    String dgender;
    Date dbirth_date;
    String dbloodgroup;
    long dphone;
    String demailid;

    public int getDzip() {
        return dzip;
    }

    public Date getDbirth_date() {
        return dbirth_date;
    }

    public void setDbirth_date(Date dbirth_date) {
        this.dbirth_date = dbirth_date;
    }

    public String getDdateofbirth() {
        return ddateofbirth;
    }

    public void setDdateofbirth(String ddateofbirth) {
        this.ddateofbirth = ddateofbirth;
    }

    public void setDzip(int dzip) {
        this.dzip = dzip;
    }

    public long getDphone() {
        return dphone;
    }

    public void setDphone(long dphone) {
        this.dphone = dphone;
    }

    public String getDzipcode() {
        return dzipcode;
    }

    public void setDzipcode(String dzipcode) {
        this.dzipcode = dzipcode;
    }

    public String getDphonenumber() {
        return dphonenumber;
    }

    public void setDphonenumber(String dphonenumber) {
        this.dphonenumber = dphonenumber;
    }
    String ddateofbirth;
    

    public String getDbloodgroup() {
        return dbloodgroup;
    }

    public void setDbloodgroup(String dbloodgroup) {
        this.dbloodgroup = dbloodgroup;
    }

    public String getDemailid() {
        return demailid;
    }

    public void setDemailid(String demailid) {
        this.demailid = demailid;
    }


    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDusername() {
        return dusername;
    }

    public void setDusername(String dusername) {
        this.dusername = dusername;
    }

    public String getDpassword() {
        return dpassword;
    }

    public void setDpassword(String dpassword) {
        this.dpassword = dpassword;
    }

    public String getDstreetname() {
        return dstreetname;
    }

    public void setDstreetname(String dstreetname) {
        this.dstreetname = dstreetname;
    }

    public String getDcommunity() {
        return dcommunity;
    }

    public void setDcommunity(String dcommunity) {
        this.dcommunity = dcommunity;
    }
    String dzipcode;
    String dphonenumber;

    public String getDgender() {
        return dgender;
    }
    
    public void setDgender(String dgender) {
        this.dgender = dgender;
    }

    
    
}
