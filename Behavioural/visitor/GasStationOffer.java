package Behavioural.visitor;

public class GasStationOffer implements OfferVisitor{

	@Override
	public void bronzeCardVisitor(BronzeCreditCard bc) {
		System.out.println("Bronze card offer for gas");
		
	}

	@Override
	public void silverCardVisitor(SilverCreditCard bc) {
		// TODO Auto-generated method stub
		System.out.println("Silver card offer for gas");
		
	}

	@Override
	public void goldCardVisitor(GoldCreditCard bc) {
		// TODO Auto-generated method stub
		System.out.println("Gold card offer for gas");
	}

}
