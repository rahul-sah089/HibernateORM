package com.java.hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import pojo.Employee;
import util.HibernateUtils;

public class HQLSelect {

	public static void main(String[] args) {
		System.out.println("Main method started");
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();

		Query query = session.createQuery("from Employee");
		List<Employee> empList = query.list();
		System.out.println("Printing employee information");
		for (Employee emp : empList) {
			System.out.println("Emp Id-->" + emp.getId());
			System.out.println("Emp Name-->" + emp.getName());
			System.out.println("Emp Email-->" + emp.getEmail());
			System.out.println("Emp Address-->" + emp.getAddress());
		}

		System.out.println("Main method ended");
	}
}
