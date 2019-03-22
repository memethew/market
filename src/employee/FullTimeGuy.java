package employee;

public class FullTimeGuy extends Employee {

	protected FullTimeGuy(String name, int age, int years) {
		super(name, age, years);
	}

	@Override
	public float calculateSalary() {
		return (float) ((super.getYears() * 35000) * (Math.pow(.95, super.getYears())));
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
