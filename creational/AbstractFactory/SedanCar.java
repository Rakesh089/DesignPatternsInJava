package creational.AbstractFactory;

public class SedanCar extends Car{

	SedanCar(Location newLocation) {
		super(CarType.SEDAN, newLocation);
		constructCar();
	}
	
	@Override
	protected void constructCar() {
		System.out.println("Building Sedan Car !!!");
	}

}
