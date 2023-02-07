package com.bitlabs.My_First_Hibernate;

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
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();
        
       
        Session s=sf.openSession();
        Employee emp=new Employee();
        emp.setId(104);
        emp.setName("shwetha");
        emp.setSalary(30000);
        
        Transaction tx=s.beginTransaction();
        
        s.save(emp);
        
        tx.commit();
        s.close();
        
        
        
    }
}
