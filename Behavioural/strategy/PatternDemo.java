package Behavioural.strategy;

public class PatternDemo {

	public static void main(String[] args) {
		
		Car sedan = new Sedan();
		sedan.applyBrakes();
		
		Car suv = new SUV();
		suv.applyBrakes();
		
		sedan.setBrakeBehaviour(new SimpleBrakes());
		sedan.applyBrakes();
	}
}
