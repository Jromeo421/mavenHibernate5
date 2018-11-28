package com.hibernatetake5.mavenhibernate5;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App {
    
    public static void main(String[] args)
    {
       fullName cfn = new fullName();
       phoneNumber pum = new phoneNumber();
       Clients hibernate = new Clients();
       appointmentDate apd = new appointmentDate();
       discountCode dc = new discountCode();
       
       hibernate.setId(101);
       hibernate.setClient_name(cfn);
       hibernate.setPhone_number(pum);
       hibernate.setAppointment_date(apd);
       hibernate.setPrice(65);
       hibernate.setDiscounts(dc);
       hibernate.setEmail_address("jromeo421@gmail.com");
       hibernate.setDate_of_birth("4-21-83");
       
       hibernate.setEmail_address("jromeo421@gmail.com");
       hibernate.setDate_of_birth("4-21-83");
       
       Scanner discountCode = new Scanner (System.in);
       System.out.println("What is your discount code( if null put none)?");
       String discounts = discountCode.nextLine();
       dc.setDiscountCode(discounts);
       
       Scanner first = new Scanner (System.in);
       System.out.println("What is your first name?");
       String fname = first.nextLine();
       cfn.setFname(fname);
       
       Scanner middle = new Scanner (System.in);
       System.out.println("What is your middle name?");
       String mname = middle.nextLine();
       cfn.setMname(mname);
       
       Scanner last = new Scanner (System.in);
       System.out.println("What is your last name?");
       String lname = last.nextLine();
       cfn.setLname(lname);
              
       Scanner appointment = new Scanner (System.in);
       System.out.println("\nWhat date do you want to schedule for an appointment?");
       System.out.println("\nAppointments are scheduled during normal business hours");
       String appointmentDate = appointment.nextLine();
       apd.setAppointmentDate(appointmentDate);   
       
       
       Configuration con = new Configuration().configure().addAnnotatedClass(Clients.class);
       
       @SuppressWarnings("deprecation")
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
                
        SessionFactory sf = con.buildSessionFactory(reg);
        
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        
       session.save(hibernate);
        
        tx.commit();
        
        System.out.println(hibernate);
    }
}
