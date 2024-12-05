package com.hbt.hibernate_003;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hbt.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();
        Transaction trns = session.beginTransaction();
        
        Student student = new Student("Kamaljit behera",20,"akamaljitbehera123@gmail.com","kamaljit");
        Student student2 = new Student("Adarsha kumar mahara",21,"adarsha@gmail.com","adarsha");
        session.save(student);
        session.save(student2);
        trns.commit();
        
    }
}
