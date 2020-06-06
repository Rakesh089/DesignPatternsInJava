package creational.AbstractFactory;

public class CarFactory{
	
	public static Car buildCar(CarType model) {
		
		//Get this location from configuration or any location api's
	
		Location location = Location.ASIA;
		Car car = null;
		
		switch(location) {
		
		case USA:
			car = USACarFactory.buildCar(model);
			break;
		case ASIA:
			car = ASIACarFactory.buildCar(model);
			break;
		case DEFAULT:
			car = DefaultCarFactory.buildCar(model);
			break;
		default:
			break;
		}
		
		return car;
	}
}
