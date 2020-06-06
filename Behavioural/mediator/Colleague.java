package Behavioural.mediator;

public abstract class Colleague {
	
	Mediator mediator;
	int colleagueCode;
	
	Colleague(Mediator newMediator){
		this.mediator = newMediator;
	}
	
	public void saleOffer(String stock, int noOfShares, int colleagueCode) {
		
		mediator.sellStockOffers(stock, noOfShares, colleagueCode);
		
	}
	
	public void buyOffer(String stock, int noOfShares, int colleagueCode) {
		
		mediator.buyStockOffers(stock, noOfShares, colleagueCode);
		
	}
	
	public void setCollId(int id) {
		colleagueCode = id;
	}
}
