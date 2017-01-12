package com.java.hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import pojo.Employee;
import util.HibernateUtils;

public class HQLUpdateExample1 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();

		Query query = session
				.createQuery("update Employee set name=:employeeNewName where name=:employeeOldName");
		query.setParameter("employeeNewName", "rahul baba");
		query.setParameter("employeeOldName", "rahul1");
		int row = query.executeUpdate();
		System.out.println("Number of rows updated-->"+row);
	}
}
