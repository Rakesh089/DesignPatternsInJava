package structural.flyweight;

public class FlyweightDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pen yellowThickPen = PenFactory.getThickPen("YELLOW");
		yellowThickPen.draw();
		
		Pen redThinPen = PenFactory.getThinPen("RED");
		redThinPen.draw();
		
		Pen yellowThickPen1 = PenFactory.getThickPen("YELLOW");
		//Pen yellowThickPen1 = new ThickPen();
		//yellowThickPen1.setColor("YELLOW");
		yellowThickPen1.draw();
		
		System.out.println("check same reference : "+ (yellowThickPen==yellowThickPen1));
	}

}
