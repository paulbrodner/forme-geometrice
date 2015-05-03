package org.training.forma_geometrica;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.training.forma_geometrica.Punct;
import org.training.forma_geometrica.Triunghi;

/**
 * S-a luat in considerare doar un caz valid pentru acest obiect. Asadar nu avem
 * un unit testing complet.
 *
 */
public class TriunghiTest extends TestCase {

	private Triunghi triunghi = new Triunghi(new Punct(6, 12),
											 new Punct(16, 6), 
											 new Punct(3, 6));

	public void testPerimetru() {
		Assert.assertEquals(31.37, triunghi.perimetru());
	}

	public void testArie() {
		Assert.assertEquals(39.0, triunghi.arie());
	}
}
