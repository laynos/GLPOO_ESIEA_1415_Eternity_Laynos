package options_du_jeu;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import création_pièces_terrain.Terrain;
import fenêtre_de_jeu.EditableStatusProvider;

/**
 * @author ange__000
 * @version $Revision: 1.0 $
 */
public class EnregistrerSous extends MAJGrille {
	private static final long serialVersionUID = 1L;
	private Terrain gridModel;
	private Component parent;

	/**
	 * Constructor for EnregistrerSous.
	 * @param grid Terrain
	 * @param editable EditableStatusProvider
	 * @param parent Component
	 */
	public EnregistrerSous(Terrain grid, EditableStatusProvider editable,
			Component parent) {
		super("Enregister sous", editable);
		this.gridModel = grid;
		this.parent = parent;
	}

	/**
	 * Method actionPerformed.
	 * @param e ActionEvent
	
	 * @see java.awt.event.ActionListener#actionPerformed(ActionEvent) */
	@Override
	public void actionPerformed(ActionEvent e) {
		JFileChooser fc = new JFileChooser();
		int returnVal = fc.showSaveDialog(this.parent);

		if (returnVal == 0)
			try {
				File file = fc.getSelectedFile();
				FileWriter writer = new FileWriter(file);
				writer.write(this.gridModel.toQuadString());
				writer.flush();
				writer.close();
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(this.parent,
						"IO Error: " + e1.getMessage(), "IO error", 0);
			}
	}
}