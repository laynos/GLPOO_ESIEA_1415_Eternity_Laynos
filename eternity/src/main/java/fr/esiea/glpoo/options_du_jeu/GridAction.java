package options_du_jeu;

import javax.swing.AbstractAction;

/**
 * @author ange__000
 * @version $Revision: 1.0 $
 */
public abstract class GridAction extends AbstractAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5215330584446323581L;

	/**
	 * Constructor for GridAction.
	 * 
	 * @param name
	 *            String
	 */
	public GridAction(String name) {
		super(name);
	}
}