package Behavioural.chainOfResponsibility;

public class Dispense20Dollar implements DispenseChain{

	DispenseChain nextChain;
	
	@Override
	public void setNextDispense(DispenseChain chain) {
		this.nextChain = chain;
	}

	@Override
	public void dispene(int amount) {
		if(amount >= 20) {
			int noOfNotes = (amount/20);
			System.out.println("No. of 20 notes : "+ noOfNotes);
			int rem = (amount%20);
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
