package org.training.geometric_shapes;

/**
 * Info: {@link "http://ro.wikipedia.org/wiki/Trapez"}
 * 
 * @author Paul Brodner
 *
 */
public class Trapeze extends Quadrilateral {
	private double bigBaze;
	private double smallBase;

	public Trapeze(Point x, Point y, Point z, Point t) {
		super(x, y, z, t);

		if (this.sideAB > this.sideCD) {
			this.bigBaze = sideAB;
			this.smallBase = sideCD;
		} else {
			this.bigBaze = sideCD;
			this.smallBase = sideAB;
		}
	}

	public double area() {
		return ((this.bigBaze + this.smallBase) * this.hight) / 2;
	}

}
