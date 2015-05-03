package org.training.forma_geometrica;

/**
 * Info: {@link "http://ro.wikipedia.org/wiki/Paralelogram"}
 * 
 * @author Paul Brodner
 *
 */
public class Paralelogram extends Patrulater {

	public Paralelogram(Punct x, Punct y, Punct z, Punct t) {
		super(x, y, z, t);
	}

	/* A = b × h */
	public double arie() {
		return laturaCD * inaltimea;
	}
}
