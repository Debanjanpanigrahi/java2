package MultiThreading;

public class VisibilityProblem {
	static volatile boolean flag = false;
	public static void main(String[] args)
	{
		
		Thread t1 = new Thread(()->{
			try {
			Thread.sleep(1000);
			}
			catch(Exception e) {
				
			}
		flag= true;	
			
		});
		
		Thread t2 = new Thread(()->{
			while(flag != true) {
				//System.out.println("Thread 2 running");
			}
			System.out.println("Thread 2 finished");
		});
		t1.start();
		t2.start();
	}
}
