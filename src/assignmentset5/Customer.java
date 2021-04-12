package AssignmentSet5;

public class Customer {
	public String customerId;
	public String customerName;
	public long contactNumber;
	public Address address;
	
	Customer(){
		
	}
	
	Customer(String customerId, String customerName, long contactNumber, Address address) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.address = address;
	}
	
	Customer(String customerName, long contactNumber, Address address) {
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.address = address;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void displayCustomerDetails() {
		System.out.println("Customer ID: " + this.customerId);
		System.out.println("Customer name: " + this.customerName);
		System.out.println("Customer phone: " + this.contactNumber);
		System.out.println("Customer address: " + this.address.address);
	}
	
	public void payBill(double totalPrice) {
		System.out.println("Total price = $" + totalPrice);
	}
	
	public static void main(String args[]) {
		
		Address add = new Address("0000 test drive");
		Customer cus = new Customer("0001", "Name", 123456789, add);
		cus.displayCustomerDetails();
		cus.payBill(500);
	}
}
