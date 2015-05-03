package org.training.forma_geometrica;

/**
 * Implementarea unui simplu triunghi 
 * 
 * Info: {@link "http://ro.wikipedia.org/wiki/Triunghi"}
 * 
 * @author Paul Brodner
 *
 */
public class Triunghi extends Poligon {
	private double laturaA;
	private double laturaB;
	private double laturaC;
	private double semiPerimetru;

	public Triunghi(Punct x, Punct y, Punct z) {
		super(x, y, z);
		this.laturaA = getDistanta(x, y);
		this.laturaB = getDistanta(y, z);
		this.laturaC = getDistanta(x, z);
		this.semiPerimetru = perimetru() / 2;
	}

	public double perimetru() {
		return Output.doubleFormat((laturaA + laturaB + laturaC));
	}

	public double arie() {
		double s = semiPerimetru;
		/*
		 * Folosim formula lui Heron:
		 * http://en.wikipedia.org/wiki/Heron%27s_formula
		 */
		double arie = Math.sqrt(s * (s - laturaA) * (s - laturaB)
				* (s - laturaC));
		return Output.doubleFormat(arie);
	}
}
