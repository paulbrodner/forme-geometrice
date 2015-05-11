package org.training.geometric_shapes;

/**
 * Info {@link "http://ro.wikipedia.org/wiki/P%C4%83trat"}
 * 
 * @author Paul Brodner
 *
 */
public class Square extends Quadrilateral {
	private int side;

	public int getSide() {
		return side;
	}

	public Square(Point x, Point y, Point z, Point t) {
		super(x, y, z, t);
		this.side = (int) getDistance(x, y);
	}

	public Square(int latura) {
		//just for fun
		super(new Point(0, 0), 
			  new Point(0, latura), 
			  new Point(latura, latura),
			  new Point(latura, 0)
			 );
		this.side = latura;
	}

	public double perimeter() {
		return 4 * getSide();
	}

	public double area() {
		return getSide() * getSide();
	}
}
