package queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class arraydeque {
	
	public static void main(String args[])
	{
		Queue<String> fif = new ArrayDeque<>();
		
		fif.add("Hi");
		fif.add("there");
		fif.add("wasssup?");
		
		System.out.println(fif.remove());
		System.out.println(fif.remove());
		System.out.println(fif.remove());
		System.out.println();
		
		Deque<String> lif = new ArrayDeque<>();
		
		lif.push("hi");
		lif.push("there");
		lif.push("wasssup?");
		
		System.out.println(lif.pop());
		System.out.println(lif.pop());
		System.out.println(lif.pop());
		
		
	}

}
