package org.training.geometric_shapes.polygonal.quadrilateral;

import org.training.geometric_shapes.GeometricShape;
import org.training.geometric_shapes.Point;
import org.training.geometric_shapes.exception.ShapeNotValidException;

/**
 * @author Paul Brodner
 *
 */
public class Rectangle extends Parallelogram {

	public Rectangle(Point x, Point y, Point z, Point t) throws ShapeNotValidException {
		super(x, y, z, t);
	}

	/* height x width */
	public double area() {
		return sideAB * sideBC;
	}
	
	public boolean isValid() {
		return (sideAB==sideCD && sideBC==sideDA && sideAB!=sideBC);
	}

	@Override
	public boolean equals(GeometricShape shape) {
		if (shape == this)
			return true;
		if (!(shape instanceof Rectangle) || shape == null)
			return false;

		return false;
	}
}
