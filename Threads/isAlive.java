package MultiThreading;

public class isAlive {
	public static void main(String[] args)
	{
		Thread t1 = new Thread(()->{
			try {
				Thread.sleep(2000);
				
			}
			catch(Exception e) {
				
			}
		});
		
		System.out.println(t1.isAlive());
		t1.start();
		System.out.println(t1.isAlive());
		try {
			Thread.sleep(3000);
		}
		catch(Exception ex) {}
		System.out.println(t1.isAlive());
	}
}
