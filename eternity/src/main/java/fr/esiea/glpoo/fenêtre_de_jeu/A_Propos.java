package fenêtre_de_jeu;

import java.awt.Dimension;
import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * @author ange__000
 * @version $Revision: 1.0 $
 */
public class A_Propos extends JDialog {

	private static final long serialVersionUID = 1L;
	private JFrame parent;

	// création d'une boîte de dialogue
	/**
	 * Constructor for A_Propos.
	 * 
	 * @param parent
	 *            JFrame
	 */
	public A_Propos(JFrame parent) {

		super(parent, "A propos de cette version d'Eternity");
		this.parent = parent;

		setModal(true);
		setResizable(false);
		setUndecorated(false);
		JTextArea text = new JTextArea();
		text.setEditable(false);

		try {
			text.append(readTextFromJar("A propos.txt"));
		}

		catch (IOException e) {
			text.append(e.getLocalizedMessage());
		}
		text.setCaretPosition(0);

		JScrollPane pane = new JScrollPane(text);
		getContentPane().add(pane);
		setPreferredSize(new Dimension(600, 400));
		pack();
	}

	// fonction d'affichage de la boîte de dialogue en fontion de la valeur de
	// visibility
	/**
	 * Method setVisible.
	 * 
	 * @param visibility
	 *            boolean
	 */
	@Override
	public void setVisible(boolean visibility) {

		if (visibility) {
			Dimension splashSize = getPreferredSize();
			Dimension parentSize = this.parent.getSize();
			Point parentLocation = this.parent.getLocationOnScreen();
			setLocation(parentLocation.x + parentSize.width / 2
					- splashSize.width / 2, parentLocation.y
					+ parentSize.height / 2 - splashSize.height / 2);
		}

		super.setVisible(visibility);
	}

	/**
	 * Method readTextFromJar.
	 * 
	 * @param filename
	 *            String
	
	
	 * @return String * @throws IOException */
	private String readTextFromJar(String filename) throws IOException {

		StringBuffer result = new StringBuffer();
		InputStream is = getClass().getResourceAsStream(filename);
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		String thisline;
		while ((thisline = br.readLine()) != null) {
			result.append(thisline);
			result.append('\n');
		}
		return result.toString();
	}
}