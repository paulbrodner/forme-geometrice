package org.training.geometric_shapes;

/**
 * Info {@link "http://ro.wikipedia.org/wiki/Patrulater"}
 * 
 * @author Paul Brodner
 *
 */
public abstract class Quadrilateral extends Polygon {
	protected double sideAB;
	protected double sideBC;
	protected double sideCD;
	protected double sideDA;
	protected double hight;

	/**
	 * Initialization of a new quadrilater with 4 sides
	 * 
	 * @param x
	 * @param y
	 * @param z
	 * @param t
	 */
	public Quadrilateral(Point x, Point y, Point z, Point t) {
		super(x, y, z, t);
		this.sideAB = getDistance(x, y);
		this.sideBC = getDistance(y, z);
		this.sideCD = getDistance(z, t);
		this.sideDA = getDistance(t, x);
		this.hight = getDistance(x, new Point(x.getX(), t.getY()));
	}

	public double perimeter() {
		return sideAB + sideBC + sideCD + sideDA;
	}

	public double area() {
		return 0;
	}
}
