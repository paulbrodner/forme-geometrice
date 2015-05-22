package org.training.geometric_shapes.serialize;

import org.training.geometric_shapes.GeometricShape;

/**
 * Using the visitor pattern
 *
 */
public interface SerializableVisitor {
	public void visit(GeometricShape shape);
}
