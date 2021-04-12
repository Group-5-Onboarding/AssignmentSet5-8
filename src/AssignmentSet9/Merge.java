package AssignmentSet9;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class Merge {
	public static Map<String, Integer> mergeMaps(Map<String, Integer> mapOne, Map<String, Integer> mapTwo){
        Map<String, Integer> mergedMap = new HashMap<String, Integer>(mapOne);
        
    	for(Map.Entry<String, Integer> entry : mapTwo.entrySet()) {
    		
    		if(mergedMap.containsKey(entry.getKey())) {
    			
    			if(mergedMap.get(entry.getKey()) != entry.getValue()) {
    				mergedMap.put(entry.getKey()+"new", entry.getValue());
    			}
    			continue;
    		}else {
    			mergedMap.put(entry.getKey(), entry.getValue());
    		}
    	}
    	
		return mergedMap;
	}

	public static void main(String args[]) {
		Map<String, Integer> mapOne = new HashMap<String, Integer>();
		mapOne.put("Kelly", 10);
		mapOne.put("Micheal", 20);
		mapOne.put("Ryan", 30);
		
		Map<String, Integer> mapTwo = new HashMap<String, Integer>();
		mapTwo.put("Jim", 15);
		mapTwo.put("Andy", 45);

		Map<String, Integer> mergedMap = mergeMaps(mapOne, mapTwo);

		System.out.println("Merged Map\n===========");
		for (Entry<String, Integer> entry : mergedMap.entrySet()) {
			System.out.println(entry.getKey()+" -- "+entry.getValue());
		}
	
	}
}
