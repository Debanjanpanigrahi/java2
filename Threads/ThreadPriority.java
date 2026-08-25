package MultiThreading;

public class ThreadPriority {
	
	public static void main(String[] args)
	{
		Thread t1= new Thread(()->{
			System.out.println("Custom thread 1 is running");
		});
		
		Thread t2= new Thread(()->{
			System.out.println("Custom thread 2 is running");
		});
		
		t1.start();
		t1.setPriority(10);
		t2.start();
	}
}
