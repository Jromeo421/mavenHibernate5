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
    private Client_fullName client_fullName;
    private String phone_number;
    private String appointment_date;
    private int price;
    private int discounts;
    private String email_address;
    private String date_of_birth;   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Client_fullName getClient_fullName() {
        return client_fullName;
    }

    public void setClient_fullName(Client_fullName client_fullName) {
        this.client_fullName = client_fullName;
    }


    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
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

    public int getDiscounts() {
        return discounts;
    }

    public void setDiscounts(int discounts) {
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
        return "Clients{" + "id=" + id + ", client_name=" + client_name + ", phone_number=" + phone_number + ", appointment_date=" + appointment_date + ", price=" + price + ", discounts=" + discounts + ", email_address=" + email_address + ", date_of_birth=" + date_of_birth + '}';
    }
    
}
    