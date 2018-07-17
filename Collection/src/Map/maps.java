package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> mymap = new HashMap<>();
		
		mymap.put("arun", 10);
		mymap.put("barath", 20);
		mymap.put("charith", 30);
		mymap.put("dhawan", 40);
		
		System.out.println("map:"+ mymap);
		
		System.out.println("getkey:"+ mymap.get("arun"));
		
		System.out.println("getkey:"+ mymap.containsKey("arun"));
		
		System.out.println("iterating to map");
		
		Set<String> keyss = mymap.keySet();
		
		for (String string : keyss) {
			
			System.out.println("key : "+ string +", value :"+ mymap.get(string));
		}
		
		Set<Map.Entry<String, Integer>> mappings = mymap.entrySet();
		
		for (Map.Entry<String, Integer> entry : mappings) {
			
			System.out.println("key : "+ entry.getKey() +", value :"+ entry.getValue());
		}
		
		
		
		
	}

}
