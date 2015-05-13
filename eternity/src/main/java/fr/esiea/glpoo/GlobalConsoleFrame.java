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


class GlobalConsoleFrame extends JFrame implements ActionListener 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panel = new JPanel();
	private JPanel panel1 = new JPanel();
	private JButton b1 = new JButton("JOUER");
	private JButton b2 = new JButton("Créer un Puzzle");
	private JButton b3 = new JButton("Règles et Contrôles");
	private JButton b4 = new JButton("QUITTER");


	GlobalConsoleFrame()
	{ 
		setSize(600,400);
		setTitle("Jeu Eterninty");
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		ImageIcon pic = new ImageIcon("C:\\eternity.jpg");
		panel.add(new JLabel(pic));
		panel.setBackground(Color.BLACK);
		panel1.setBackground(Color.BLACK);
		this.add(panel);
		this.add(panel1,BorderLayout.SOUTH);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		panel1.add(b1);
		panel1.add(b2);
		panel1.add(b3);
		panel1.add(b4);
		this.setVisible(true);

		//this.getContentPane().add(b1,BorderLayout.SOUTH);

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if((JButton)e.getSource()==b1)
		{
			new EcranJeu().setVisible(true);

		}
		if((JButton)e.getSource()==b2) //puzzle
		{
	//		new GrilleJeu().setVisible(true);

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
