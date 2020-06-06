package Behavioural.state;

public class ATMMachine implements ATMState{

	
	ATMState hasCard;
	ATMState noCard;
	ATMState hasCorrectPin;
	ATMState atmOutOfMoney;
	
	ATMState atmState;
	
	int cashInMachine = 2000;
	boolean correctPinEntered = false;
	
	ATMMachine(){
		
		hasCard = new HasCard(this);
		noCard = new NoCard(this);
		//hasCorrectPin = new HasCorrectPin(this);
		//atmOutOfMoney = new NoCash(this);
		
		atmState = noCard;
		
		if(cashInMachine < 0) {
			atmState = atmOutOfMoney;
		}
	}
	
	public void setATMState(ATMState newAtmState) {
		this.atmState = newAtmState; 
	}

	@Override
	public void insertCard() {
		atmState.insertCard();
	}

	@Override
	public void ejectCard() {
		atmState.ejectCard();
	}

	@Override
	public void insertPin(int pinEntered) {
		atmState.insertPin(pinEntered);
	}

	@Override
	public void requestCash(int cashToWithdraw) {
		atmState.requestCash(cashToWithdraw);
	}
	
	public ATMState getHasCardState() { return hasCard; }
	public ATMState getNoCardState() { return noCard; }
	public ATMState getHasCorrectPinState() { return hasCorrectPin; }
	public ATMState getHasNoCashState() { return atmOutOfMoney; }
	
	
}
