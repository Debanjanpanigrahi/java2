package MultiThreading;

public class ThreadMethods {
	
	public static void main(String[] args)
	{
		System.out.println("Main thread starts");
		Thread t1 = new Thread(()->{
			try {
				Thread.sleep(2000);
				System.out.println("Thread-0 starts");
			}
			catch(Exception e) {
				
			}
		});
		
		t1.start();
		
		try {
			//t1.join();
			t1.join(1000);
		}
		catch(Exception e) {
			
		}
		
		System.out.println("Main Thread Ends");
	}

}
