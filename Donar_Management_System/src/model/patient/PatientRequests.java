/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.patient;

/**
 *
 * @author snehal
 */
public class PatientRequests extends Patient {
    String prequesttype;
    String prequestvalue;

    public String getPrequesttype() {
        return prequesttype;
    }

    public void setPrequesttype(String prequesttype) {
        this.prequesttype = prequesttype;
    }

    public String getPrequestvalue() {
        return prequestvalue;
    }

    public void setPrequestvalue(String prequestvalue) {
        this.prequestvalue = prequestvalue;
    }
    
}
