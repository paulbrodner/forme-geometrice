package org.training.geometric_shapes;

import static org.hamcrest.MatcherAssert.assertThat;
import junit.framework.TestCase;

import org.hamcrest.CoreMatchers;
import org.training.geometric_shapes.exception.ShapeNotValidException;
import org.training.geometric_shapes.polygonal.quadrilateral.Square;

public class SquareTest extends TestCase implements TestableShape {

	public void testValidShape() throws ShapeNotValidException {
		Square square = new Square(4);
		assertEquals(square.toString(),
				"sideAB=4.0, sideBC=4.0, sideCD=4.0, sideDA=4.0");
	}

	public void testShapeNotValid() {
		try {
			new Square(-2); // we should use only values > 0
		} catch (ShapeNotValidException e) {
			assertThat(e.getMessage(),
					CoreMatchers.containsString("Square is not valid"));
			return;
		}
		fail("expected ShapeNotValidException for Square");
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
