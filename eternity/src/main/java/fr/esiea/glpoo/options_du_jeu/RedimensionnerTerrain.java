package options_du_jeu;

import java.awt.event.ActionEvent;

import cr�ation_pi�ces_terrain.Terrain;
import fen�tre_de_jeu.EditableStatusProvider;

/**
 * @author ange__000
 * @version $Revision: 1.0 $
 */
public class RedimensionnerTerrain extends MAJGrille {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5057928860327880623L;
	private Terrain gridModel;
	private int gridSize;

	/**
	 * Constructor for RedimensionnerTerrain.
	 * 
	 * @param grid
	 *            Terrain
	 * @param size
	 *            int
	 * @param editable
	 *            EditableStatusProvider
	 */
	public RedimensionnerTerrain(Terrain grid, int size,
			EditableStatusProvider editable) {
		super("changer la taille de la grille � " + size + "x" + size, editable);
		this.gridModel = grid;
		this.gridSize = size;
	}

	/**
	 * Method actionPerformed.
	 * 
	 * @param e
	 *            ActionEvent
	
	 * @see java.awt.event.ActionListener#actionPerformed(ActionEvent) */
	@Override
	public void actionPerformed(ActionEvent e) {
		this.gridModel.setSize(this.gridSize);
	}
}
