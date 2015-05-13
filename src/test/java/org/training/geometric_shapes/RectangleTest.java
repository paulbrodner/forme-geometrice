package org.training.geometric_shapes;

import junit.framework.TestCase;
import static org.hamcrest.MatcherAssert.assertThat;
import org.hamcrest.CoreMatchers;
import org.training.geometric_shapes.exception.ShapeNotValidException;
import org.training.geometric_shapes.polygonal.quadrilateral.Rectangle;

public class RectangleTest extends TestCase implements TestableShape {

	Rectangle rectangle;

	public void testShape() throws ShapeNotValidException {
		rectangle = new Rectangle(new Point(0, 2), 3, 2);
	}
	
	public void testPerimeter() throws ShapeNotValidException {
		rectangle = new Rectangle(new Point(0, 2),3,2);
		assertEquals(10.00, Output.doubleFormat(rectangle.perimeter()));
	}

	public void testArea() throws ShapeNotValidException {
		rectangle = new Rectangle(new Point(0, 2),3, 2);
		assertEquals(6.0, Output.doubleFormat(rectangle.area()));
	}

	public void testRectangleIsNotSquare() {
		try {
			rectangle = new Rectangle(new Point(0, 2),2,2);
		} catch (ShapeNotValidException e) {
			assertThat(e.getMessage(), CoreMatchers.containsString("Rectangle is not valid"));
			return;
		}
		fail("expected ShapeNotValidException for Rectangle");
	}
}
