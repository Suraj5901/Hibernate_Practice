package com.Hibernat.ProjectWithMaven;

import org.hibernate.SessionFactory;
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
        
        System.out.println(factory);
        
        System.out.println(factory.isClosed());
        
    }
}
