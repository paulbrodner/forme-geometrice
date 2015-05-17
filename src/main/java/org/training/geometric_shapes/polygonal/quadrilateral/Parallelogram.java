package org.training.geometric_shapes.polygonal.quadrilateral;

import org.training.geometric_shapes.Point;
import org.training.geometric_shapes.exception.ShapeNotValidException;

/**
 * Info: {@link "http://ro.wikipedia.org/wiki/Paralelogram"}
 * 
 * @author Paul Brodner
 *
 */
public abstract class Parallelogram extends Quadrilateral {

	public Parallelogram(Point x, Point y, Point z, Point t) throws ShapeNotValidException {
		super(x, y, z, t);
	}

	/* A = b × h */
	public double area() {
		return sideCD * hight;
	}
}
