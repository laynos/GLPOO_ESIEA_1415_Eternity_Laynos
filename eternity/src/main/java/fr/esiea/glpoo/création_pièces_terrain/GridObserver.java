package création_pièces_terrain;

/**
 * @author ange__000
 * @version $Revision: 1.0 $
 */
public abstract interface GridObserver {
	/**
	 * Method gridSizeUpdated.
	 * 
	 * @param paramInt
	 *            int
	 */
	public abstract void gridSizeUpdated(int paramInt);

	public abstract void gridUpdated();
}
