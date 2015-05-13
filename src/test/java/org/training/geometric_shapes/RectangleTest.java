package org.training.geometric_shapes;

import junit.framework.TestCase;
import static org.hamcrest.MatcherAssert.assertThat;
import org.hamcrest.CoreMatchers;
import org.training.geometric_shapes.exception.ShapeNotValidException;
import org.training.geometric_shapes.polygonal.quadrilateral.Rectangle;

public class RectangleTest extends TestCase implements TestableShape {

	Rectangle rectangle;

	public void testShapeIsValid() throws ShapeNotValidException {
		rectangle = new Rectangle(new Point(0, 2), 
								  new Point(3, 2), 
								  new Point(3, 0), 
								  new Point(0, 0));
	}

	public void testShapeNotValid() {
		try {
			rectangle = new Rectangle(new Point(1, 5), 
									  new Point(8, 5),
									  new Point(8, 0), 
									  new Point(0, 0));
		} catch (ShapeNotValidException e) {
			assertThat(e.getMessage(), CoreMatchers.containsString("Rectangle is not valid"));
			return;
		}
		fail("expected ShapeNotValidException for Rectangle");
	}
	
	public void testShapeNotValidOnAngle() {
		try {
			rectangle = new Rectangle(new Point(0, 2), 
					  				  new Point(3, 2), 
					                  new Point(3, 0), 
					                  new Point(0, 0));
		} catch (ShapeNotValidException e) {
			assertThat(e.getMessage(), CoreMatchers.containsString("Rectangle is not valid"));
			return;
		}
		fail("expected ShapeNotValidException for Rectangle with degree != 90");
	}

	public void testPerimeter() throws ShapeNotValidException {
		rectangle = new Rectangle(new Point(0, 2), 
								  new Point(3, 2), 
								  new Point(3, 0), 
								  new Point(0, 0));
		assertEquals(10.00, Output.doubleFormat(rectangle.perimeter()));
	}

	public void testArea() throws ShapeNotValidException {
		rectangle = new Rectangle(new Point(0, 2), 
								  new Point(3, 2), 
								  new Point(3, 0), 
								  new Point(0, 0));
		assertEquals(6.0, Output.doubleFormat(rectangle.area()));
	}

	public void testRectangleIsNotSquare() {
		try {
			rectangle = new Rectangle(new Point(0, 2), 
									  new Point(2, 2),
									  new Point(2, 0), 
									  new Point(0, 0));
		} catch (ShapeNotValidException e) {
			assertThat(e.getMessage(), CoreMatchers.containsString("Rectangle is not valid"));
			return;
		}
		fail("expected ShapeNotValidException for Rectangle");
	}
}
