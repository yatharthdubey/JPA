import javax.persistence.*;  
  
@Entity  
@Table(name="empl1")  
public class Employee {  
  
    @Id  
    private int e_id;  
    private String e_name;  
    private int e_age;
    
   
	public int getE_id() {
		return e_id;
	}
	
	public void setE_id(int e_id) {
		this.e_id = e_id;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public int getE_age() {
		return e_age;
	}
	public void setE_age(int e_age) {
		this.e_age = e_age;
	}  
      

}  