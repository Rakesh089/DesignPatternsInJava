package structural.composite;

public class Leaf implements Component{

	private String name;
	private int price; 

	public Leaf(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public void showPrice() {
		System.out.println("Price of "+ name + " : " + price);
	}

}
