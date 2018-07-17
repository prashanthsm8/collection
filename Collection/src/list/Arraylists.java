package list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Arraylists<T> {
	
	public static void main(String args[])
	{
		
		// assigning it to a Interface
		Collection<Integer> cl = new ArrayList<>();
		
		cl.add(1);
		cl.add(3);
		cl.add(3);
		cl.add(4);
		cl.add(null);
		
		System.out.println("arrlis" + cl);
		
		cl.remove(2);
		
		System.out.println("arrlis " + cl);
		
		List<Integer> cl2 = new ArrayList<>();
		
		cl2.addAll(cl);
		
		System.out.println("arrlis2"+ cl2);
		
		cl2.remove(2);
		
		System.out.println("arrlis2"+ cl2);
		
		List<Integer> cl3 = new ArrayList<>();
		cl3.add(3);
		cl3.add(4);
		
		//cl2.retainAll(cl3);
		
		cl2.removeAll(cl3);
		
		
		
		System.out.println("arrlis2"+ cl2);
		
		
		System.out.println("search l3  "+ cl2.get(1));
		
		cl2.set(1, 3);
		
		System.out.println("all2 " + cl2);
		
		System.out.println("all2 " + cl2.contains(1));
		
		System.out.println("all2 " + cl2.lastIndexOf(1) + cl2.indexOf(1));
		
		List<Integer> cl4 = cl2.subList(0, 1);
		
		System.out.println("all4 " + cl4);
		
		for (Integer it1 : cl2) {

			System.out.println("element " +  it1);
			
			/*
			if(it1 == 3)
			{
				cl2.remove(Integer.valueOf(it1));
			}
			*/
			
			
			
		}
		
		Iterator<Integer> itr = cl2.iterator();
		
		// iterator allows concurrent modification 
		
		while(itr.hasNext())
		{
			Integer it1 = itr.next();
			
			if(it1 == 3)
			{
				itr.remove();
			}
		}
		
		System.out.println("al2 " + cl2 );
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
	}

}
