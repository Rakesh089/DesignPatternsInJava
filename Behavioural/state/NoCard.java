package Behavioural.state;

public class NoCard implements ATMState {

	ATMMachine atmMachine;
	
	NoCard(ATMMachine atmMachine){
		this.atmMachine = atmMachine;
	}
	@Override
	public void insertCard() {
		// TODO Auto-generated method stub

	}

	@Override
	public void ejectCard() {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertPin(int pinEntered) {
		// TODO Auto-generated method stub

	}

	@Override
	public void requestCash(int cashToWithdraw) {
		// TODO Auto-generated method stub

	}

}
