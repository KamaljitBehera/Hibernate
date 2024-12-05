package com.hbt.hibernate_002;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hbt.anotationEntity.Address;
import com.hbt.entity.Student;
import com.hbt.entity.Teacher;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
      Configuration config = new Configuration();
      config.configure("hibernate.cfg.xml");
      SessionFactory factory = config.buildSessionFactory();
      
//      Creating student object
      Student student = new Student(1,"Kamaljit Behera","Chandaka");
      Student student1 = new Student(2,"Adarsha Maharana","Bharatpur");
      
//      Creating teacher object
      
      Teacher teacher = new Teacher(1,"Rakesh jena",20);
      
      
      Address ad = new Address();
      ad.setAddedDate(new Date());
      ad.setCity("Bhubaneswar");
      ad.setOpen(false);
      ad.setStreet("street1");
  
      FileInputStream stream = new FileInputStream("src/main/java/pic.jpg");
      byte[] bt=new byte[stream.available()];
      stream.read(bt);
      
      ad.setImage(bt);
      
      Session session = factory.openSession();
      
      Transaction transaction = session.beginTransaction();
      Serializable save = session.save(student);
      Serializable save2 = session.save(student1);
      Serializable save3 = session.save(teacher);
      session.save(ad);
      transaction.commit();
      System.out.println(save);
      System.out.println(save);
      
      
      session.close();
      
      
    }
}
