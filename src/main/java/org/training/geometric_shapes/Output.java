package org.training.geometric_shapes;

import java.text.DecimalFormat;

/**
 * Helper for output formatting
 * 
 * @author Paul Brodner
 *
 */
public class Output {
	public static DecimalFormat doubleDecimal = new DecimalFormat("#.00");

	/**
	 * 
	 * @param value
	 * @return value as a double decimal 
	 */
	public static double doubleFormat(double value) {
		return Double.valueOf(doubleDecimal.format(value));
	}
}
