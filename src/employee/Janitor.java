package employee;

public class Janitor extends Employee {

	private final int jConstant = 42069;
	
	protected Janitor(String name, int age, int years) {
		super(name, age, years);
	}

	@Override
	public float calculateSalary() {
		return (float) ((super.getYears() * jConstant) * (Math.pow(.95, super.getYears())));
	}

	@Override
	public String getBenefits() {
		String benefits = "\tHealth Insurance"
				+ "\n\tFitness Center"
				+ "\n\tComplimentary Breakfast (Totino's Pizza Rolls)"
				+ "\n\tComplimentary Lunch (Quizno's Subs)"
				+ "\n\tComplimentary Supper (Burger King $1 Chicken Nuggets - 10 piece)";
		return benefits;
	}

	@Override
	public float calculateChanceToBeFired() {
		return 0;
	}

	@Override
	public String toString() {
		return "Janitor: " + super.getName() + "\nAge: " + super.getAge() + "\nYears Worked: " + super.getYears() + "\nSalary: " + calculateSalary() + "\nBenefits:\n" + getBenefits() ;
	}

}
