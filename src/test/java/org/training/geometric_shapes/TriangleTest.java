package org.training.geometric_shapes;

import static org.hamcrest.MatcherAssert.assertThat;
import junit.framework.TestCase;

import org.hamcrest.CoreMatchers;
import org.training.geometric_shapes.exception.ShapeNotValidException;
import org.training.geometric_shapes.polygonal.Triangle;

public class TriangleTest extends TestCase implements TestableShape {

	private Triangle triangle;

	public void testValidShape() throws ShapeNotValidException {
		triangle = new Triangle(new Point(0, 0), 
								new Point(1, 1), 
								new Point(2, 0));
			
	}

	public void testShapeNotValid() throws ShapeNotValidException {
		try {
			triangle = new Triangle(new Point(0, 0), 
									new Point(0, 0), 
									new Point(0, 0));
		} catch (ShapeNotValidException e) {
			assertThat(e.getMessage(),
					CoreMatchers.containsString("Triangle is not valid"));
			return;
		}

		fail("expected ShapeNotValidException for Rectangle");
	}

	public void testPerimeter() throws ShapeNotValidException {
		triangle = new Triangle(new Point(0, 0), 
								new Point(1, 1), 
								new Point(2,0));
		assertEquals(4.83, Output.doubleFormat(triangle.perimeter()));
	}

	public void testArea() throws ShapeNotValidException {
		triangle = new Triangle(new Point(6, 12), 
								new Point(16, 6), 
								new Point(3, 6));
		assertEquals(39.0, triangle.area());
	}
}
