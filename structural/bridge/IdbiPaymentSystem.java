package structural.bridge;

////Concrete implementation

public class IdbiPaymentSystem implements PaymentSystem{

	@Override
	public void processPayment(String paymentType) {
		System.out.println("Using idbi bank gateway for " + paymentType);
		
	}
	
}
