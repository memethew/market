package employee;
import java.util.Date;

public abstract class Employee {
	
	private String name;
	private int age;
	private int years;
	
	protected Employee(String name, int age, int years) {
		this.name = name;
		this.age = age;
		this.years = years; 
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

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}
	
	public abstract float calculateSalary();
	public abstract String calculateBenefits();
	public abstract float calculateChanceToBeFired();
	public abstract String toString();
	
	public static void main(String[] args) {
		Janitor j = new Janitor("Jimbo", 69, 12);
		System.out.println(j);
	}
}
