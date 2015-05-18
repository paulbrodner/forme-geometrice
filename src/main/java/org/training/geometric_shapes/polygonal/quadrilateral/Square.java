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
	private double side;
	
	public Square(int side) throws ShapeNotValidException {	
		this(new Point(0, 0), new Point(0, side), new Point(side, side), new Point(side, 0));
	}
	
	private Square(Point x, Point y, Point z, Point t) throws ShapeNotValidException {
		super(x, y, z, t);
		this.side = getDistance(x, y);
		validateShape();
	}

	public double perimeter() {
		return 4 * getSide();
	}

	public double area() {
		return getSide() * getSide();
	}

	public boolean isValid() {
		return sideAB==sideBC && sideCD==sideDA && getCoordinates().get(1).getY() > 0;
	}

	@Override
	public boolean equals(GeometricShape shape) {
		if (shape == this)
			return true;
		if (shape == null || !(shape instanceof Square))
			return false;
		
		Square r = (Square)shape;
		return equalsCoordinates(r.getCoordinates());
	}
	
	public double getSide() {
		return side;
	}

}
