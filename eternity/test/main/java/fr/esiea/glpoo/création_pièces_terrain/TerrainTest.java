package création_pièces_terrain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fenêtre_de_jeu.AffichageGrille;

/**
 * The class <code>TerrainTest</code> contains tests for the class <code>{@link Terrain}</code>.
 *
 * @generatedBy CodePro at 15/05/15 23:06
 * @author ange__000
 * @version $Revision: 1.0 $
 */
public class TerrainTest {
	/**
	 * Run the Terrain() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testTerrain_1()
		throws Exception {

		Terrain result = new Terrain();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.getSize());
		assertEquals(4, result.countConnections());
		assertEquals(true, result.isHSymetric());
		assertEquals(0, result.countPairs());
		assertEquals(true, result.isVSymetric());
		assertEquals(true, result.isRSymetric());
		assertEquals(false, result.isComplete());
		assertEquals("Too many border tiles", result.getStatusMessage());
		assertEquals(2, result.getHeight());
		assertEquals("  0  0  0  0      0  0  0  0 \n  0  0  0  0      0  0  0  0 \n", result.toQuadString());
		assertEquals(2, result.getWidth());
		assertEquals(4, result.getPositions());
	}

	/**
	 * Run the Terrain(int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testTerrain_2()
		throws Exception {
		int size = 1;

		Terrain result = new Terrain(size);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getSize());
		assertEquals(0, result.countConnections());
		assertEquals(true, result.isHSymetric());
		assertEquals(0, result.countPairs());
		assertEquals(true, result.isVSymetric());
		assertEquals(true, result.isRSymetric());
		assertEquals(true, result.isComplete());
		assertEquals("Ok", result.getStatusMessage());
		assertEquals(1, result.getHeight());
		assertEquals("  0  0  0  0 \n", result.toQuadString());
		assertEquals(1, result.getWidth());
		assertEquals(1, result.getPositions());
	}

	/**
	 * Run the void addGridObserver(GridObserver) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testAddGridObserver_1()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		GridObserver observer = new AffichageGrille(new Terrain());

		fixture.addGridObserver(observer);

		// add additional test code here
	}

	/**
	 * Run the Terrain clone() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testClone_1()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));

		Terrain result = fixture.clone();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.getSize());
		assertEquals(4, result.countConnections());
		assertEquals(true, result.isHSymetric());
		assertEquals(0, result.countPairs());
		assertEquals(true, result.isVSymetric());
		assertEquals(true, result.isRSymetric());
		assertEquals(false, result.isComplete());
		assertEquals("Too many border tiles", result.getStatusMessage());
		assertEquals(2, result.getHeight());
		assertEquals("  0  0  0  0      0  0  0  0 \n  0  0  0  0      0  0  0  0 \n", result.toQuadString());
		assertEquals(2, result.getWidth());
		assertEquals(4, result.getPositions());
	}

	/**
	 * Run the Terrain clone() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testClone_2()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));

		Terrain result = fixture.clone();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.getSize());
		assertEquals(4, result.countConnections());
		assertEquals(true, result.isHSymetric());
		assertEquals(0, result.countPairs());
		assertEquals(true, result.isVSymetric());
		assertEquals(true, result.isRSymetric());
		assertEquals(false, result.isComplete());
		assertEquals("Too many border tiles", result.getStatusMessage());
		assertEquals(2, result.getHeight());
		assertEquals("  0  0  0  0      0  0  0  0 \n  0  0  0  0      0  0  0  0 \n", result.toQuadString());
		assertEquals(2, result.getWidth());
		assertEquals(4, result.getPositions());
	}

	/**
	 * Run the void copyTo(Terrain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testCopyTo_1()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		Terrain destGrid = new Terrain();

		fixture.copyTo(destGrid);

		// add additional test code here
	}

	/**
	 * Run the void copyTo(Terrain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testCopyTo_2()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		Terrain destGrid = new Terrain();

		fixture.copyTo(destGrid);

		// add additional test code here
	}

	/**
	 * Run the void copyTo(Terrain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testCopyTo_3()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		Terrain destGrid = new Terrain();

		fixture.copyTo(destGrid);

		// add additional test code here
	}

	/**
	 * Run the void copyTo(Terrain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testCopyTo_4()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		Terrain destGrid = new Terrain();

		fixture.copyTo(destGrid);

		// add additional test code here
	}

	/**
	 * Run the int countConnections() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testCountConnections_1()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));

		int result = fixture.countConnections();

		// add additional test code here
		assertEquals(4, result);
	}

	/**
	 * Run the int countExternalBorders(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testCountExternalBorders_1()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		int index = 1;

		int result = fixture.countExternalBorders(index);

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the int countExternalBorders(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testCountExternalBorders_2()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		int x = 0;
		int y = 0;

		int result = fixture.countExternalBorders(x, y);

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the int countExternalBorders(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testCountExternalBorders_3()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		int x = 1;
		int y = 1;

		int result = fixture.countExternalBorders(x, y);

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the int countExternalBorders(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testCountExternalBorders_4()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		int x = 1;
		int y = 1;

		int result = fixture.countExternalBorders(x, y);

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the int countOccurences(Pieces) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testCountOccurences_1()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		Pieces pattern = Pieces.PAT_00;

		int result = fixture.countOccurences(pattern);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int countOccurences(Pieces) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testCountOccurences_2()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		Pieces pattern = Pieces.PAT_00;

		int result = fixture.countOccurences(pattern);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int countOccurences(Pieces) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testCountOccurences_3()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		Pieces pattern = Pieces.PAT_00;

		int result = fixture.countOccurences(pattern);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int countOpenOccurences(Pieces) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testCountOpenOccurences_1()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		Pieces pattern = Pieces.PAT_00;

		int result = fixture.countOpenOccurences(pattern);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.AbstractQuadGrid.getQuad(AbstractQuadGrid.java:67)
		//       at création_pièces_terrain.Terrain.countOpenOccurences(Terrain.java:353)
		assertEquals(0, result);
	}

	/**
	 * Run the int countOpenOccurences(Pieces) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testCountOpenOccurences_2()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		Pieces pattern = Pieces.PAT_00;

		int result = fixture.countOpenOccurences(pattern);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.AbstractQuadGrid.getQuad(AbstractQuadGrid.java:67)
		//       at création_pièces_terrain.Terrain.countOpenOccurences(Terrain.java:353)
		assertEquals(0, result);
	}

	/**
	 * Run the int countOpenOccurences(Pieces) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testCountOpenOccurences_3()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		Pieces pattern = Pieces.PAT_00;

		int result = fixture.countOpenOccurences(pattern);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.AbstractQuadGrid.getQuad(AbstractQuadGrid.java:67)
		//       at création_pièces_terrain.Terrain.countOpenOccurences(Terrain.java:353)
		assertEquals(0, result);
	}

	/**
	 * Run the int countOpenOccurences(Pieces) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testCountOpenOccurences_4()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		Pieces pattern = Pieces.PAT_00;

		int result = fixture.countOpenOccurences(pattern);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.AbstractQuadGrid.getQuad(AbstractQuadGrid.java:67)
		//       at création_pièces_terrain.Terrain.countOpenOccurences(Terrain.java:353)
		assertEquals(0, result);
	}

	/**
	 * Run the int countOpenOccurences(Pieces) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testCountOpenOccurences_5()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		Pieces pattern = Pieces.PAT_00;

		int result = fixture.countOpenOccurences(pattern);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.AbstractQuadGrid.getQuad(AbstractQuadGrid.java:67)
		//       at création_pièces_terrain.Terrain.countOpenOccurences(Terrain.java:353)
		assertEquals(0, result);
	}

	/**
	 * Run the int countOpenOccurences(Pieces) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testCountOpenOccurences_6()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		Pieces pattern = Pieces.PAT_00;

		int result = fixture.countOpenOccurences(pattern);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.AbstractQuadGrid.getQuad(AbstractQuadGrid.java:67)
		//       at création_pièces_terrain.Terrain.countOpenOccurences(Terrain.java:353)
		assertEquals(0, result);
	}

	/**
	 * Run the int countPairs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testCountPairs_1()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));

		int result = fixture.countPairs();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.AbstractQuadGrid.getQuad(AbstractQuadGrid.java:67)
		//       at création_pièces_terrain.Terrain.countPairs(Terrain.java:185)
		assertEquals(0, result);
	}

	/**
	 * Run the int countPairs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testCountPairs_2()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));

		int result = fixture.countPairs();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.AbstractQuadGrid.getQuad(AbstractQuadGrid.java:67)
		//       at création_pièces_terrain.Terrain.countPairs(Terrain.java:185)
		assertEquals(0, result);
	}

	/**
	 * Run the int countPairs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testCountPairs_3()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));

		int result = fixture.countPairs();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.AbstractQuadGrid.getQuad(AbstractQuadGrid.java:67)
		//       at création_pièces_terrain.Terrain.countPairs(Terrain.java:185)
		assertEquals(0, result);
	}

	/**
	 * Run the int countPairs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testCountPairs_4()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));

		int result = fixture.countPairs();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.AbstractQuadGrid.getQuad(AbstractQuadGrid.java:67)
		//       at création_pièces_terrain.Terrain.countPairs(Terrain.java:185)
		assertEquals(0, result);
	}

	/**
	 * Run the int countPairs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testCountPairs_5()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));

		int result = fixture.countPairs();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.AbstractQuadGrid.getQuad(AbstractQuadGrid.java:67)
		//       at création_pièces_terrain.Terrain.countPairs(Terrain.java:185)
		assertEquals(0, result);
	}

	/**
	 * Run the int countPairs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testCountPairs_6()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));

		int result = fixture.countPairs();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.AbstractQuadGrid.getQuad(AbstractQuadGrid.java:67)
		//       at création_pièces_terrain.Terrain.countPairs(Terrain.java:185)
		assertEquals(0, result);
	}

	/**
	 * Run the int countPairs(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testCountPairs_7()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		int index = 1;

		int result = fixture.countPairs(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 1, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.AbstractQuadGrid.getQuad(AbstractQuadGrid.java:67)
		//       at création_pièces_terrain.Terrain.countPairs(Terrain.java:256)
		//       at création_pièces_terrain.Terrain.countPairs(Terrain.java:235)
		//       at création_pièces_terrain.Terrain.countPairs(Terrain.java:221)
		assertEquals(0, result);
	}

	/**
	 * Run the int countPairs(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testCountPairs_8()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		int x = 1;
		int y = 1;

		int result = fixture.countPairs(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 3, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.AbstractQuadGrid.getQuad(AbstractQuadGrid.java:67)
		//       at création_pièces_terrain.Terrain.countPairs(Terrain.java:256)
		//       at création_pièces_terrain.Terrain.countPairs(Terrain.java:235)
		assertEquals(0, result);
	}

	/**
	 * Run the int countPairs(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testCountPairs_9()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		int x = -1;
		int y = 1;
		int borderweight = 1;

		int result = fixture.countPairs(x, y, borderweight);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int countPairs(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testCountPairs_10()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		int x = 1;
		int y = 1;
		int borderweight = 1;

		int result = fixture.countPairs(x, y, borderweight);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 3, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.AbstractQuadGrid.getQuad(AbstractQuadGrid.java:67)
		//       at création_pièces_terrain.Terrain.countPairs(Terrain.java:256)
		assertEquals(0, result);
	}

	/**
	 * Run the int countPairs(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testCountPairs_11()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		int x = 1;
		int y = -1;
		int borderweight = 1;

		int result = fixture.countPairs(x, y, borderweight);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int countPairs(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testCountPairs_12()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		int x = 1;
		int y = 1;
		int borderweight = 1;

		int result = fixture.countPairs(x, y, borderweight);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 3, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.AbstractQuadGrid.getQuad(AbstractQuadGrid.java:67)
		//       at création_pièces_terrain.Terrain.countPairs(Terrain.java:256)
		assertEquals(0, result);
	}

	/**
	 * Run the int countPairs(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testCountPairs_13()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		int x = 1;
		int y = 1;
		int borderweight = 1;

		int result = fixture.countPairs(x, y, borderweight);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 3, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.AbstractQuadGrid.getQuad(AbstractQuadGrid.java:67)
		//       at création_pièces_terrain.Terrain.countPairs(Terrain.java:256)
		assertEquals(0, result);
	}

	/**
	 * Run the int countPairs(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testCountPairs_14()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		int x = 0;
		int y = 0;
		int borderweight = 1;

		int result = fixture.countPairs(x, y, borderweight);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.AbstractQuadGrid.getQuad(AbstractQuadGrid.java:67)
		//       at création_pièces_terrain.Terrain.countPairs(Terrain.java:256)
		assertEquals(0, result);
	}

	/**
	 * Run the int countPairs(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testCountPairs_15()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		int x = 1;
		int y = 1;
		int borderweight = 1;

		int result = fixture.countPairs(x, y, borderweight);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 3, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.AbstractQuadGrid.getQuad(AbstractQuadGrid.java:67)
		//       at création_pièces_terrain.Terrain.countPairs(Terrain.java:256)
		assertEquals(0, result);
	}

	/**
	 * Run the int countPairs(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testCountPairs_16()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		int x = 0;
		int y = 1;
		int borderweight = 1;

		int result = fixture.countPairs(x, y, borderweight);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 2, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.AbstractQuadGrid.getQuad(AbstractQuadGrid.java:67)
		//       at création_pièces_terrain.Terrain.countPairs(Terrain.java:256)
		assertEquals(0, result);
	}

	/**
	 * Run the int countPairs(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testCountPairs_17()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		int x = 1;
		int y = 0;
		int borderweight = 1;

		int result = fixture.countPairs(x, y, borderweight);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 1, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.AbstractQuadGrid.getQuad(AbstractQuadGrid.java:67)
		//       at création_pièces_terrain.Terrain.countPairs(Terrain.java:256)
		assertEquals(0, result);
	}

	/**
	 * Run the void flipHorizontal() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testFlipHorizontal_1()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));

		fixture.flipHorizontal();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.Terrain.flipHorizontal(Terrain.java:846)
	}

	/**
	 * Run the void flipHorizontal() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testFlipHorizontal_2()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(false);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));

		fixture.flipHorizontal();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.Terrain.flipHorizontal(Terrain.java:846)
	}

	/**
	 * Run the void flipHorizontal() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testFlipHorizontal_3()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(false);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));

		fixture.flipHorizontal();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.Terrain.flipHorizontal(Terrain.java:846)
	}

	/**
	 * Run the void flipHorizontal() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testFlipHorizontal_4()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(false);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));

		fixture.flipHorizontal();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.Terrain.flipHorizontal(Terrain.java:846)
	}

	/**
	 * Run the void flipHorizontal() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testFlipHorizontal_5()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(false);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));

		fixture.flipHorizontal();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.Terrain.flipHorizontal(Terrain.java:846)
	}

	/**
	 * Run the void flipHorizontal() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testFlipHorizontal_6()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(false);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));

		fixture.flipHorizontal();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.Terrain.flipHorizontal(Terrain.java:846)
	}

	/**
	 * Run the void flipHorizontal() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testFlipHorizontal_7()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(false);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));

		fixture.flipHorizontal();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.Terrain.flipHorizontal(Terrain.java:846)
	}

	/**
	 * Run the void flipVertical() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testFlipVertical_1()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));

		fixture.flipVertical();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.Terrain.rotateClockwise(Terrain.java:771)
		//       at création_pièces_terrain.Terrain.flipVertical(Terrain.java:830)
	}

	/**
	 * Run the void flipVertical() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testFlipVertical_2()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(false);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));

		fixture.flipVertical();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.Terrain.rotateClockwise(Terrain.java:771)
		//       at création_pièces_terrain.Terrain.flipVertical(Terrain.java:830)
	}

	/**
	 * Run the void fromQuadString(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test(expected = création_pièces_terrain.GestionExceptionCases.class)
	public void testFromQuadString_1()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(false);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		String text = "";

		fixture.fromQuadString(text);

		// add additional test code here
	}

	/**
	 * Run the void fromQuadString(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test(expected = création_pièces_terrain.GestionExceptionCases.class)
	public void testFromQuadString_2()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(false);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		String text = "a";

		fixture.fromQuadString(text);

		// add additional test code here
	}

	/**
	 * Run the void fromQuadString(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test(expected = création_pièces_terrain.GestionExceptionCases.class)
	public void testFromQuadString_3()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(false);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		String text = "a";

		fixture.fromQuadString(text);

		// add additional test code here
	}

	/**
	 * Run the void fromQuadString(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test(expected = création_pièces_terrain.GestionExceptionCases.class)
	public void testFromQuadString_4()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(false);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		String text = "a";

		fixture.fromQuadString(text);

		// add additional test code here
	}

	/**
	 * Run the void fromQuadString(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test(expected = création_pièces_terrain.GestionExceptionCases.class)
	public void testFromQuadString_5()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(false);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		String text = "a";

		fixture.fromQuadString(text);

		// add additional test code here
	}

	/**
	 * Run the void fromQuadString(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test(expected = création_pièces_terrain.GestionExceptionCases.class)
	public void testFromQuadString_6()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(false);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		String text = "a";

		fixture.fromQuadString(text);

		// add additional test code here
	}

	/**
	 * Run the void fromQuadString(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test(expected = création_pièces_terrain.GestionExceptionCases.class)
	public void testFromQuadString_7()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(false);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		String text = "a";

		fixture.fromQuadString(text);

		// add additional test code here
	}

	/**
	 * Run the void fromQuadString(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test(expected = création_pièces_terrain.GestionExceptionCases.class)
	public void testFromQuadString_8()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(false);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		String text = "a";

		fixture.fromQuadString(text);

		// add additional test code here
	}

	/**
	 * Run the void fromQuadString(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test(expected = création_pièces_terrain.GestionExceptionCases.class)
	public void testFromQuadString_9()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(false);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		String text = "a";

		fixture.fromQuadString(text);

		// add additional test code here
	}

	/**
	 * Run the void fromQuadString(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test(expected = création_pièces_terrain.GestionExceptionCases.class)
	public void testFromQuadString_10()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(false);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		String text = "a";

		fixture.fromQuadString(text);

		// add additional test code here
	}

	/**
	 * Run the void fromQuadString(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test(expected = création_pièces_terrain.GestionExceptionCases.class)
	public void testFromQuadString_11()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(false);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		String text = "";

		fixture.fromQuadString(text);

		// add additional test code here
	}

	/**
	 * Run the void fromQuadString(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test(expected = création_pièces_terrain.GestionExceptionCases.class)
	public void testFromQuadString_12()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(false);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		String text = "";

		fixture.fromQuadString(text);

		// add additional test code here
	}

	/**
	 * Run the void fromQuadString(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test(expected = création_pièces_terrain.GestionExceptionCases.class)
	public void testFromQuadString_13()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(false);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		String text = "";

		fixture.fromQuadString(text);

		// add additional test code here
	}

	/**
	 * Run the void fromQuadString(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test(expected = création_pièces_terrain.GestionExceptionCases.class)
	public void testFromQuadString_14()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(false);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		String text = "";

		fixture.fromQuadString(text);

		// add additional test code here
	}

	/**
	 * Run the void fromQuadString(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test(expected = création_pièces_terrain.GestionExceptionCases.class)
	public void testFromQuadString_15()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(false);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		String text = "";

		fixture.fromQuadString(text);

		// add additional test code here
	}

	/**
	 * Run the void fromQuadString(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test(expected = création_pièces_terrain.GestionExceptionCases.class)
	public void testFromQuadString_16()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(false);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		String text = "";

		fixture.fromQuadString(text);

		// add additional test code here
	}

	/**
	 * Run the List<Integer> getMatchingQuads(Cases,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testGetMatchingQuads_1()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		Cases missing = new Cases();
		int degrees = 1;

		List<Integer> result = fixture.getMatchingQuads(missing, degrees);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Integer> getMatchingQuads(Cases,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testGetMatchingQuads_2()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		Cases missing = new Cases();
		int degrees = 1;

		List<Integer> result = fixture.getMatchingQuads(missing, degrees);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Integer> getMatchingQuads(Cases,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testGetMatchingQuads_3()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		Cases missing = new Cases();
		int degrees = 1;

		List<Integer> result = fixture.getMatchingQuads(missing, degrees);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Integer> getMatchingQuads(Cases,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testGetMatchingQuads_4()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		Cases missing = new Cases();
		int degrees = 1;

		List<Integer> result = fixture.getMatchingQuads(missing, degrees);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Cases getMissingQuad(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testGetMissingQuad_1()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		int index = 1;

		Cases result = fixture.getMissingQuad(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 3, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.AbstractQuadGrid.getQuad(AbstractQuadGrid.java:67)
		//       at création_pièces_terrain.AbstractQuadGrid.getNeighbor(AbstractQuadGrid.java:197)
		//       at création_pièces_terrain.Terrain.getMissingQuad(Terrain.java:613)
		//       at création_pièces_terrain.Terrain.getMissingQuad(Terrain.java:596)
		assertNotNull(result);
	}

	/**
	 * Run the Cases getMissingQuad(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testGetMissingQuad_2()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		int x = 1;
		int y = 1;

		Cases result = fixture.getMissingQuad(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 1, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.AbstractQuadGrid.getQuad(AbstractQuadGrid.java:67)
		//       at création_pièces_terrain.AbstractQuadGrid.getNeighbor(AbstractQuadGrid.java:197)
		//       at création_pièces_terrain.Terrain.getMissingQuad(Terrain.java:613)
		assertNotNull(result);
	}

	/**
	 * Run the Cases getMissingQuad(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testGetMissingQuad_3()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		int x = 1;
		int y = 1;

		Cases result = fixture.getMissingQuad(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 1, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.AbstractQuadGrid.getQuad(AbstractQuadGrid.java:67)
		//       at création_pièces_terrain.AbstractQuadGrid.getNeighbor(AbstractQuadGrid.java:197)
		//       at création_pièces_terrain.Terrain.getMissingQuad(Terrain.java:613)
		assertNotNull(result);
	}

	/**
	 * Run the Cases getMissingQuad(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testGetMissingQuad_4()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		int x = 1;
		int y = 1;

		Cases result = fixture.getMissingQuad(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 1, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.AbstractQuadGrid.getQuad(AbstractQuadGrid.java:67)
		//       at création_pièces_terrain.AbstractQuadGrid.getNeighbor(AbstractQuadGrid.java:197)
		//       at création_pièces_terrain.Terrain.getMissingQuad(Terrain.java:613)
		assertNotNull(result);
	}

	/**
	 * Run the Cases getMissingQuad(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testGetMissingQuad_5()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		int x = 1;
		int y = 1;

		Cases result = fixture.getMissingQuad(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 1, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.AbstractQuadGrid.getQuad(AbstractQuadGrid.java:67)
		//       at création_pièces_terrain.AbstractQuadGrid.getNeighbor(AbstractQuadGrid.java:197)
		//       at création_pièces_terrain.Terrain.getMissingQuad(Terrain.java:613)
		assertNotNull(result);
	}

	/**
	 * Run the int getSize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testGetSize_1()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));

		int result = fixture.getSize();

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the String getStatusMessage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testGetStatusMessage_1()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));

		String result = fixture.getStatusMessage();

		// add additional test code here
		assertEquals("Too few border tiles", result);
	}

	/**
	 * Run the String getStatusMessage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testGetStatusMessage_2()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));

		String result = fixture.getStatusMessage();

		// add additional test code here
		assertEquals("Too few border tiles", result);
	}

	/**
	 * Run the String getStatusMessage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testGetStatusMessage_3()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));

		String result = fixture.getStatusMessage();

		// add additional test code here
		assertEquals("Too few border tiles", result);
	}

	/**
	 * Run the String getStatusMessage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testGetStatusMessage_4()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));

		String result = fixture.getStatusMessage();

		// add additional test code here
		assertEquals("Too few border tiles", result);
	}

	/**
	 * Run the String getStatusMessage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testGetStatusMessage_5()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));

		String result = fixture.getStatusMessage();

		// add additional test code here
		assertEquals("Too few border tiles", result);
	}

	/**
	 * Run the String getStatusMessage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testGetStatusMessage_6()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));

		String result = fixture.getStatusMessage();

		// add additional test code here
		assertEquals("Too few border tiles", result);
	}

	/**
	 * Run the boolean isComplete() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testIsComplete_1()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));

		boolean result = fixture.isComplete();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.AbstractQuadGrid.getQuad(AbstractQuadGrid.java:67)
		//       at création_pièces_terrain.Terrain.countPairs(Terrain.java:185)
		//       at création_pièces_terrain.Terrain.isComplete(Terrain.java:160)
		assertTrue(result);
	}

	/**
	 * Run the boolean isComplete() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testIsComplete_2()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));

		boolean result = fixture.isComplete();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.AbstractQuadGrid.getQuad(AbstractQuadGrid.java:67)
		//       at création_pièces_terrain.Terrain.countPairs(Terrain.java:185)
		//       at création_pièces_terrain.Terrain.isComplete(Terrain.java:160)
		assertTrue(result);
	}

	/**
	 * Run the boolean isHSymetric() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testIsHSymetric_1()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));

		boolean result = fixture.isHSymetric();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isHSymetric() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testIsHSymetric_2()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));

		boolean result = fixture.isHSymetric();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isRSymetric() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testIsRSymetric_1()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));

		boolean result = fixture.isRSymetric();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isRSymetric() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testIsRSymetric_2()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));

		boolean result = fixture.isRSymetric();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isVSymetric() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testIsVSymetric_1()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));

		boolean result = fixture.isVSymetric();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isVSymetric() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testIsVSymetric_2()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));

		boolean result = fixture.isVSymetric();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the int optimizeQuadRotation(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testOptimizeQuadRotation_1()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		int index = 1;

		int result = fixture.optimizeQuadRotation(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 1, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.AbstractQuadGrid.getQuad(AbstractQuadGrid.java:49)
		//       at création_pièces_terrain.Terrain.optimizeQuadRotation(Terrain.java:547)
		assertEquals(0, result);
	}

	/**
	 * Run the int optimizeQuadRotation(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testOptimizeQuadRotation_2()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(false);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		int index = 1;

		int result = fixture.optimizeQuadRotation(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 1, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.AbstractQuadGrid.getQuad(AbstractQuadGrid.java:49)
		//       at création_pièces_terrain.Terrain.optimizeQuadRotation(Terrain.java:547)
		assertEquals(0, result);
	}

	/**
	 * Run the int optimizeQuadRotation(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testOptimizeQuadRotation_3()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(false);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		int index = 1;

		int result = fixture.optimizeQuadRotation(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 1, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.AbstractQuadGrid.getQuad(AbstractQuadGrid.java:49)
		//       at création_pièces_terrain.Terrain.optimizeQuadRotation(Terrain.java:547)
		assertEquals(0, result);
	}

	/**
	 * Run the int optimizeQuadRotation(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testOptimizeQuadRotation_4()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(false);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		int index = 1;

		int result = fixture.optimizeQuadRotation(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 1, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.AbstractQuadGrid.getQuad(AbstractQuadGrid.java:49)
		//       at création_pièces_terrain.Terrain.optimizeQuadRotation(Terrain.java:547)
		assertEquals(0, result);
	}

	/**
	 * Run the void removeGridObserver(GridObserver) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testRemoveGridObserver_1()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		GridObserver observer = new AffichageGrille(new Terrain());

		fixture.removeGridObserver(observer);

		// add additional test code here
	}

	/**
	 * Run the void reset() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testReset_1()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));

		fixture.reset();

		// add additional test code here
	}

	/**
	 * Run the void reset() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testReset_2()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(false);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));

		fixture.reset();

		// add additional test code here
	}

	/**
	 * Run the void reset() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testReset_3()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(false);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));

		fixture.reset();

		// add additional test code here
	}

	/**
	 * Run the void rotateCenterClockwise() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testRotateCenterClockwise_1()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));

		fixture.rotateCenterClockwise();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.Terrain.rotateCenterClockwise(Terrain.java:802)
	}

	/**
	 * Run the void rotateCenterClockwise() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testRotateCenterClockwise_2()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(false);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));

		fixture.rotateCenterClockwise();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.Terrain.rotateCenterClockwise(Terrain.java:802)
	}

	/**
	 * Run the void rotateCenterClockwise() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testRotateCenterClockwise_3()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(false);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));

		fixture.rotateCenterClockwise();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.Terrain.rotateCenterClockwise(Terrain.java:802)
	}

	/**
	 * Run the void rotateCenterClockwise() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testRotateCenterClockwise_4()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(false);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));

		fixture.rotateCenterClockwise();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.Terrain.rotateCenterClockwise(Terrain.java:802)
	}

	/**
	 * Run the void rotateCenterClockwise() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testRotateCenterClockwise_5()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(false);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));

		fixture.rotateCenterClockwise();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.Terrain.rotateCenterClockwise(Terrain.java:802)
	}

	/**
	 * Run the void rotateCenterClockwise() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testRotateCenterClockwise_6()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(false);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));

		fixture.rotateCenterClockwise();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.Terrain.rotateCenterClockwise(Terrain.java:802)
	}

	/**
	 * Run the void rotateCenterClockwise() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testRotateCenterClockwise_7()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(false);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));

		fixture.rotateCenterClockwise();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.Terrain.rotateCenterClockwise(Terrain.java:802)
	}

	/**
	 * Run the void rotateCenterClockwise(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testRotateCenterClockwise_8()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		int steps = 1;

		fixture.rotateCenterClockwise(steps);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.Terrain.rotateCenterClockwise(Terrain.java:802)
		//       at création_pièces_terrain.Terrain.rotateCenterClockwise(Terrain.java:789)
	}

	/**
	 * Run the void rotateCenterClockwise(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testRotateCenterClockwise_9()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(false);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		int steps = 1;

		fixture.rotateCenterClockwise(steps);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.Terrain.rotateCenterClockwise(Terrain.java:802)
		//       at création_pièces_terrain.Terrain.rotateCenterClockwise(Terrain.java:789)
	}

	/**
	 * Run the void rotateCenterClockwise(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testRotateCenterClockwise_10()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(false);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		int steps = 0;

		fixture.rotateCenterClockwise(steps);

		// add additional test code here
	}

	/**
	 * Run the void rotateCenterCounterclockwise() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testRotateCenterCounterclockwise_1()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));

		fixture.rotateCenterCounterclockwise();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.Terrain.rotateCenterClockwise(Terrain.java:802)
		//       at création_pièces_terrain.Terrain.rotateCenterClockwise(Terrain.java:789)
		//       at création_pièces_terrain.Terrain.rotateCenterCounterclockwise(Terrain.java:825)
	}

	/**
	 * Run the void rotateCenterCounterclockwise() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testRotateCenterCounterclockwise_2()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(false);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));

		fixture.rotateCenterCounterclockwise();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.Terrain.rotateCenterClockwise(Terrain.java:802)
		//       at création_pièces_terrain.Terrain.rotateCenterClockwise(Terrain.java:789)
		//       at création_pièces_terrain.Terrain.rotateCenterCounterclockwise(Terrain.java:825)
	}

	/**
	 * Run the void rotateCenterCounterclockwise(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testRotateCenterCounterclockwise_3()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		int steps = 1;

		fixture.rotateCenterCounterclockwise(steps);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.Terrain.rotateCenterClockwise(Terrain.java:802)
		//       at création_pièces_terrain.Terrain.rotateCenterClockwise(Terrain.java:789)
		//       at création_pièces_terrain.Terrain.rotateCenterCounterclockwise(Terrain.java:825)
		//       at création_pièces_terrain.Terrain.rotateCenterCounterclockwise(Terrain.java:820)
	}

	/**
	 * Run the void rotateCenterCounterclockwise(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testRotateCenterCounterclockwise_4()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(false);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		int steps = 1;

		fixture.rotateCenterCounterclockwise(steps);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.Terrain.rotateCenterClockwise(Terrain.java:802)
		//       at création_pièces_terrain.Terrain.rotateCenterClockwise(Terrain.java:789)
		//       at création_pièces_terrain.Terrain.rotateCenterCounterclockwise(Terrain.java:825)
		//       at création_pièces_terrain.Terrain.rotateCenterCounterclockwise(Terrain.java:820)
	}

	/**
	 * Run the void rotateCenterCounterclockwise(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testRotateCenterCounterclockwise_5()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(false);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		int steps = 0;

		fixture.rotateCenterCounterclockwise(steps);

		// add additional test code here
	}

	/**
	 * Run the void rotateClockwise() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testRotateClockwise_1()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));

		fixture.rotateClockwise();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.Terrain.rotateClockwise(Terrain.java:771)
	}

	/**
	 * Run the void rotateClockwise() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testRotateClockwise_2()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(false);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));

		fixture.rotateClockwise();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.Terrain.rotateClockwise(Terrain.java:771)
	}

	/**
	 * Run the void rotateClockwise() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testRotateClockwise_3()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(false);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));

		fixture.rotateClockwise();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.Terrain.rotateClockwise(Terrain.java:771)
	}

	/**
	 * Run the void rotateClockwise() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testRotateClockwise_4()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(false);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));

		fixture.rotateClockwise();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.Terrain.rotateClockwise(Terrain.java:771)
	}

	/**
	 * Run the void rotateClockwise() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testRotateClockwise_5()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(false);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));

		fixture.rotateClockwise();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.Terrain.rotateClockwise(Terrain.java:771)
	}

	/**
	 * Run the void rotateClockwise() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testRotateClockwise_6()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(false);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));

		fixture.rotateClockwise();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.Terrain.rotateClockwise(Terrain.java:771)
	}

	/**
	 * Run the void rotateClockwise() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testRotateClockwise_7()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(false);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));

		fixture.rotateClockwise();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.Terrain.rotateClockwise(Terrain.java:771)
	}

	/**
	 * Run the void rotateClockwise(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testRotateClockwise_8()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		int steps = 1;

		fixture.rotateClockwise(steps);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.Terrain.rotateClockwise(Terrain.java:771)
		//       at création_pièces_terrain.Terrain.rotateClockwise(Terrain.java:740)
	}

	/**
	 * Run the void rotateClockwise(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testRotateClockwise_9()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(false);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		int steps = 1;

		fixture.rotateClockwise(steps);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.Terrain.rotateClockwise(Terrain.java:771)
		//       at création_pièces_terrain.Terrain.rotateClockwise(Terrain.java:740)
	}

	/**
	 * Run the void rotateClockwise(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testRotateClockwise_10()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(false);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		int steps = 0;

		fixture.rotateClockwise(steps);

		// add additional test code here
	}

	/**
	 * Run the void rotateCounterclockwise() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testRotateCounterclockwise_1()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));

		fixture.rotateCounterclockwise();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.Terrain.rotateClockwise(Terrain.java:771)
		//       at création_pièces_terrain.Terrain.rotateClockwise(Terrain.java:740)
		//       at création_pièces_terrain.Terrain.rotateCounterclockwise(Terrain.java:758)
	}

	/**
	 * Run the void rotateCounterclockwise() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testRotateCounterclockwise_2()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(false);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));

		fixture.rotateCounterclockwise();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.Terrain.rotateClockwise(Terrain.java:771)
		//       at création_pièces_terrain.Terrain.rotateClockwise(Terrain.java:740)
		//       at création_pièces_terrain.Terrain.rotateCounterclockwise(Terrain.java:758)
	}

	/**
	 * Run the void rotateCounterclockwise(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testRotateCounterclockwise_3()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		int steps = 1;

		fixture.rotateCounterclockwise(steps);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.Terrain.rotateClockwise(Terrain.java:771)
		//       at création_pièces_terrain.Terrain.rotateClockwise(Terrain.java:740)
		//       at création_pièces_terrain.Terrain.rotateCounterclockwise(Terrain.java:758)
		//       at création_pièces_terrain.Terrain.rotateCounterclockwise(Terrain.java:753)
	}

	/**
	 * Run the void rotateCounterclockwise(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testRotateCounterclockwise_4()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(false);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		int steps = 1;

		fixture.rotateCounterclockwise(steps);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.Terrain.rotateClockwise(Terrain.java:771)
		//       at création_pièces_terrain.Terrain.rotateClockwise(Terrain.java:740)
		//       at création_pièces_terrain.Terrain.rotateCounterclockwise(Terrain.java:758)
		//       at création_pièces_terrain.Terrain.rotateCounterclockwise(Terrain.java:753)
	}

	/**
	 * Run the void rotateCounterclockwise(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testRotateCounterclockwise_5()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(false);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		int steps = 0;

		fixture.rotateCounterclockwise(steps);

		// add additional test code here
	}

	/**
	 * Run the void setReadOnly(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testSetReadOnly_1()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		boolean readOnly = true;

		fixture.setReadOnly(readOnly);

		// add additional test code here
	}

	/**
	 * Run the void setReadOnly(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testSetReadOnly_2()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		boolean readOnly = true;

		fixture.setReadOnly(readOnly);

		// add additional test code here
	}

	/**
	 * Run the void setSize(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testSetSize_1()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		int size = 1;

		fixture.setSize(size);

		// add additional test code here
	}

	/**
	 * Run the void setSize(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testSetSize_2()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(false);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		int size = 1;

		fixture.setSize(size);

		// add additional test code here
	}

	/**
	 * Run the void shuffle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testShuffle_1()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));

		fixture.shuffle();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.Terrain.shuffle(Terrain.java:123)
	}

	/**
	 * Run the void shuffle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testShuffle_2()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(false);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));

		fixture.shuffle();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.Terrain.shuffle(Terrain.java:123)
	}

	/**
	 * Run the void shuffle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testShuffle_3()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(false);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));

		fixture.shuffle();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.Terrain.shuffle(Terrain.java:123)
	}

	/**
	 * Run the void shuffle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testShuffle_4()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(false);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));

		fixture.shuffle();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.Terrain.shuffle(Terrain.java:123)
	}

	/**
	 * Run the void shuffle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testShuffle_5()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(false);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));

		fixture.shuffle();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.Terrain.shuffle(Terrain.java:123)
	}

	/**
	 * Run the void sort(Cases) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testSort_1()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		Cases reference = new Cases();

		fixture.sort(reference);

		// add additional test code here
	}

	/**
	 * Run the void sort(Comparator<Cases>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testSort_2()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		Comparator<Cases> comparator = new ComparerCases(new Cases());

		fixture.sort(comparator);

		// add additional test code here
	}

	/**
	 * Run the void sort(Comparator<Cases>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testSort_3()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		Comparator<Cases> comparator = new ComparerCases(new Cases());

		fixture.sort(comparator);

		// add additional test code here
	}

	/**
	 * Run the void sort(Comparator<Cases>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testSort_4()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		Comparator<Cases> comparator = new ComparerCases(new Cases());

		fixture.sort(comparator);

		// add additional test code here
	}

	/**
	 * Run the void sort(Comparator<Cases>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testSort_5()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		Comparator<Cases> comparator = new ComparerCases(new Cases());

		fixture.sort(comparator);

		// add additional test code here
	}

	/**
	 * Run the void swap(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testSwap_1()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(true);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		int indexA = 1;
		int indexB = 1;

		fixture.swap(indexA, indexB);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 1, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.AbstractQuadGrid.getQuad(AbstractQuadGrid.java:49)
		//       at création_pièces_terrain.Terrain.swap(Terrain.java:576)
	}

	/**
	 * Run the void swap(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testSwap_2()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.setReadOnly(false);
		fixture.gridQuads = new ArrayList<Cases>();
		fixture.addGridObserver(new AffichageGrille(new Terrain()));
		int indexA = 1;
		int indexB = 1;

		fixture.swap(indexA, indexB);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 1, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.AbstractQuadGrid.getQuad(AbstractQuadGrid.java:49)
		//       at création_pièces_terrain.Terrain.swap(Terrain.java:576)
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
		new org.junit.runner.JUnitCore().run(TerrainTest.class);
	}
}