package MultiThreading;

public class currentThread {
	
	public static void main(String[] args)
	{
		Thread t1 = new Thread(()->{
			try {
				System.out.println(Thread.currentThread());
				
			}
			catch(Exception e) {
				
			}
		});
		
		t1.setName("Worker-1 ");
		t1.start();
	}
}
