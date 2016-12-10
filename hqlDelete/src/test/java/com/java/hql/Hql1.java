package com.java.hql;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import pojo.OldStudent;
import util.HibernateUtils;

public class Hql1{
	
	public static void main(String[] args){
		System.out.println("Main method started");
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		String hql = "delete  NewStudent where id=4";
		Query query = session.createQuery(hql);
		int rowNum = query.executeUpdate();
		System.out.println("No of row dumped from old to new table --->"+rowNum);
		transaction.commit();
		
		System.out.println("Main method ended");
	}
}
