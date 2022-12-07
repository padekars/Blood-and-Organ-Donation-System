/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.hospital;

/**
 *
 * @author snehal
 */
public class HospitalRequests extends Hospital{
    String hrequesttype;
    String hrequestvalue;

    public String getHrequesttype() {
        return hrequesttype;
    }

    public void setHrequesttype(String hrequesttype) {
        this.hrequesttype = hrequesttype;
    }

    public String getHrequestvalue() {
        return hrequestvalue;
    }

    public void setHrequestvalue(String hrequestvalue) {
        this.hrequestvalue = hrequestvalue;
    }
}
