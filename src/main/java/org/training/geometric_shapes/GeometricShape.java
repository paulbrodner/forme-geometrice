package org.training.geometric_shapes;

import org.training.geometric_shapes.exception.ShapeNotValidException;
import org.training.geometric_shapes.serialize.SerializableElement;
import org.training.geometric_shapes.serialize.SerializableVisitor;

public abstract class GeometricShape implements Validable, SerializableElement {

	public abstract String toString();

	public String name() {
		return this.getClass().getSimpleName();
	}

	public abstract boolean equals(GeometricShape shape);

	/**
	 * Validate GeometricShape
	 * 
	 * @throws ShapeNotValidException
	 */
	public void validateShape() throws ShapeNotValidException {
		if (!isValid()) {
			throw new ShapeNotValidException(name() + " is not valid: " + this.toString());
		}
	}

	public void serialize(SerializableVisitor visitor) {
		visitor.visit(this);
	}
}
