package org.training.geometric_shapes;

import junit.framework.TestCase;

import org.training.geometric_shapes.exception.ShapeNotValidException;
import org.training.geometric_shapes.polygonal.quadrilateral.Square;


public class SquareTest extends TestCase implements TestableShape {

	public void testShapeIsValid() throws ShapeNotValidException {
		// TODO Auto-generated method stub
		
	}

	public void testShapeNotValid() {
		// TODO Auto-generated method stub
		
	}

	public void testPerimeter() throws ShapeNotValidException {
		Square square = new Square(8);
		assertEquals(32.0, square.perimeter());
		
		
	}

	public void testArea() throws ShapeNotValidException {
		Square square = new Square(8);
		assertEquals(64.0, square.area());
	}
	
}

