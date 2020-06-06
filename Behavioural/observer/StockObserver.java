package Behavioural.observer;

public class StockObserver implements Observer{

	Subject sub;
	
	double ibmPrice;
	
	private int observerId ;
	
	private static int totalObserverId=0;
	
	StockObserver(StockGrabber stockGrabber){
		sub = stockGrabber;
		
		this.observerId = ++totalObserverId;
		
		System.out.println("Adding observer : " + observerId);
		sub.register(this);
	}

	@Override
	public void update(double ibmPrice) {
		this.ibmPrice = ibmPrice;
		System.out.println("Observer " + observerId + " got an update of ibmPrice : "+ibmPrice);
	}
	
	public int getObserverId() {
		return observerId;
	}
}
