package org.training.geometric_shapes.polygonal;

import java.util.ArrayList;
import java.util.List;

import org.training.geometric_shapes.Computable;
import org.training.geometric_shapes.Drawable;
import org.training.geometric_shapes.GeometricShape;
import org.training.geometric_shapes.Point;
import org.training.geometric_shapes.exception.ShapeNotValidException;

/**
 *
 * Info {@link "http://ro.wikipedia.org/wiki/Poligon"}
 * 
 * @author Paul Brodner
 *
 */
public abstract class Polygon extends GeometricShape implements Drawable, Computable {

	private ArrayList<Point> coordinates = new ArrayList<Point>();

	/**
	 * Defines a new Polygon based on multiple @link Point arrays {@link Point}
	 * 
	 * @param puncte
	 * @throws ShapeNotValidException
	 */
	public Polygon(Point... coordinates) throws ShapeNotValidException {
		for (int i = 0; i < coordinates.length; i++) {
			this.coordinates.add(coordinates[i]);
		}
	}

	/**
	 * @return all coordinates of this Polygon as a {@link List}
	 */
	public List<Point> getCoordinates() {
		return coordinates;
	}

	/**
	 * Return the distance between two points P1(x_1,y_1) & P2(x_2, y_2)
	 * {@link "http://ro.wikipedia.org/wiki/Geometrie_analitic%C4%83#Geometrie_analitic.C4.83_plan.C4.83"}
	 * 
	 * Using Math class {@link Math} & method 'hypot'
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public double getDistance(Point p1, Point p2) {
		return Math.hypot(p2.getX() - p1.getX(), p2.getY() - p1.getY());
	}

	public boolean equalsCoordinates(List<Point> coordinates) {
		if (coordinates == null
				|| getCoordinates().size() != coordinates.size()) {
			return false;
		}
		boolean isEqual = false;
		for (int i = 0; i < getCoordinates().size(); i++) {
			isEqual = getCoordinates().get(i).equals(coordinates.get(i));
			if (isEqual == false) {
				return false;
			}
		}
		return isEqual;
	}

	public void draw() {
		System.out.println(toString());
	}
}
