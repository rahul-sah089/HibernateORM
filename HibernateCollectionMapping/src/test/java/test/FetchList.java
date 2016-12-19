package test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import pojo.Answer;
import pojo.Question;
import util.HibernateUtil;

public class FetchList {
	public static void main(String[] args) {
		System.out.println("Main Methodd Started");
		SessionFactory sessionFactory = HibernateUtil.buildSessionFactory();
		Session session = sessionFactory.openSession();
		// ///////////////////////////////////////////////////////////////////////////
		Query query = session.createQuery("from Question");
		List<Question> questions = query.list();
		Iterator<Question> itr = questions.iterator();
		while (itr.hasNext()) {
			Question question = itr.next();
			System.out.println("Question Name--->" + question.getId());
			System.out.println("Question Name--->" + question.getqName());
			List<String> answers = question.getAnswers();
			System.out.println("Question ka answer --->");
			for(String answer : answers) {
				System.out.println("---->" + answer);
			}
		}
		session.close();
		sessionFactory.close();
		// ///////////////////////////////////////////////////////////////////////////
		System.out.println("Main Methodd Ended");
	}
}
