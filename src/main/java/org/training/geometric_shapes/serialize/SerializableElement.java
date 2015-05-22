package org.training.geometric_shapes.serialize;

/**
 * Using the visitor pattern
 *
 * {@link serialize} method is the visitor's accept method
 */
public interface SerializableElement {
	public void serialize(SerializableVisitor visitor);
}
