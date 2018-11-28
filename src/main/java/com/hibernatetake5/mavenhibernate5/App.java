package com.hibernatetake5.mavenhibernate5;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App {
    
    public static void main(String[] args)
    {
       clientInfo hibernateObject = new clientInfo(); 
       hibernateObject.setClientid(101);
       hibernateObject.setPhoneNumber("(801)557-6053");
       hibernateObject.setAppointment_date("12-03-18");
       hibernateObject.setDiscountCode("none");
       hibernateObject.setDate_of_birth("4-21-1983");
       hibernateObject.setFullName("Jamie Lynne Hugh");
       hibernateObject.setEmail_address("Savvyandsassyboutique@gmail.com");
       hibernateObject.setServicePrice(65);
       Configuration con = new Configuration().configure().addAnnotatedClass(clientInfo.class);
       
       @SuppressWarnings("deprecation")
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
                
        SessionFactory sf = con.buildSessionFactory(reg);
        
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        
       session.save(hibernateObject);
        
        tx.commit();
        
        System.out.println(hibernateObject);
    }
}
