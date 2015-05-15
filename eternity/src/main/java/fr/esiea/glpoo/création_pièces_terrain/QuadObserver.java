package création_pièces_terrain;

/**
 * @author ange__000
 * @version $Revision: 1.0 $
 */
public abstract interface QuadObserver {
	public abstract void quadUpdated();

	/**
	 * Method setError.
	 * @param direction int
	 * @param error boolean
	 */
	void setError(int direction, boolean error);
}
