package Behavioural.template;

public abstract class SandwichTemplate {

	final void makeSandwich() {
		
		cutBun();
		
		if(custWantsMeat()) {
			addMeat();
		}
		
		if(custWantsCheese()) {
			addCheese();
		}
		
		if(custWantsVeggies()) {
			addVeggies();
		}
		
		wrapBun();
	}

	abstract void addVeggies();

	abstract void addCheese(); 

	abstract void addMeat();
	
	private void cutBun() {
		System.out.println("Bun has been cut");
	}
	
	private void wrapBun() {
		System.out.println("Bun has been wrapped\n");
	}

	boolean custWantsMeat() { return true;}
	boolean custWantsCheese() { return true;} 
	boolean custWantsVeggies() { return true;}
}
