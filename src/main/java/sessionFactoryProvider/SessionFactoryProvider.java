package sessionFactoryProvider;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryProvider {
	private static SessionFactory factory;
	public static SessionFactory getSessionFactory() {
		// TODO Auto-generated method stub
		if(factory == null) {
			factory = new Configuration().configure().buildSessionFactory();
		}
		return factory;
	}
	
	public static void closeSessionFactory() {
		if(factory.isOpen()) {
			factory.close();
		}
	}
}
