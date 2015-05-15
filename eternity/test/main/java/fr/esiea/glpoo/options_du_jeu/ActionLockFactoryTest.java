package options_du_jeu;

import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>ActionLockFactoryTest</code> contains tests for the class <code>{@link ActionLockFactory}</code>.
 *
 * @generatedBy CodePro at 15/05/15 23:06
 * @author ange__000
 * @version $Revision: 1.0 $
 */
public class ActionLockFactoryTest {
	/**
	 * Run the ActionLockFactory() constructor test.
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testActionLockFactory_1()
		throws Exception {
		ActionLockFactory result = new ActionLockFactory();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the Object getActionLock() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15/05/15 23:06
	 */
	@Test
	public void testGetActionLock_1()
		throws Exception {

		Object result = ActionLockFactory.getActionLock();

		// add additional test code here
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(ActionLockFactoryTest.class);
	}
}