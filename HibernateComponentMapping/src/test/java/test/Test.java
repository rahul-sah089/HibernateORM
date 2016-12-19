package test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import pojo.Address;
import pojo.Employee;
import util.HibernateUtil;

public class Test {
	public static void main(String[] args) {
		System.out.println("Maven + Hibernate + MySQL");

		Session session = HibernateUtil.buildSessionFactory().openSession();
		session.beginTransaction();
		// //////////////////////////////////////////////////////////////////////////////////////////
		Address address = new Address();
		address.setCity("Kolkata");
		address.setCountry("India");
		address.setPincode(711101);

		Employee emp = new Employee();
		emp.setAddress(address);
		emp.setId(1);
		emp.setName("Rahul");

		session.save(emp);
		// /////////////////////////////////////////////////////////////////////////////////////////
		session.getTransaction().commit();
	}
}
