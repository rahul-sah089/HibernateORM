package myProject;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {

	private static final SessionFactory sessionFactory = buildSessionFactory();
	public static SessionFactory buildSessionFactory() {
		SessionFactory  sessionFactory =  null;
		try {
		sessionFactory =  new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return sessionFactory;
	}

}
