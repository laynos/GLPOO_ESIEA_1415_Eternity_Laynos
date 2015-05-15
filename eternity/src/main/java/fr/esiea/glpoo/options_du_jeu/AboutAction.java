package options_du_jeu;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;

import fenêtre_de_jeu.A_Propos;

/**
 * @author ange__000
 * @version $Revision: 1.0 $
 */
public class AboutAction extends AbstractAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3190325754453546071L;
	private JFrame parent;

	/**
	 * Constructor for AboutAction.
	 * 
	 * @param parent
	 *            JFrame
	 */
	public AboutAction(JFrame parent) {
		super("auteurs");
		this.parent = parent;
	}

	/**
	 * Method actionPerformed.
	 * 
	 * @param e
	 *            ActionEvent
	
	 * @see java.awt.event.ActionListener#actionPerformed(ActionEvent) */
	@Override
	public void actionPerformed(ActionEvent e) {
		A_Propos dialog = new A_Propos(this.parent);
		dialog.setVisible(true);
	}
}