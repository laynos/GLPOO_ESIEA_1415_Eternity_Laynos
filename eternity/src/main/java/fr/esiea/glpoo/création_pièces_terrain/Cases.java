package création_pièces_terrain;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author ange__000
 * @version $Revision: 1.0 $
 */
public class Cases implements Cloneable, Serializable {
	private static final long serialVersionUID = 1L;
	public static final int DIR_NORTH = 0;
	public static final int DIR_EAST = 1;
	public static final int DIR_SOUTH = 2;
	public static final int DIR_WEST = 3;
	private Pieces[] patterns;
	private Set<QuadObserver> observers = new HashSet<QuadObserver>();
	private Pieces defaultpat;
	private boolean locked = false;
	private boolean readOnly = false;

	public Cases() {
		this.defaultpat = Pieces.getDefaultPattern();
		this.patterns = new Pieces[4];
		this.patterns[0] = this.defaultpat;
		this.patterns[1] = this.defaultpat;
		this.patterns[2] = this.defaultpat;
		this.patterns[3] = this.defaultpat;
	}

	/**
	 * Constructor for Cases.
	 * 
	 * @param initialPatterns
	 *            Pieces[]
	 */
	public Cases(Pieces[] initialPatterns) {
		this.defaultpat = Pieces.getDefaultPattern();
		this.patterns = new Pieces[4];
		this.patterns[0] = initialPatterns[0];
		this.patterns[1] = initialPatterns[1];
		this.patterns[2] = initialPatterns[2];
		this.patterns[3] = initialPatterns[3];
	}

	/**
	 * Method clone.
	 * 
	 * 
	 * @return Cases
	 */
	@Override
	public Cases clone() {
		Cases newQuad = new Cases();
		copyTo(newQuad);
		return newQuad;
	}

	/**
	 * Method copyTo.
	 * 
	 * @param q
	 *            Cases
	 */
	public void copyTo(Cases q) {
		copyTo(q, true);
	}

	/**
	 * Method copyTo.
	 * 
	 * @param q
	 *            Cases
	 * @param notifyObservers
	 *            boolean
	 */
	protected void copyTo(Cases q, boolean notifyObservers) {
		assert (!q.readOnly);
		q.patterns[0] = this.patterns[0];
		q.patterns[1] = this.patterns[1];
		q.patterns[2] = this.patterns[2];
		q.patterns[3] = this.patterns[3];
		q.locked = isLocked();

		if (notifyObservers)
			q.notifyQuadUpdated();
	}

	/**
	 * Method isClear.
	 * 
	 * 
	 * @return boolean
	 */
	public boolean isClear() {
		return (this.patterns[0] == this.defaultpat)
				&& (this.patterns[1] == this.defaultpat)
				&& (this.patterns[2] == this.defaultpat)
				&& (this.patterns[3] == this.defaultpat);
	}

	/**
	 * Method isNull.
	 * 
	 * 
	 * @return boolean
	 */
	public boolean isNull() {
		return (this.patterns[0] == null) && (this.patterns[1] == null)
				&& (this.patterns[2] == null) && (this.patterns[3] == null);
	}

	/**
	 * Method countPattern.
	 * 
	 * @param pattern
	 *            Pieces
	 * 
	 * @return int
	 */
	public int countPattern(Pieces pattern) {
		int result = 0;

		if (this.patterns[0] == pattern) {
			result++;
		}

		if (this.patterns[1] == pattern) {
			result++;
		}

		if (this.patterns[2] == pattern) {
			result++;
		}

		if (this.patterns[3] == pattern) {
			result++;
		}

		return result;
	}

	/**
	 * Method countDefaultPattern.
	 * 
	 * 
	 * @return int
	 */
	public int countDefaultPattern() {
		return countPattern(this.defaultpat);
	}

	/**
	 * Method isLocked.
	 * 
	 * 
	 * @return boolean
	 */
	public boolean isLocked() {
		return this.locked;
	}

	/**
	 * Method setLocked.
	 * 
	 * @param l
	 *            boolean
	 */
	public void setLocked(boolean l) {
		if (this.locked != l) {
			this.locked = l;
			notifyQuadUpdated();
		}
	}

