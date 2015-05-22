package org.training.geometric_shapes;

import org.junit.Test;
import org.training.geometric_shapes.exception.ShapeNotValidException;
import org.training.geometric_shapes.polygonal.quadrilateral.Rectangle;
import org.training.geometric_shapes.serialize.JsonSerializer;

public class SerializeTest {

	@Test
	public void testRectangleSerialize() throws ShapeNotValidException {
		JsonSerializer json = new JsonSerializer();
		Rectangle rectangle = new Rectangle(new Point(0, 2), 3, 2);
		rectangle.serialize(json);
	}

}
