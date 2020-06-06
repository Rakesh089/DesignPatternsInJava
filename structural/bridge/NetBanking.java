package structural.bridge;


// Refined abstractions

public class NetBanking extends PaymentType{

	NetBanking(PaymentSystem newPaymentSystem) {
		super(newPaymentSystem);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void makePayment() {
		paymentSystem.processPayment("NetBanking");
	}

	
}
