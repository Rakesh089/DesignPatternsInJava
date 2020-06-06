package creational.Factory;

public class LuxuryCar extends Car{

	LuxuryCar() {
		super(CarType.LUXURY);
		constructCar();
	}
	
	@Override
	protected void constructCar() {
		System.out.println("Building LuxuryCar Car !!!");
	}

}
