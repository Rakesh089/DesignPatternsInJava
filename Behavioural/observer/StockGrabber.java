package Behavioural.observer;

import java.util.ArrayList;
import java.util.List;

//Concrete Subject

public class StockGrabber implements Subject {

	List<Observer> obList;
	
	double ibmPrice;
	
	StockGrabber(){
		obList = new ArrayList<>();
	}
	
	@Override
	public void register(Observer o) {
		obList.add(o);
		
	}

	@Override
	public void unregister(Observer o) {
		int delIndex = obList.indexOf(o);
		System.out.println("Deleting observer : "+delIndex+1);
		obList.remove(delIndex);
	}

	@Override
	public void notifyObservers() {
		obList.forEach(ob -> ob.update(ibmPrice));
	}
	
	public void setIbmPrice(double ibmPrice) {
		this.ibmPrice = ibmPrice;
		
		notifyObservers();
		
	}

}
