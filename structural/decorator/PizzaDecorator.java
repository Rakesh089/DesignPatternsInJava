package structural.decorator;

//Decorator

public abstract class PizzaDecorator implements Pizza{
	
	Pizza tempPizza;
	
	PizzaDecorator(Pizza newPizza){
		tempPizza = newPizza;
	}
	
	
	public String getDescription() {
		// TODO Auto-generated method stub
		return tempPizza.getDescription();
	}

	public double getCost() {
		// TODO Auto-generated method stub
		return tempPizza.getCost();
	}
	
}
