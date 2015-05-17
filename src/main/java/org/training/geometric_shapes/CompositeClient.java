package org.training.geometric_shapes;

import org.training.geometric_shapes.exception.ShapeNotValidException;
import org.training.geometric_shapes.polygonal.Triangle;
import org.training.geometric_shapes.polygonal.quadrilateral.Square;

public class CompositeClient {

	public static void main(String[] args) throws ShapeNotValidException {
		CompositeGeometricShape composite = new CompositeGeometricShape();
		
		Circle c = new Circle(new Point(1,2), 3);
		Triangle t = new Triangle(new Point(1,2), new Point(2,2), new Point(2,0));
		Square s = new Square(2);
		
		
		composite.add(c);
		composite.add(t);
		composite.add(s);
		
		composite.draw();
	}
}
