package Thread1;

public class mythread2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Thread.currentThread());
		
		Thread t1 = new Thread(new emailcampaign());
		
		Thread t2 = new Thread(new dataextracter());
		
		t1.setName("emailcampaign");
		t2.setName("dataextraction");
		
		//t1.setPriority(Thread.MAX_PRIORITY);
		//t2.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("inside main ");
		
	}

}


class emailcampaign implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =0; i<5; i++)
		{
			System.out.println("Inside emailcampaign");
			System.out.println(Thread.currentThread().getName());
			
		}
		
	}
	
}

class dataextracter implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("Inside dataextraction");
		System.out.println(Thread.currentThread().getName());
		
	}
	
}
