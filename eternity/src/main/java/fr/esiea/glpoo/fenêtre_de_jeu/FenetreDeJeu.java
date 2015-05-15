package fen�tre_de_jeu;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.KeyStroke;

import options_du_jeu.AboutAction;
import options_du_jeu.EnregistrerSous;
import options_du_jeu.FairePivoterPieces;
import options_du_jeu.FaireTournerPieces;
import options_du_jeu.MelangerPieces;
import options_du_jeu.NouveauJeu;
import options_du_jeu.OuvrirFichier;
import options_du_jeu.QuitterJeu;
import options_du_jeu.RedimensionnerTerrain;
import options_du_jeu.RemplirGrille;
import options_du_jeu.RemplirGrilleDuBord;
import options_du_jeu.ResetJeu;
import cr�ation_pi�ces_terrain.Terrain;

//Cr�ation de la fen�tre de jeu
/**
 * @author ange__000
 * @version $Revision: 1.0 $
 */
public class FenetreDeJeu extends JFrame {
	private static final long serialVersionUID = 1L;

	public FenetreDeJeu() {
		super(
				"Cr�ation de puzzle Eternity by FOFE, HARVEL, GUCLU, BERDAOUI, TRIKI, IM, BEMAT, MANKOURI");

		Terrain gridmodel = new Terrain(8);

		AffichageGrille grid = new AffichageGrille(gridmodel);
		grid.setPreferredSize(new Dimension(600, 600));

		JPanel labels = new JPanel(new GridLayout(5, 2));

		JPanel infos = new JPanel(new GridLayout(5, 2));

		JPanel infoPanel = new JPanel(new BorderLayout());
		infoPanel.add("West", labels);
		infoPanel.add("Center", infos);
		JPanel partRight = new JPanel(new BorderLayout());
		partRight.add("North", infoPanel);
		JPanel frameContent = new JPanel(new BorderLayout());
		frameContent.add("Center", grid);
		frameContent.add("East", partRight);
		
		setContentPane(frameContent);
		setUndecorated(true);
		getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
		
		setJMenuBar(buildMenuBar(grid));
		pack();
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		/*
		 Dimension mysize = getSize();
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(screenSize.width / 4 - mysize.width / 4, screenSize.height
				/ 4 - mysize.height / 4);
	*/
	}

