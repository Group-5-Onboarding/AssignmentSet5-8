package AssignmentSet6;

class Payment{
    private int customerId;
	private String paymentId;
    private double serviceTaxPercentage;
    
    public Payment( int customerId) {
    	this.customerId = customerId;
    }
    
    public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public double getServiceTaxPercentage() {
		return serviceTaxPercentage;
	}

	public void setServiceTaxPercentage(double serviceTaxPercentage) {
		this.serviceTaxPercentage = serviceTaxPercentage;
	}
	
	public double payBill(double amount) {
		return amount;
	}
}

class DebitCardPayment extends Payment{
	private static int counter;
	private double discountPercentage;
	
	static {
		counter = 1000;
	}
	public DebitCardPayment(int customerId) {
		super(customerId);
		super.setPaymentId("D"+ ++DebitCardPayment.counter);
	}
	
	public static int getCounter() {
		return DebitCardPayment.counter;
	}

	public static void setCounter(int counter) {
		DebitCardPayment.counter = counter;
	}

	public double getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	
	public double payBill(double amount) {
		double bill = amount;
		
		if(amount <=500) {
			this.setServiceTaxPercentage(2.5);
			this.setDiscountPercentage(1);
		}else if(amount> 500 && amount <= 1000) {
			this.setServiceTaxPercentage(4);
			this.setDiscountPercentage(2);
		} else if(amount >1000) {
			this.setServiceTaxPercentage(5);
			this.setDiscountPercentage(3);
		}
		
		return bill * (1+this.getServiceTaxPercentage()/100) - bill* this.getDiscountPercentage()/100;
	}
}

class CreditCardPayment extends Payment{
	private static int counter;
	
	static {
		counter = 1000;
	}
	
	public CreditCardPayment(int customerId) {
		super(customerId);
		super.setPaymentId("C"+ ++CreditCardPayment.counter);
	}
	
	public static int getCounter() {
		return CreditCardPayment.counter;
	}

	public static void setCounter(int counter) {
		CreditCardPayment.counter = counter;
	}
	
	public double payBill(double amount) {
		double bill = amount;
		
		if(amount <=500) {
			this.setServiceTaxPercentage(3);
		}else if(amount> 500 && amount <= 1000) {
			this.setServiceTaxPercentage(5);
		} else if(amount >1000) {
			this.setServiceTaxPercentage(6);
		}
		return bill * (1+this.getServiceTaxPercentage()/100);
	}
}

public class AbstractAssignment1 {
	public static void main(String args[]){
        DebitCardPayment debitCardPayment = new DebitCardPayment(101);
        double billAmount=Math.round(debitCardPayment.payBill(500)*100)/100.0;
		System.out.println("Customer Id: " + debitCardPayment.getCustomerId());
		System.out.println("Payment Id: " + debitCardPayment.getPaymentId());
		System.out.println("Service tax percentage: " + debitCardPayment.getServiceTaxPercentage());
		System.out.println("Discount percentage: " + debitCardPayment.getDiscountPercentage());
		System.out.println("Total bill amount: " + billAmount);
		
		CreditCardPayment creditCardPayment = new CreditCardPayment(102);
        billAmount=Math.round(creditCardPayment.payBill(1000)*100)/100.0;
		System.out.println("Customer Id: " + creditCardPayment.getCustomerId());
		System.out.println("Payment Id: " + creditCardPayment.getPaymentId());
		System.out.println("Service tax percentage: " + creditCardPayment.getServiceTaxPercentage());
		System.out.println("Total bill amount: " + billAmount);
    }
}
