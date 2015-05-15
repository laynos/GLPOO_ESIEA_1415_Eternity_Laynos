package options_du_jeu;

import java.awt.event.ActionEvent;

import création_pièces_terrain.Terrain;
import fenêtre_de_jeu.EditableStatusProvider;

/**
 * @author ange__000
 * @version $Revision: 1.0 $
 */
public class ChargerTerrain extends MAJGrille {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for ChargerTerrain.
	 * @param gridModel Terrain
	 * @param name String
	 * @param modelname String
	 * @param editable EditableStatusProvider
	 */
	public ChargerTerrain(Terrain gridModel, String name, String modelname,
			EditableStatusProvider editable) {
		super(name, editable);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Method actionPerformed.
	 * 
	 * @param e
	 *            ActionEvent
	
	 * @see java.awt.event.ActionListener#actionPerformed(ActionEvent) */
	@Override
	public void actionPerformed(ActionEvent e) {
	}
}
