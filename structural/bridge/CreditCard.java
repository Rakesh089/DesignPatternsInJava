package structural.bridge;

//Refined abstractions


public class CreditCard extends PaymentType{
	
	CreditCard(PaymentSystem newPaymentSystem) {
		super(newPaymentSystem);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void makePayment() {
		paymentSystem.processPayment("CreditCard");
	}
}
