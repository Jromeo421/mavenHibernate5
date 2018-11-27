package com.hibernatetake5.mavenhibernate5;

/**
 * Hello world!
 *
 */
public class App {
    
    public static void main(String[] args)
    {
       Clients hibernate = new Clients();
       hibernate.setId(101);
       hibernate.setClient_name("Jamie Hugh");
       hibernate.setPhone_number("8015576053");
       hibernate.setAppointment_date("12-03-18");
       hibernate.setPrice("65");
       hibernate.setDiscounts(0);
       hibernate.setEmail_address("jromeo421@gmail.com");
       hibernate.setDate_of_birth("4-21-83");
       
    }
}
