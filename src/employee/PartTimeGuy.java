package employee;

public class PartTimeGuy extends Employee {

	protected PartTimeGuy(String name, int age, int years) {
		super(name, age, years);
	}

	@Override
	public float calculateSalary() {
		return (float) ((super.getYears() * 25000) * (Math.pow(.95, super.getYears())));
	}

	@Override
	public String getBenefits() {
		return 0;
	}

	@Override
	public float calculateChanceToBeFired() {
		return 0;
	}

}
