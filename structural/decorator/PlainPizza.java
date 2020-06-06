package structural.decorator;

//Concrete component

public class PlainPizza implements Pizza{

	PlainPizza(){
		
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Plain pizza with Dough";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 100;
	}

}
