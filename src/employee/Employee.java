package employee;
import java.util.Date;
public abstract class Employee {
	private String name;
	private int age;
	private Date dateCreated;
	
	protected Employee(String name, int age) {
		this.name = name;
		this.age = age;
		this.dateCreated = new Date();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	public abstract short calculateSalary();
	public abstract long calculateBenefits();
	public abstract float calculateChanceToBeFired();
}
