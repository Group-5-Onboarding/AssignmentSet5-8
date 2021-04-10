package AssignmentSet8;

import org.junit.Assert;

class InvalidPrincipalException extends Exception {
	InvalidPrincipalException(String message) {
		super(message);
	}
}

class InvalidTimeException extends Exception {
	InvalidTimeException(String message) {
		super(message);
	}
}

class InvalidRateException extends Exception {
	InvalidRateException(String message) {
		super(message);
	}
}

class Calculator {
	public double calculateSimpleInterest(double principal, double time, double rate) {
		try {
			if (principal < 0) {
				throw new InvalidPrincipalException("Invalid principal amount");
			}
			
			try {
				if (time < 0) {
					throw new InvalidTimeException("Invalid time period");
				}
				
				try {
					if (rate < 0) {
						throw new InvalidRateException("Invalid interest rate");
					}
				} catch (InvalidRateException e) {
					System.out.println("Invalid interest rate");
				}
			} catch (InvalidTimeException e) {
				System.out.println("Invalid time period");
			}
		} catch (InvalidPrincipalException e) {
			System.out.println("Invalid principal amount");
		}
		
		return principal * rate * time;
	}
}

public class UnitTestingAndCodeCoverage {
	
	static void main(String args[]) {
		Calculator Ti89 = new Calculator();
		double simpleInterest = Ti89.calculateSimpleInterest(3.2, 10, 3.1);
		System.out.println(simpleInterest);
	}
}
