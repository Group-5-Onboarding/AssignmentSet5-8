package AssignmentSet8;

public class CheckWebAddressValidity {
	public static boolean checkWebAddressValidity(String address) {
		String regex = "(http|https)://[w]{3}[.][\\w\\d]+[.]com";
		if(address.matches(regex)) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		String webAddress = "https://www.company.com";
        System.out.println("The web address is "+ (checkWebAddressValidity(webAddress) ? "valid!" : "invalid!"));

	}

}
