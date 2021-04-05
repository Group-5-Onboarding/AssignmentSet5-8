package assignmentset5;

public class Bill {

	public double findPrice(int itemId) {
		switch(itemId) {
			case 1001:
				return 25;
			case 1002:
				return 25;
			case 1003:
				return 25;
			case 1004:
				return 25;
			default:
				return 0;
		}
	}

	public double findPrice(String brandName, String itemType, int size) {
		switch(brandName) {
		case "Puma":
			if(itemType == "T-shirt") {
				if(size == 34 || size == 36) {
					return 25;
				}else {
					return 0;
				}
			}else if(itemType == "Skirt") {
				if(size == 38 || size == 40) {
					return 20;
				}else {
					return 0;
				}
			}else {
				return 0;
			}
		case "Reebok":
			if(itemType == "T-shirt") {
				if(size == 34 || size == 36) {
					return 23;
				}else {
					return 0;
				}
			}else if(itemType == "Skirt") {
				if(size == 38 || size == 40) {
					return 18;
				}else {
					return 0;
				}
			}else {
				return 0;
			}
		default:
			return 0;
		}
	}

	public static void main(String[] args) {
		Bill bill = new Bill();
		
		double price = bill.findPrice(1001);
		if(price>0)
		    System.out.println("Price of the selected item is $"+price);
		else
		    System.out.println("The Item Id is invalid");
		
		price = bill.findPrice("Reebok","T-shirt",34);
		if(price>0)
		    System.out.println("Price of the selected item is $"+price);
		else
		    System.out.println("The values are not valid");
	}

}
