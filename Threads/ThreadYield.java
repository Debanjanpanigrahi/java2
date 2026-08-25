package MultiThreading;

public class ThreadYield {
	public static void main(String[] args)
	{
		Thread t1 = new Thread(()->{
			try {
				for(int i = 1 ;i <= 10; i++) {
					System.out.println("Thread-1 : " + i);
					Thread.yield();
				}
				
			}
			catch(Exception e) {
				
			}
		});
		
		Thread t2 = new Thread(()->{
			try {
				for(int i = 1 ;i <= 10; i++) {
					System.out.println("Thread-2:" + i);
				}
				
			}
			catch(Exception e) {
				
			}
		});
		
		t1.start();
		t2.start();
	}
}
