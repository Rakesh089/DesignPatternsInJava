package structural.decorator;

//Concrete Decorator

public class CheesePizza extends PizzaDecorator{

	CheesePizza(Pizza newPizza) {
		super(newPizza);
		// TODO Auto-generated constructor stub
	}

	public String getDescription() {
		// TODO Auto-generated method stub
		return tempPizza.getDescription() + ", adding Cheese";
	}

	public double getCost() {
		// TODO Auto-generated method stub
		return tempPizza.getCost() + 50;
	}	
	
}
