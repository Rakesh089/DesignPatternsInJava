package Behavioural.visitor;

public class SilverCreditCard implements CreditCard{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "silverCard";
	}

	@Override
	public void accept(OfferVisitor v) {
		// TODO Auto-generated method stub
		v.silverCardVisitor(this);
	}

}
