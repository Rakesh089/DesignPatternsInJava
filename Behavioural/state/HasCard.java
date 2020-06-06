package Behavioural.state;

public class HasCard implements ATMState {

	ATMMachine atmMachine;
	
	HasCard(ATMMachine newAtmMachine){
		this.atmMachine = newAtmMachine;
	}
	
	@Override
	public void insertCard() {
		System.out.println("No second card is allowed");
	}

	@Override
	public void ejectCard() {
		System.out.println("Card has been ejected successfully");
		atmMachine.setATMState(atmMachine.getNoCardState());
	}

	@Override
	public void insertPin(int pinEntered) {
		if(pinEntered == 1234) {
			System.out.println("Correct Pin");
			atmMachine.setATMState(atmMachine.getHasCorrectPinState());
		}else {
			System.out.println("Incorrect Pin");
			atmMachine.setATMState(atmMachine.getNoCardState());
		}
		
	}

	@Override
	public void requestCash(int cashToWithdraw) {
		if(cashToWithdraw <= atmMachine.cashInMachine){
			int withdraw = (atmMachine.cashInMachine-cashToWithdraw);
			System.out.println("Successfully withdrawn " + withdraw);
			atmMachine.cashInMachine = (atmMachine.cashInMachine-cashToWithdraw);
			atmMachine.setATMState(atmMachine.getNoCardState());
		}else {
			System.out.println("CashToWithdraw is more than current atm balance");
			atmMachine.setATMState(atmMachine.getNoCardState());
		}
	}

}
