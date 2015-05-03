package org.training.forma_geometrica;

/**
 * Info: {@link "http://ro.wikipedia.org/wiki/Trapez"}
 * 
 * @author Paul Brodner
 *
 */
public class Trapez extends Patrulater {
	private double bazaMare;
	private double bazaMica;

	public Trapez(Punct x, Punct y, Punct z, Punct t) {
		super(x, y, z, t);

		if (this.laturaAB > this.laturaCD) {
			this.bazaMare = laturaAB;
			this.bazaMica = laturaCD;
		} else {
			this.bazaMare = laturaCD;
			this.bazaMica = laturaAB;
		}
	}

	/* (baza mare + baza mica)x inaltimea/2 */
	public double arie() {
		return Output
				.doubleFormat(((this.bazaMare * this.bazaMica) * this.inaltimea) / 2);
	}

}
