 package com.java.hql;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import util.HibernateUtils;

public class HqlAgregate {
	public static void main(String[] args){
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		Session session = sessionFactory.openSession();
		String hql = "select max(id) from Employee";
		Query query = session.createQuery(hql);
		double id = (Double)query.uniqueResult();
		System.out.println("max id---->"+id);
		session.close();
		sessionFactory.close();
	}
}
