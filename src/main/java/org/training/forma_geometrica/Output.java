package org.training.forma_geometrica;

import java.text.DecimalFormat;

/**
 * Contine metode ajutatoare in vederea formatarii valorilor numerice
 * 
 * @author Paul Brodner
 *
 */
public class Output {
	public static DecimalFormat douaZecimale = new DecimalFormat("#.00");

	/**
	 * 
	 * @param valoare
	 * @return numarul double cu 2 zecimale
	 */
	public static double doubleFormat(double valoare) {
		return Double.valueOf(douaZecimale.format(valoare));
	}
}
