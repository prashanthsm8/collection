package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class keyss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> al = new ArrayList<>();
		
		al.add(1);
		
		Map<List<Integer>, Integer> mp = new HashMap<>();
		mp.put(al, 1);
		
		al.add(2);
		
		System.out.println(mp.get(al));
	}

}
