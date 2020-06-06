package structural.decorator;

//Concrete Decorator

public class SauceTopping extends PizzaDecorator{

	SauceTopping(Pizza newPizza) {
		super(newPizza);
		// TODO Auto-generated constructor stub
	}

	public String getDescription() {
		// TODO Auto-generated method stub
		return tempPizza.getDescription() + ", adding Sauce";
	}

	public double getCost() {
		// TODO Auto-generated method stub
		return tempPizza.getCost() + 30;
	}	
	
}
