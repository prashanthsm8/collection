package Map;

import java.util.HashMap;
import java.util.Map;

public class maps2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Map<String,Object>> userprofile = new HashMap<>();
		Map<String,Object> profile = new HashMap<>();
		
		profile.put("age",25);
		profile.put("dept","CS");
		profile.put("city","new york");
	
		
		userprofile.put("jhon", profile);
		
		profile.put("age",29);
		profile.put("dept","CS");
		profile.put("city","new york");
		
		userprofile.put("Raj", profile);
		
		System.out.println("MAP"+ userprofile);
		
		
		
		
	}

}
