package com.java.hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import pojo.Employee;
import util.HibernateUtils;

public class HQLSelectWithSort {

	public static void main(String[] args) {
		System.out.println("Main method started");
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();

		Query query = session.createQuery("from  Employee order by name");
		List<Employee> emps = query.list();

		for (Employee emp : emps) {
			System.out.println("Emp id-->" + emp.getId());
			System.out.println("Emp name-->" + emp.getName());
			System.out.println("Emp email-->" + emp.getEmail());
			System.out.println("Emp address-->" + emp.getAddress());

		}
	}
}
