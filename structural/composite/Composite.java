package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{

	private String name;
	List<Component> components;
	
	
	public Composite(String name) {
		super();
		this.name = name;
		components = new ArrayList<Component>();
	}

	public void addComponent(Component newComponent) {
		components.add(newComponent);
	}

	@Override
	public void showPrice() {
		System.out.println("Name : " + name);
		components.forEach(c -> {c.showPrice();});
	}

}
