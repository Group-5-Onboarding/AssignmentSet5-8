package AssignmentSet5;

public class Order {
	public static int orderIdCounter = 0;
	private int orderId;
	private Customer customer;
	private Food[] orderedFoods;
	private double totalPrice;
	private String status;
	
	public Order() {
		this.orderId = 100 + ++Order.orderIdCounter;
		status = "Ordered";
	}
	
	public Order(Food[] orderedFoods, Customer customer) {
		this.orderId = 100 + ++Order.orderIdCounter;
		this.orderedFoods = orderedFoods;
		this.status = "Ordered";
		this.customer = customer;
	}
	
	public static int getTotalNoOfOrders() {
		return orderIdCounter;
	}
	
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Food[] getOrderedFoods() {
		return orderedFoods;
	}

	public void setOrderedFoods(Food[] orderedFoods) {
		this.orderedFoods = orderedFoods;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double calculateTotalPrice(int unitPrice) {
		System.out.println("Order Id: " + orderId);
		System.out.println("Ordered Food: " + orderedFoods);
		System.out.println("Ordered Status: " + status);
		totalPrice = 1.05 * unitPrice;
		
		System.out.println("Total Price = $" + totalPrice);
		return totalPrice;
	}
	
	public static void main(String[] args) {
		Food food = new Food("Test");
		Food[] allFood = new Food[] {food};
		Address address = new Address("0000 Test Drive");
		Customer customer = new Customer("Name", 1234556789  , address);
		Order order = new Order(allFood, customer);

	}
}
