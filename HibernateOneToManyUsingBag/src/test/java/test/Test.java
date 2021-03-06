package test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import pojo.Answer;
import pojo.Question;
import util.HibernateUtil;

public class Test {
	public static void main(String[] args) {
		System.out.println("Maven + Hibernate + MySQL");

		Session session = HibernateUtil.buildSessionFactory().openSession();

		session.beginTransaction();
		
		List<Answer> answersList1 = new ArrayList<Answer>();
		List<Answer> answersList2 = new ArrayList<Answer>();
		Answer answer1 = new Answer();
		answer1.setAnswername("Answer1 for question1");
		answer1.setPostedBy("rahul");
		
		Answer answer2 = new Answer();
		answer2.setAnswername("Answer2 for question1");
		answer2.setPostedBy("rahul");
		
		Answer answer3 = new Answer();
		answer1.setAnswername("Answer1 for question2");
		answer1.setPostedBy("anjali");
		
		Answer answer4 = new Answer();
		answer1.setAnswername("Answer2 for question2");
		answer1.setPostedBy("anjali");
		
		answersList1.add(answer1);
		answersList1.add(answer2);
		
		answersList2.add(answer3);
		answersList2.add(answer4);
		
		Question question1 = new Question();
		question1.setQname("question 1");
		question1.setAnswers(answersList1);
		
		Question question2 = new Question();
		question1.setQname("question 2");
		question1.setAnswers(answersList2);
		
		session.save(question1);
		session.save(question2);
		
		session.getTransaction().commit();
	}
}
