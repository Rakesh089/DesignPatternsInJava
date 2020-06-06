package Behavioural.visitor;

public interface OfferVisitor {

	void bronzeCardVisitor(BronzeCreditCard bc);
	void silverCardVisitor(SilverCreditCard bc);
	void goldCardVisitor(GoldCreditCard bc);
	
}
