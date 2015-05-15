package options_du_jeu;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.awt.Component;
import java.awt.event.ActionEvent;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Window.EcranJeu;
import création_pièces_terrain.Terrain;
import fenêtre_de_jeu.AffichageGrille;
import fenêtre_de_jeu.EditableStatusProvider;

/**
 * The class <code>OuvrirFichierTest</code> contains tests for the class <code>{@link OuvrirFichier}</code>.
 *
 * @generatedBy CodePro at 15/05/15 23:08
 * @author ange__000
 * @version $Revision: 1.0 $
 */
public class OuvrirFichierTest {
	/**
	 * Run the OuvrirFichier(Terrain,EditableStatusProvider,Component) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:08
	 */
	@Test
	public void testOuvrirFichier_1()
		throws Exception {
		Terrain grid = new Terrain();
		EditableStatusProvider editable = new AffichageGrille(new Terrain());
		Component parent = new EcranJeu();

		OuvrirFichier result = new OuvrirFichier(grid, editable, parent);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isEnabled());
	}

	/**
	 * Run the void actionPerformed(ActionEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:08
	 */
	@Test
	public void testActionPerformed_1()
		throws Exception {
		OuvrirFichier fixture = new OuvrirFichier(new Terrain(), new AffichageGrille(new Terrain()), new EcranJeu());
		ActionEvent e = new ActionEvent(new Object(), 1, "");

		fixture.actionPerformed(e);

		// add additional test code here
	}

	/**
	 * Run the void actionPerformed(ActionEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:08
	 */
	@Test
	public void testActionPerformed_2()
		throws Exception {
		OuvrirFichier fixture = new OuvrirFichier(new Terrain(), new AffichageGrille(new Terrain()), new EcranJeu());
		ActionEvent e = new ActionEvent(new Object(), 1, "");

		fixture.actionPerformed(e);

		// add additional test code here
	}

	/**
	 * Run the void actionPerformed(ActionEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:08
	 */
	@Test(expected = java.awt.HeadlessException.class)
	public void testActionPerformed_3()
		throws Exception {
		OuvrirFichier fixture = new OuvrirFichier(new Terrain(), new AffichageGrille(new Terrain()), new EcranJeu());
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
	 * @generatedBy CodePro at 15/05/15 23:08
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
	 * @generatedBy CodePro at 15/05/15 23:08
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
	 * @generatedBy CodePro at 15/05/15 23:08
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(OuvrirFichierTest.class);
	}
}