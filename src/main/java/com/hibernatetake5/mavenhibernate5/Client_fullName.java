/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernatetake5.mavenhibernate5;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author JRome
 */

@Embeddable
public class Client_fullName implements Serializable {
    
    private String fname;
    private String lname;
    private String mname;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    @Override
    public String toString() {
        return "Client_fullName{" + "fname=" + fname + ", lname=" + lname + ", mname=" + mname + '}';
    }
    
   
    
    
}
