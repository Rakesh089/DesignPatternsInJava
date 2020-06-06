package structural.facade;

public class SecurityCodeChecker {

	private int securityCode = 987789;
	
	public int getSecurityCode() {
		return securityCode;
	}
	
	public boolean isSecurityCodeValid(int newSecCode) {
		
		if(newSecCode == getSecurityCode()) {
			System.out.println("Security code validated successfully");
			return true;
		}else {
			return false;
		}
	}
}
