package structural.composite;

public class PatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Component hd = new Leaf("HDD", 4000);
		Component mouse = new Leaf("mouse", 3000);
		Component ram = new Leaf("RAM", 4000);
		Component cpu = new Leaf("CPU", 4000);
		Component monitor = new Leaf("monitor", 5000);
		
		
		
		Composite ph = new Composite("Peri");
		Composite cabinet = new Composite("Cabinet");
		Composite mb = new Composite("MB");
		Composite computer = new Composite("Computer");
		
		mb.addComponent(cpu);
		mb.addComponent(ram);
		
		ph.addComponent(mouse);
		ph.addComponent(monitor);
		
		cabinet.addComponent(hd);
		cabinet.addComponent(mb);
		
		computer.addComponent(ph);
		computer.addComponent(cabinet);
		
		//sram.showPrice();
		computer.showPrice();
	}

}
