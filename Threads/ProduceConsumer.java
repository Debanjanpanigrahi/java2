package MultiThreading;

public class ProduceConsumer {
	public static void main(String[] args)
	{
		Box box = new Box();
		
		Thread t1 = new Thread(()->{
			for(int i=1;i<=20;i++) {
				try {
					Thread.sleep(100);
				}
				catch(Exception ex){
					
				}
				box.producer(i);
			}
		});
		
		Thread t2 = new Thread(()->{
			for(int i=1;i<=20;i++) {
				try {
					Thread.sleep(70);
				}
				catch(Exception ex){
					
				}
				box.consumer();
			}
		});
		
		t1.start();
		t2.start();
	}
}

class Box{
	Integer item;
	volatile Boolean flag = false;
	
	 synchronized void producer(int value) {
		
		while(flag) {
			//do nothing!!
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		item=value;
		flag = true;
		notify();
		System.out.println("Producer produces"+item);
	}
	
	 synchronized void consumer() {
		
		while(!flag) {
			//do nothing
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Consumer consumes"+item);
		item = null;
		flag = false;
		notify();
	}
}