package options_du_jeu;

import java.awt.event.ActionEvent;

import création_pièces_terrain.Terrain;
import fenêtre_de_jeu.EditableStatusProvider;

/**
 * @author ange__000
 * @version $Revision: 1.0 $
 */
public class MelangerPieces extends MAJGrille {
	/**
	 * 
	 */
	private static final long serialVersionUID = 801740805374688321L;
	private Terrain gridModel;

	/**
	 * Constructor for MelangerPieces.
	 * @param grid Terrain
	 * @param editable EditableStatusProvider
	 */
	public MelangerPieces(Terrain grid, EditableStatusProvider editable) {
		super("mélanger", editable);
		this.gridModel = grid;
	}

	/**
	 * Method actionPerformed.
	 * @param e ActionEvent
	
	 * @see java.awt.event.ActionListener#actionPerformed(ActionEvent) */
	@Override
	public void actionPerformed(ActionEvent e) {
		LancerActionEnArrierePlan.run(new Runnable() {
			@Override
			public void run() {
				MelangerPieces.this.gridModel.shuffle();
			}
		});
	}
}
