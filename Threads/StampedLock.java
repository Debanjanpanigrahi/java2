package MultiThreading;


import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;

public class StampedLock {
	public static void main(String[] args) {
		SharedResourceStampedLockImplementation sr =new SharedResourceStampedLockImplementation();
		
		Thread r1 = new Thread(()->{
			sr.read();
		});
		
		Thread r2 = new Thread(()->{
			sr.read();
		});
		
		Thread r3 = new Thread(()->{
			sr.read();
		});
		
		Thread w1 = new Thread(()->{
			sr.write(5);
		});
		
		Thread w2 = new Thread(()->{
			sr.write(7);
		});
		
		Thread w3 = new Thread(()->{
			sr.write(9);
		});
		
		r1.start();
		r2.start();
		r3.start();
		
		w1.start();
		w2.start();
		w3.start();
	}
}


class SharedResourceStampedLockImplementation{
	private int value = 0;
	
	StampedLock lock = new StampedLock();
	
	public int read() {
		long stamp = lock.readLock();
		try {
			System.out.println(Thread.currentThread().getName()+"rading value entered: ");
			try {
				Thread.sleep(2000);
			}
			catch(Exception ex) {
				
			}
			System.out.println(Thread.currentThread().getName()+"reading value exited: ");
			return value;
		}
		finally {
			
			lock.unlock(stamp);
		}
	}
	
	public void write(int newVal) {
		long stamp = lock.writeLock();
		try {
			System.out.println(Thread.currentThread().getName()+"writing value Entered: ");
			try {
					Thread.sleep(2000);
				}
			catch(Exception ex) {
					
			}
			value = newVal;
			System.out.println(Thread.currentThread().getName()+"writing exited : ");
		}
		catch(Exception e) {
			
		}
		finally {
			lock.unlock(stamp);
		}
	}
}
