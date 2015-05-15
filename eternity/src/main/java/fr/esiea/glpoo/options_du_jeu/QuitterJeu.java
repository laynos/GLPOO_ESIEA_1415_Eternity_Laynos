package options_du_jeu;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

/**
 * @author ange__000
 * @version $Revision: 1.0 $
 */
public class QuitterJeu extends AbstractAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4803935537264829287L;

	public QuitterJeu() {
		super("Quitter");
	}

	/**
	 * Constructor for QuitterJeu.
	 * 
	 * @param label
	 *            String
	 */
	public QuitterJeu(String label) {
		super(label);
	}

	/**
	 * Method actionPerformed.
	 * 
	 * @param e
	 *            ActionEvent
	
	 * @see java.awt.event.ActionListener#actionPerformed(ActionEvent) */
	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}
