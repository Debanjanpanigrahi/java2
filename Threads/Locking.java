package MultiThreading;

public class Locking {
	public static void main(String[] args)
	{
		Test t = new Test();
		
		Thread t1 = new Thread(() ->t.show());
		
		Thread t2 = new Thread(() ->t.show());
		
		t1.start();
		t2.start();
	}
}


class Test{

	synchronized void show()
	{
		System.out.println(Thread.currentThread().getName()+"Inside show");
		
		try {
			Thread.sleep(2000);
		}
		catch(Exception ex) {
			
		}
		
		System.out.println("Show done!");
	}
	
}