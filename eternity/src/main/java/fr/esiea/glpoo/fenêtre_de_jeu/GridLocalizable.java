package fen�tre_de_jeu;

import cr�ation_pi�ces_terrain.Cases;

// TODO from UCDetector: Change visibility of Interface "GridLocalizable" to default - May cause compile errors!
/**
 * @author ange__000
 * @version $Revision: 1.0 $
 */
public abstract interface GridLocalizable { // NO_UCD (use default)
	/**
	 * Method getSelectedQuad.
	 * 
	
	 * @return Cases */
	public abstract Cases getSelectedQuad();
}
