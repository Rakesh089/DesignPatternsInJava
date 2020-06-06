package creational.AbstractFactory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FactoryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Car car1 = CarFactory.buildCar(CarType.SMALL);
		//Car car2 = CarFactory.buildCar(CarType.SEDAN);
		//Car car3 = CarFactory.buildCar(CarType.LUXURY);
		
		System.out.println(CarFactory.buildCar(CarType.SMALL));
		System.out.println(CarFactory.buildCar(CarType.SEDAN));
		System.out.println(CarFactory.buildCar(CarType.LUXURY));
		
	}

}
