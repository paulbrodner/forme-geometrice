package org.training.geometric_shapes.polygonal;

import org.training.geometric_shapes.GeometricShape;
import org.training.geometric_shapes.Point;
import org.training.geometric_shapes.exception.ShapeNotValidException;
import org.training.geometric_shapes.polygonal.quadrilateral.Quadrilateral;

/**
 * Info: {@link "http://ro.wikipedia.org/wiki/Trapez"}
 * 
 * @author Paul Brodner
 *
 */
public class Trapeze extends Quadrilateral {
	private double bigBaze;
	private double smallBase;

	public Trapeze(Point x, Point y, Point z, Point t) throws ShapeNotValidException {
		super(x, y, z, t);

		if (this.sideAB > this.sideCD) {
			this.bigBaze = sideAB;
			this.smallBase = sideCD;
		} else {
			this.bigBaze = sideCD;
			this.smallBase = sideAB;
		}
		
		validateShape();
	}

	public double area() {
		return ((this.bigBaze + this.smallBase) * this.hight) / 2;
	}

	public boolean isValid() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean equals(GeometricShape shape) {
		if (shape == this)
			return true;
		if (!(shape instanceof Trapeze) || shape == null)
			return false;

		return false;
	}

}
