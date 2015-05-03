package org.training.forma_geometrica;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * S-a luat in considerare doar un caz valid pentru acest obiect. Asadar nu avem
 * un unit testing complet.
 *
 */
public class TrapezTest extends TestCase {
	private Trapez trapez = new Trapez(new Punct(6, 12), 
									   new Punct(13, 12),
			                           new Punct(16, 6), 
			                           new Punct(3, 6));

	public void testPerimetru() {
		Assert.assertEquals(33.42, trapez.perimetru());
	}

	public void testArie() {
		Assert.assertEquals(273.0, trapez.arie());
	}

}
