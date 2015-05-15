package Window;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRootPane;

import fenêtre_de_jeu.FenetreDeJeu;


class GlobalConsoleFrame extends JFrame implements ActionListener 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static GlobalConsoleFrame instance;
	private JPanel panel;
	private JPanel panel1;
	private JButton b1;
	private JButton b2;
	private JButton b3;
	private JButton b4;
	private ImageIcon pic;


	public GlobalConsoleFrame()
	{ 
		this.setSize(600,400);
		this.setTitle("Jeu Eternity  by FOFE, HARVEL, GUCLU, BERDAOUI, TRIKI, IM, BEMAT, MANKOURI");
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setUndecorated(true);
		this.getRootPane().setWindowDecorationStyle(JRootPane.WARNING_DIALOG);

		pic = new ImageIcon("src/eternity.jpg");
		panel = new JPanel();
		panel1 = new JPanel();
		panel.add(new JLabel(pic));

		panel.setBackground(Color.BLACK);
		this.add(panel,BorderLayout.NORTH);

		panel1.setBackground(Color.BLACK);
		this.add(panel1,BorderLayout.CENTER);

		b1 = new JButton("JOUER");
		b1.addActionListener(this);
		b2 = new JButton("Créer un Puzzle");
		b2.addActionListener(this);
		b3 = new JButton("Règles et Contrôles");
		b3.addActionListener(this);
		b4 = new JButton("QUITTER");
		b4.addActionListener(this);

		panel1.add(b1);
		panel1.add(b2);
		panel1.add(b3);
		panel1.add(b4);
		this.setVisible(true);

	}
	public static GlobalConsoleFrame getInstance(){
		if(instance == null){
			instance = new GlobalConsoleFrame();
			/*System.out.println("Création du menu");*/
		}		
		return instance;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if((JButton)e.getSource()==b1)
		{
			new EcranJeu().setVisible(true);

		}
		if((JButton)e.getSource()==b2) //puzzle
		{
			new FenetreDeJeu().setVisible(true);

		}
		if((JButton)e.getSource()==b3)//regles
		{
			new Regle().setVisible(true);

		}
		if((JButton)e.getSource()==b4)//exit
		{
			this.dispose();

		}
	}
}