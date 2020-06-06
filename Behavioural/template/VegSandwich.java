package Behavioural.template;

public class VegSandwich extends SandwichTemplate{

	
	boolean custWantsMeat() { return false;}
	boolean custWantsCheese() { return false;} 

	@Override
	void addVeggies() {
		System.out.println("Adding Veggies");
	}

	@Override
	void addCheese() {
		
		
	}

	@Override
	void addMeat() {
		
	}
	
}
