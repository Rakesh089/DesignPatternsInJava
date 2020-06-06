package Behavioural.visitor;

public class GoldCreditCard implements CreditCard{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "goldCard";
	}

	@Override
	public void accept(OfferVisitor v) {
		// TODO Auto-generated method stub
		v.goldCardVisitor(this);
	}

}
