package AssignmentSet6;

public class OfficeStaff extends Faculty{
	
	private String designation;
	
	public OfficeStaff(String name, float basicSalary, String designation) {
		super(name, basicSalary);
		this.designation = designation;
	}
	
	@Override
	public double calculateSalary() {
		int add = 0;
		if (designation.contentEquals("Accountant")) {
			add = 10000;
		} else if (designation.contentEquals("Clerk")) {
			add = 7000;
		} else if (designation.contentEquals("Peon")) {
			add = 4500;
		}
		return super.calculateSalary() + add;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
}
