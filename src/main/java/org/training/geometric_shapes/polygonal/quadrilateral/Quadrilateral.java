package org.training.geometric_shapes.polygonal.quadrilateral;

import org.training.geometric_shapes.Point;
import org.training.geometric_shapes.exception.ShapeNotValidException;
import org.training.geometric_shapes.polygonal.Polygon;

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
	 * @throws ShapeNotValidException 
	 */
	public Quadrilateral(Point x, Point y, Point z, Point t) throws ShapeNotValidException {
		super(x, y, z, t);
		this.sideAB = getDistance(x, y);
		this.sideBC = getDistance(y, z);
		this.sideCD = getDistance(z, t);
		this.sideDA = getDistance(t, x);
		this.hight = getDistance(x, new Point(x.getX(), t.getY()));
		validateShape();
	}

	public double perimeter() {
		return sideAB + sideBC + sideCD + sideDA;
	}

	public double area() {
		return 0;
	}
	
	@Override
	public String toString() {
		return new StringBuilder("sideAB=")
					.append(sideAB)
					.append(", sideBC=")
					.append(sideBC)
					.append(", sideCD")
					.append(sideCD)
					.append(", sideDA")
					.append("sideDA")
					.toString();
	}

}
