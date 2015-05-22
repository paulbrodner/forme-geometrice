package org.training.geometric_shapes;


import org.junit.Assert;
import org.junit.Test;
import org.training.geometric_shapes.exception.ShapeNotValidException;
import org.training.geometric_shapes.polygonal.quadrilateral.Rectangle;

public class CompositePatternTest {

	@Test
	public void simpleTests() throws ShapeNotValidException {
		Circle circle = new Circle(new Point(1,2), 2.00);
		Rectangle rectangle  = new Rectangle(new Point(2,2),2,4);
		
		GeometricShapeList listA = new GeometricShapeList();
		listA.add(circle);
		listA.add(rectangle);
		
		listA.toString();
		listA.getChildGeometricShapes().add(circle);
		
		Assert.assertTrue(listA.getChildGeometricShapes().get(0).equals(circle));
		
		
		GeometricShapeList listB = new GeometricShapeList();
		listB.add(circle);
		listB.add(rectangle);
		
		Assert.assertTrue(listB.isValid());
		
	}

}
