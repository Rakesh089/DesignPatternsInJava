package creational.Factory;

public abstract class Car {

	private CarType model = null;
	
	Car(CarType newModel){
		this.model = newModel;
	}

	protected abstract void constructCar();
}
