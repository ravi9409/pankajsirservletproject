package hibernate1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class A {
	
	public static void main(String[] args) {
		
		UserName userName=new UserName();
		userName.setId(100);
		userName.setName("smith");
		
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(userName);
		session.getTransaction().commit();
		session.close();
		
	}

}
