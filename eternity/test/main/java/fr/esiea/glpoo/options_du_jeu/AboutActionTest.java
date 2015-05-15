package options_du_jeu;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.awt.event.ActionEvent;

import javax.swing.JFrame;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>AboutActionTest</code> contains tests for the class <code>{@link AboutAction}</code>.
 *
 * @generatedBy CodePro at 15/05/15 23:05
 * @author ange__000
 * @version $Revision: 1.0 $
 */
public class AboutActionTest {
	/**
	 * Run the AboutAction(JFrame) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:05
	 */
	@Test
	public void testAboutAction_1()
		throws Exception {
		JFrame parent = new JFrame();

		AboutAction result = new AboutAction(parent);

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
		AboutAction fixture = new AboutAction(new JFrame());
		ActionEvent e = new ActionEvent(new Object(), 1, "");

		fixture.actionPerformed(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.awt.IllegalComponentStateException: component must be showing on the screen to determine its location
		//       at java.awt.Component.getLocationOnScreen_NoTreeLock(Unknown Source)
		//       at java.awt.Component.getLocationOnScreen(Unknown Source)
		//       at fenêtre_de_jeu.A_Propos.setVisible(A_Propos.java:70)
		//       at options_du_jeu.AboutAction.actionPerformed(AboutAction.java:42)
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
		new org.junit.runner.JUnitCore().run(AboutActionTest.class);
	}
}