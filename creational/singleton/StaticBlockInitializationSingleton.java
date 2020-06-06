package creational.singleton;


/*
 * Implementation is similar to eager initialization, 
 * except that instance of class is created in the static block that provides option for exception handling.
 * 
 * Both eager initialization and static block initialization creates the instance even before it’s being used 
 * and that is not the best practice to use
 * 
 * */


public class StaticBlockInitializationSingleton {

	private static StaticBlockInitializationSingleton INSTANCE = null;
	
	private StaticBlockInitializationSingleton() {
		
	}
	
	static {
		try {
			INSTANCE = new StaticBlockInitializationSingleton();
		}catch(Exception e) {
			throw new RuntimeException("Exception occured during runtime creation of instance");
		}
	}
	
	public static StaticBlockInitializationSingleton getInstance() {
		return INSTANCE;
	}
	
}
