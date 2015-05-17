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
	private Point center;

	public Circle(Point center,double radius) throws ShapeNotValidException {
		setRadius(radius);
		this.center = center;
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
		return getRadius() > 0 ;
	}

	@Override
	public String toString() {
		return new StringBuilder(this.getClass().getSimpleName())
				.append(": radius=")
				.append(getRadius()).toString();
	}

	@Override
	public boolean equals(GeometricShape shape) {
		if (shape == this)
			return true;
		if (!(shape instanceof Circle) || shape == null)
			return false;

		return false;
	}

	public Point getCenter() {
		return center;
	}

}
