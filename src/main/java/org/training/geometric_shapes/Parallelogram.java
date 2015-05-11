package org.training.geometric_shapes;

/**
 * Info: {@link "http://ro.wikipedia.org/wiki/Paralelogram"}
 * 
 * @author Paul Brodner
 *
 */
public class Parallelogram extends Quadrilateral {

	public Parallelogram(Point x, Point y, Point z, Point t) {
		super(x, y, z, t);
	}

	/* A = b × h */
	public double area() {
		return sideCD * hight;
	}
}
