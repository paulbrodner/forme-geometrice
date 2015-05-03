package org.training.forma_geometrica;

/**
 * @author Paul Brodner
 *
 */
public class Dreptunghi extends Paralelogram {

	public Dreptunghi(Punct x, Punct y, Punct z, Punct t) {
		super(x, y, z, t);
	}

	/* lungimea x latimea */
	public double arie() {
		return laturaAB * laturaBC;
	}
}
