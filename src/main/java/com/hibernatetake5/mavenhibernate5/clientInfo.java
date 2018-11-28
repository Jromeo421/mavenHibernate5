/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernatetake5.mavenhibernate5;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author JRome
 */
@Entity
@Table(name="Clients")
public class clientInfo implements Serializable {
    
    @Id
    private int Clientid;
    private String fullName;
    private String phoneNumber;
    private String appointment_date;
    private int servicePrice;
    private String discountCode;
    private String email_address;
    private String date_of_birth;   

    public int getClientid() {
        return Clientid;
    }

    public void setClientid(int Clientid) {
        this.Clientid = Clientid;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAppointment_date() {
        return appointment_date;
    }

    public void setAppointment_date(String appointment_date) {
        this.appointment_date = appointment_date;
    }

    public int getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(int servicePrice) {
        this.servicePrice = servicePrice;
    }

    public String getDiscountCode() {
        return discountCode;
    }

    public void setDiscountCode(String discountCode) {
        this.discountCode = discountCode;
    }

    public String getDiscounts() {
        return discountCode;
    }

    public void setDiscounts(String discountCode) {
        this.discountCode = discountCode;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }   

    @Override
    public String toString() {
        return "clientInfo{" + "Clientid=" + Clientid + ", fullName=" + fullName + ", phoneNumber=" + phoneNumber + ", appointment_date=" + appointment_date + ", price=" + servicePrice + ", discounts=" + discountCode + ", email_address=" + email_address + ", date_of_birth=" + date_of_birth + '}';
    }
}
    