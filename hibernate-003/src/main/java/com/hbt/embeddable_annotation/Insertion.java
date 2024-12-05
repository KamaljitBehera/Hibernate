package com.hbt.embeddable_annotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Insertion {
public static void main(String[] args) {
	Configuration config = new Configuration();
	config.configure("hibernate.cfg.xml");
	SessionFactory factory = config.buildSessionFactory();
	Session session = factory.openSession();
	Transaction ts = session.beginTransaction();
	
	Course course = new Course();
	course.setId(21021);
	course.setName("physics");
	course.setDuration("20 dec 2024");
	
	Teacher teacher = new Teacher();
	teacher.setTechName("Kamaljit Behera");
	teacher.setEmail("kamaljitbehera@gmail.com");
	teacher.setCourse(course);
	
	session.save(teacher);
	ts.commit();
	
	
	session.close();
	factory.close();
}
}
