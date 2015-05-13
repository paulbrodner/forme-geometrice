package org.training.geometric_shapes.exception;

public class ShapeNotValidException extends Exception {

	private static final long serialVersionUID = 6532195898608059996L;

	public ShapeNotValidException() {
		super();
	}

	public ShapeNotValidException(String message) {
		super(message);
	}

	public ShapeNotValidException(String message, Throwable cause) {
		super(message, cause);
	}
}
