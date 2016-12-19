package test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import pojo.Question;
import util.HibernateUtil;

public class Test {
	public static void main(String[] args) {
		System.out.println("Maven + Hibernate + MySQL");

		Session session = HibernateUtil.buildSessionFactory().openSession();

		session.beginTransaction();
		Question question1 = new Question();
		question1.setId(1);
		question1.setqName("question 1");
		List<String> answers1 = new ArrayList<String>();
		answers1.add("answer1 for question 1");
		answers1.add("answer2 for question 1");
		answers1.add("answer3 for question 1");
		answers1.add("answer4 for question 1");
		question1.setAnswers(answers1);
		session.save(question1);
		
		Question question2 = new Question();
		question2.setId(2);
		question2.setqName("question 2");
		List<String> answers2 = new ArrayList<String>();
		answers2.add("answer1 for question 2 ");
		answers2.add("answer2 for question 2");
		answers2.add("answer3 for question 2");
		answers2.add("answer4 for question 2");
		question1.setAnswers(answers2);
		session.save(question2);
		session.getTransaction().commit();
	}
}
