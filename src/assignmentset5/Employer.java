package AssignmentSet5;

class Employee {
    
    private int employeeId;
    private String employeeName;
    private double salary;
    
    public Employee() {
    	System.out.println("Default constructor");
    }
    
    public Employee(int employeeId, String employeeName) {
    	this.employeeId = employeeId;
    	this.employeeName = employeeName;
    }
	
    public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String toString(){
        return "Employee\nemployeeId: "+this.getEmployeeId()+"\nemployeeName: "+this.getEmployeeName()+"\nsalary: "+this.getSalary();
    }
}


class PermanentEmployee extends Employee {
	private double basicPay;
	private double hrs;
	private float experience;
      
    public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}

	public double getHrs() {
		return hrs;
	}

	public void setHrs(double hrs) {
		this.hrs = hrs;
	}

	public float getExperience() {
		return experience;
	}

	public void setExperience(float experience) {
		this.experience = experience;
	}
	
	public PermanentEmployee(int empId, String name, double basicPay, double hra, float experience) {
		this.setEmployeeId(empId);
		this.setEmployeeName(name);
		this.setBasicPay(basicPay);
		this.setHrs(hra);
		this.setExperience(experience);
	}
	
	public double calculateMonthlySalary() {
		double percentage;
		if (this.getExperience() < 3) {
			percentage = 0;
		} else if (this.getExperience() >= 3 && this.getExperience() < 5) {
			percentage = 0.05;
		} else if (this.getExperience() >= 5 && this.getExperience() < 10) {
			percentage = 0.07;
		} else {
			percentage = 0.12;
		}
		return this.getHrs() + this.getBasicPay() + (percentage * this.getBasicPay());
	}

	@Override
	public String toString(){
        return "PermanentEmployee\nemployeeId: "+this.getEmployeeId()+"\nemployeeName: "+this.getEmployeeName()+"\nsalary: "+this.getSalary()+"\nbasicPay: "+this.getBasicPay()+"\nhra: "+this.getHra()+"\nexperience: "+this.getExperience();
    }

	private String getHra() {
		// TODO Auto-generated method stub
		return null;
	}
}

class ContractEmployee extends Employee {
    
	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public float getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(float hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	private double wage;
	private float hoursWorked;
	
	public ContractEmployee(int empId, String name, double wage, float hoursWorked) {
		this.setEmployeeId(empId);
		this.setEmployeeName(name);
		this.setWage(wage);
		this.setHoursWorked(hoursWorked);
	}
	
	public double calculateSalary() {
		return this.getHoursWorked() * this.getWage();
	}
	
    @Override
	public String toString(){
        return "ContractEmployee\nemployeeId: "+this.getEmployeeId()+"\nemployeeName: "+this.getEmployeeName()+"\nsalary: "+this.getSalary()+"\nwage: "+this.getWage()+"\nhoursWorked: "+this.getHoursWorked();
    }
}
public class Employer {
	 public static void main(String[] args) {
	      
		 PermanentEmployee permanentEmployee = new PermanentEmployee(711211, "Rafael", 1850, 115, 3.5f);
	     permanentEmployee.calculateMonthlySalary();
	     System.out.println("Hi "+permanentEmployee.getEmployeeName()+", your salary is $"+Math.round(permanentEmployee.getSalary()*100)/100.0);
	            
	     ContractEmployee contractEmployee = new ContractEmployee(102, "Jennifer", 16, 90);
	     contractEmployee.calculateSalary();
	     System.out.println("Hi "+contractEmployee.getEmployeeName()+", your salary is $"+Math.round(contractEmployee.getSalary()*100)/100.0);
	        
	        //Create more objects for testing your code
	    }
}
