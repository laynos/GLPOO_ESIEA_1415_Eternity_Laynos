package Window;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.Timer;
import javax.swing.WindowConstants;

public class EcranJeu extends JFrame{

	private static final long serialVersionUID = 1L;

	private JPanel panel;
/* */	private JButton[][] Board;	
/* */	private JButton[][] Pioche;	

	private int size = 4;	/* taille choisi : 4 x 4 */
	private static int timeCompteur = 0;
	private static int score = 1000;  /* On commence avec un score de 1000 */

	/* --- Début de la partie chrono + score --- */

	private static JLabel scoreAfficher = new JLabel("Score : 1000 !");
	private static JLabel time = new JLabel("00 min et 00 sec");
	static Timer timer;
	static ActionListener pasSeconde = new ActionListener()  {
		@Override
		public void actionPerformed(ActionEvent e)  {
			// +1 et conversion en minute seconde
			timeCompteur++;
			score -= 1;
			int minute = timeCompteur/60;	//récupération des minutes
			int seconde = timeCompteur %60;	//récupérationdes secondes
			String min = Integer.toString(minute);
			if (minute < 10){ min = "0" + Integer.toString(minute);}
			String sec = Integer.toString(seconde);
			if (seconde < 10){ sec = "0" + Integer.toString(seconde);}
			//Actualiser le JLabel
			time.setText(""+min+" min et "+sec+" sec");	
			scoreAfficher.setText("Score : "+score+" !");
		}
	};		
	/* --- Fin de la partie chrono + score --- */




	public EcranJeu() {

	
	
		panel = (JPanel) this.getContentPane();
		panel.setLayout(null);
		panel.setBackground(new Color(15,25,55));
		this.setTitle("Eternity by FOFE, HARVEL, GUCLU, BERDAOUI, TRIKI, IM, BEMAT, MANKOURI");
		this.setSize(800, 600);
		this.setJMenuBar(buildMenuBar());
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);


		this.setUndecorated(true);
		this.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);




		/* --- Début du Chronomètre --- */
		time.setForeground(new Color(240,240,240));
		timer = new Timer(1000, pasSeconde);		
		/* On commence à compter */
		timer.start();
		/* On place le chrono avec quelques paramètres... */
		Font policeForChrono = new Font("Tahoma",Font.BOLD,15);
		time.setFont(policeForChrono);		
		time.setBounds(550,20,550,20);		

		/* --- Fin du Chronomètre --- */




		/* --- Début du Score --- */
		scoreAfficher.setForeground(new Color(240,240,240));
		scoreAfficher.setFont(policeForChrono);	
		scoreAfficher.setBounds(550,60,450,60);	

		/* --- Fin du Score --- */



		/* Affichage de tout les élements */
		panel.add(time);
		panel.add(scoreAfficher);
	}


	//Remise a zero du timer
	private static void resetTimer(){
		timer.stop(); 
		timer = new Timer(1000, pasSeconde);		
		timer.start();  
		timeCompteur = -1;
		score = 1001;
	}

	static void reset(){
		resetTimer();
	}
	
	private JMenuBar buildMenuBar() {
		JMenuBar menubar = new JMenuBar();
	

		JMenu mFile = new JMenu("Fichier");
		JMenuItem itemNouveau = new JMenuItem("Nouvelle Partie");
		itemNouveau.addActionListener(new MenuActionListener());
		mFile.add(itemNouveau);
		JMenuItem itemSave = new JMenuItem("Sauvegarder");
		itemSave.addActionListener(new MenuActionListener());
		mFile.add(itemSave);
		JMenuItem itemLoad = new JMenuItem("Reprendre une partie");
		itemLoad.addActionListener(new MenuActionListener());
		mFile.add(itemLoad);

		JMenu mOpt = new JMenu("Option");
		JMenuItem itemScore = new JMenuItem("Highscore");
		mOpt.add(itemScore);
		JMenuItem itemControl = new JMenuItem("Règles & controles du jeu");
		itemControl.addActionListener(new MenuActionListener());
		mOpt.add(itemControl);


		menubar.add(mFile);
		menubar.add(mOpt);

		return menubar;
	}


	/*public void actionPerformed(ActionEvent e) { }
	public void actionListener(ActionEvent e) { }
	public void MouseListener(ActionEvent e) { }
	public void mouseClicked(MouseEvent e) { }
	public void mouseEntered(MouseEvent e) { }*/
}
