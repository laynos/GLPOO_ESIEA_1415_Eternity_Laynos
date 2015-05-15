package création_pièces_terrain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>ComparerCasesTest</code> contains tests for the class <code>{@link ComparerCases}</code>.
 *
 * @generatedBy CodePro at 15/05/15 23:06
 * @author ange__000
 * @version $Revision: 1.0 $
 */
public class ComparerCasesTest {
	/**
	 * Run the ComparerCases(Cases) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testComparerCases_1()
		throws Exception {
		Cases reference = new Cases();

		ComparerCases result = new ComparerCases(reference);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ComparerCases(Cases,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testComparerCases_2()
		throws Exception {
		Cases reference = new Cases();
		boolean inverted = true;

		ComparerCases result = new ComparerCases(reference, inverted);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int compare(Cases,Cases) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testCompare_1()
		throws Exception {
		ComparerCases fixture = new ComparerCases(new Cases(), true);
		Cases q1 = new Cases();
		Cases q2 = new Cases();

		int result = fixture.compare(q1, q2);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int compare(Cases,Cases) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testCompare_2()
		throws Exception {
		ComparerCases fixture = new ComparerCases(new Cases(), false);
		Cases q1 = new Cases();
		Cases q2 = new Cases();

		int result = fixture.compare(q1, q2);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int compare(Cases,Cases) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testCompare_3()
		throws Exception {
		ComparerCases fixture = new ComparerCases(new Cases(), false);
		Cases q1 = new Cases();
		Cases q2 = new Cases();

		int result = fixture.compare(q1, q2);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int compare(Cases,Cases) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testCompare_4()
		throws Exception {
		ComparerCases fixture = new ComparerCases(new Cases(), false);
		Cases q1 = new Cases();
		Cases q2 = new Cases();

		int result = fixture.compare(q1, q2);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int compare(Cases,Cases) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testCompare_5()
		throws Exception {
		ComparerCases fixture = new ComparerCases(new Cases(), false);
		Cases q1 = new Cases();
		Cases q2 = new Cases();

		int result = fixture.compare(q1, q2);

		// add additional test code here
		assertEquals(0, result);
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
		new org.junit.runner.JUnitCore().run(ComparerCasesTest.class);
	}
}