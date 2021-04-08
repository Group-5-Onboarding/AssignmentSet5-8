package AssignmentSet6;

public class Faculty {
	private String name;
	private float basicSalary;
	private float bonusPercentage;
	private float carAllowancePercentage;
	
	public Faculty(String name, float basicSalary) {
		this.name = name;
		this.basicSalary = basicSalary;
		bonusPercentage = 4;
		carAllowancePercentage = 2.5f;
	}
	
	public double calculateSalary() {
		return basicSalary + (.01 * basicSalary * ( bonusPercentage + carAllowancePercentage));
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(float basicSalary) {
		this.basicSalary = basicSalary;
	}

	public float getBonusPercentage() {
		return bonusPercentage;
	}

	public void setBonusPercentage(float bonusPercentage) {
		this.bonusPercentage = bonusPercentage;
	}

	public float getCarAllowancePercentage() {
		return carAllowancePercentage;
	}

	public void setCarAllowancePercentage(float carAllowancePercentage) {
		this.carAllowancePercentage = carAllowancePercentage;
	}
	
	
}
