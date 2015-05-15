package options_du_jeu;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.awt.Component;
import java.awt.event.ActionEvent;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Window.EcranJeu;
import cr�ation_pi�ces_terrain.Terrain;
import fen�tre_de_jeu.AffichageGrille;
import fen�tre_de_jeu.EditableStatusProvider;


/**
 * The class <code>EnregistrerSousTest</code> contains tests for the class <code>{@link EnregistrerSous}</code>.
 *
 * @generatedBy CodePro at 15/05/15 23:07
 * @author ange__000
 * @version $Revision: 1.0 $
 */
public class EnregistrerSousTest {
	/**
	 * Run the EnregistrerSous(Terrain,EditableStatusProvider,Component) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:07
	 */
	@Test
	public void testEnregistrerSous_1()
		throws Exception {
		Terrain grid = new Terrain();
		EditableStatusProvider editable = new AffichageGrille(new Terrain());
		Component parent = new EcranJeu();

		EnregistrerSous result = new EnregistrerSous(grid, editable, parent);

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
		EnregistrerSous fixture = new EnregistrerSous(new Terrain(), new AffichageGrille(new Terrain()), new EcranJeu());
		ActionEvent e = new ActionEvent(new Object(), 1, "");

		fixture.actionPerformed(e);

		// add additional test code here
	}

	/**
	 * Run the void actionPerformed(ActionEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:07
	 */
	@Test
	public void testActionPerformed_2()
		throws Exception {
		EnregistrerSous fixture = new EnregistrerSous(new Terrain(), new AffichageGrille(new Terrain()), new EcranJeu());
		ActionEvent e = new ActionEvent(new Object(), 1, "");

		fixture.actionPerformed(e);

		// add additional test code here
	}

	/**
	 * Run the void actionPerformed(ActionEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:07
	 */
	@Test
	public void testActionPerformed_3()
		throws Exception {
		EnregistrerSous fixture = new EnregistrerSous(new Terrain(), new AffichageGrille(new Terrain()), new EcranJeu());
		ActionEvent e = new ActionEvent(new Object(), 1, "");

		fixture.actionPerformed(e);

		// add additional test code here
	}

	/**
	 * Run the void actionPerformed(ActionEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:07
	 */
	@Test
	public void testActionPerformed_4()
		throws Exception {
		EnregistrerSous fixture = new EnregistrerSous(new Terrain(), new AffichageGrille(new Terrain()), new EcranJeu());
		ActionEvent e = new ActionEvent(new Object(), 1, "");

		fixture.actionPerformed(e);

		// add additional test code here
	}

	/**
	 * Run the void actionPerformed(ActionEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:07
	 */
	@Test
	public void testActionPerformed_5()
		throws Exception {
		EnregistrerSous fixture = new EnregistrerSous(new Terrain(), new AffichageGrille(new Terrain()), new EcranJeu());
		ActionEvent e = new ActionEvent(new Object(), 1, "");

		fixture.actionPerformed(e);

		// add additional test code here
	}

	/**
	 * Run the void actionPerformed(ActionEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:07
	 */
	@Test
	public void testActionPerformed_6()
		throws Exception {
		EnregistrerSous fixture = new EnregistrerSous(new Terrain(), new AffichageGrille(new Terrain()), new EcranJeu());
		ActionEvent e = new ActionEvent(new Object(), 1, "");

		fixture.actionPerformed(e);

		// add additional test code here
	}

	/**
	 * Run the void actionPerformed(ActionEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:07
	 */
	@Test(expected = java.awt.HeadlessException.class)
	public void testActionPerformed_7()
		throws Exception {
		EnregistrerSous fixture = new EnregistrerSous(new Terrain(), new AffichageGrille(new Terrain()), new EcranJeu());
		ActionEvent e = new ActionEvent(new Object(), 1, "");

		fixture.actionPerformed(e);

		// add additional test code here
	}

	/**
	 * Run the void actionPerformed(ActionEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:07
	 */
	@Test(expected = java.awt.HeadlessException.class)
	public void testActionPerformed_8()
		throws Exception {
		EnregistrerSous fixture = new EnregistrerSous(new Terrain(), new AffichageGrille(new Terrain()), new EcranJeu());
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
		new org.junit.runner.JUnitCore().run(EnregistrerSousTest.class);
	}
}