	/**
	 * Method buildMenuBar.
	 * 
	 * @param gridView
	 *            AffichageGrille
	 * 
	 * @return JMenuBar
	 */
	private JMenuBar buildMenuBar(AffichageGrille gridView) {
		int menuShortcutKeyMask = Toolkit.getDefaultToolkit()
				.getMenuShortcutKeyMask();
		Terrain gridModel = gridView.getGridModel();
		JMenuBar menubar = new JMenuBar();
		JMenu mFile = new JMenu("Fichier");
		JMenuItem itemNouveau = new JMenuItem(new NouveauJeu(gridModel,
				gridView, 8));
		mFile.add(itemNouveau);
		JMenuItem itemOuvrir = new JMenuItem(new OuvrirFichier(gridModel,
				gridView, this));
		itemOuvrir.setAccelerator(KeyStroke.getKeyStroke(79,
				menuShortcutKeyMask));
		mFile.add(itemOuvrir);
		JMenuItem itemEnregistrerSous = new JMenuItem(new EnregistrerSous(
				gridModel, gridView, this));
		itemEnregistrerSous.setAccelerator(KeyStroke.getKeyStroke(83,
				menuShortcutKeyMask));
		mFile.add(itemEnregistrerSous);
		JMenuItem itemQuitter = new JMenuItem(new QuitterJeu());
		itemQuitter.setAccelerator(KeyStroke.getKeyStroke(81,
				menuShortcutKeyMask));

		mFile.add(itemQuitter);

		JMenu mGrid = new JMenu("Grille");

		mGrid.add(new JMenuItem(new ResetJeu(gridModel, gridView)));
		mGrid.add(new JMenuItem(new MelangerPieces(gridModel, gridView)));

		JMenu mgRotate = new JMenu("Retourner");
		mGrid.add(mgRotate);

		mgRotate.add(new JMenuItem(new FaireTournerPieces(gridModel, true,
				gridView)));
		mgRotate.add(new JMenuItem(new FaireTournerPieces(gridModel, false,
				gridView)));

		JMenu mgFlip = new JMenu("Pivoter");
		mGrid.add(mgFlip);
		mgFlip.add(new JMenuItem(new FairePivoterPieces(gridModel, true,
				gridView)));
		mgFlip.add(new JMenuItem(new FairePivoterPieces(gridModel, false,
				gridView)));
		JMenu mgSize = new JMenu("Taille");
		mGrid.add(mgSize);
		mgSize.add(new JMenuItem(new RedimensionnerTerrain(gridModel, 2,
				gridView)));
		mgSize.add(new JMenuItem(new RedimensionnerTerrain(gridModel, 3,
				gridView)));
		mgSize.add(new JMenuItem(new RedimensionnerTerrain(gridModel, 4,
				gridView)));
		mgSize.add(new JMenuItem(new RedimensionnerTerrain(gridModel, 5,
				gridView)));
		mgSize.add(new JMenuItem(new RedimensionnerTerrain(gridModel, 6,
				gridView)));
		mgSize.add(new JMenuItem(new RedimensionnerTerrain(gridModel, 7,
				gridView)));
		mgSize.add(new JMenuItem(new RedimensionnerTerrain(gridModel, 8,
				gridView)));
		mgSize.add(new JMenuItem(new RedimensionnerTerrain(gridModel, 9,
				gridView)));
		mgSize.add(new JMenuItem(new RedimensionnerTerrain(gridModel, 10,
				gridView)));
		mgSize.add(new JMenuItem(new RedimensionnerTerrain(gridModel, 11,
				gridView)));
		mgSize.add(new JMenuItem(new RedimensionnerTerrain(gridModel, 12,
				gridView)));
		mgSize.add(new JMenuItem(new RedimensionnerTerrain(gridModel, 13,
				gridView)));
		mgSize.add(new JMenuItem(new RedimensionnerTerrain(gridModel, 14,
				gridView)));
		mgSize.add(new JMenuItem(new RedimensionnerTerrain(gridModel, 15,
				gridView)));
		mgSize.add(new JMenuItem(new RedimensionnerTerrain(gridModel, 16,
				gridView)));
		mgSize.add(new JMenuItem(new RedimensionnerTerrain(gridModel, 17,
				gridView)));
		mgSize.add(new JMenuItem(new RedimensionnerTerrain(gridModel, 18,
				gridView)));
		mgSize.add(new JMenuItem(new RedimensionnerTerrain(gridModel, 19,
				gridView)));
		mgSize.add(new JMenuItem(new RedimensionnerTerrain(gridModel, 20,
				gridView)));
		mgSize.add(new JMenuItem(new RedimensionnerTerrain(gridModel, 21,
				gridView)));
		mgSize.add(new JMenuItem(new RedimensionnerTerrain(gridModel, 22,
				gridView)));
		mgSize.add(new JMenuItem(new RedimensionnerTerrain(gridModel, 23,
				gridView)));
		mgSize.add(new JMenuItem(new RedimensionnerTerrain(gridModel, 24,
				gridView)));
		mgSize.add(new JMenuItem(new RedimensionnerTerrain(gridModel, 25,
				gridView)));
		mgSize.add(new JMenuItem(new RedimensionnerTerrain(gridModel, 26,
				gridView)));
		mgSize.add(new JMenuItem(new RedimensionnerTerrain(gridModel, 27,
				gridView)));
		mgSize.add(new JMenuItem(new RedimensionnerTerrain(gridModel, 28,
				gridView)));
		mgSize.add(new JMenuItem(new RedimensionnerTerrain(gridModel, 29,
				gridView)));
		mgSize.add(new JMenuItem(new RedimensionnerTerrain(gridModel, 30,
				gridView)));

		JMenu mgFB = new JMenu("Terrain entier");
		mgFB.add(new JMenuItem(new RemplirGrille(gridModel, 2, gridView)));
		mgFB.add(new JMenuItem(new RemplirGrille(gridModel, 3, gridView)));
		mgFB.add(new JMenuItem(new RemplirGrille(gridModel, 4, gridView)));
		mgFB.add(new JMenuItem(new RemplirGrille(gridModel, 5, gridView)));
		mgFB.add(new JMenuItem(new RemplirGrille(gridModel, 6, gridView)));
		mgFB.add(new JMenuItem(new RemplirGrille(gridModel, 7, gridView)));
		mgFB.add(new JMenuItem(new RemplirGrille(gridModel, 8, gridView)));
		mgFB.add(new JMenuItem(new RemplirGrille(gridModel, 9, gridView)));
		mgFB.add(new JMenuItem(new RemplirGrille(gridModel, 10, gridView)));
		mgFB.add(new JMenuItem(new RemplirGrille(gridModel, 11, gridView)));
		mgFB.add(new JMenuItem(new RemplirGrille(gridModel, 12, gridView)));
		mgFB.add(new JMenuItem(new RemplirGrille(gridModel, 13, gridView)));
		mgFB.add(new JMenuItem(new RemplirGrille(gridModel, 14, gridView)));
		mgFB.add(new JMenuItem(new RemplirGrille(gridModel, 15, gridView)));
		mgFB.add(new JMenuItem(new RemplirGrille(gridModel, 16, gridView)));
		mgFB.add(new JMenuItem(new RemplirGrille(gridModel, 17, gridView)));
		mgFB.add(new JMenuItem(new RemplirGrille(gridModel, 18, gridView)));
		mgFB.add(new JMenuItem(new RemplirGrille(gridModel, 19, gridView)));
		mgFB.add(new JMenuItem(new RemplirGrille(gridModel, 20, gridView)));
		mgFB.add(new JMenuItem(new RemplirGrille(gridModel, 21, gridView)));
		mgFB.add(new JMenuItem(new RemplirGrille(gridModel, 22, gridView)));
		mgFB.add(new JMenuItem(new RemplirGrille(gridModel, 23, gridView)));
		mgFB.add(new JMenuItem(new RemplirGrille(gridModel, 24, gridView)));
		mgFB.add(new JMenuItem(new RemplirGrille(gridModel, 25, gridView)));
		mgFB.add(new JMenuItem(new RemplirGrille(gridModel, 26, gridView)));
		mgFB.add(new JMenuItem(new RemplirGrille(gridModel, 27, gridView)));
		mgFB.add(new JMenuItem(new RemplirGrille(gridModel, 28, gridView)));
		mgFB.add(new JMenuItem(new RemplirGrille(gridModel, 29, gridView)));
		mgFB.add(new JMenuItem(new RemplirGrille(gridModel, 30, gridView)));

		JMenu mgFO = new JMenu("Bord");
		mgFO.add(new JMenuItem(new RemplirGrilleDuBord(gridModel, 2, gridView)));
		mgFO.add(new JMenuItem(new RemplirGrilleDuBord(gridModel, 3, gridView)));
		mgFO.add(new JMenuItem(new RemplirGrilleDuBord(gridModel, 4, gridView)));
		mgFO.add(new JMenuItem(new RemplirGrilleDuBord(gridModel, 5, gridView)));
		mgFO.add(new JMenuItem(new RemplirGrilleDuBord(gridModel, 6, gridView)));
		mgFO.add(new JMenuItem(new RemplirGrilleDuBord(gridModel, 7, gridView)));
		mgFO.add(new JMenuItem(new RemplirGrilleDuBord(gridModel, 8, gridView)));
		mgFO.add(new JMenuItem(new RemplirGrilleDuBord(gridModel, 9, gridView)));
		mgFO.add(new JMenuItem(new RemplirGrilleDuBord(gridModel, 10, gridView)));
		mgFO.add(new JMenuItem(new RemplirGrilleDuBord(gridModel, 11, gridView)));
		mgFO.add(new JMenuItem(new RemplirGrilleDuBord(gridModel, 12, gridView)));
		mgFO.add(new JMenuItem(new RemplirGrilleDuBord(gridModel, 13, gridView)));
		mgFO.add(new JMenuItem(new RemplirGrilleDuBord(gridModel, 14, gridView)));
		mgFO.add(new JMenuItem(new RemplirGrilleDuBord(gridModel, 15, gridView)));
		mgFO.add(new JMenuItem(new RemplirGrilleDuBord(gridModel, 16, gridView)));
		mgFO.add(new JMenuItem(new RemplirGrilleDuBord(gridModel, 17, gridView)));
		mgFO.add(new JMenuItem(new RemplirGrilleDuBord(gridModel, 18, gridView)));
		mgFO.add(new JMenuItem(new RemplirGrilleDuBord(gridModel, 19, gridView)));
		mgFO.add(new JMenuItem(new RemplirGrilleDuBord(gridModel, 20, gridView)));
		mgFO.add(new JMenuItem(new RemplirGrilleDuBord(gridModel, 21, gridView)));
		mgFO.add(new JMenuItem(new RemplirGrilleDuBord(gridModel, 22, gridView)));
		mgFO.add(new JMenuItem(new RemplirGrilleDuBord(gridModel, 23, gridView)));
		mgFO.add(new JMenuItem(new RemplirGrilleDuBord(gridModel, 24, gridView)));
		mgFO.add(new JMenuItem(new RemplirGrilleDuBord(gridModel, 25, gridView)));
		mgFO.add(new JMenuItem(new RemplirGrilleDuBord(gridModel, 26, gridView)));
		mgFO.add(new JMenuItem(new RemplirGrilleDuBord(gridModel, 27, gridView)));
		mgFO.add(new JMenuItem(new RemplirGrilleDuBord(gridModel, 28, gridView)));
		mgFO.add(new JMenuItem(new RemplirGrilleDuBord(gridModel, 29, gridView)));
		mgFO.add(new JMenuItem(new RemplirGrilleDuBord(gridModel, 30, gridView)));

		JMenu mInfo = new JMenu("A propos");
		mInfo.add(new JMenuItem(new AboutAction(this)));
		menubar.add(mFile);
		menubar.add(mGrid);
		menubar.add(mInfo);

		return menubar;
	}
}