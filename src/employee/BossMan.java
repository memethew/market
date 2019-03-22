package employee;

public class BossMan extends Employee {

	protected BossMan(String name, int age, int years) {
		super(name, age, years);
	}

	@Override
	public float calculateSalary() {
		return (float) ((super.getYears() * 15000) * (Math.pow(.95, super.getYears())));
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
