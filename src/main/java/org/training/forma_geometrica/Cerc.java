package org.training.forma_geometrica;

/**
 * Info: {@link "http://ro.wikipedia.org/wiki/Cerc"}
 * 
 * @author Paul Brodner
 *
 */
public class Cerc implements FormuleGeometrice {

	private double raza;

	public Cerc() {
		setRaza(raza);
	}

	public double getRaza() {
		return raza;
	}

	public void setRaza(double raza) {
		this.raza = raza;
	}

	public double getCircumferinta() {
		return Output.doubleFormat(2 * Math.PI * getRaza());
	}

	public double perimetru() {
		return Output.doubleFormat((Math.PI * Math.pow(getRaza(), 2)));
	}

	public double arie() {
		/* aria= PI x r x r */
		return Output.doubleFormat(Math.PI * Math.pow(getRaza(), 2));
	}
}
