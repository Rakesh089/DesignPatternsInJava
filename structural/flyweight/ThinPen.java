package structural.flyweight;

public class ThinPen implements Pen{

	final BrushSize brushSize = BrushSize.THIN;
	private String color = null;
	
	@Override
	public void setColor(String color) {
		// TODO Auto-generated method stub
		this.color = color;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing with ThinPen of Color : " + color);
	}
}
