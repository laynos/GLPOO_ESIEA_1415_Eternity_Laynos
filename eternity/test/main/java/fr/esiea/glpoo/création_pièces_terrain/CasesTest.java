package création_pièces_terrain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fenêtre_de_jeu.AffichageCases;

/**
 * The class <code>CasesTest</code> contains tests for the class <code>{@link Cases}</code>.
 *
 * @generatedBy CodePro at 15/05/15 23:05
 * @author ange__000
 * @version $Revision: 1.0 $
 */
public class CasesTest {
	/**
	 * Run the Cases() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testCases_1()
		throws Exception {

		Cases result = new Cases();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Q[Pat00,Pat00,Pat00,Pat00]", result.toString());
		assertEquals("0 0 0 0", result.save());
		assertEquals(false, result.isNull());
		assertEquals(false, result.isLocked());
		assertEquals(true, result.isClear());
		assertEquals(4, result.countDefaultPattern());
	}

	/**
	 * Run the Cases(Pieces[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testCases_2()
		throws Exception {
		Pieces[] initialPatterns = new Pieces[] {null, Pieces.PAT_00, Pieces.PAT_00, Pieces.PAT_00};

		Cases result = new Cases(initialPatterns);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Q[null,Pat00,Pat00,Pat00]", result.toString());
		assertEquals(false, result.isNull());
		assertEquals(false, result.isLocked());
		assertEquals(false, result.isClear());
		assertEquals(3, result.countDefaultPattern());
	}

	/**
	 * Run the void addQuadObserver(QuadObserver) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testAddQuadObserver_1()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));
		QuadObserver observer = new AffichageCases(new Cases());

		fixture.addQuadObserver(observer);

		// add additional test code here
	}

	/**
	 * Run the void clear() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testClear_1()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));

		fixture.clear();

		// add additional test code here
	}

	/**
	 * Run the void clear() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testClear_2()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(false);
		fixture.addQuadObserver(new AffichageCases(new Cases()));

		fixture.clear();

		// add additional test code here
	}

	/**
	 * Run the Cases clone() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testClone_1()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));

		Cases result = fixture.clone();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Q[Pat00,Pat00,Pat00,Pat00]", result.toString());
		assertEquals("0 0 0 0", result.save());
		assertEquals(false, result.isNull());
		assertEquals(false, result.isLocked());
		assertEquals(true, result.isClear());
		assertEquals(4, result.countDefaultPattern());
	}

	/**
	 * Run the void copyTo(Cases) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testCopyTo_1()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));
		Cases q = new Cases();

		fixture.copyTo(q);

		// add additional test code here
	}

	/**
	 * Run the void copyTo(Cases,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testCopyTo_2()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));
		Cases q = new Cases();
		q.setReadOnly(true);
		boolean notifyObservers = true;

		fixture.copyTo(q, notifyObservers);

		// add additional test code here
	}

	/**
	 * Run the void copyTo(Cases,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testCopyTo_3()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(false);
		fixture.addQuadObserver(new AffichageCases(new Cases()));
		Cases q = new Cases();
		q.setReadOnly(false);
		boolean notifyObservers = true;

		fixture.copyTo(q, notifyObservers);

		// add additional test code here
	}

	/**
	 * Run the void copyTo(Cases,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testCopyTo_4()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(false);
		fixture.addQuadObserver(new AffichageCases(new Cases()));
		Cases q = new Cases();
		q.setReadOnly(false);
		boolean notifyObservers = false;

		fixture.copyTo(q, notifyObservers);

		// add additional test code here
	}

	/**
	 * Run the int countDefaultPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testCountDefaultPattern_1()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));

		int result = fixture.countDefaultPattern();

		// add additional test code here
		assertEquals(4, result);
	}

	/**
	 * Run the int countPattern(Pieces) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testCountPattern_1()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));
		Pieces pattern = Pieces.PAT_00;

		int result = fixture.countPattern(pattern);

		// add additional test code here
		assertEquals(4, result);
	}

	/**
	 * Run the int countPattern(Pieces) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testCountPattern_2()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));
		Pieces pattern = Pieces.PAT_00;

		int result = fixture.countPattern(pattern);

		// add additional test code here
		assertEquals(4, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));
		Object o = new Cases();

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));
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
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));
		Object o = new Cases();

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equalsIgnoreRotation(Cases) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testEqualsIgnoreRotation_1()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));
		Cases quad = new Cases();

		boolean result = fixture.equalsIgnoreRotation(quad);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equalsIgnoreRotation(Cases) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testEqualsIgnoreRotation_2()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));
		Cases quad = new Cases();

		boolean result = fixture.equalsIgnoreRotation(quad);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equalsIgnoreRotation(Cases,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testEqualsIgnoreRotation_3()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));
		Cases quad = new Cases();
		int degrees = 1;

		boolean result = fixture.equalsIgnoreRotation(quad, degrees);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equalsIgnoreRotation(Cases,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testEqualsIgnoreRotation_4()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));
		Cases quad = new Cases();
		int degrees = 1;

		boolean result = fixture.equalsIgnoreRotation(quad, degrees);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the void flipHorizontal() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testFlipHorizontal_1()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));

		fixture.flipHorizontal();

		// add additional test code here
	}

	/**
	 * Run the void flipHorizontal() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testFlipHorizontal_2()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(false);
		fixture.addQuadObserver(new AffichageCases(new Cases()));

		fixture.flipHorizontal();

		// add additional test code here
	}

	/**
	 * Run the void flipVertical() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testFlipVertical_1()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));

		fixture.flipVertical();

		// add additional test code here
	}

	/**
	 * Run the void flipVertical() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testFlipVertical_2()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(false);
		fixture.addQuadObserver(new AffichageCases(new Cases()));

		fixture.flipVertical();

		// add additional test code here
	}

	/**
	 * Run the Pieces getPattern(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testGetPattern_1()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));
		int direction = 1;

		Pieces result = fixture.getPattern(direction);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Pat00", result.toString());
		assertEquals(0, result.getCode());
		assertEquals(" 0", result.getCodeString());
		assertEquals("PAT_00", result.name());
		assertEquals(0, result.ordinal());
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(-581307007, result);
	}

	/**
	 * Run the boolean isClear() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testIsClear_1()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));

		boolean result = fixture.isClear();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isClear() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testIsClear_2()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));

		boolean result = fixture.isClear();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isClear() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testIsClear_3()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));

		boolean result = fixture.isClear();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isClear() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testIsClear_4()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));

		boolean result = fixture.isClear();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isClear() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testIsClear_5()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));

		boolean result = fixture.isClear();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isLocked() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testIsLocked_1()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));

		boolean result = fixture.isLocked();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isLocked() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testIsLocked_2()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));

		boolean result = fixture.isLocked();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testIsNull_1()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));

		boolean result = fixture.isNull();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testIsNull_2()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));

		boolean result = fixture.isNull();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testIsNull_3()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));

		boolean result = fixture.isNull();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testIsNull_4()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));

		boolean result = fixture.isNull();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isNull() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testIsNull_5()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));

		boolean result = fixture.isNull();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void load(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testLoad_1()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));
		String text = "";

		fixture.load(text);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at création_pièces_terrain.Cases.load(Cases.java:542)
	}

	/**
	 * Run the void load(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testLoad_2()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));
		String text = "";

		fixture.load(text);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: For input string: ""
		//       at java.lang.NumberFormatException.forInputString(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at java.lang.Integer.parseInt(Unknown Source)
		//       at création_pièces_terrain.Cases.load(Cases.java:542)
	}

	/**
	 * Run the void load(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test(expected = java.lang.NumberFormatException.class)
	public void testLoad_3()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));
		String text = "";

		fixture.load(text);

		// add additional test code here
	}

	/**
	 * Run the int matchDegrees(Cases) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testMatchDegrees_1()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));
		Cases quad = new Cases();

		int result = fixture.matchDegrees(quad);

		// add additional test code here
		assertEquals(4, result);
	}

	/**
	 * Run the int matchDegrees(Cases) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testMatchDegrees_2()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));
		Cases quad = new Cases();

		int result = fixture.matchDegrees(quad);

		// add additional test code here
		assertEquals(4, result);
	}

	/**
	 * Run the int matchDegrees(Cases) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testMatchDegrees_3()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));
		Cases quad = new Cases();

		int result = fixture.matchDegrees(quad);

		// add additional test code here
		assertEquals(4, result);
	}

	/**
	 * Run the int matchDegrees(Cases) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testMatchDegrees_4()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));
		Cases quad = new Cases();

		int result = fixture.matchDegrees(quad);

		// add additional test code here
		assertEquals(4, result);
	}

	/**
	 * Run the int matchDegrees(Cases) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testMatchDegrees_5()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));
		Cases quad = new Cases();

		int result = fixture.matchDegrees(quad);

		// add additional test code here
		assertEquals(4, result);
	}

	/**
	 * Run the int matchDegrees(Cases) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testMatchDegrees_6()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));
		Cases quad = new Cases();

		int result = fixture.matchDegrees(quad);

		// add additional test code here
		assertEquals(4, result);
	}

	/**
	 * Run the boolean matches(Cases) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testMatches_1()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));
		Cases quad = new Cases();

		boolean result = fixture.matches(quad);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean matches(Cases) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testMatches_2()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));
		Cases quad = new Cases();

		boolean result = fixture.matches(quad);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean matches(Cases) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testMatches_3()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));
		Cases quad = new Cases();

		boolean result = fixture.matches(quad);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean matches(Cases) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testMatches_4()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));
		Cases quad = new Cases();

		boolean result = fixture.matches(quad);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean matches(Cases) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testMatches_5()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));
		Cases quad = new Cases();

		boolean result = fixture.matches(quad);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean matches(Cases) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testMatches_6()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));
		Cases quad = new Cases();

		boolean result = fixture.matches(quad);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean matchesBackground(Cases) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testMatchesBackground_1()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));
		Cases quad = new Cases();

		boolean result = fixture.matchesBackground(quad);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean matchesBackground(Cases) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testMatchesBackground_2()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));
		Cases quad = new Cases();

		boolean result = fixture.matchesBackground(quad);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean matchesBackground(Cases) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testMatchesBackground_3()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));
		Cases quad = new Cases();

		boolean result = fixture.matchesBackground(quad);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean matchesBackground(Cases) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testMatchesBackground_4()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));
		Cases quad = new Cases();

		boolean result = fixture.matchesBackground(quad);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean matchesBackground(Cases) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testMatchesBackground_5()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));
		Cases quad = new Cases();

		boolean result = fixture.matchesBackground(quad);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean matchesBackground(Cases) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testMatchesBackground_6()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));
		Cases quad = new Cases();

		boolean result = fixture.matchesBackground(quad);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the void removeQuadObserver(QuadObserver) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testRemoveQuadObserver_1()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));
		QuadObserver observer = new AffichageCases(new Cases());

		fixture.removeQuadObserver(observer);

		// add additional test code here
	}

	/**
	 * Run the void rotateClockwise() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testRotateClockwise_1()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));

		fixture.rotateClockwise();

		// add additional test code here
	}

	/**
	 * Run the void rotateClockwise() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testRotateClockwise_2()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(false);
		fixture.addQuadObserver(new AffichageCases(new Cases()));

		fixture.rotateClockwise();

		// add additional test code here
	}

	/**
	 * Run the void rotateClockwise(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testRotateClockwise_3()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));
		int steps = 1;

		fixture.rotateClockwise(steps);

		// add additional test code here
	}

	/**
	 * Run the void rotateClockwise(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testRotateClockwise_4()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(false);
		fixture.addQuadObserver(new AffichageCases(new Cases()));
		int steps = 1;

		fixture.rotateClockwise(steps);

		// add additional test code here
	}

	/**
	 * Run the void rotateClockwise(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testRotateClockwise_5()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(false);
		fixture.addQuadObserver(new AffichageCases(new Cases()));
		int steps = 1;

		fixture.rotateClockwise(steps);

		// add additional test code here
	}

	/**
	 * Run the void rotateCounterclockwise() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testRotateCounterclockwise_1()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));

		fixture.rotateCounterclockwise();

		// add additional test code here
	}

	/**
	 * Run the void rotateCounterclockwise() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testRotateCounterclockwise_2()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(false);
		fixture.addQuadObserver(new AffichageCases(new Cases()));

		fixture.rotateCounterclockwise();

		// add additional test code here
	}

	/**
	 * Run the void rotateCounterclockwise(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testRotateCounterclockwise_3()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));
		int steps = 1;

		fixture.rotateCounterclockwise(steps);

		// add additional test code here
	}

	/**
	 * Run the void rotateCounterclockwise(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testRotateCounterclockwise_4()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(false);
		fixture.addQuadObserver(new AffichageCases(new Cases()));
		int steps = 1;

		fixture.rotateCounterclockwise(steps);

		// add additional test code here
	}

	/**
	 * Run the void rotateCounterclockwise(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testRotateCounterclockwise_5()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(false);
		fixture.addQuadObserver(new AffichageCases(new Cases()));
		int steps = 1;

		fixture.rotateCounterclockwise(steps);

		// add additional test code here
	}

	/**
	 * Run the void rotatePattern(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testRotatePattern_1()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));
		int direction = 1;

		fixture.rotatePattern(direction);

		// add additional test code here
	}

	/**
	 * Run the void rotatePattern(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testRotatePattern_2()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(false);
		fixture.addQuadObserver(new AffichageCases(new Cases()));
		int direction = 1;

		fixture.rotatePattern(direction);

		// add additional test code here
	}

	/**
	 * Run the void rotatePattern(int,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testRotatePattern_3()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));
		int direction = 1;
		boolean forward = true;

		fixture.rotatePattern(direction, forward);

		// add additional test code here
	}

	/**
	 * Run the void rotatePattern(int,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testRotatePattern_4()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(false);
		fixture.addQuadObserver(new AffichageCases(new Cases()));
		int direction = 1;
		boolean forward = false;

		fixture.rotatePattern(direction, forward);

		// add additional test code here
	}

	/**
	 * Run the void rotatePattern(int,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testRotatePattern_5()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(false);
		fixture.addQuadObserver(new AffichageCases(new Cases()));
		int direction = 1;
		boolean forward = true;

		fixture.rotatePattern(direction, forward);

		// add additional test code here
	}

	/**
	 * Run the String save() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testSave_1()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));

		String result = fixture.save();

		// add additional test code here
		assertEquals("0 0 0 0", result);
	}

	/**
	 * Run the void setLocked(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testSetLocked_1()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));
		boolean l = true;

		fixture.setLocked(l);

		// add additional test code here
	}

	/**
	 * Run the void setLocked(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testSetLocked_2()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));
		boolean l = true;

		fixture.setLocked(l);

		// add additional test code here
	}

	/**
	 * Run the void setPattern(int,Pieces) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testSetPattern_1()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));
		int direction = 1;
		Pieces pattern = Pieces.PAT_00;

		fixture.setPattern(direction, pattern);

		// add additional test code here
	}

	/**
	 * Run the void setPattern(int,Pieces) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testSetPattern_2()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(false);
		fixture.addQuadObserver(new AffichageCases(new Cases()));
		int direction = 1;
		Pieces pattern = Pieces.PAT_00;

		fixture.setPattern(direction, pattern);

		// add additional test code here
	}

	/**
	 * Run the void setReadOnly(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testSetReadOnly_1()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));
		boolean readOnly = true;

		fixture.setReadOnly(readOnly);

		// add additional test code here
	}

	/**
	 * Run the void swap(Cases) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testSwap_1()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));
		Cases other = new Cases();

		fixture.swap(other);

		// add additional test code here
	}

	/**
	 * Run the void swap(Cases) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testSwap_2()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(false);
		fixture.addQuadObserver(new AffichageCases(new Cases()));
		Cases other = new Cases();
		other.setReadOnly(false);

		fixture.swap(other);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testToString_1()
		throws Exception {
		Cases fixture = new Cases();
		fixture.setReadOnly(true);
		fixture.addQuadObserver(new AffichageCases(new Cases()));

		String result = fixture.toString();

		// add additional test code here
		assertEquals("Q[Pat00,Pat00,Pat00,Pat00]", result);
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
		new org.junit.runner.JUnitCore().run(CasesTest.class);
	}
}