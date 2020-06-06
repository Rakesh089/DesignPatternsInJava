package Behavioural.strategy;

public class SUV extends Car{

	SUV() {
		super(new SimpleBrakes());
	}
	
}