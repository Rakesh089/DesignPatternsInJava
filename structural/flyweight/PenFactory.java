package structural.flyweight;

import java.util.HashMap;

public class PenFactory {
	
	private static final HashMap<String, Pen> penMap = new HashMap<>();
	
	public static Pen getThickPen(String color) {
		
		String key  = color + "-THICK";
		
		if(!penMap.containsKey(key)) {
			ThickPen thickPen = new ThickPen();
			thickPen.setColor(color);
			penMap.put(key, thickPen);
		}
		return penMap.get(key);
	}
	
	public static Pen getThinPen(String color) {
		
		String key  = color + "-THIN";
		
		if(!penMap.containsKey(key)) {
			ThinPen thinPen = new ThinPen();
			thinPen.setColor(color);
			penMap.put(key, thinPen);
		}
		return penMap.get(key);
	}
	
	public static Pen getMediumPen(String color) {
		
		String key  = color + "-MEDIUM";
		
		if(!penMap.containsKey(key)) {
			MediumPen mediumPen = new MediumPen();
			mediumPen.setColor(color);
			penMap.put(key, mediumPen);
		}
		return penMap.get(key);
	}
}	
