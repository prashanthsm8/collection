package set;

import java.util.HashSet;
import java.util.Set;

public class sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> st = new HashSet<>();
		
		st.add("abcd");
		st.add("fghi");
		st.add("abcd");
		
		System.out.println("set :" +st);
		
		book b1 = new book("abcd", "xyz");
		
		book b2 = new book("abcd","xyz");
		
		book b3 = new book("abcd3","xyz1");
		
		Set<book> st2 = new HashSet<>();
		st2.add(b1);
		st2.add(b2);
		st2.add(b3);
		
		System.out.println("set :" +st2);
		
		
	}


}
