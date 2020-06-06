package Behavioural.strategy;

public class Sedan extends Car{

	Sedan() {
		super(new BrakesWithABS());
	}
	
}
