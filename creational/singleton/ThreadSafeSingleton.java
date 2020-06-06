package creational.singleton;


/* The easier way to create a thread-safe singleton class is
 * to make the global access method synchronized, so that only one 
 * thread can execute this method at a time
 * 
 * 
 * 
 * 
 * 
 * 
 * */


public class ThreadSafeSingleton {
	
	private static ThreadSafeSingleton INSTANCE = null;
	
	private ThreadSafeSingleton() {
		
	}
	
	public static synchronized ThreadSafeSingleton getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new ThreadSafeSingleton();
		}
		return INSTANCE;
	}
	
	/*
	 * Above implementation works fine and provides thread-safety but it reduces the performance because
	 * of the cost associated with the synchronized method, although we need it only for the first few threads 
	 * who might create the separate instances (Read: Java Synchronization). To avoid this extra overhead every time,
	 *  double checked locking principle is used. In this approach, the synchronized block is used inside the if condition with 
	 *  an additional check to ensure that only one instance of a singleton class is created.
	 * */
	
	public static synchronized ThreadSafeSingleton getInstanceUsingDoubleCheckedLocking() {
		
		if(INSTANCE == null) {
			
			synchronized(ThreadSafeSingleton.class) {
				
				if(INSTANCE == null) {
					
					INSTANCE = new ThreadSafeSingleton();
				}
			}
		}
		return INSTANCE;
	}
	
}
