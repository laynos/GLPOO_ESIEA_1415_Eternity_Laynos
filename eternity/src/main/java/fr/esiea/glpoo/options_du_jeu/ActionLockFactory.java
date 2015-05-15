package options_du_jeu;

/**
 * @author ange__000
 * @version $Revision: 1.0 $
 */
public class ActionLockFactory {
	private static Object actionLock = new Object();

	/**
	 * Method getActionLock.
	
	 * @return Object */
	public static Object getActionLock() {
		return actionLock;
	}
}
