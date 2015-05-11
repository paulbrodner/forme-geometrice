package org.training.geometric_shapes;

import org.training.geometric_shapes.Point;
import org.training.geometric_shapes.Rectangle;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * S-a luat in considerare doar un caz valid pentru acest obiect. Asadar nu avem
 * un unit testing complet.
 *
 */
public class RectangleTest extends TestCase {

	private Rectangle rectangle = new Rectangle(new Point(2, 3), 
												   new Point(8, 3), 
												   new Point(8, 0), 
												   new Point(3, 0));
	public void testPerimeter() {
		Assert.assertEquals(17.16, Output.doubleFormat(rectangle.perimeter()));
	}

	public void testArie() {
		Assert.assertEquals(18.0, Output.doubleFormat(rectangle.area()));
	}
}
