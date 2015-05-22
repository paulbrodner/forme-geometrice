package org.training.geometric_shapes.polygonal.quadrilateral;

import org.training.geometric_shapes.GeometricShape;
import org.training.geometric_shapes.Point;
import org.training.geometric_shapes.exception.ShapeNotValidException;

/**
 * @author Paul Brodner
 *
 */
public class Rectangle extends Parallelogram {

    public Rectangle(Point upperLeft, int width, int hight) throws ShapeNotValidException{
    	super(upperLeft, 
    		  new Point(upperLeft.getX() + width,upperLeft.getY()), 
    		  new Point(upperLeft.getX() + width,upperLeft.getY() - hight), 
    		  new Point(upperLeft.getX(), upperLeft.getY() - hight));
    	validateShape();
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
		if (shape == null || !(shape instanceof Rectangle))
			return false;
		
		Rectangle r = (Rectangle)shape;
		return equalsCoordinates(r.getCoordinates());
	}

}
