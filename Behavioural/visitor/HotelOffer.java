package Behavioural.visitor;

public class HotelOffer implements OfferVisitor{

	@Override
	public void bronzeCardVisitor(BronzeCreditCard bc) {
		// TODO Auto-generated method stub
		System.out.println("Bronze card offer for Hotel");
	}

	@Override
	public void silverCardVisitor(SilverCreditCard bc) {
		// TODO Auto-generated method stub
		System.out.println("Silver card offer for Hotel");
	}

	@Override
	public void goldCardVisitor(GoldCreditCard bc) {
		// TODO Auto-generated method stub
		System.out.println("Gold card offer for Hotel");
		
	}

}
