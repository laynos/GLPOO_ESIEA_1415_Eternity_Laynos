package options_du_jeu;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import création_pièces_terrain.Terrain;
import fenêtre_de_jeu.AffichageGrille;

/**
 * The class <code>MAJGrilleTest</code> contains tests for the class <code>{@link MAJGrille}</code>.
 *
 * @generatedBy CodePro at 15/05/15 23:03
 * @author ange__000
 * @version $Revision: 1.0 $
 */
public class MAJGrilleTest {
	/**
	 * Run the void editableStatusUpdated(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:03
	 */
	@Test
	public void testEditableStatusUpdated_1()
		throws Exception {
		MAJGrille fixture = new MelangerPieces(new Terrain(), new AffichageGrille(new Terrain()));
		boolean editable = true;

		fixture.editableStatusUpdated(editable);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 15/05/15 23:03
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
	 * @generatedBy CodePro at 15/05/15 23:03
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
	 * @generatedBy CodePro at 15/05/15 23:03
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(MAJGrilleTest.class);
	}
}