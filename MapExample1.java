import java.util.*;
public class MapExample1 {
public static void main (String [] args) {
	Map <String, String> map1 = new HashMap<String,String>();
	
	map1.put("School", "A place where you to school");
	map1.put("Sun", "The center of the universe");
	map1.put("Jupitar", "The largest Planet");
	map1.put("Mercury", "The smallest Planet");
	map1.put("Moon", "A rock that rotates around the Earth");
	map1.put("Moon", "A satellite that has 4 phases");
	
	System.out.println("\n Printing Key Set");
	
	
	for (String word : map1.keySet()) {
		System.out.println(word + " " + map1.get(word));
		
		
	}
	
	System.out.println(map1);
	
	
	Map <String, ArrayList<String>> map2 = new HashMap <String, ArrayList< String>>();
		// word, define, define 2, word, dtfn, deft2...
	String [] dictionary = { " Namath", "Jet", "Alabama", "Trump", "President", "Businessman" , "Clinton" , "President", "Govenor" };
	
	String key = " ";
	int count = 0;
	for (int i = 0; i < dictionary.length; i++) {
		String word = dictionary[i];
		if (count == 0) 
			key = word;
		else {
			if (map2.get(key) == null) {
				ArrayList<String> list = new ArrayList<String>();
				list.add(word);
				map2.put(key, list);
			}
			else {
				map2.get(key).add(word);
			} 
			
			
		} // end else
		count++;
		if (count == 3) 
			count = 0;
	}
	System.out.println(map2);
}
}

