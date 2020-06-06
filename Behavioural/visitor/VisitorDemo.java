package Behavioural.visitor;

public class VisitorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditCard bcard = new BronzeCreditCard();
		
		OfferVisitor vis1 = new GasStationOffer();
		bcard.accept(vis1);
		
		CreditCard gcard = new GoldCreditCard();
		
		OfferVisitor vis2 = new HotelOffer();
		gcard.accept(vis2);
		bcard.accept(vis2);
		
	}

}
