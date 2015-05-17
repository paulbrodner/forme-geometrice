package org.training.geometric_shapes.polygonal;

import org.training.geometric_shapes.GeometricShape;
import org.training.geometric_shapes.Point;
import org.training.geometric_shapes.exception.ShapeNotValidException;

/**
 * Implementarea unui simplu triunghi
 * 
 * Info: {@link "http://ro.wikipedia.org/wiki/Triunghi"}
 * 
 * @author Paul Brodner
 *
 */
public class Triangle extends Polygon {
	private double sideAB;
	private double sideBC;
	private double sideCA;
	private double semiperimeter;

	public Triangle(Point x, Point y, Point z) throws ShapeNotValidException {
		super(x, y, z);
		this.sideAB = getDistance(x, y);
		this.sideBC = getDistance(y, z);
		this.sideCA = getDistance(x, z);
		this.semiperimeter = perimeter() / 2;
		validateShape();
	}

	public double perimeter() {
		return (sideAB + sideBC + sideCA);
	}

	public double area() {
		double s = semiperimeter;
		// Using Heron's formula: http://en.wikipedia.org/wiki/Heron%27s_formula
		return  Math.sqrt(s * (s - sideAB) * (s - sideBC) * (s - sideCA));
	}

	public boolean isValid() {
		return sideAB >0 && sideBC > 0 & sideCA >0;
	}


	@Override
	public boolean equals(GeometricShape shape) {
		if (shape == this)
			return true;
		if (!(shape instanceof Triangle) || shape == null)
			return false;
	    
   	    
	    return false;
	}

	@Override
	public String toString() {
		return  new StringBuilder(this.getClass().getSimpleName())
					.append(": sideAB=")
					.append(sideAB)
					.append(", sideBC=")
					.append(sideBC)
					.append(", sideCA=")
					.append(sideCA)
					.toString();
	}
}
