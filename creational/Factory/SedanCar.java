package creational.Factory;

public class SedanCar extends Car{

	SedanCar() {
		super(CarType.SEDAN);
		constructCar();
	}
	
	@Override
	protected void constructCar() {
		System.out.println("Building Sedan Car !!!");
	}

}
