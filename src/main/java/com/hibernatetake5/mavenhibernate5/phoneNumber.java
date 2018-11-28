/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernatetake5.mavenhibernate5;

/**
 *
 * @author JRome
 */
public class phoneNumber {
    
    private String pnumber;

    public String getPnumber() {
        return pnumber;
    }

    /**
     *
     * @param pnumber
     */
    
    public void setPnumber(String pnumber) {
        this.pnumber = pnumber;
    }

    

    @Override
    public String toString() {
        return "phoneNumber{" + "pnumber=" + pnumber + '}';
    }
    
    
}
