package employee;

public class BossMan extends Employee {

	protected BossMan(String name, int age, int years) {
		super(name, age, years);
	}

	@Override
	public float calculateSalary() {
		return 0;
	}

	@Override
	public String calculateBenefits() {
		return 0;
	}

	@Override
	public float calculateChanceToBeFired() {
		return 0;
	}

}
