package AssignmentSet9;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SalesSort {
	
	public static List<String> sortSales(Map<String, Integer> sales) {
		List<String> salesList = new ArrayList<String>();
		List<Integer> intList = new ArrayList<Integer>(sales.values());
		
		Collections.sort(intList, Collections.reverseOrder());
		
		for(Integer value: intList) {
			
			for(Map.Entry<String, Integer> entry : sales.entrySet()) {
				
				if(entry.getValue() == value) {
					salesList.add(entry.getKey());
					sales.remove(entry.getKey(), entry.getValue());
					break;
				}
			}
		}
		return salesList;
	}
	
	public static void main(String args[]) {
	    Map<String, Integer> sales = new HashMap<String, Integer>();
		sales.put("Mathew", 50);
		sales.put("Lisa", 76);
		sales.put("Courtney", 45);
		sales.put("David", 49);
		sales.put("Paul", 49);
		
		List<String> employees = sortSales(sales);
		
		System.out.println("Employees in the decreasing order of their sales\n=====================================");
		for (String employeeName : employees) {
			System.out.println(employeeName);
		}
	}
}
