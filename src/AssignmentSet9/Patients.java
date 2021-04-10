package AssignmentSet9;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

class Patient {

	private String name;
	private String gender;
	private int age;
	
	public Patient(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Name: "+this.name+", Gender: "+this.gender+", Age: "+this.age;
	}
}

public class Patients {
	 public static List<Deque<Patient>> splitQueue(Deque<Patient> patientsQueue) {
		    //Implement your logic here and change the return statement accordingly
		 	List newList = new ArrayList<Patient>();
		 	Deque<Patient> patientsOver60 = new ArrayDeque();
		 	Deque<Patient> allOtherPatients = new ArrayDeque();
		 	
		 	for (Patient patient : patientsQueue) {
		 		if (patient.getAge() < 60) {
		 			allOtherPatients.add(patient);
		 		} else {
		 			patientsOver60.add(patient);
		 		}
		 	}
		 	newList.add(patientsOver60);
		 	newList.add(allOtherPatients);
		 	
			return newList;
		}

		public static void main(String[] args) {
			
			Patient patient1=new Patient("Jack","Male",25);
			Patient patient2=new Patient("Tom","Male",64);
			Patient patient3=new Patient("Simona","Female",24);

			Deque<Patient> patientsQueue = new ArrayDeque<Patient>();
			patientsQueue.add(patient1);
			patientsQueue.add(patient2);
			patientsQueue.add(patient3);

			List<Deque<Patient>> queuesList = splitQueue(patientsQueue);
			
			int counter=0;
			for (Deque<Patient> queue : queuesList) {
				if(counter==0)
					System.out.println("Patients in the senior queue\n============================");
				else
					System.out.println("Patients in the normal queue\n============================");
				
				for (Patient patient : queue) {
					System.out.println("Name : "+patient.getName());
					System.out.println("Age : "+patient.getAge());
					System.out.println();
				}
				counter++;
			}	
		}
}
