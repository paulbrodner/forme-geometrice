package org.training.geometric_shapes;

import org.training.geometric_shapes.exception.ShapeNotValidException;

public abstract class GeometricShape implements Computable, Validable, Drawable {
	// http://www.javapractices.com/topic/TopicAction.do?Id=55
	// http://java.dzone.com/articles/composite-design-pattern-java-0
	public abstract String toString();

	public abstract boolean equals(GeometricShape shape);

	public void validateShape() throws ShapeNotValidException {
		if (!isValid()) {
			throw new ShapeNotValidException(getClass().getSimpleName()
					+ " is not valid: " + this.toString());
		}
	}
	
	public void draw() {
		System.out.println(toString());
	}

}
