package org.training.geometric_shapes.serialize;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.training.geometric_shapes.GeometricShape;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonSerializer implements SerializableVisitor {

	private ObjectMapper mapper = new ObjectMapper();

	public void visit(GeometricShape shape) {

		try {
			mapper.writeValue(shapeLocation(shape), getShapeData(shape));

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private File shapeLocation(GeometricShape shape) {
		return new File(shape.name().concat(".json"));
	}

	/**
	 * Custom serialization
	 * 
	 * @param shape
	 * @return
	 */
	private Map<String, Object> getShapeData(GeometricShape shape) {
		System.out.println("JSON Serializer: " + shape.toString());

		Map<String, Object> shapeData = new HashMap<String, Object>();
		shapeData.put("name", shape.name());
		shapeData.put("data", shape);

		return shapeData;
	}

}