	public void clear() {
		assert (!this.readOnly);
		this.patterns[0] = this.defaultpat;
		this.patterns[2] = this.defaultpat;
		this.patterns[3] = this.defaultpat;
		this.patterns[1] = this.defaultpat;
		setLocked(false);
		notifyQuadUpdated();
	}

	/**
	 * Method getPattern.
	 * 
	 * @param direction
	 *            int
	 * 
	 * @return Pieces
	 */
	public Pieces getPattern(int direction) {
		return this.patterns[direction];
	}

	/**
	 * Method setPattern.
	 * 
	 * @param direction
	 *            int
	 * @param pattern
	 *            Pieces
	 */
	public void setPattern(int direction, Pieces pattern) {
		assert (!this.readOnly);
		this.patterns[direction] = pattern;
		notifyQuadUpdated();
	}

	/**
	 * Method swap.
	 * 
	 * @param other
	 *            Cases
	 */
	public void swap(Cases other) {
		assert (!this.readOnly);
		assert (!other.readOnly);
		Pieces[] my_old_patterns = this.patterns;
		this.patterns = other.patterns;
		other.patterns = my_old_patterns;

		notifyQuadUpdated();
		other.notifyQuadUpdated();
	}

	/**
	 * Method rotatePattern.
	 * 
	 * @param direction
	 *            int
	 */
	public void rotatePattern(int direction) {
		assert (!this.readOnly);
		rotatePattern(direction, true);
	}

	/**
	 * Method rotatePattern.
	 * 
	 * @param direction
	 *            int
	 * @param forward
	 *            boolean
	 */
	public void rotatePattern(int direction, boolean forward) {
		assert (!this.readOnly);

		List<?> allpats = Pieces.getAllPatterns();

		Pieces pat = getPattern(direction);
		int patix = allpats.indexOf(pat);

		int offset = 1;

		if (!forward) {
			offset = -1;
		}

		setPattern(
				direction,
				(Pieces) allpats.get((patix + offset + allpats.size())
						% allpats.size()));
	}

	public void rotateClockwise() {
		assert (!this.readOnly);

		Pieces buf = this.patterns[0];
		this.patterns[0] = this.patterns[3];
		this.patterns[3] = this.patterns[2];
		this.patterns[2] = this.patterns[1];
		this.patterns[1] = buf;
		notifyQuadUpdated();
	}

	/**
	 * Method rotateClockwise.
	 * 
	 * @param steps
	 *            int
	 */
	public void rotateClockwise(int steps) {
		assert (!this.readOnly);

		int stepsLeft = steps;
		while (stepsLeft-- > 0)
			rotateClockwise();
	}

	public void rotateCounterclockwise() {
		assert (!this.readOnly);

		Pieces buf = this.patterns[0];
		this.patterns[0] = this.patterns[1];
		this.patterns[1] = this.patterns[2];
		this.patterns[2] = this.patterns[3];
		this.patterns[3] = buf;
		notifyQuadUpdated();
	}

	/**
	 * Method rotateCounterclockwise.
	 * 
	 * @param steps
	 *            int
	 */
	public void rotateCounterclockwise(int steps) {
		assert (!this.readOnly);

		int stepsLeft = steps;
		while (stepsLeft-- > 0)
			rotateCounterclockwise();
	}

	/**
	 * Method addQuadObserver.
	 * 
	 * @param observer
	 *            QuadObserver
	 */
	public void addQuadObserver(QuadObserver observer) {
		this.observers.add(observer);
	}

	/**
	 * Method removeQuadObserver.
	 * 
	 * @param observer
	 *            QuadObserver
	 */
	public void removeQuadObserver(QuadObserver observer) {
		this.observers.remove(observer);
	}

	private void notifyQuadUpdated() {
		if (this.observers.size() > 0)
			for (QuadObserver observer : this.observers)
				observer.quadUpdated();
	}

	/**
	 * Method equals.
	 * 
	 * @param o
	 *            Object
	 * 
	 * @return boolean
	 */
	@Override
	public boolean equals(Object o) {
		boolean result = false;

		if ((o instanceof Cases)) {
			Cases oQuad = (Cases) o;
			result = this.locked == oQuad.locked;
			result = (result)
					&& (Arrays.deepEquals(this.patterns, oQuad.patterns));
		} else {
			result = false;
		}

		return result;
	}

