package structural.facade;

public class BankAccountFacade {

	AccountNumberChecker accNumChecker;
	SecurityCodeChecker  secCodeChecker;
	FundsChecker fundChecker;
	
	WelcomeBank welcomeBank;
	
	BankAccountFacade(){
		welcomeBank = new WelcomeBank();
		
		accNumChecker = new AccountNumberChecker();
		secCodeChecker = new SecurityCodeChecker();
		fundChecker = new FundsChecker();
	}
	
	public void withDrawCash(int accNum, int secCode, int cashToWithDraw) {

		if (accNumChecker.isAccountNumValid(accNum) && secCodeChecker.isSecurityCodeValid(secCode)
				&& fundChecker.hasFunds(cashToWithDraw)) {
			fundChecker.decreaseCash(cashToWithDraw);
		}else {
			System.out.println("Couldn't withdraw cash !!!");
		}
	}
	
	public void depositCash(int accNum, int secCode, int cashToDeposit) {

		if (accNumChecker.isAccountNumValid(accNum) && secCodeChecker.isSecurityCodeValid(secCode)
				) {
			fundChecker.increaseCash(cashToDeposit); 
		}else {
			System.out.println("Couldn't deposit cash !!!");
		}
	}
	
}
