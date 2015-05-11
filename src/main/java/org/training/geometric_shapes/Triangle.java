package org.training.geometric_shapes;

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

	public Triangle(Point x, Point y, Point z) {
		super(x, y, z);
		this.sideA = getDistance(x, y);
		this.sideB = getDistance(y, z);
		this.sideC = getDistance(x, z);
		this.semiperimeter = perimeter() / 2;
	}

	public double perimeter() {
		return (sideA + sideB + sideC);
	}

	public double area() {
		double s = semiperimeter;
		/*
		 * Using Heron's formula: http://en.wikipedia.org/wiki/Heron%27s_formula
		 */
		double area = Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
		return area;
	}
}
