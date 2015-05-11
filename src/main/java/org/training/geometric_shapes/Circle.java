package org.training.geometric_shapes;

/**
 * Info: {@link "http://ro.wikipedia.org/wiki/Cerc"}
 * 
 * @author Paul Brodner
 *
 */
public class Circle implements Computable {

	private double radius;

	public Circle() {
		setRadius(radius);
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
}
