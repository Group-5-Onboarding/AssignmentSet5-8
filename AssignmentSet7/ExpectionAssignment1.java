package AssignmentSet7;


class InvalidCouponCodeExpection extends Exception {
	public InvalidCouponCodeExpection(String message) {
		super(message);
	}
}

class InvalidDestinationExpection extends Exception {
	public InvalidDestinationExpection(String message) {
		super(message);
	}
}

class InvalidTripPackageExpection extends Exception {
	public InvalidTripPackageExpection(String message) {
		super(message);
	}
}


class BusBooking{
    private int bookingId;
	private String destination;
    private String tripPackage;
    private double totalAmount;
    
    
    public BusBooking(int bookingId, String destination, String tripPackage) {
    	this.bookingId = bookingId;
    	this.destination = destination;
    	this.tripPackage = tripPackage;
    }
    
    public int getBookingId() {
		return bookingId;
	}


	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}


	public String getDestination() {
		return destination;
	}


	public void setDestination(String destination) {
		this.destination = destination;
	}


	public String getTripPackage() {
		return tripPackage;
	}


	public void setTripPackage(String tripPackage) {
		this.tripPackage = tripPackage;
	}


	public double getTotalAmount() {
		return totalAmount;
	}


	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	public String bookTrip(String couponCode, int numberOfMembers) {
		String des = this.getDestination();
		String pack = this.getTripPackage();
		int pricePerMember = 0;
		
		try {			
			if(des == "Washington DC" || des == "Philadephia" || des == "Orlando" || des == "Boston" || des == "Atlanta") {
				try {
					if(pack == "Regular") {
						pricePerMember = 500;
					}else if(pack == "Premium"){
						pricePerMember = 800;
					} else {
						throw new InvalidTripPackageExpection("Invalid package.");
					}
					
				} catch(InvalidTripPackageExpection e) {
					System.out.println(e.getMessage());
				}
			}else {
				throw new InvalidDestinationExpection("Invalid Destination");
			}
		} catch(InvalidDestinationExpection e){
			System.out.println(e.getMessage());
		}
		
		if(pricePerMember!=0) {
			if(validateCouponCode(couponCode, numberOfMembers)) {
				this.setTotalAmount(pricePerMember*numberOfMembers);
				return "Booking successful";
			}
		}
		
		
		return "Your booking was not successful, please try again!";
	}
	
	
	public boolean validateCouponCode(String couponCode, int numberOfMembers) {
		try {
			if(couponCode == "BIGBUS") {
				if(numberOfMembers >= 10) {
					return true;
				}
			}else if(couponCode == "MAGICBUS") {
				if(numberOfMembers >= 15) {
					return true;
				}
			}
			throw new InvalidCouponCodeExpection("Invalid coupon code");
		} catch(InvalidCouponCodeExpection e){
			System.out.println(e.getMessage());
		}
		return false;
	}
}

public class ExpectionAssignment1 {
	public static void main(String[] args) {
		BusBooking booking = new BusBooking(101,"Orlando", "Regular");
		String result = booking.bookTrip("BIGBUS",8);
		if(result.equals("Booking successful")){
			System.out.println(result);
			System.out.println("Total amount for the trip: " + booking.getTotalAmount());
		}
		else{
//			System.out.println(result);
			System.out.println("Your booking was not successful, please try again!");
		}
	}
}
