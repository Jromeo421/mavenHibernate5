package com.hibernatetake5.mavenhibernate5;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

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
       hibernate.setPrice(65);
       hibernate.setDiscounts(0);
       hibernate.setEmail_address("jromeo421@gmail.com");
       hibernate.setDate_of_birth("4-21-83");
       
       Configuration con = new Configuration().configure().addAnnotatedClass(Clients.class);
       
        ServiceRegistry reg = new ServiceRegistryBuilder().applySetting(con.getProperties()).buildServiceRegistry();
                
        
        SessionFactory sf = con.buildSessionFactory(reg);
        
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        
        session.save(hibernate);
        
        tx.commit();
        
    }
}
