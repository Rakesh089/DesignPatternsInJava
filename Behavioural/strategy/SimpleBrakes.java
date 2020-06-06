package Behavioural.strategy;

//Concrete strategy

public class SimpleBrakes implements IBrakeBehaviour{

	@Override
	public void applyBrake() {
		System.out.println("Simple brakes applied");
	}

}
