package org.training.geometric_shapes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Info {@link "http://ro.wikipedia.org/wiki/Poligon"}
 * 
 * @author Paul Brodner
 *
 */
public abstract class Polygon implements Computable {

	private ArrayList<Point> coordinates = new ArrayList<Point>();

	/**
	 * Defines a new Polygon based on multiple @link Point arrays
	 * {@link Point}
	 * 
	 * @param puncte
	 */
	public Polygon(Point... coordinates) {
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
}
