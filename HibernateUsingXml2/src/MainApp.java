import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class MainApp {
	

	
		private static SessionFactory factory; 
		public static void main(String[] args) {
			
			 factory=HibernateUtil.getSessionFactory();
			
			Session session=factory.openSession();
			Transaction tx=session.beginTransaction();
			Employee user=new Employee();
			
			user.setName("updated name1");
			session.save(user);
			tx.commit();
			session.close();

	}

}