package structural.bridge;

//abstraction

public abstract class PaymentType {
	
	protected PaymentSystem paymentSystem;
	
	PaymentType(PaymentSystem newPaymentSystem){
		this.paymentSystem = newPaymentSystem;
	}
	
	protected abstract void makePayment() ;
}
