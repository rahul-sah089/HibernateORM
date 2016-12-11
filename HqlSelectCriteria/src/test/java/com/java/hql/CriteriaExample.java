package com.java.hql;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import pojo.Employee;
import util.HibernateUtils;

public class CriteriaExample {
	public static void main(String[] args) {
		System.out.println("Main method started");
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Employee.class);
		List<Employee> emps = cr.list();
		for (Employee emp : emps) {
			System.out.println("========================");
			System.out.println("Employee id--->" + emp.getId());
			System.out.println("Employee name--->" + emp.getName());
			System.out.println("Employee Email--->" + emp.getEmail());
			System.out.println("Employee Address--->" + emp.getAddress());
			System.out.println("========================");
		}
		System.out.println("Main method ended");
	}

}
