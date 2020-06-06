package structural.flyweight;

public class MediumPen implements Pen{

	final BrushSize brushSize = BrushSize.MEDIUM; //intrinsic state - shareable and immutable attribute
	private String color = null;				  //extrinsic state - supplied by client
	
	@Override
	public void setColor(String color) {
		// TODO Auto-generated method stub
		this.color = color;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing with Medium of Color : " + color);
	}
}
