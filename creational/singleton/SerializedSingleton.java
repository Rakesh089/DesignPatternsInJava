package creational.singleton;

import java.io.Serializable;

/*
 * So it destroys the singleton pattern, to overcome this scenario all we need to do
 * it provide the implementation of readResolve() method.
 * 
 * */


public class SerializedSingleton implements Serializable{

    private static final long serialVersionUID = -7604766932017737115L;

    private SerializedSingleton(){}
    
    private static class SingletonHelper{
        private static final SerializedSingleton instance = new SerializedSingleton();
    }
    
    public static SerializedSingleton getInstance(){
        return SingletonHelper.instance;
    }
    
    public Object readResolve() {
    	return getInstance();
    }
}
