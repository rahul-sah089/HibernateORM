package com.java.hql;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

import pojo.Employee;
import util.HibernateUtils;

public class CriteriaAggretionExample {
	public static void main(String[] args){
		System.out.println("Main method started");
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		
		Criteria criteria =  session.createCriteria(Employee.class);
		Projection projection = Projections.avg("id");
		criteria.setProjection(projection);
		Object obj = criteria.uniqueResult();
		Double avg = (Double) obj;
		System.out.println("Average--->"+avg);
		System.out.println("Main method ended");
	}

}
