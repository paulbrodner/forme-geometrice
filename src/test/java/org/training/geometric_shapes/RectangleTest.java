package org.training.geometric_shapes;

import junit.framework.TestCase;
import static org.hamcrest.MatcherAssert.assertThat;
import org.hamcrest.CoreMatchers;
import org.training.geometric_shapes.exception.ShapeNotValidException;
import org.training.geometric_shapes.polygonal.quadrilateral.Rectangle;

public class RectangleTest extends TestCase implements TestableShape {

	Rectangle rectangle;

	public void testValidShape() throws ShapeNotValidException {
		rectangle = new Rectangle(new Point(0, 2), 3, 2);
		assertEquals(rectangle.toString(),
				"Rectangle: sideAB=3.0, sideBC=2.0, sideCD=3.0, sideDA=2.0");
	}

	public void testShapeNotValid() throws ShapeNotValidException {
		try {
			rectangle = new Rectangle(new Point(0, 2), 2, 2);
		} catch (ShapeNotValidException e) {
			assertThat(e.getMessage(),
					CoreMatchers.containsString("Rectangle is not valid"));
			return;
		}
		fail("expected ShapeNotValidException for Rectangle");
	}

	public void testPerimeter() throws ShapeNotValidException {
		rectangle = new Rectangle(new Point(0, 2), 3, 2);
		assertEquals(10.00, Output.doubleFormat(rectangle.perimeter()));
	}

	public void testArea() throws ShapeNotValidException {
		rectangle = new Rectangle(new Point(0, 2), 3, 2);
		assertEquals(6.0, Output.doubleFormat(rectangle.area()));
	}
	
	public void testNotEqualsNull() throws ShapeNotValidException {
		Rectangle r1 = new Rectangle(new Point(0, 2), 3, 2);
		Rectangle r2 = null;
		assertFalse(r1.equals(r2));
	}
	
	public void testEqualsSelf() throws ShapeNotValidException {
		Rectangle r1 = new Rectangle(new Point(0, 2), 3, 2);
		assertTrue(r1.equals(r1));
	}
	
	public void testEqualsAnotherRectangle() throws ShapeNotValidException {
		Rectangle r1 = new Rectangle(new Point(0, 2), 3, 2);
		Rectangle r2 = new Rectangle(new Point(0, 2), 3, 2);
		assertTrue(r1.equals(r2));
	}
	
	public void testNotEqualsAnotherRectangle() throws ShapeNotValidException {
		Rectangle r1 = new Rectangle(new Point(0, 2), 3, 2);
		Rectangle r2 = new Rectangle(new Point(0, 3), 3, 2);
		assertFalse(r1.equals(r2));
	}
	
	public void testNotEqualsAnotherRectangleWithDifferedSides() throws ShapeNotValidException {
		Rectangle r1 = new Rectangle(new Point(0, 2), 3, 2);
		Rectangle r2 = new Rectangle(new Point(0, 2), 4, 2);
		assertFalse(r1.equals(r2));
	}

}