	/**
	 * Method hashCode.
	 * 
	 * 
	 * @return int
	 */
	@Override
	public int hashCode() {
		return Arrays.hashCode(this.patterns);
	}

	/**
	 * Method matchDegrees.
	 * 
	 * @param quad
	 *            Cases
	 * 
	 * @return int
	 */
	public int matchDegrees(Cases quad) {
		int matchDegrees = 0;

		for (int rot = 0; rot < 4; rot++) {
			int degrees = 0;
			for (int a = 0; a < 4; a++) {
				Pieces pat1 = this.patterns[((a + rot) % 4)];
				Pieces pat2 = quad.patterns[a];
				if ((pat1 == null) || (pat2 == null) || (pat1 == pat2)) {
					degrees++;
				}
			}

			matchDegrees = Math.max(matchDegrees, degrees);
		}

		return matchDegrees;
	}

	/**
	 * Method matches.
	 * 
	 * @param quad
	 *            Cases
	 * 
	 * @return boolean
	 */
	public boolean matches(Cases quad) {
		boolean result = true;

		for (int a = 0; (result) && (a < 4); a++) {
			Pieces pat1 = this.patterns[a];
			Pieces pat2 = quad.patterns[a];
			if ((pat1 != null) && (pat2 != null) && (pat1 != pat2)) {
				result = false;
			}
		}

		return result;
	}

	/**
	 * Method matchesBackground.
	 * 
	 * @param quad
	 *            Cases
	 * 
	 * @return boolean
	 */
	public boolean matchesBackground(Cases quad) {
		boolean result = true;

		for (int a = 0; (result) && (a < 4); a++) {
			Pieces pat1 = this.patterns[a];
			Pieces pat2 = quad.patterns[a];
			if ((pat1 != null) && (pat2 != null)
					&& (pat1.getPatternBg() != pat2.getPatternBg())) {
				result = false;
			}
		}

		return result;
	}

	/**
	 * Method equalsIgnoreRotation.
	 * 
	 * @param quad
	 *            Cases
	 * 
	 * @return boolean
	 */
	public boolean equalsIgnoreRotation(Cases quad) {
		return equalsIgnoreRotation(quad, 4);
	}

	/**
	 * Method equalsIgnoreRotation.
	 * 
	 * @param quad
	 *            Cases
	 * @param degrees
	 *            int
	 * 
	 * @return boolean
	 */
	public boolean equalsIgnoreRotation(Cases quad, int degrees) {
		return matchDegrees(quad) >= degrees;
	}

	/**
	 * Method toString.
	 * 
	 * 
	 * @return String
	 */
	@Override
	public String toString() {
		return "Q[" + getPattern(0) + "," + getPattern(1) + "," + getPattern(2)
				+ "," + getPattern(3) + "]";
	}

	public void flipHorizontal() {
		assert (!this.readOnly);

		Pieces w = this.patterns[3];
		this.patterns[3] = this.patterns[1];
		this.patterns[1] = w;
	}

	public void flipVertical() {
		assert (!this.readOnly);

		Pieces n = this.patterns[0];
		this.patterns[0] = this.patterns[2];
		this.patterns[2] = n;
	}

	/**
	 * Method setReadOnly.
	 * 
	 * @param readOnly
	 *            boolean
	 */
	public void setReadOnly(boolean readOnly) {
		this.readOnly = readOnly;
	}

	/**
	 * Method save.
	 * 
	 * 
	 * @return String
	 */
	public String save() {
		return String.format(
				"%d %d %d %d",
				new Object[] { Integer.valueOf(getPattern(0).getCode()),
						Integer.valueOf(getPattern(1).getCode()),
						Integer.valueOf(getPattern(2).getCode()),
						Integer.valueOf(getPattern(3).getCode()) });
	}

	/**
	 * Method load.
	 * 
	 * @param text
	 *            String
	 */
	public void load(String text) {
		String[] patternStrings = text.split(" ");
		for (int i = 0; i < 4; i++) {
			int patternCode = Integer.parseInt(patternStrings[i]);
			Pieces pattern = Pieces.getPatternByCode(patternCode);
			setPattern(i, pattern);
		}
	}
}
