package AssignmentSet7;

interface Testable{
    public boolean testCompatibility();
}

class Mobile {
    //Implement your code here
	private String name;
	private String brand;
	private String operatingSystemName;
	private String operatingSystemVersion;
	
	public Mobile(String name, String brand, String operatingSystemName, String operatingSystemVersion) {
		this.name = name;
		this.brand = brand;
		this.operatingSystemName = operatingSystemName;
		this.operatingSystemVersion = operatingSystemVersion;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getOperatingSystemName() {
		return operatingSystemName;
	}

	public void setOperatingSystemName(String operatingSystemName) {
		this.operatingSystemName = operatingSystemName;
	}

	public String getOperatingSystemVersion() {
		return operatingSystemVersion;
	}

	public void setOperatingSystemVersion(String operatingSystemVersion) {
		this.operatingSystemVersion = operatingSystemVersion;
	}
}
class SmartPhone extends Mobile implements Testable {
    private String networkGeneration;
    
    public SmartPhone(String name, String brand, String operatingSystemName, String operatingSystemVersion, String networkGeneration) {
    	super(name, brand, operatingSystemName, operatingSystemVersion);
    	this.networkGeneration = networkGeneration;
    }

	public String getNetworkGeneration() {
		return networkGeneration;
	}

	public void setNetworkGeneration(String networkGeneration) {
		this.networkGeneration = networkGeneration;
	}
    
	@Override
    public boolean testCompatibility() {
    	String name = this.getOperatingSystemName();
    	String generation = this.getNetworkGeneration();
    	String version = this.getOperatingSystemVersion();
    	if(name.equals("Saturn")) {
    		if(generation.equals("3G")) {
    			return (version.equals("1.1")|version.equals("1.2") | version.equals("1.3"));
    		}else if(generation.equals("4G")) {
    			return (version.equals("1.2") | version.equals("1.3"));
    		}else if(generation.equals("5G")) {
    			return (version.equals("1.3"));
    		}
    	}else if(name.equals("Gara")) {
    		if(generation.equals("3G")) {
    			return (version.equals("EXRT.1")|version.equals("EXRT.2") | version.equals("EXRU.1"));
    		}else if(generation.equals("4G")) {
    			return (version.equals("EXRT.2") | version.equals("EXRU.1"));
    		}else if(generation.equals("5G")) {
    			return (version.equals("EXRU.1"));
    		}
    	}
    	return false;
    }
}

public class MobileTester {
	public static void main(String args[]){
		SmartPhone smartPhone = new SmartPhone("KrillinM20", "Nebula", "Saturn", "1.3", "5G");
		if(smartPhone.testCompatibility())
		    System.out.println("The mobile OS is compatible with the network generation!");
		else
		    System.out.println("The mobile OS is not compatible with the network generation!");
		
		//Create more objects for testing your code
	}
}
