package Behavioural.visitor;

public class BronzeCreditCard implements CreditCard{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "bronzeCard";
	}

	@Override
	public void accept(OfferVisitor v) {
		// TODO Auto-generated method stub
		v.bronzeCardVisitor(this);
	}

}
