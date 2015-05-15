package Window;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JTextArea;

public class Regle extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel panel;
	private JTextArea label;
	public Regle() {
		Font policeRegles = new Font("Tahoma",Font.BOLD,12);
		panel = new JPanel(new FlowLayout());
		label = new JTextArea("Règle du jeu :\n\n"
				+ "Dans ce jeu vous devez replacer les pièces \ndans la bonne case et la bonne orientation.\n"
				+ "\n\n"
				+ "Bon jeu !! ");
		label.setEditable(false);  
		label.setCursor(null);  
		label.setOpaque(false);  
		label.setFocusable(false);
		label.setBounds(120,15,120,15);
		label.setFont(policeRegles);
		panel.setBackground(new Color(200,220,240));
		label.setWrapStyleWord(true);


		setSize(300,300);
		setTitle("Règles du Jeu Eternity  by FOFE, HARVEL, GUCLU, BERDAOUI, TRIKI, IM, BEMAT, MANKOURI");
		this.setUndecorated(true);
		this.getRootPane().setWindowDecorationStyle(JRootPane.WARNING_DIALOG);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.add(panel);
		panel.add(label);



	}

}
