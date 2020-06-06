package structural.facade;

public class PatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccountFacade bankfacade = new BankAccountFacade();
		
		bankfacade.withDrawCash(123321456, 987789, 100);
		bankfacade.depositCash(123321456, 987789, 300);
		bankfacade.withDrawCash(123321456, 987789, 1500);
	}

}
