package set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class treesets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		book b1 = new book("abcd", "xyz");
		
		book b2 = new book("abcd","xyz");
		
		book b3 = new book("abcd3","xyz1");
		
		Set<book> st2 = new TreeSet<>(new TitleComparator());
		st2.add(b1);
		st2.add(b2);
		st2.add(b3);
		System.out.println("set :" +st2);
	}
}

class TitleComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return ((book)o1).getTitle().compareTo(((book)o2).getTitle());
	}
	
}