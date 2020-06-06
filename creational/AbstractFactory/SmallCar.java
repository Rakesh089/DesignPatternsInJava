package creational.AbstractFactory;

public class SmallCar extends Car{

	SmallCar(Location newLocation) {
		super(CarType.SMALL, newLocation);
		constructCar();
	}
	
	@Override
	protected void constructCar() {
		System.out.println("Building Small Car !!!");
	}

}
