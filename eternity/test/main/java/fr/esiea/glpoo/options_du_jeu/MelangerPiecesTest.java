package options_du_jeu;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.awt.event.ActionEvent;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cr�ation_pi�ces_terrain.Terrain;
import fen�tre_de_jeu.AffichageGrille;
import fen�tre_de_jeu.EditableStatusProvider;

/**
 * The class <code>MelangerPiecesTest</code> contains tests for the class <code>{@link MelangerPieces}</code>.
 *
 * @generatedBy CodePro at 15/05/15 23:04
 * @author ange__000
 * @version $Revision: 1.0 $
 */
public class MelangerPiecesTest {
	/**
	 * Run the MelangerPieces(Terrain,EditableStatusProvider) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:04
	 */
	@Test
	public void testMelangerPieces_1()
		throws Exception {
		Terrain grid = new Terrain();
		EditableStatusProvider editable = new AffichageGrille(new Terrain());

		MelangerPieces result = new MelangerPieces(grid, editable);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isEnabled());
	}

	/**
	 * Run the void actionPerformed(ActionEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:04
	 */
	@Test
	public void testActionPerformed_1()
		throws Exception {
		MelangerPieces fixture = new MelangerPieces(new Terrain(), new AffichageGrille(new Terrain()));
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
	 * @generatedBy CodePro at 15/05/15 23:04
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
	 * @generatedBy CodePro at 15/05/15 23:04
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
	 * @generatedBy CodePro at 15/05/15 23:04
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(MelangerPiecesTest.class);
	}
}