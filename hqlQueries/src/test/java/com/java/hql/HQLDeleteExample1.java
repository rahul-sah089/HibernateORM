package com.java.hql;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import util.HibernateUtils;

public class HQLDeleteExample1 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();

		Query query = session
				.createQuery("delete from  Employee where name=:employeeOldName");
		query.setParameter("employeeOldName", "rahul baba");
		int row = query.executeUpdate();
		System.out.println("Number of rows deleted-->"+row);
	}
}
