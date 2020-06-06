package Behavioural.strategy;

//Concrete strategy

public class BrakesWithABS implements IBrakeBehaviour{

	@Override
	public void applyBrake() {
		System.out.println("ABS brakes applied");
	}
}
