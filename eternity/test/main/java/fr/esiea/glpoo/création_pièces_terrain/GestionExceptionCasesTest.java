package création_pièces_terrain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>GestionExceptionCasesTest</code> contains tests for the class <code>{@link GestionExceptionCases}</code>.
 *
 * @generatedBy CodePro at 15/05/15 23:06
 * @author ange__000
 * @version $Revision: 1.0 $
 */
public class GestionExceptionCasesTest {
	/**
	 * Run the GestionExceptionCases() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testGestionExceptionCases_1()
		throws Exception {

		GestionExceptionCases result = new GestionExceptionCases();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("création_pièces_terrain.GestionExceptionCases: Erreur", result.toString());
		assertEquals("Erreur", result.getLocalizedMessage());
		assertEquals("Erreur", result.getMessage());
	}

	/**
	 * Run the GestionExceptionCases(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testGestionExceptionCases_2()
		throws Exception {
		String message = "";

		GestionExceptionCases result = new GestionExceptionCases(message);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("création_pièces_terrain.GestionExceptionCases: ", result.toString());
		assertEquals("", result.getLocalizedMessage());
		assertEquals("", result.getMessage());
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
		new org.junit.runner.JUnitCore().run(GestionExceptionCasesTest.class);
	}
}