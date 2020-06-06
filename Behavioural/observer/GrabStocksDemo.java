package Behavioural.observer;

public class GrabStocksDemo {
	
	public static void main(String args[]) {
		StockGrabber grab = new StockGrabber();
		
		StockObserver ob1 = new StockObserver(grab);
		grab.setIbmPrice(11.1);
		
		StockObserver ob2 = new StockObserver(grab);
		grab.setIbmPrice(13.1);
	}
}
