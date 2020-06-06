package Behavioural.chainOfResponsibility;

public class Dispense10Dollar implements DispenseChain{

	DispenseChain nextChain;
	
	@Override
	public void setNextDispense(DispenseChain chain) {
		this.nextChain = chain;
	}

	@Override
	public void dispene(int amount) {
		if(amount >= 10) {
			int noOfNotes = (amount/10);
			System.out.println("No. of 10 notes : "+ noOfNotes);
			int rem = (amount%10);
			if(rem != 0) {
				this.nextChain.dispene(rem);
			}else {
				return;
			}
		}else {
			this.nextChain.dispene(amount);
		}
	}
}
