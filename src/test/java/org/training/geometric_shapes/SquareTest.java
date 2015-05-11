package org.training.geometric_shapes;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.training.geometric_shapes.Square;

/**
 * S-a luat in considerare doar un caz valid pentru acest obiect. Asadar nu avem
 * un unit testing complet.
 *
 */
public class SquareTest extends TestCase {

	private Square square = new Square(8);
	

	public void testPerimetru() {
		Assert.assertEquals(32.0, square.perimeter());
	}

	public void testArie() {
		Assert.assertEquals(64.0, square.area());
	}
}

