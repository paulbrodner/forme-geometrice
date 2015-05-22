package org.training.geometric_shapes;

import java.util.ArrayList;
import java.util.List;

public class GeometricShapeList extends GeometricShape {

	private List<GeometricShape> childGeometricShapes = new ArrayList<GeometricShape>();

	public void add(GeometricShape graphic) {
		childGeometricShapes.add(graphic);
	}

	public void remove(GeometricShape graphic) {
		childGeometricShapes.remove(graphic);
	}

	public List<GeometricShape> getChildGeometricShapes() {
		return childGeometricShapes;
	}

	public boolean isValid() {
		for (GeometricShape shape : childGeometricShapes) {
			if (!shape.isValid()) {
				return false;
			}
		}
		return true;
	}

	@Override
	public String toString() {
		String output = "";
		for (GeometricShape shape : childGeometricShapes) {
			output += shape.toString();
		}
		return output;
	}

	@Override
	public boolean equals(GeometricShape shape) {
		return false;
	}

}
