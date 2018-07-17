package Thread1;

public class Racedemo {
	
	public static void main(String args[])
	{
		Bankaccount task = new Bankaccount();
		task.setBalance(100);
		   
		   Thread john = new Thread(task);
		   Thread anita = new Thread(task);	   
		   john.setName("John");
		   anita.setName("Anita");
		   john.start();
		   anita.start();
	}

}

class Bankaccount implements Runnable {
	
	private int balance;
	public void setBalance(int balance) {
		this.balance = balance;		
	}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		makeWithdrawal(75);
		if (balance < 0) {
			System.out.println("Money overdrawn!!!");
		}
	}


	private synchronized void makeWithdrawal(int amount) {
		// TODO Auto-generated method stub
	
		if (balance >= amount) {
			System.out.println(Thread.currentThread().getName() + " is about to withdraw ...");
			balance -= amount;
			System.out.println(Thread.currentThread().getName() + " has withdrawn " + amount + " bucks");
	    } else {
	    	System.out.println("Sorry, not enough balance for " + Thread.currentThread().getName());
	    }
		
	}
	
}
