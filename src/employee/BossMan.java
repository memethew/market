package employee;

public class BossMan extends Employee {

	protected BossMan(String name, int age) {
		super(name, age);
	}

	@Override
	public short calculateSalary() {
		return 0;
	}

	@Override
	public long calculateBenefits() {
		return 0;
	}

	@Override
	public float calculateChanceToBeFired() {
		return 0;
	}

}
