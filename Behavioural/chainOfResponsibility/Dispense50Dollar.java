package Behavioural.chainOfResponsibility;

public class Dispense50Dollar implements DispenseChain{

	DispenseChain nextChain;
	
	@Override
	public void setNextDispense(DispenseChain chain) {
		this.nextChain = chain;
	}

	@Override
	public void dispene(int amount) {
		if(amount >= 50) {
			int noOfNotes = (amount/50);
			System.out.println("No. of 50 notes : "+ noOfNotes);
			int rem = (amount%50);
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
