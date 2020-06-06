package creational.singleton;

import java.io.Serializable;


//After having discussed so many possible approaches and other possible error cases, 
//I will recommend to you the code template below, to design your singleton class which 
//shall ensure only one instance of a class in the whole application in all above discussed scenarios.

public class RecommendedSingleton implements Serializable {

	    private static final long serialVersionUID = 1L;
	 
	    private RecommendedSingleton() {
	        // private constructor
	    }
	 
	    private static class RecommendedSingletonHolder {
	        public static final RecommendedSingleton INSTANCE = new RecommendedSingleton();
	    }
	 
	    public static RecommendedSingleton getInstance() {
	        return RecommendedSingletonHolder.INSTANCE;
	    }
	 
	    protected Object readResolve() {
	        return getInstance();
	    }
}
