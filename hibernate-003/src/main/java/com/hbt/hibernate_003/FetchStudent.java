package com.hbt.hibernate_003;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hbt.entity.Student;

public class FetchStudent {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		
//		get method
		
		Student student = session.get(Student.class, 1);
		System.out.println(student);//Student(id=1, name=Kamaljit behera, age=20, email=akamaljitbehera123@gmail.com, password=kamaljit)
		
//		We i try to access the same object more than one the hibernate access database only once and store data in cache memory and
//		return data from there.
		Student student1 = session.get(Student.class, 1);
		System.out.println(student1);//Student(id=1, name=Kamaljit behera, age=20, email=akamaljitbehera123@gmail.com, password=kamaljit)
		
		Student student2 = session.get(Student.class, 3);
		System.out.println(student2);//null
		
		
//		load method
		
		Student student3 = session.load(Student.class, 1);
//		Until i not use the student3 object the hibernate don't bother to access the database
		
//		if i want to print the id of student3 which is provided by database it return the id pass in the argument but not access the database
		System.out.println(student3.getId());//1
		
//		but i try to access the student3 other date except id then it access the database
		System.out.println(student3);//Student(id=1, name=Kamaljit behera, age=20, email=akamaljitbehera123@gmail.com, password=kamaljit)
//		
		Student student5 = session.load(Student.class, 1);
		System.out.println(student5);//Student(id=1, name=Kamaljit behera, age=20, email=akamaljitbehera123@gmail.com, password=kamaljit)
	
//		Student student4 = session.load(Student.class, 3);
//		
//		System.out.println(student4.getId());//3 but 3 is not present in my database because it return the id present in the argument
//		System.out.println(student4);//throw ObjectNotfoundException
		
		
		
		
		
	}
}
