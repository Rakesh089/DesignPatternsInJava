package Behavioural.template;

public class MakeSandwich {

	public static void main(String[] args) {
		SandwichTemplate veg = new VegSandwich();
		veg.makeSandwich();
		
		SandwichTemplate chick = new ChickenSandwich();
		chick.makeSandwich();

	}

}
