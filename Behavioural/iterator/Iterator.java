package Behavioural.iterator;

//Iterator
public interface Iterator<E> {
	
	boolean hasNext();
	
	E next();
	
	void reset();
	
	E current();
}
