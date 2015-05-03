package org.training.forma_geometrica;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * S-a luat in considerare doar un caz valid pentru acest obiect. Asadar nu avem
 * un unit testing complet.
 *
 */
public class DreptunghiTest extends TestCase {

	private Dreptunghi dreptunghi = new Dreptunghi(new Punct(2, 3), 
												   new Punct(8, 3), 
												   new Punct(8, 0), 
												   new Punct(3, 0));
	public void testPerimetru() {
		Assert.assertEquals(17.16, dreptunghi.perimetru());
	}

	public void testArie() {
		Assert.assertEquals(18.0, dreptunghi.arie());
	}
}
