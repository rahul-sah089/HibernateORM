package com.java.hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import pojo.Employee;
import util.HibernateUtils;

public class HqlMultipleRowSelection {

	public static void main(String[] args) {
		System.out.println("Main method started");
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		Session session = sessionFactory.openSession();

		//Transaction transaction = session.beginTransaction();

		String hql = "select name from Employee";
		Query query = session.createQuery(hql);
		List<String> names = query.list();

		for (String name : names) {
			System.out.println("Employee Name--->" + name);
		}

		//transaction.commit();

		System.out.println("Main method ended");

	}

}
