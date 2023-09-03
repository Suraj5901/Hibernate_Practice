package com.Hibernat.ProjectWithMaven;

import java.util.Scanner;

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
        System.out.println( "Project Started......!" );
        
//        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
//        factory.getCurrentSession();
        
//        System.out.println(factory);
//        
//        System.out.println(factory.isClosed());
        
        //<<<<<<<<<<<<<<<<<<<<<<<<Creating Studing>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
     
        
        Scanner sc = new Scanner(System.in);
        
        Student st = new Student();
        System.out.println("Enter the Student Id: ");
        int id = sc.nextInt();
        
        System.out.println("Enter the Student Name: ");
        String name = sc.next();
        
        System.out.println("Enter the Student City: ");
        String city = sc.next();
        
        st.setId(id);
        st.setName(name);
        st.setCity(city);
        
        System.out.println(st);
        

        Session session = factory.openSession(); // in starting use this openSession
//      Session session = factory.getCurrentSession(); // after starting one time use getCurrentSession
        
        
        
       Transaction tx =  session.beginTransaction();
        session.save(st);
        session.getTransaction();
        tx.commit();
        
        session.close();
        
    }
}
