package création_pièces_terrain;

import java.awt.Color;

/**
 * @author ange__000
 * @version $Revision: 1.0 $
 */
public enum CouleurPieces {
	// On crée une énumération pour répertorier les couleurs des différentes
	// pièces. Les chiffres représentent les codes des couleurs

	COL_DARKGREEN(21760), COL_PEACH(16765120), COL_BLUEGRAY(9474208), COL_ORANGE(
			15505690), COL_DARKBLUE(2774391), COL_MELON(16744560), COL_YELLOW(
			14737168), COL_PURPLE(14316231), COL_DARKPURPLE(6434135), COL_MAGENTA(
			10427975), COL_GREEN(3114327), COL_PINK(14311818), COL_VIOLET(
			6107261), COL_BROWN(5122333), COL_DARKRED(5570560);

	private Color color;

	/**
	 * Constructor for CouleurPieces.
	 * 
	 * @param color
	 *            int
	 */
	private CouleurPieces(int color) {
		this.color = new Color(color);
	}

	/**
	 * Method getColor.
	 * 
	 * 
	 * @return Color
	 */
	public Color getColor() {
		return this.color;
	}
}
