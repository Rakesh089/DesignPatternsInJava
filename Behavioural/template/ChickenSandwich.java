package Behavioural.template;

public class ChickenSandwich extends SandwichTemplate{

	
	boolean custWantsVeggies() { return false;}

	@Override
	void addVeggies() {
	}

	@Override
	void addCheese() {
		System.out.println("Adding Cheese");
		
	}

	@Override
	void addMeat() {
		System.out.println("Adding Meat");
		
	}
	
}
