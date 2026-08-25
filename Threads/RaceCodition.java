package MultiThreading;

public class RaceCodition {
	
	public static void main(String[] args)
	{
		counter c1 = new counter();
		
		Thread t1=new Thread(()->{
			for(int i=1; i<=1000;i++) {
				c1.increment();
			}
		});
		
		Thread t2=new Thread(()->{
			for(int i=1;i<=1000;i++) {
				c1.increment();
			}
		});
		
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		}
		catch(Exception e) {
			
		}
		System.out.print(c1.count);
	}
}

class counter{
	public int count = 0;
	synchronized void increment() {
		count++;
	}
}