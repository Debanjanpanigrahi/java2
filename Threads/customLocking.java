package MultiThreading;

public class customLocking {
	public static void main(String[] args)
	{
		Bank b1=new Bank();
		Thread t1 = new Thread(()->b1.deposite());
		Thread t2 = new Thread(()->b1.withdraw());
		
		t1.start();
		
		t2.start();
		
	}
}

class Bank{
	
	
	synchronized void deposite()
	{
		System.out.println("Deposite Logic");
		try {
			Thread.sleep(2000);
		}
		catch(Exception ex)
		{
			
		}
	}
	
	synchronized void withdraw() {
		System.out.println("Withdraw Logic....");
		try {
			Thread.sleep(2000);
		}
		catch(Exception ex) {
			
		}
		
	}
}

class Bank1{
	
	Object lock1 = new Object();
	Object lock2 = new Object();
	
	void m1() {
		synchronized(this) {
		System.out.println(Thread.currentThread().getName()+"Entering m1");
		try {
			Thread.sleep(2000);
		}
		catch(Exception e) {
			System.out.println(Thread.currentThread().getName()+"Exiting m1");
		}
		}
	}
	
	 void deposite()
	{
		 synchronized(lock1) {
		 System.out.println("Deposite Logic");
		 try {
			Thread.sleep(2000);
		 }
		 catch(Exception ex)
		 {
			
		 }
		}
	}
	
	
	 
	 void withdraw() {
		 synchronized(lock2) {
		 System.out.println("Withdraw Logic....");
		 try {
			 Thread.sleep(2000);
		}
		catch(Exception ex) {
			
		}
		}
	 }
		
}