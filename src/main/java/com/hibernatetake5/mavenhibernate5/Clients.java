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
public class Clients implements Serializable {
    
    @Id
    private int id;
    private fullName fullName;
    private String phoneNumber;
    private String appointment_date;
    private int price;
    private String discounts;
    private String email_address;
    private String date_of_birth;   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public fullName getFullName() {
        return fullName;
    }

    public void setFullName(fullName fullName) {
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDiscounts() {
        return discounts;
    }

    public void setDiscounts(String discounts) {
        this.discounts = discounts;
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
        return "Clients{" + "id=" + id + ", fullName=" + fullName + ", phoneNumber=" + phoneNumber + ", appointment_date=" + appointment_date + ", price=" + price + ", discounts=" + discounts + ", email_address=" + email_address + ", date_of_birth=" + date_of_birth + '}';
    }

    void setPhone_number(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    