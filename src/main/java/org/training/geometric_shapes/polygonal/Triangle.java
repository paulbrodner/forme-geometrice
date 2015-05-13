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
	private double sideA;
	private double sideB;
	private double sideC;
	private double semiperimeter;

	public Triangle(Point x, Point y, Point z) throws ShapeNotValidException {
		super(x, y, z);
		this.sideA = getDistance(x, y);
		this.sideB = getDistance(y, z);
		this.sideC = getDistance(x, z);
		this.semiperimeter = perimeter() / 2;
		validateShape();
	}

	public double perimeter() {
		return (sideA + sideB + sideC);
	}

	public double area() {
		double s = semiperimeter;
		// Using Heron's formula: http://en.wikipedia.org/wiki/Heron%27s_formula
		double area = Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
		return area;
	}

	public boolean isValid() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		return null;
	}
	
	@Override
	public boolean equals(GeometricShape shape) {
		if (shape == this)
			return true;
		if (!(shape instanceof Triangle) || shape == null)
			return false;
	    
   	    
	    return false;
	}

}
