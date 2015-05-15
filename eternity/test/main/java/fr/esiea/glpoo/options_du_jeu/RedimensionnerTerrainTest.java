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
 * The class <code>RedimensionnerTerrainTest</code> contains tests for the class <code>{@link RedimensionnerTerrain}</code>.
 *
 * @generatedBy CodePro at 15/05/15 23:05
 * @author ange__000
 * @version $Revision: 1.0 $
 */
public class RedimensionnerTerrainTest {
	/**
	 * Run the RedimensionnerTerrain(Terrain,int,EditableStatusProvider) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testRedimensionnerTerrain_1()
		throws Exception {
		Terrain grid = new Terrain();
		int size = 1;
		EditableStatusProvider editable = new AffichageGrille(new Terrain());

		RedimensionnerTerrain result = new RedimensionnerTerrain(grid, size, editable);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isEnabled());
	}

	/**
	 * Run the void actionPerformed(ActionEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testActionPerformed_1()
		throws Exception {
		RedimensionnerTerrain fixture = new RedimensionnerTerrain(new Terrain(), 1, new AffichageGrille(new Terrain()));
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
	 * @generatedBy CodePro at 15/05/15 23:05
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
	 * @generatedBy CodePro at 15/05/15 23:05
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
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(RedimensionnerTerrainTest.class);
	}
}