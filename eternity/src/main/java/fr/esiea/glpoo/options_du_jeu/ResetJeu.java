package options_du_jeu;

import java.awt.event.ActionEvent;

import création_pièces_terrain.Terrain;
import fenêtre_de_jeu.EditableStatusProvider;

/**
 * @author ange__000
 * @version $Revision: 1.0 $
 */
public class ResetJeu extends MAJGrille {
	private static final long serialVersionUID = 1L;
	private Terrain gridModel;

	/**
	 * Constructor for ResetJeu.
	 * @param grid Terrain
	 * @param editable EditableStatusProvider
	 */
	public ResetJeu(Terrain grid, EditableStatusProvider editable) {
		super("Reset", editable);
		this.gridModel = grid;
	}

	/**
	 * Method actionPerformed.
	 * @param e ActionEvent
	
	 * @see java.awt.event.ActionListener#actionPerformed(ActionEvent) */
	@Override
	public void actionPerformed(ActionEvent e) {
		this.gridModel.reset();
	}
}