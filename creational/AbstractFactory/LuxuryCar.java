package creational.AbstractFactory;

public class LuxuryCar extends Car{

	LuxuryCar(Location newLocation) {
		super(CarType.LUXURY, newLocation);
		constructCar();
	}
	
	@Override
	protected void constructCar() {
		System.out.println("Building LuxuryCar Car !!!");
	}

}
