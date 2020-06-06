package creational.AbstractFactory;

public abstract class Car {

	private CarType model = null;
	private Location location = null;
	
	Car(CarType newModel, Location newLocation){
		this.model = newModel;
		this.location = newLocation;
	}

	protected abstract void constructCar();

	@Override
	public String toString() {
		return "Car Built [model=" + model + ", location=" + location + "]";
	}
	
}
