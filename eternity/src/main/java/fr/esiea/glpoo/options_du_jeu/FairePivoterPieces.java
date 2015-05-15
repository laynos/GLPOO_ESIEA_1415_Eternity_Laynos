package options_du_jeu;

import java.awt.event.ActionEvent;

import création_pièces_terrain.Terrain;
import fenêtre_de_jeu.EditableStatusProvider;

/**
 * @author ange__000
 * @version $Revision: 1.0 $
 */
public class FairePivoterPieces extends MAJGrille {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8488696323447281352L;
	private Terrain gridModel;
	private boolean horizontal;

	/**
	 * Constructor for FairePivoterPieces.
	 * 
	 * @param grid
	 *            Terrain
	 * @param clockwise
	 *            boolean
	 * @param editable
	 *            EditableStatusProvider
	 */
	public FairePivoterPieces(Terrain grid, boolean clockwise,
			EditableStatusProvider editable) {
		super(new StringBuilder().append("faire pivoter grille ")
				.append(clockwise ? "horizontalement" : "verticalement")
				.toString(), editable);
		this.gridModel = grid;
		this.horizontal = clockwise;
	}

	/**
	 * Method actionPerformed.
	 * 
	 * @param e
	 *            ActionEvent
	
	 * @see java.awt.event.ActionListener#actionPerformed(ActionEvent) */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (this.horizontal)
			this.gridModel.flipHorizontal();
		else
			this.gridModel.flipVertical();
	}
}