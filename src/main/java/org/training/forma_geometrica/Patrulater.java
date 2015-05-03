package org.training.forma_geometrica;

/**
 * Info {@link "http://ro.wikipedia.org/wiki/Patrulater"}
 * 
 * @author Paul Brodner
 *
 */
public abstract class Patrulater extends Poligon {
	protected double laturaAB;
	protected double laturaBC;
	protected double laturaCD;
	protected double laturaDA;
	protected double inaltimea; // o vom calcula automat;

	/**
	 * Initializarea unui patrulare, unui poligon cu 4 laturi
	 * 
	 * @param x
	 * @param y
	 * @param z
	 * @param t
	 */
	public Patrulater(Punct x, Punct y, Punct z, Punct t) {
		super(x, y, z, t);
		this.laturaAB = getDistanta(x, y);
		this.laturaBC = getDistanta(y, z);
		this.laturaCD = getDistanta(z, t);
		this.laturaDA = getDistanta(t, x);
		this.inaltimea = getDistanta(x, new Punct(x.getX(), t.getY()));
	}

	/* suma tuturor laturilor */
	public double perimetru() {
		return Output.doubleFormat(laturaAB + laturaBC + laturaCD + laturaDA);
	}

	public double arie() {
		return 0;
	}
}
