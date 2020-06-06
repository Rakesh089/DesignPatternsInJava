package structural.decorator;


public class PizzaMaker {

	public static void main(String[] args) {
		Pizza toppingPizza = new SauceTopping(new CheesePizza(new PlainPizza()));
		System.out.println("Desc : "+ toppingPizza.getDescription());
		System.out.println("Cost : "+ toppingPizza.getCost());
		
		//System.out.println("Desc : "+ new CheesePizza(new PlainPizza()).getDescription());
		//System.out.println("Cost : "+ new CheesePizza(new PlainPizza()).getCost());
	}

}
