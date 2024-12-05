package com.hbt.hibernate_001;

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
        System.out.println( "Learning start.." );
        
        Configuration confi = new Configuration();
        confi.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = confi.buildSessionFactory();
        
        System.out.println(sessionFactory);
        System.out.println(sessionFactory.isClosed());
    }
}
