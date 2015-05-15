package création_pièces_terrain;

/**
 * @author ange__000
 * @version $Revision: 1.0 $
 */
public class GestionExceptionCases extends Exception {
	private static final long serialVersionUID = 1L;

	public GestionExceptionCases() {
		super("Erreur");
	}

	/**
	 * Constructor for GestionExceptionCases.
	 * 
	 * @param message
	 *            String
	 */
	public GestionExceptionCases(String message) {
		super(message);
	}
}
