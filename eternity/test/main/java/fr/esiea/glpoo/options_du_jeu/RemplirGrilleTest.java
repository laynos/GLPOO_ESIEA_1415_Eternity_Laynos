package options_du_jeu;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.awt.event.ActionEvent;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import création_pièces_terrain.Terrain;
import fenêtre_de_jeu.AffichageGrille;
import fenêtre_de_jeu.EditableStatusProvider;

/**
 * The class <code>RemplirGrilleTest</code> contains tests for the class <code>{@link RemplirGrille}</code>.
 *
 * @generatedBy CodePro at 15/05/15 23:07
 * @author ange__000
 * @version $Revision: 1.0 $
 */
public class RemplirGrilleTest {
	/**
	 * Run the RemplirGrille(Terrain,int,EditableStatusProvider) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:07
	 */
	@Test
	public void testRemplirGrille_1()
		throws Exception {
		Terrain grid = new Terrain();
		int patterns = 1;
		EditableStatusProvider editable = new AffichageGrille(new Terrain());

		RemplirGrille result = new RemplirGrille(grid, patterns, editable);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isEnabled());
	}

	/**
	 * Run the void actionPerformed(ActionEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:07
	 */
	@Test
	public void testActionPerformed_1()
		throws Exception {
		RemplirGrille fixture = new RemplirGrille(new Terrain(), 1, new AffichageGrille(new Terrain()));
		ActionEvent e = new ActionEvent(new Object(), 1, "");

		fixture.actionPerformed(e);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 15/05/15 23:07
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
	 * @generatedBy CodePro at 15/05/15 23:07
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
	 * @generatedBy CodePro at 15/05/15 23:07
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(RemplirGrilleTest.class);
	}
}