package assignmentset5;

import org.junit.Assert;
import org.junit.Test;

public class BillPaymentTest {
	@Test
	public void validatePaymentOptionTestInvalid() {
		Bill1 bill = new Bill1("Paypal");
		// Provide a valid value and observe the JUnit test report
		Assert.assertFalse(bill.validatePaymentOption());
	}
}
