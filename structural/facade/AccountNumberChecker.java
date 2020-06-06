package structural.facade;

public class AccountNumberChecker {
	
	private int accNum = 123321456;
	
	public int getAccNum() {
		return accNum;
	}
	
	public boolean isAccountNumValid(int newAccNum) {
		
		if(newAccNum == getAccNum()) {
			System.out.println("Account no. validated successfully");
			return true;
		}else {
			return false;
		}
	}
}
