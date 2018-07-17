package Thread1;

public class mythread extends Thread{
	
	public static void main(String args[])
	{
		Task task = new Task();
		Thread th = new Thread(task);
		th.start();
		
		System.out.println("Inside main");
	}

}

class Task implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Inside run....");
		go();
	}

	private void go() {
		// TODO Auto-generated method stub
		
		System.out.println("Inside go....");
		
		more();
	}

	private void more() {
		// TODO Auto-generated method stub
		System.out.println("Inside more....");

	}
	
	
}
