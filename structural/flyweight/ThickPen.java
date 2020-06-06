package structural.flyweight;

public class ThickPen implements Pen{

	final BrushSize brushSize = BrushSize.THICK;
	private String color = null;
	
	@Override
	public void setColor(String color) {
		// TODO Auto-generated method stub
		this.color = color;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing with ThickPen of Color : " + color);
	}

}
