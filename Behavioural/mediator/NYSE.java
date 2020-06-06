package Behavioural.mediator;

public class NYSE {
	
	public static void main(String args[]) { 
		
		StockMediator stockExchange = new StockMediator();
		GoldmanSachs broker1 = new GoldmanSachs(stockExchange);
		JPMorgan broker2 = new JPMorgan(stockExchange);
		
		stockExchange.addColleague(broker1);
		stockExchange.addColleague(broker2);
		
		broker1.saleOffer("MSFT", 10, 1);
		broker1.saleOffer("GOOG", 20, 1);
		
		broker2.buyOffer("MSFT", 10, 2);
		broker2.saleOffer("NRG", 20, 2);
		
		
	}
}
