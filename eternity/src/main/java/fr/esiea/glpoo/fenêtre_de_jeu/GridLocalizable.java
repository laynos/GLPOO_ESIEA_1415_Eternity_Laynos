package fenêtre_de_jeu;

import création_pièces_terrain.Cases;

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
