package org.training.forma_geometrica;

import java.util.ArrayList;

/**
 *
 * Info {@link "http://ro.wikipedia.org/wiki/Poligon"}
 * 
 * @author Paul Brodner
 *
 */
public abstract class Poligon implements FormuleGeometrice {

	private ArrayList<Punct> coordonatePoligon = new ArrayList<Punct>();

	/**
	 * Defineste un nou Poligon format dintr-un array de puncte Vezi si
	 * {@link Punct}
	 * 
	 * @param puncte
	 */
	public Poligon(Punct... coordonate) {
		for (int i = 0; i < coordonate.length; i++) {
			this.coordonatePoligon.add(coordonate[i]);
		}
	}

	/**
	 * @return toate coordonatele poligonului
	 */
	public ArrayList<Punct> getCoordonatePoligon() {
		return coordonatePoligon;
	}

	/**
	 * Returneaza distanta dintre 2 puncte P1(x_1,y_1) și P2(x_2, y_2) INFO
	 * {@link "http://ro.wikipedia.org/wiki/Geometrie_analitic%C4%83#Geometrie_analitic.C4.83_plan.C4.83"}
	 * 
	 * Ne vom folosi de clasa {@link Math} si metoda 'hypot'
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public double getDistanta(Punct p1, Punct p2) {
		return Math.hypot(p2.getX() - p1.getX(), p2.getY() - p1.getY());
	}
}
