package org.training.forma_geometrica;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.training.forma_geometrica.Patrat;

/**
 * S-a luat in considerare doar un caz valid pentru acest obiect. Asadar nu avem
 * un unit testing complet.
 *
 */
public class PatratTest extends TestCase {

	private Patrat patrat = new Patrat(8);
	

	public void testPerimetru() {
		Assert.assertEquals(32.0, patrat.perimetru());
	}

	public void testArie() {
		Assert.assertEquals(64.0, patrat.arie());
	}
}
