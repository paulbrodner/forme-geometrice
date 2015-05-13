package org.training.geometric_shapes;

import org.training.geometric_shapes.exception.ShapeNotValidException;

/**
 * Info: {@link "http://ro.wikipedia.org/wiki/Cerc"}
 * 
 * @author Paul Brodner
 *
 */
public class Circle extends GeometricShape {

	private double radius;

	public Circle() throws ShapeNotValidException {
		setRadius(radius);
		validateShape();
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getCircumference() {
		return Math.PI * getRadius();
	}

	public double perimeter() {
		return (Math.PI * Math.pow(getRadius(), 2));
	}

	/* area= PI x r x r */
	public double area() {
		return Math.PI * Math.pow(getRadius(), 2);
	}

	public boolean isValid() {
		return false;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean equals(GeometricShape shape) {
		// TODO Auto-generated method stub
		return false;
	}
}
