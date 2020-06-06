package structural.bridge;

//Concrete implementation


public class CitiPaymentSystem implements PaymentSystem{

	@Override
	public void processPayment(String paymentType) {
		System.out.println("Using citi bank gateway for " + paymentType);
		
	}
	
}
