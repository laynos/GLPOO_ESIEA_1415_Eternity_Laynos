package création_pièces_terrain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.geom.Dimension2D;
import java.awt.image.BufferedImage;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>PiecesTest</code> contains tests for the class <code>{@link Pieces}</code>.
 *
 * @generatedBy CodePro at 15/05/15 23:04
 * @author ange__000
 * @version $Revision: 1.0 $
 */
public class PiecesTest {
	/**
	 * Run the List<Pieces> getAllPatterns() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:04
	 */
	@Test
	public void testGetAllPatterns_1()
		throws Exception {

		List<Pieces> result = Pieces.getAllPatterns();

		// add additional test code here
		assertNotNull(result);
		assertEquals(40, result.size());
	}

	/**
	 * Run the int getCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:04
	 */
	@Test
	public void testGetCode_1()
		throws Exception {
		Pieces fixture = Pieces.PAT_00;

		int result = fixture.getCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the String getCodeString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:04
	 */
	@Test
	public void testGetCodeString_1()
		throws Exception {
		Pieces fixture = Pieces.PAT_00;

		String result = fixture.getCodeString();

		// add additional test code here
		assertEquals(" 0", result);
	}

	/**
	 * Run the String getCodeString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:04
	 */
	@Test
	public void testGetCodeString_2()
		throws Exception {
		Pieces fixture = Pieces.PAT_00;

		String result = fixture.getCodeString();

		// add additional test code here
		assertEquals(" 0", result);
	}

	/**
	 * Run the Pieces getDefaultPattern() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:04
	 */
	@Test
	public void testGetDefaultPattern_1()
		throws Exception {

		Pieces result = Pieces.getDefaultPattern();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Pat00", result.toString());
		assertEquals(0, result.getCode());
		assertEquals(" 0", result.getCodeString());
		assertEquals("PAT_00", result.name());
		assertEquals(0, result.ordinal());
	}

	/**
	 * Run the List<Pieces> getNonDefaultPatterns() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:04
	 */
	@Test
	public void testGetNonDefaultPatterns_1()
		throws Exception {

		List<Pieces> result = Pieces.getNonDefaultPatterns();

		// add additional test code here
		assertNotNull(result);
		assertEquals(39, result.size());
	}

	/**
	 * Run the CouleurPieces getPatternBg() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:04
	 */
	@Test
	public void testGetPatternBg_1()
		throws Exception {
		Pieces fixture = Pieces.PAT_00;

		CouleurPieces result = fixture.getPatternBg();

		// add additional test code here
		assertNotNull(result);
		assertEquals("COL_DARKRED", result.name());
		assertEquals("COL_DARKRED", result.toString());
		assertEquals(14, result.ordinal());
	}

	/**
	 * Run the Pieces getPatternByCode(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:04
	 */
	@Test
	public void testGetPatternByCode_1()
		throws Exception {
		int patternCode = 1;

		Pieces result = Pieces.getPatternByCode(patternCode);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Pat01", result.toString());
		assertEquals(1, result.getCode());
		assertEquals(" 1", result.getCodeString());
		assertEquals("PAT_01", result.name());
		assertEquals(1, result.ordinal());
	}

	/**
	 * Run the Pieces getPatternByCode(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:04
	 */
	@Test
	public void testGetPatternByCode_2()
		throws Exception {
		int patternCode = 1;

		Pieces result = Pieces.getPatternByCode(patternCode);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Pat01", result.toString());
		assertEquals(1, result.getCode());
		assertEquals(" 1", result.getCodeString());
		assertEquals("PAT_01", result.name());
		assertEquals(1, result.ordinal());
	}

	/**
	 * Run the Pieces getPatternByCode(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:04
	 */
	@Test
	public void testGetPatternByCode_3()
		throws Exception {
		int patternCode = 1;

		Pieces result = Pieces.getPatternByCode(patternCode);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Pat01", result.toString());
		assertEquals(1, result.getCode());
		assertEquals(" 1", result.getCodeString());
		assertEquals("PAT_01", result.name());
		assertEquals(1, result.ordinal());
	}

	/**
	 * Run the CouleurPieces getPatternFg() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:04
	 */
	@Test
	public void testGetPatternFg_1()
		throws Exception {
		Pieces fixture = Pieces.PAT_00;

		CouleurPieces result = fixture.getPatternFg();

		// add additional test code here
		assertNotNull(result);
		assertEquals("COL_DARKBLUE", result.name());
		assertEquals("COL_DARKBLUE", result.toString());
		assertEquals(4, result.ordinal());
	}

	/**
	 * Run the MotifPieces getPatternShape() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:04
	 */
	@Test
	public void testGetPatternShape_1()
		throws Exception {
		Pieces fixture = Pieces.PAT_00;

		MotifPieces result = fixture.getPatternShape();

		// add additional test code here
		assertNotNull(result);
		assertEquals("SHAPE_NONE", result.name());
		assertEquals("SHAPE_NONE", result.toString());
		assertEquals(0, result.ordinal());
	}

	/**
	 * Run the void paint(Graphics2D,Dimension2D) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:04
	 */
	@Test
	public void testPaint_1()
		throws Exception {
		Pieces fixture = Pieces.PAT_00;
		BufferedImage image = new BufferedImage(8, 8, BufferedImage.TYPE_INT_RGB);
		Graphics2D g2d = image.createGraphics();
		Dimension2D size = new Dimension();

		fixture.paint(g2d, size);

		// add additional test code here
	}

	/**
	 * Run the void paint(Graphics2D,Dimension2D) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:04
	 */
	@Test
	public void testPaint_2()
		throws Exception {
		Pieces fixture = Pieces.PAT_00;
		BufferedImage image = new BufferedImage(8, 8, BufferedImage.TYPE_INT_RGB);
		Graphics2D g2d = image.createGraphics();
		Dimension2D size = new Dimension();

		fixture.paint(g2d, size);

		// add additional test code here
	}

	/**
	 * Run the void paint(Graphics2D,Dimension2D) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:04
	 */
	@Test
	public void testPaint_3()
		throws Exception {
		Pieces fixture = Pieces.PAT_00;
		BufferedImage image = new BufferedImage(8, 8, BufferedImage.TYPE_INT_RGB);
		Graphics2D g2d = image.createGraphics();
		Dimension2D size = new Dimension();

		fixture.paint(g2d, size);

		// add additional test code here
	}

	/**
	 * Run the void paint(Graphics2D,Dimension2D) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:04
	 */
	@Test
	public void testPaint_4()
		throws Exception {
		Pieces fixture = Pieces.PAT_00;
		BufferedImage image = new BufferedImage(8, 8, BufferedImage.TYPE_INT_RGB);
		Graphics2D g2d = image.createGraphics();
		Dimension2D size = new Dimension();

		fixture.paint(g2d, size);

		// add additional test code here
	}

	/**
	 * Run the void paint(Graphics2D,Dimension2D) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:04
	 */
	@Test
	public void testPaint_5()
		throws Exception {
		Pieces fixture = Pieces.PAT_00;
		BufferedImage image = new BufferedImage(8, 8, BufferedImage.TYPE_INT_RGB);
		Graphics2D g2d = image.createGraphics();
		Dimension2D size = new Dimension();

		fixture.paint(g2d, size);

		// add additional test code here
	}

	/**
	 * Run the void paint(Graphics2D,Dimension2D) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:04
	 */
	@Test
	public void testPaint_6()
		throws Exception {
		Pieces fixture = Pieces.PAT_00;
		BufferedImage image = new BufferedImage(8, 8, BufferedImage.TYPE_INT_RGB);
		Graphics2D g2d = image.createGraphics();
		Dimension2D size = new Dimension();

		fixture.paint(g2d, size);

		// add additional test code here
	}

	/**
	 * Run the void paint(Graphics2D,Dimension2D) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:04
	 */
	@Test
	public void testPaint_7()
		throws Exception {
		Pieces fixture = Pieces.PAT_00;
		BufferedImage image = new BufferedImage(8, 8, BufferedImage.TYPE_INT_RGB);
		Graphics2D g2d = image.createGraphics();
		Dimension2D size = new Dimension();

		fixture.paint(g2d, size);

		// add additional test code here
	}

	/**
	 * Run the void paint(Graphics2D,Dimension2D) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:04
	 */
	@Test
	public void testPaint_8()
		throws Exception {
		Pieces fixture = Pieces.PAT_00;
		BufferedImage image = new BufferedImage(8, 8, BufferedImage.TYPE_INT_RGB);
		Graphics2D g2d = image.createGraphics();
		Dimension2D size = new Dimension();

		fixture.paint(g2d, size);

		// add additional test code here
	}

	/**
	 * Run the void paint(Graphics2D,Dimension2D) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:04
	 */
	@Test
	public void testPaint_9()
		throws Exception {
		Pieces fixture = Pieces.PAT_00;
		BufferedImage image = new BufferedImage(8, 8, BufferedImage.TYPE_INT_RGB);
		Graphics2D g2d = image.createGraphics();
		Dimension2D size = new Dimension();

		fixture.paint(g2d, size);

		// add additional test code here
	}

	/**
	 * Run the void paint(Graphics2D,Dimension2D) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:04
	 */
	@Test
	public void testPaint_10()
		throws Exception {
		Pieces fixture = Pieces.PAT_00;
		BufferedImage image = new BufferedImage(8, 8, BufferedImage.TYPE_INT_RGB);
		Graphics2D g2d = image.createGraphics();
		Dimension2D size = new Dimension();

		fixture.paint(g2d, size);

		// add additional test code here
	}

	/**
	 * Run the void paint(Graphics2D,Dimension2D) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:04
	 */
	@Test
	public void testPaint_11()
		throws Exception {
		Pieces fixture = Pieces.PAT_00;
		BufferedImage image = new BufferedImage(8, 8, BufferedImage.TYPE_INT_RGB);
		Graphics2D g2d = image.createGraphics();
		Dimension2D size = new Dimension();

		fixture.paint(g2d, size);

		// add additional test code here
	}

	/**
	 * Run the void paint(Graphics2D,Dimension2D) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:04
	 */
	@Test
	public void testPaint_12()
		throws Exception {
		Pieces fixture = Pieces.PAT_00;
		BufferedImage image = new BufferedImage(8, 8, BufferedImage.TYPE_INT_RGB);
		Graphics2D g2d = image.createGraphics();
		Dimension2D size = new Dimension();

		fixture.paint(g2d, size);

		// add additional test code here
	}

	/**
	 * Run the void paint(Graphics2D,Dimension2D) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:04
	 */
	@Test
	public void testPaint_13()
		throws Exception {
		Pieces fixture = Pieces.PAT_00;
		BufferedImage image = new BufferedImage(8, 8, BufferedImage.TYPE_INT_RGB);
		Graphics2D g2d = image.createGraphics();
		Dimension2D size = new Dimension();

		fixture.paint(g2d, size);

		// add additional test code here
	}

	/**
	 * Run the void paint(Graphics2D,Dimension2D) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:04
	 */
	@Test
	public void testPaint_14()
		throws Exception {
		Pieces fixture = Pieces.PAT_00;
		BufferedImage image = new BufferedImage(8, 8, BufferedImage.TYPE_INT_RGB);
		Graphics2D g2d = image.createGraphics();
		Dimension2D size = new Dimension();

		fixture.paint(g2d, size);

		// add additional test code here
	}

	/**
	 * Run the void paint(Graphics2D,Dimension2D) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:04
	 */
	@Test
	public void testPaint_15()
		throws Exception {
		Pieces fixture = Pieces.PAT_00;
		BufferedImage image = new BufferedImage(8, 8, BufferedImage.TYPE_INT_RGB);
		Graphics2D g2d = image.createGraphics();
		Dimension2D size = new Dimension();

		fixture.paint(g2d, size);

		// add additional test code here
	}

	/**
	 * Run the void paint(Graphics2D,Dimension2D) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:04
	 */
	@Test
	public void testPaint_16()
		throws Exception {
		Pieces fixture = Pieces.PAT_00;
		BufferedImage image = new BufferedImage(8, 8, BufferedImage.TYPE_INT_RGB);
		Graphics2D g2d = image.createGraphics();
		Dimension2D size = new Dimension();

		fixture.paint(g2d, size);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:04
	 */
	@Test
	public void testToString_1()
		throws Exception {
		Pieces fixture = Pieces.PAT_00;

		String result = fixture.toString();

		// add additional test code here
		assertEquals("Pat00", result);
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
		new org.junit.runner.JUnitCore().run(PiecesTest.class);
	}
}