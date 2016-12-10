package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	
	private static SessionFactory sessionFactory = null;
	public static SessionFactory getSessionFactory(){
		Configuration config = new Configuration().configure("config/hibernate.cfg.xml");
		sessionFactory = config.buildSessionFactory();
		return sessionFactory;
	}

}
