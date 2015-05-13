package org.training.geometric_shapes.polygonal.quadrilateral;

import org.training.geometric_shapes.GeometricShape;
import org.training.geometric_shapes.Point;
import org.training.geometric_shapes.exception.ShapeNotValidException;

/**
 * Info: {@link "http://ro.wikipedia.org/wiki/Paralelogram"}
 * 
 * @author Paul Brodner
 *
 */
public class Parallelogram extends Quadrilateral {

	public Parallelogram(Point x, Point y, Point z, Point t) throws ShapeNotValidException {
		super(x, y, z, t);
	}

	/* A = b × h */
	public double area() {
		return sideCD * hight;
	}

	public boolean isValid() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean equals(GeometricShape shape) {
		if (shape == this)
			return true;
		if (!(shape instanceof Parallelogram) || shape == null)
			return false;

		return false;
	}

}
