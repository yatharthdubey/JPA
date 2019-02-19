import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class CreateTable {
	
	private static SessionFactory factory; 
	public static void main(String[] args) {
		
		 factory=HibernateUtil.getSessionFactory();
		
		if(factory!=null)
		{
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Employee user=new Employee();
		user.setName("user 1");
		session.save(user);
		
		tx.commit();
      session.close();
      
      ReadData();
      
      
	}
		else
			System.out.println("Session factory is null");

}

	private static void ReadData() {
		// TODO Auto-generated method stub
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Employee user1=(Employee)session.get(Employee.class,5);
		System.out.println(user1.getName());
		tx.commit();
		session.close();
		
		
	}
}