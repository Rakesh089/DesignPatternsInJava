package Behavioural.chainOfResponsibility;

public interface DispenseChain {
	
		void setNextDispense(DispenseChain chain);
		
		void dispene(int amount);
}
