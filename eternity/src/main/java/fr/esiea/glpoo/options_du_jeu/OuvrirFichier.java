package options_du_jeu;

import java.awt.Component;
import java.awt.event.ActionEvent;

import javax.swing.JFileChooser;

import création_pièces_terrain.Terrain;
import fenêtre_de_jeu.EditableStatusProvider;

/**
 * @author ange__000
 * @version $Revision: 1.0 $
 */
public class OuvrirFichier extends MAJGrille {
	/**
	 * 
	 */
	private static final long serialVersionUID = 341241052228645756L;
	private Component parent;

	/**
	 * Constructor for OuvrirFichier.
	 * @param grid Terrain
	 * @param editable EditableStatusProvider
	 * @param parent Component
	 */
	public OuvrirFichier(Terrain grid, EditableStatusProvider editable,
			Component parent) {
		super("Ouvrir", editable);
		this.parent = parent;
	}

	/**
	 * Method actionPerformed.
	 * @param e ActionEvent
	
	 * @see java.awt.event.ActionListener#actionPerformed(ActionEvent) */
	@Override
	public void actionPerformed(ActionEvent e) {
		JFileChooser fc = new JFileChooser();
		int returnVal = fc.showOpenDialog(this.parent);

		if (returnVal == 0) {
			fc.getSelectedFile();
		}
	}
}