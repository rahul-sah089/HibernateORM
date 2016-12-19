package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sessionFactory = null;

	public static SessionFactory buildSessionFactory() {
		Configuration config = new Configuration()
				.configure("config/hibernate.cfg.xml");
		sessionFactory = config.buildSessionFactory();
		return sessionFactory;
	}

}
