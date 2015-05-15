package options_du_jeu;

import fenêtre_de_jeu.EditableStatusListener;
import fenêtre_de_jeu.EditableStatusProvider;

/**
 * @author ange__000
 * @version $Revision: 1.0 $
 */
public abstract class MAJGrille extends GridAction implements
		EditableStatusListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = -176477663832102297L;

	/**
	 * Constructor for MAJGrille.
	 * 
	 * @param name
	 *            String
	 * @param editable
	 *            EditableStatusProvider
	 */
	public MAJGrille(String name, EditableStatusProvider editable) {
		super(name);
		editable.addEditableStatusListener(this);
	}

	/**
	 * Method editableStatusUpdated.
	 * 
	 * @param editable
	 *            boolean
	
	 * @see fenêtre_de_jeu.EditableStatusListener#editableStatusUpdated(boolean) */
	@Override
	public void editableStatusUpdated(boolean editable) {
		setEnabled(editable);
	}
}
