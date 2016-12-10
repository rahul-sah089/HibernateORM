package com.java.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import pojo.Employee;
import util.HibernateUtils;

public class Test{
	
	public static void main(String[] args){
		System.out.println("Main method started");
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Employee employee1 = new Employee(1,"rahul1","rahul1.sah089@gmail.com","120 GT road(s) howrah");
		Employee employee2 = new Employee(1,"rahul2","rahul2.sah089@gmail.com","120 GT road(s) howrah");
		Employee employee3 = new Employee(1,"rahul3","rahul3.sah089@gmail.com","120 GT road(s) howrah");
		Employee employee4 = new Employee(1,"rahul4","rahul4.sah089@gmail.com","120 GT road(s) howrah");
		
		session.save(employee1);
		session.save(employee2);
		session.save(employee3);
		session.save(employee4);
		
		transaction.commit();
		
		
		
		
		System.out.println("Main method ended");
	}
}
