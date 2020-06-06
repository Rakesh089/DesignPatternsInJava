package structural.bridge;

public class PatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//consider payment system based on availability
		PaymentSystem paymentGateway = new IdbiPaymentSystem();
		
		
		//NetBanking/creditCard selected by user
		PaymentType paymentType = new NetBanking(paymentGateway);
		paymentType.makePayment();
	}

}
