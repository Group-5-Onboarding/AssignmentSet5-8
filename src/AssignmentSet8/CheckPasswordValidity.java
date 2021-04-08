package AssignmentSet8;

public class CheckPasswordValidity {
	public static boolean checkPasswordValidity(String password) {
		String regex = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}";
		if(password.matches(regex)) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		String password = "P@$sW0rd";
        System.out.println("The password is "+ (checkPasswordValidity(password) ? "valid!" : "invalid!"));
	}

}
