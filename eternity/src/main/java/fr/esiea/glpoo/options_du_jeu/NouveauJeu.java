package options_du_jeu;

import java.awt.event.ActionEvent;

import création_pièces_terrain.Terrain;
import fenêtre_de_jeu.EditableStatusProvider;

/**
 * @author ange__000
 * @version $Revision: 1.0 $
 */
public class NouveauJeu extends MAJGrille {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4037054985961883367L;
	private Terrain gridModel;
	private int defaultSize;

	/**
	 * Constructor for NouveauJeu.
	 * 
	 * @param grid
	 *            Terrain
	 * @param editable
	 *            EditableStatusProvider
	 * @param defaultSize
	 *            int
	 */
	public NouveauJeu(Terrain grid, EditableStatusProvider editable,
			int defaultSize) {
		super("Nouveau", editable);
		this.gridModel = grid;
		this.defaultSize = defaultSize;
	}

	/**
	 * Method actionPerformed.
	 * 
	 * @param e
	 *            ActionEvent
	
	 * @see java.awt.event.ActionListener#actionPerformed(ActionEvent) */
	@Override
	public void actionPerformed(ActionEvent e) {
		this.gridModel.setSize(this.defaultSize);
		this.gridModel.reset();
	}
}
