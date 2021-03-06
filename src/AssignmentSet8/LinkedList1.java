package AssignmentSet8;

import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

public class LinkedList1 {
	public static List<Integer> removeDuplicates(List<Integer> list) {
        //Implement your logic here and change the return statement accordingly
		List<Integer> unique = new LinkedList<Integer>();
		Iterator i = list.iterator();
		while (i.hasNext()) {
			Object value = i.next();
			if (!unique.contains(value)) {
				unique.add((Integer)value);
			}
		}
        return unique;
	}
	
	public static void main(String args[]) {
		List<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(15);
		list.add(21);
		list.add(15);
		list.add(10);
		
		List<Integer> updatedList = removeDuplicates(list);
		
		System.out.println("Linked list without duplicates");
		for (Integer value : updatedList) {
			System.out.print(value+" ");
		}
	}
	
}
