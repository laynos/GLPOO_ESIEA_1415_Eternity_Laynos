package options_du_jeu;

import java.awt.event.ActionEvent;

import création_pièces_terrain.Terrain;
import fenêtre_de_jeu.EditableStatusProvider;

/**
 * @author ange__000
 * @version $Revision: 1.0 $
 */
public class FaireTournerPieces extends MAJGrille {
	private static final long serialVersionUID = 1L;
	private Terrain gridModel;
	private boolean clockwise;

	/**
	 * Constructor for FaireTournerPieces.
	 * @param grid Terrain
	 * @param clockwise boolean
	 * @param editable EditableStatusProvider
	 */
	public FaireTournerPieces(Terrain grid, boolean clockwise,
			EditableStatusProvider editable) {
		super(new StringBuilder()
				.append("Faire tourner la grille ")
				.append(clockwise ? "Dans le sens des aiguilles d'une montre"
						: "dans le sens antihoraire").toString(), editable);
		this.gridModel = grid;
		this.clockwise = clockwise;
	}

	/**
	 * Method actionPerformed.
	 * @param e ActionEvent
	
	 * @see java.awt.event.ActionListener#actionPerformed(ActionEvent) */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (this.clockwise)
			this.gridModel.rotateClockwise();
		else
			this.gridModel.rotateCounterclockwise();
	}
}
