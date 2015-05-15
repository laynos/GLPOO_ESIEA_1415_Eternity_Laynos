package création_pièces_terrain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// TODO from UCDetector: Change visibility of Class "AbstractQuadGrid" to default - May cause compile errors!
/**
 * @author ange__000
 * @version $Revision: 1.0 $
 */
public abstract class AbstractQuadGrid implements Iterable<Cases>, // NO_UCD
																		// (use
																		// default)
		Serializable {
	private static final long serialVersionUID = 1L;
	private int sizeX;
	private int sizeY;
	protected List<Cases> gridQuads;
	private boolean $assertionsDisabled;

	// TODO from UCDetector: Change visibility of Constructor
	// "AbstractQuadGrid.AbstractQuadGrid(int,int)" to default
	/**
	 * Constructor for AbstractQuadGrid.
	 * 
	 * @param width
	 *            int
	 * @param height
	 *            int
	 */
	public AbstractQuadGrid(int width, int height) { // NO_UCD (use default)
		assert (width > 0);
		assert (height > 0);
		setSize(width, height);
	}

	// TODO from UCDetector: Change visibility of Method
	// "AbstractQuadGrid.getQuad(int)" to default
	/**
	 * Method getQuad.
	 * 
	 * @param index
	 *            int
	
	 * @return Cases */
	public Cases getQuad(int index) { // NO_UCD (use default)
		return this.gridQuads.get(index);
	}

	// TODO from UCDetector: Change visibility of Method
	// "AbstractQuadGrid.getQuad(int,int)" to default
	/**
	 * Method getQuad.
	 * 
	 * @param x
	 *            int
	 * @param y
	 *            int
	
	 * @return Cases */
	public Cases getQuad(int x, int y) { // NO_UCD (use default)
		Cases result = null;

		if ((x >= 0) && (x < this.sizeX) && (y >= 0) && (y < this.sizeY)) {
			result = this.gridQuads.get(x + y * this.sizeX);
		}

		return result;
	}

	/**
	 * Method getQuads.
	 * 
	
	 * @return List<Cases> */
	public List<Cases> getQuads() {
		return this.gridQuads;
	}

	// TODO from UCDetector: Change visibility of Method
	// "AbstractQuadGrid.setSize(int,int)" to default
	/**
	 * Method setSize.
	 * 
	 * @param width
	 *            int
	 * @param height
	 *            int
	 */
	public void setSize(int width, int height) { // NO_UCD (use default)
		this.sizeX = width;
		this.sizeY = height;
		int positions = this.sizeX * this.sizeY;
		this.gridQuads = new ArrayList<Cases>(positions);

		while (this.gridQuads.size() < positions)
			this.gridQuads.add(new Cases());
	}

	/**
	 * Method getWidth.
	 * 
	
	 * @return int */
	public int getWidth() {
		return this.sizeX;
	}

	/**
	 * Method getHeight.
	 * 
	
	 * @return int */
	public int getHeight() {
		return this.sizeY;
	}

	/**
	 * Method getPositions.
	 * 
	
	 * @return int */
	public int getPositions() {
		return this.sizeX * this.sizeY;
	}

	/**
	 * Method toQuadString.
	 * 
	
	 * @return String */
	public String toQuadString() {
		StringBuffer text = new StringBuffer();
		int ix = 0;

		for (Cases quad : this.gridQuads) {
			if (quad.isLocked())
				text.append('[');
			else {
				text.append(' ');
			}

			text.append(quad.getPattern(0).getCodeString());
			text.append(' ');
			text.append(quad.getPattern(1).getCodeString());
			text.append(' ');
			text.append(quad.getPattern(2).getCodeString());
			text.append(' ');
			text.append(quad.getPattern(3).getCodeString());

			if (quad.isLocked())
				text.append(']');
			else {
				text.append(' ');
			}

			ix++;
			if (ix % getWidth() == 0)
				text.append('\n');
			else {
				text.append("   ");
			}

		}

		return text.toString();
	}

	// TODO from UCDetector: Change visibility of Method
	// "AbstractQuadGrid.getNeighbor(int,int,int)" to default
	/**
	 * Method getNeighbor.
	 * 
	 * @param x
	 *            int
	 * @param y
	 *            int
	 * @param direction
	 *            int
	
	 * @return Cases */
	public Cases getNeighbor(int x, int y, int direction) { // NO_UCD (use
																// default)
		if (direction == 0)
			y--;
		else if (direction == 2)
			y++;
		else if (direction == 3)
			x--;
		else if (direction == 1) {
			x++;
		} else if (!$assertionsDisabled)
			throw new AssertionError();

		return getQuad(x, y);
	}

	/**
	 * Method iterator.
	 * 
	
	
	 * @return Iterator<Cases> * @see java.lang.Iterable#iterator() */
	@Override
	public Iterator<Cases> iterator() {
		return this.gridQuads.iterator();
	}

	/**
	 * Method hashCode.
	 * 
	
	 * @return int */
	@Override
	public int hashCode() {
		int result = this.sizeX * 17 + this.sizeY;

		for (Cases quad : this.gridQuads) {
			result *= (1 + quad.hashCode());
		}

		return result;
	}

	/**
	 * Method equals.
	 * 
	 * @param o
	 *            Object
	
	 * @return boolean */
	@Override
	public boolean equals(Object o) {
		boolean result = false;

		if ((o instanceof AbstractQuadGrid)) {
			AbstractQuadGrid otherGrid = (AbstractQuadGrid) o;
			result = this.gridQuads.equals(otherGrid.gridQuads);
		}

		return result;
	}

	/**
	 * Method countConnections.
	 * 
	
	 * @return int */
	public int countConnections() {
		// TODO Auto-generated method stub
		return 0;
	}
}
