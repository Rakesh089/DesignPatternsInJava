package Behavioural.mediator;

public interface Mediator {
	
	public void sellStockOffers(String stock, int noOfShares, int colleagueId);
	public void buyStockOffers(String stock, int noOfShares, int colleagueId);
	public void addColleague(Colleague colleagure);
}
