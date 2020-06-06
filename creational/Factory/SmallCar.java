package creational.Factory;

public class SmallCar extends Car{

	SmallCar() {
		super(CarType.SMALL);
		constructCar();
	}
	
	@Override
	protected void constructCar() {
		System.out.println("Building Small Car !!!");
	}

}
