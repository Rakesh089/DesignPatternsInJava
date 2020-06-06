package Behavioural.mediator;

import java.util.ArrayList;
import java.util.List;

//Concrete mediator

public class StockMediator implements Mediator{

	List<Colleague> colleagues;
	List<StockOffers> sellOffers;
	List<StockOffers> buyOffers;
	public static int colleagueId = 0;
	
	StockMediator(){
		colleagues = new ArrayList<Colleague>();
		sellOffers = new ArrayList<StockOffers>();
		buyOffers = new ArrayList<StockOffers>();
	}
	
	@Override
	public void sellStockOffers(String stock, int noOfShares, int colleagueId) {
		
		boolean isSold = false;
		
		for(StockOffers offers : buyOffers) {
			if((offers.getSymbol().equals(stock)) && noOfShares == offers.getNoOfShares()) {
				System.out.println(noOfShares + " Shares of "+ stock + "sold to colleagueId" + offers.getCollegueId());
				isSold = true;
			}
			if(isSold) {
				break;
			}
		}
		
		if(!isSold) {
			System.out.println(stock + " Stocks got added to inventory");
			sellOffers.add(new StockOffers(stock, noOfShares, colleagueId));
		}
		
	}

	@Override
	public void buyStockOffers(String stock, int noOfShares, int colleagueId) {
		boolean isBought = false;
		
		for(StockOffers offers : sellOffers) {
			if((offers.getSymbol().equals(stock)) && noOfShares == offers.getNoOfShares()) {
				System.out.println(noOfShares + " Shares of "+ stock + "bought from colleagueId " + offers.getCollegueId());
				isBought = true;
			}
			if(isBought) {
				break;
			}
		}
		
		if(!isBought) {
			System.out.println(stock + " Stocks got added to inventory");
			buyOffers.add(new StockOffers(stock, noOfShares, colleagueId));
		}
		
	}

	@Override
	public void addColleague(Colleague newColleague) {
		
		colleagues.add(newColleague);
		colleagueId++;
		newColleague.setCollId(colleagueId);		
	}

}
