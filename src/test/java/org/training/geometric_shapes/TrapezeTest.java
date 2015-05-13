//package org.training.geometric_shapes;
//
//import org.training.geometric_shapes.Point;
//import org.training.geometric_shapes.polygonal.Trapeze;
//
//import junit.framework.Assert;
//import junit.framework.TestCase;
//
///**
// * S-a luat in considerare doar un caz valid pentru acest obiect. Asadar nu avem
// * un unit testing complet.
// *
// */
//public class TrapezeTest extends TestCase {
//	private Trapeze trapeze = new Trapeze(new Point(6, 12), 
//									   new Point(13, 12),
//			                           new Point(16, 6), 
//			                           new Point(3, 6));
//
//	public void testPerimetru() {
//		Assert.assertEquals(33.42, Output.doubleFormat(trapeze.perimeter()));
//	}
//
//	public void testArie() {
//		Assert.assertEquals(60.0, Output.doubleFormat(trapeze.area()));
//	}
//
//}
