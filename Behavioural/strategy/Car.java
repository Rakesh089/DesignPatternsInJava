package Behavioural.strategy;

public abstract class Car {
	
	IBrakeBehaviour brakeBehaviour;
	
	Car(IBrakeBehaviour newBrakeBehaviour){
		this.brakeBehaviour = newBrakeBehaviour;
	}

	public IBrakeBehaviour getBrakeBehaviour() {
		return brakeBehaviour;
	}

	public void setBrakeBehaviour(IBrakeBehaviour brakeBehaviour) {
		this.brakeBehaviour = brakeBehaviour;
	}
	
	public void applyBrakes() {
		brakeBehaviour.applyBrake();
	}

}
