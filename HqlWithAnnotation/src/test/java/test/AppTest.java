package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import pojo.NewStudent;
import util.HibernateUtils;

public class AppTest {
	public static void main(String[] args){
		System.out.println("Main method started");
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session =  sf.openSession();
		
		Transaction trans = session.beginTransaction();
		//==========================================================
		NewStudent newStudent =  new NewStudent();
		
		//==========================================================
		
		trans.commit();
		
		
		System.out.println("Main method ended");
	}

}
