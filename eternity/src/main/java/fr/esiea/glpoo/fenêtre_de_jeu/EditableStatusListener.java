package fen�tre_de_jeu;

//interface qui permet de r�agir suite aux actions de l'utilisateur(click sur les diff�rents boutons du jeu) 
/**
 * @author ange__000
 * @version $Revision: 1.0 $
 */
public abstract interface EditableStatusListener {
	/**
	 * Method editableStatusUpdated.
	 * @param paramBoolean boolean
	 */
	public abstract void editableStatusUpdated(boolean paramBoolean);
}
