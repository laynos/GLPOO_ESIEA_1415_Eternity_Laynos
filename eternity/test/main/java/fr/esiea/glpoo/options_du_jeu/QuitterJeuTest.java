package options_du_jeu;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.awt.event.ActionEvent;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>QuitterJeuTest</code> contains tests for the class <code>{@link QuitterJeu}</code>.
 *
 * @generatedBy CodePro at 15/05/15 23:03
 * @author ange__000
 * @version $Revision: 1.0 $
 */
public class QuitterJeuTest {
	/**
	 * Run the QuitterJeu() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:03
	 */
	@Test
	public void testQuitterJeu_1()
		throws Exception {

		QuitterJeu result = new QuitterJeu();

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isEnabled());
	}

	/**
	 * Run the QuitterJeu(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:03
	 */
	@Test
	public void testQuitterJeu_2()
		throws Exception {
		String label = "";

		QuitterJeu result = new QuitterJeu(label);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isEnabled());
	}

	/**
	 * Run the void actionPerformed(ActionEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:03
	 */
	@Test
	public void testActionPerformed_1()
		throws Exception {
		QuitterJeu fixture = new QuitterJeu();
		ActionEvent e = new ActionEvent(new Object(), 1, "");

		fixture.actionPerformed(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Exit while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkExit(CodeProJUnitSecurityManager.java:57)
		//       at java.lang.Runtime.exit(Unknown Source)
		//       at java.lang.System.exit(Unknown Source)
		//       at options_du_jeu.QuitterJeu.actionPerformed(QuitterJeu.java:39)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 15/05/15 23:03
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
	 * @generatedBy CodePro at 15/05/15 23:03
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
	 * @generatedBy CodePro at 15/05/15 23:03
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(QuitterJeuTest.class);
	}
}