package fenêtre_de_jeu;

//interface qui permet de réagir suite aux actions de l'utilisateur(click sur les différents boutons du jeu) 
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
