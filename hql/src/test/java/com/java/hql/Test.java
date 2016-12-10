package com.java.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import pojo.OldStudent;
import util.HibernateUtils;

public class Test{
	
	public static void main(String[] args){
		System.out.println("Main method started");
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		
		Transaction transaction = session.beginTransaction();
		OldStudent oldStudent1 =  new OldStudent(1,"rahul sah", "rahul.sah089@gmail.com", "120 gt road south howrah");
		OldStudent oldStudent2 =  new OldStudent(2,"rahul singh", "rahul.singh089@gmail.com", "120 ft road south howrah");
		OldStudent oldStudent3 =  new OldStudent(3,"rahul somanai", "rahul.somanai089@gmail.com", "120 ft road south howrah");
		session.save(oldStudent1);
		session.save(oldStudent2);
		session.save(oldStudent3);
		transaction.commit();
		
		System.out.println("Main method ended");
	}
}
