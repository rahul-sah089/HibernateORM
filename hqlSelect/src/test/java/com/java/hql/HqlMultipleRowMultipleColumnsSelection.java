package com.java.hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import pojo.Employee;
import util.HibernateUtils;

public class HqlMultipleRowMultipleColumnsSelection {

	public static void main(String[] args) {
		System.out.println("Main method started");
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();

		String hql = "select id,email,address from Employee";
		Query query = session.createQuery(hql);
		List<Object> objects = query.list();

		for (Object obj : objects) {
			Object arr[] = (Object[]) obj;
			for (Object ar : arr) {
				System.out.println(ar);
			}
		}

		transaction.commit();

		System.out.println("Main method ended");

	}

}
