package Behavioural.mediator;

public class StockOffers {

	String Symbol;
	int noOfShares;
	int collegueId;
	
	StockOffers(String Symbol, int noOfShares, int collegueId){
		this.Symbol = Symbol;
		this.noOfShares = noOfShares;
		this.collegueId = collegueId;
	}

	public String getSymbol() {
		return Symbol;
	}

	public void setSymbol(String symbol) {
		Symbol = symbol;
	}

	public int getNoOfShares() {
		return noOfShares;
	}

	public void setNoOfShares(int noOfShares) {
		this.noOfShares = noOfShares;
	}

	public int getCollegueId() {
		return collegueId;
	}

	public void setCollegueId(int collegueId) {
		this.collegueId = collegueId;
	}
	
}
