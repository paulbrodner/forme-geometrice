package org.training.geometric_shapes;

/**
 * @author Paul Brodner
 *
 */
public class Rectangle extends Parallelogram {

	public Rectangle(Point x, Point y, Point z, Point t) {
		super(x, y, z, t);
	}

	/* height x width */
	public double area() {
		return sideAB * sideBC;
	}
}
