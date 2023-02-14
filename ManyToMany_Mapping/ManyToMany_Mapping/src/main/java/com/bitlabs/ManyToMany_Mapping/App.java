package com.bitlabs.ManyToMany_Mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bitlabs.Entity.Employee;
import com.bitlabs.Entity.Project;

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
        Session s=sf.openSession();
        
        Transaction tx=s.beginTransaction();
        Employee e1=new Employee();
        Employee e2=new Employee();
        
        e1.setId(101);
        e1.seteName("Madar");
        
        e2.setId(102);
        e2.seteName("Saheb");
        
        Project p1=new Project();
        Project p2=new Project();
        
        p1.setId(201);
        p1.setpName("java project");
        
        p2.setId(202);
        p2.setpName("python project");
        
        
        List<Project> listP=new ArrayList();
        List<Employee> listE=new ArrayList();
        
        listP.add(p1);
        listP.add(p2);
        
        listE.add(e2);
        listE.add(e1);
        
        e1.setP(listP);
        p1.setE(listE);
        
        
        s.save(e1);
        s.save(e2);
        s.save(p1);
        s.save(p2);
        
        
        
        tx.commit();
        s.close();
        
    }
}
