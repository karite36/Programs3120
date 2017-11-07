package hw9;

import java.util.Comparator;

public class ShapeAreaComparator implements Comparator<Shape>  {

	/*
	 * lhs: Left Hand Side
	 * rhs: Right Hand Side
	 */	
	//@Override
	public int compare(Shape lhs, Shape rhs) {
		if (lhs.area() > rhs.area()) {
			return 1;
		} else if (lhs.area() < rhs.area()) {
			return -1;
		} else {
			return 0;
		}
	}
}
