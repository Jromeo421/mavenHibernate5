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
public class fullName implements Serializable {
    
    private String fname;
    private String mname;
    private String lname;
    

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    @Override
    public String toString() {
        return "fullName{" + "fname=" + fname + ", mname=" + mname + ", lname=" + lname + '}';
    }
    
    
    }