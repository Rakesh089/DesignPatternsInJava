package creational.singleton;

//Singleton created at class loading

//PROS : Easiest method to create a singleton class
//CONS : 1.Instance is created even though client application might not be using it.
//		 2.This method doesn’t provide any options for exception handling.

public class EagerInitializedSingleton {
	
	private static EagerInitializedSingleton INSTANCE = new EagerInitializedSingleton();
	
	private EagerInitializedSingleton() {
		
	}

	public static EagerInitializedSingleton getInstance() {
		return INSTANCE;
	}
}
