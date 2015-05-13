package Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Regle extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panel = new JPanel();
	/*private JLabel label = new JLabel("Règle du jeu"
			+ "Dans ce jeu vous devez replacer les pièces dans le bonne case et la bonne orientation"
			+ "Il n'y a qu'une combinaison possible"
			+ "Bon jeu",JLabel.CENTER);
	*/
	private JTextArea label = new JTextArea("Règle du jeu :\n"
			+ "Dans ce jeu vous devez replacer les pièces dans le bonne case et la bonne orientation.\n"
			+ "Il n'y a qu'une combinaison possible\n"
			+ "Bon jeu");
	public Regle() {
	    
		label.setEditable(false);  
	    label.setCursor(null);  
	    label.setOpaque(false);  
	    label.setFocusable(false);
	    label.setLineWrap(true);
	    label.setWrapStyleWord(true);
	    
	    
		setSize(300,300);
		setTitle("Jeu Eterninty");
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.add(panel);
		panel.add(label);
		
		
	
	}

}
