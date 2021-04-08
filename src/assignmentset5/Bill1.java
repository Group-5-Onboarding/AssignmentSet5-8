package assignmentset5;

class Bill1 {
	private String paymentMode;
	// other variables and methods
	public Bill1(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public boolean validatePaymentOption() {
		if (paymentMode.equals("Credit Card")
				|| paymentMode.equals("Debit Card")
				|| paymentMode.equals("PayPal")
				|| paymentMode.equals("Amazon Pay")
				|| paymentMode.equals("Google Pay")) {
			return true;
		}
		return false;
	}
}