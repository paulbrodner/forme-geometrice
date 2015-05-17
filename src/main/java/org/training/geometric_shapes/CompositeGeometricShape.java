package org.training.geometric_shapes;

import java.util.ArrayList;
import java.util.List;

public class CompositeGeometricShape implements Drawable {

	private List<GeometricShape> geometricShapes = new ArrayList<GeometricShape>();

	public void draw() {
		for (GeometricShape shape : geometricShapes) {
			shape.draw();
		}
	}
	
    public void add(GeometricShape graphic) {
    	geometricShapes.add(graphic);
    }

    public void remove(GeometricShape graphic) {
    	geometricShapes.remove(graphic);
    }
}
