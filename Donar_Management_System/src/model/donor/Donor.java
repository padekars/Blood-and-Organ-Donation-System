/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.donor;

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
    int dzipcode;
    String dgender;
    String ddateofbirth;
    String dbloodgroup;
    long dphonenumber;
    String demailid;

    public String getDdateofbirth() {
        return ddateofbirth;
    }

    public void setDdateofbirth(String ddateofbirth) {
        this.ddateofbirth = ddateofbirth;
    }

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

    public int getDzipcode() {
        return dzipcode;
    }

    public void setDzipcode(int dzipcode) {
        this.dzipcode = dzipcode;
    }

    public String getDgender() {
        return dgender;
    }

    public void setDgender(String dgender) {
        this.dgender = dgender;
    }

    public long getDphonenumber() {
        return dphonenumber;
    }

    public void setDphonenumber(long dphonenumber) {
        this.dphonenumber = dphonenumber;
    }
    
}
