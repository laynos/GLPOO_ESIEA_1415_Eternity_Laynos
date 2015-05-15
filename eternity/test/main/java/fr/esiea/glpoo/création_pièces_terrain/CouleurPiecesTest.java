package création_pièces_terrain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.awt.Color;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>CouleurPiecesTest</code> contains tests for the class <code>{@link CouleurPieces}</code>.
 *
 * @generatedBy CodePro at 15/05/15 23:06
 * @author ange__000
 * @version $Revision: 1.0 $
 */
public class CouleurPiecesTest {
	/**
	 * Run the Color getColor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testGetColor_1()
		throws Exception {
		CouleurPieces fixture = CouleurPieces.COL_BLUEGRAY;

		Color result = fixture.getColor();

		// add additional test code here
		assertNotNull(result);
		assertEquals("java.awt.Color[r=144,g=144,b=160]", result.toString());
		assertEquals(144, result.getGreen());
		assertEquals(144, result.getRed());
		assertEquals(160, result.getBlue());
		assertEquals(1, result.getTransparency());
		assertEquals(-7303008, result.getRGB());
		assertEquals(255, result.getAlpha());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CouleurPiecesTest.class);
	}
}