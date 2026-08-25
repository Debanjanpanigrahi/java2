package MultiThreading;

public class interupt {
	public static void main(String[] args)
	{
		Thread t1 = new Thread(()->{
			try {
				while(!Thread.currentThread().isInterrupted())
				{
					System.out.println("Running");
				}
				
			}
			catch(Exception e) {
				
			}
		});
		
		t1.start();
		t1.interrupt();
	}
}

/*
 * isInterupted() -> return True/false
 * interupted() -> return True/false and also set interupt flag false
 * */
