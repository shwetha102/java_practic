package com.bitlabs.HibernateAnotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Employeee emp=new Employeee();
        emp.setEid(123);
        emp.setEname("shwetha");
        emp.setEphonenum(964490439);
        emp.setEsalary(25000);
        emp.setEaddress("Bangalore");
        
        Session s=sf.openSession();
        Transaction tx=s.beginTransaction();
        
        s.save(emp);
        
        tx.commit();
        s.close(); 
             
       
    }
}
