package AssignmentSet6;

public class Teacher extends Faculty {
	private String qualification;
	
	public Teacher(String name, float basicSalary, String qualification) {
		super(name, basicSalary);
		this.qualification = qualification;
	}
	
	@Override
	public double calculateSalary() {
		int add = 0;
		if (qualification.contentEquals("Doctoral")) {
			add = 20000;
		} else if (qualification.contentEquals("Masters")) {
			add = 18000;
		} else if (qualification.contentEquals("Bachelors")) {
			add = 15500;
		} else if (qualification.contentEquals("Associate")) {
			add = 10000;
		}
		return super.calculateSalary() + add;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	
	
}
