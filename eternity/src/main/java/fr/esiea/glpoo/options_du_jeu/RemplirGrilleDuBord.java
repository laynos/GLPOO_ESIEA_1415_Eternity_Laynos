package options_du_jeu;

import java.awt.event.ActionEvent;

import création_pièces_terrain.Terrain;
import fenêtre_de_jeu.EditableStatusProvider;

/**
 * @author ange__000
 * @version $Revision: 1.0 $
 */
public class RemplirGrilleDuBord extends MAJGrille {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8366519057394378233L;

	/**
	 * Constructor for RemplirGrilleDuBord.
	 * @param grid Terrain
	 * @param patterns int
	 * @param editable EditableStatusProvider
	 */
	public RemplirGrilleDuBord(Terrain grid, int patterns,
			EditableStatusProvider editable) {
		super("" + patterns + " patterns", editable);
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

			}
		});
	}
}
