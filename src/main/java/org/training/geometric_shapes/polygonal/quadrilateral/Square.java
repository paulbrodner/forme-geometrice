package org.training.geometric_shapes.polygonal.quadrilateral;

import org.training.geometric_shapes.GeometricShape;
import org.training.geometric_shapes.Point;
import org.training.geometric_shapes.exception.ShapeNotValidException;

/**
 * Info {@link "http://ro.wikipedia.org/wiki/P%C4%83trat"}
 * 
 * @author Paul Brodner
 *
 */
public class Square extends Quadrilateral {
	private int side;

	public Square(Point x, Point y, Point z, Point t) throws ShapeNotValidException {
		super(x, y, z, t);
		this.side = (int) getDistance(x, y);
		validateShape();
	}
	
	public int getSide() {
		return side;
	}

	public Square(int latura) throws ShapeNotValidException {
		// just for fun
		super(new Point(0, 0), new Point(0, latura), new Point(latura, latura), new Point(latura, 0));
		this.side = latura;
	}

	public double perimeter() {
		return 4 * getSide();
	}

	public double area() {
		return getSide() * getSide();
	}

	public boolean isValid() {
		return sideAB==sideBC && sideCD==sideDA;
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
		if (!(shape instanceof Square) || shape == null)
			return false;

		return false;
	}

}
