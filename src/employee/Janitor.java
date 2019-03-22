package employee;

public class Janitor extends Employee {

	protected Janitor(String name, int age, int years) {
		super(name, age, years);
	}

	@Override
	public float calculateSalary() {
		return (float) ((super.getYears() * 42069) * (Math.pow(.95, super.getYears())));
	}

	@Override
	public String calculateBenefits() {
		/* add each line to list and accordingly calculate based on salary, last benefit is $150k */
		String benefits = "Health Insurance"
				+ "\nFitness Center"
				+ "\nComplimentary Breakfast (Totino's Pizza Rolls)"
				+ "\nComplimentary Lunch (Quizno's Subs)"
				+ "\nComplimentary Supper (Burger King $1 Chicken Nuggets - 10 piece)";
		return benefits;
	}

	@Override
	public float calculateChanceToBeFired() {
		return 0;
	}

	@Override
	public String toString() {
		return "Janitor: " + super.getName() + "\nAge: " + super.getAge() + "\nYears Worked: " + super.getYears() + "\nSalary: " + calculateSalary() + "\nBenefits:\n" + calculateBenefits() ;
	}

}
