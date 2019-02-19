import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;  
  
public class MainApp {  
      
    public static void main(String args[])  
    {  
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("Employee_Details");  
        EntityManager em=emf.createEntityManager();  
        em.getTransaction().begin(); 
      
          
        Employee s=new Employee();
        s.setE_id(1);
        s.setE_name("Yatharth");
        s.setE_age(21);
        em.persist(s);
        em.getTransaction().commit();
        em.close();
        emf.close();
       
    } 
  
}  