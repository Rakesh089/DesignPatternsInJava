package Behavioural.chainOfResponsibility;

public class AtmDispenser {
 
	
	public static void main(String args[]) {
		
		DispenseChain c1 = new Dispense50Dollar();
		DispenseChain c2 = new Dispense20Dollar();
		DispenseChain c3 = new Dispense10Dollar();
		
		c1.setNextDispense(c2);
		c2.setNextDispense(c3);
		
		c1.dispene(660);
	}
}
