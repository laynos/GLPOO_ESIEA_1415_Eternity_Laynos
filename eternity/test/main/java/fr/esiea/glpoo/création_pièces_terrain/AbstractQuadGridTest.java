package création_pièces_terrain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>AbstractQuadGridTest</code> contains tests for the class <code>{@link AbstractQuadGrid}</code>.
 *
 * @generatedBy CodePro at 15/05/15 23:06
 * @author ange__000
 * @version $Revision: 1.0 $
 */
public class AbstractQuadGridTest {
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
		fixture.gridQuads = new ArrayList<Cases>();

		int result = fixture.countConnections();

		// add additional test code here
		assertEquals(4, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.gridQuads = new ArrayList<Cases>();
		Object o = new Object();

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.gridQuads = new ArrayList<Cases>();
		Terrain o = new Terrain();
		o.gridQuads = new ArrayList<Cases>();

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the int getHeight() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testGetHeight_1()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.gridQuads = new ArrayList<Cases>();

		int result = fixture.getHeight();

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the Cases getNeighbor(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testGetNeighbor_1()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.gridQuads = new ArrayList<Cases>();
		int x = 1;
		int y = 1;
		int direction = 4;

		Cases result = fixture.getNeighbor(x, y, direction);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.AssertionError
		//       at création_pièces_terrain.AbstractQuadGrid.getNeighbor(AbstractQuadGrid.java:195)
		assertNotNull(result);
	}

	/**
	 * Run the Cases getNeighbor(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testGetNeighbor_2()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.gridQuads = new ArrayList<Cases>();
		int x = 1;
		int y = 1;
		int direction = 1;

		Cases result = fixture.getNeighbor(x, y, direction);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Cases getNeighbor(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testGetNeighbor_3()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.gridQuads = new ArrayList<Cases>();
		int x = 1;
		int y = 1;
		int direction = 3;

		Cases result = fixture.getNeighbor(x, y, direction);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 2, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.AbstractQuadGrid.getQuad(AbstractQuadGrid.java:67)
		//       at création_pièces_terrain.AbstractQuadGrid.getNeighbor(AbstractQuadGrid.java:197)
		assertNotNull(result);
	}

	/**
	 * Run the Cases getNeighbor(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testGetNeighbor_4()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.gridQuads = new ArrayList<Cases>();
		int x = 1;
		int y = 1;
		int direction = 2;

		Cases result = fixture.getNeighbor(x, y, direction);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Cases getNeighbor(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testGetNeighbor_5()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.gridQuads = new ArrayList<Cases>();
		int x = 1;
		int y = 1;
		int direction = 0;

		Cases result = fixture.getNeighbor(x, y, direction);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 1, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.AbstractQuadGrid.getQuad(AbstractQuadGrid.java:67)
		//       at création_pièces_terrain.AbstractQuadGrid.getNeighbor(AbstractQuadGrid.java:197)
		assertNotNull(result);
	}

	/**
	 * Run the Cases getNeighbor(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test(expected = java.lang.AssertionError.class)
	public void testGetNeighbor_6()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.gridQuads = new ArrayList<Cases>();
		int x = 1;
		int y = 1;
		int direction = 4;

		Cases result = fixture.getNeighbor(x, y, direction);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int getPositions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testGetPositions_1()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.gridQuads = new ArrayList<Cases>();

		int result = fixture.getPositions();

		// add additional test code here
		assertEquals(4, result);
	}

	/**
	 * Run the Cases getQuad(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testGetQuad_1()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.gridQuads = new ArrayList<Cases>();
		int index = 1;

		Cases result = fixture.getQuad(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 1, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.AbstractQuadGrid.getQuad(AbstractQuadGrid.java:49)
		assertNotNull(result);
	}

	/**
	 * Run the Cases getQuad(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testGetQuad_2()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.gridQuads = new ArrayList<Cases>();
		int x = 1;
		int y = 1;

		Cases result = fixture.getQuad(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 3, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.AbstractQuadGrid.getQuad(AbstractQuadGrid.java:67)
		assertNotNull(result);
	}

	/**
	 * Run the Cases getQuad(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testGetQuad_3()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.gridQuads = new ArrayList<Cases>();
		int x = -1;
		int y = 1;

		Cases result = fixture.getQuad(x, y);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Cases getQuad(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testGetQuad_4()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.gridQuads = new ArrayList<Cases>();
		int x = 1;
		int y = 1;

		Cases result = fixture.getQuad(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 3, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.AbstractQuadGrid.getQuad(AbstractQuadGrid.java:67)
		assertNotNull(result);
	}

	/**
	 * Run the Cases getQuad(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testGetQuad_5()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.gridQuads = new ArrayList<Cases>();
		int x = 1;
		int y = -1;

		Cases result = fixture.getQuad(x, y);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Cases getQuad(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testGetQuad_6()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.gridQuads = new ArrayList<Cases>();
		int x = 1;
		int y = 1;

		Cases result = fixture.getQuad(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 3, Size: 0
		//       at java.util.ArrayList.rangeCheck(Unknown Source)
		//       at java.util.ArrayList.get(Unknown Source)
		//       at création_pièces_terrain.AbstractQuadGrid.getQuad(AbstractQuadGrid.java:67)
		assertNotNull(result);
	}

	/**
	 * Run the List<Cases> getQuads() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testGetQuads_1()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.gridQuads = new ArrayList<Cases>();

		List<Cases> result = fixture.getQuads();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the int getWidth() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testGetWidth_1()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.gridQuads = new ArrayList<Cases>();

		int result = fixture.getWidth();

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.gridQuads = new ArrayList<Cases>();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(36, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testHashCode_2()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.gridQuads = new ArrayList<Cases>();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(36, result);
	}

	/**
	 * Run the Iterator<Cases> iterator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testIterator_1()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.gridQuads = new ArrayList<Cases>();

		Iterator<Cases> result = fixture.iterator();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.hasNext());
	}

	/**
	 * Run the void setSize(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testSetSize_1()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.gridQuads = new ArrayList<Cases>();
		int width = 1;
		int height = 1;

		fixture.setSize(width, height);

		// add additional test code here
	}

	/**
	 * Run the void setSize(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testSetSize_2()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.gridQuads = new ArrayList<Cases>();
		int width = 1;
		int height = 1;

		fixture.setSize(width, height);

		// add additional test code here
	}

	/**
	 * Run the String toQuadString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testToQuadString_1()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.gridQuads = new ArrayList<Cases>();

		String result = fixture.toQuadString();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String toQuadString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testToQuadString_2()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.gridQuads = new ArrayList<Cases>();

		String result = fixture.toQuadString();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String toQuadString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testToQuadString_3()
		throws Exception {
		Terrain fixture = new Terrain();
		fixture.gridQuads = new ArrayList<Cases>();

		String result = fixture.toQuadString();

		// add additional test code here
		assertEquals("", result);
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
		new org.junit.runner.JUnitCore().run(AbstractQuadGridTest.class);
	}
}