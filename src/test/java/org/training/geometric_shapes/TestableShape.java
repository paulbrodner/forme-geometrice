package org.training.geometric_shapes;

import org.training.geometric_shapes.exception.ShapeNotValidException;

public interface TestableShape {
	public void testShapeIsValid() throws ShapeNotValidException;

	public void testShapeNotValid();

	public void testPerimeter() throws ShapeNotValidException;

	public void testArea() throws ShapeNotValidException;
}