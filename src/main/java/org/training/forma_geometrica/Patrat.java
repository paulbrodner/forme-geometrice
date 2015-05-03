package org.training.forma_geometrica;

/**
 * Info {@link "http://ro.wikipedia.org/wiki/P%C4%83trat"}
 * 
 * @author Paul Brodner
 *
 */
public class Patrat extends Patrulater {
	private int latura;

	public int getLatura() {
		return latura;
	}

	public Patrat(Punct x, Punct y, Punct z, Punct t) {
		super(x, y, z, t);
		this.latura = (int) getDistanta(x, y);
	}

	public Patrat(int latura) {
		//just for fun
		super(new Punct(0, 0), 
			  new Punct(0, latura), 
			  new Punct(latura, latura),
			  new Punct(latura, 0)
			 );
		this.latura = latura;
	}

	public double perimetru() {
		return Output.doubleFormat(4 * getLatura());
	}

	public double arie() {
		return Output.doubleFormat(getLatura() * getLatura());
	}
}
