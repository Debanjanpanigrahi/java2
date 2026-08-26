package MultiThreading;

public class staticLock {
	public static void main(String[] args) {
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		
		t1.start();
		t2.start();
	}
}

class Counter{
	static int count = 0;
	
	synchronized static void increment() {
		try {
			Thread.sleep(2000);
		}
		catch(Exception ex) {
			
		}
		count++;
		System.out.println(count);
	}
}