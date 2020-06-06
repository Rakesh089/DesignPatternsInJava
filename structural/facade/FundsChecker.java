package structural.facade;

public class FundsChecker {
	
	private int totalBalance = 1000;
	
	private int getTotalBalance() {
		return totalBalance;
	}
	
	public void increaseCash(int cashToDeposit) {
		totalBalance += cashToDeposit;
		System.out.println("Cash Deposit successfull. Current balance : " + getTotalBalance());
	}
	
	public void decreaseCash(int cashToWithdraw) {
		if(cashToWithdraw < getTotalBalance()) {
			totalBalance -= cashToWithdraw;
			System.out.println("Cash withdrawl successfull. Current balance : " + getTotalBalance());
		}else {
			System.out.println("cash withdrawl amount (" +cashToWithdraw + ") is greater than current balance : " + getTotalBalance());
		}
		
	}
	
	public boolean hasFunds(int cashToWithdraw) {
		return cashToWithdraw <= totalBalance ;
	}
}
