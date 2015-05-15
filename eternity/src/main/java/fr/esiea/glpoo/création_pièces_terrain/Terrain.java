package création_pièces_terrain;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.regex.Matcher;

/**
 * @author ange__000
 * @version $Revision: 1.0 $
 */
public class Terrain extends AbstractQuadGrid implements Cloneable {
	private static final long serialVersionUID = 1L;
	private boolean readOnly;
	private Set<GridObserver> gridObservers = new HashSet<GridObserver>();
	private Pieces defaultpat;

	public Terrain() {
		this(2);
	}

	/**
	 * Constructor for Terrain.
	 * 
	 * @param size
	 *            int
	 */
	public Terrain(int size) {
		super(size, size);
		this.defaultpat = Pieces.getDefaultPattern();
		this.readOnly = false;
	}

	/**
	 * Method setReadOnly.
	 * 
	 * @param readOnly
	 *            boolean
	 */
	public void setReadOnly(boolean readOnly) {
		this.readOnly = readOnly;
		for (Cases quad : this.gridQuads)
			quad.setReadOnly(readOnly);
	}

	/**
	 * Method clone.
	 * 
	 * 
	 * @return Terrain
	 */
	@Override
	public Terrain clone() {
		Terrain newgrid = new Terrain(getSize());

		for (int i = 0; i < this.gridQuads.size(); i++) {
			newgrid.gridQuads.set(i, this.gridQuads.get(i).clone());
		}

		return newgrid;
	}

	/**
	 * Method getSize.
	 * 
	 * 
	 * @return int
	 */
	public int getSize() {
		return super.getWidth();
	}

	/**
	 * Method setSize.
	 * 
	 * @param size
	 *            int
	 */
	public void setSize(int size) {
		assert (!this.readOnly);

		super.setSize(size, size);
		notifyGridSizeUpdated();
	}

	/**
	 * Method copyTo.
	 * 
	 * @param destGrid
	 *            Terrain
	 */
	public void copyTo(Terrain destGrid) {
		if (destGrid.getSize() != getSize()) {
			destGrid.setSize(getSize());
		}

		for (int i = 0; i < this.gridQuads.size(); i++) {
			getQuad(i).copyTo(destGrid.getQuad(i), false);
		}

		destGrid.notifyGridUpdated();
	}

	public void reset() {
		assert (!this.readOnly);

		for (Cases quad : this.gridQuads)
			quad.clear();
	}

	public void shuffle() {
		assert (!this.readOnly);

		Random rand = new Random();

		for (int i = 0; i < getSize() * getSize(); i++) {
			int swap_pos = rand.nextInt(getSize() * getSize());
			int rotations = rand.nextInt(4);
			Cases quad = this.gridQuads.get(i);
			Cases target = this.gridQuads.get(swap_pos);

			if ((!quad.isLocked()) && (!target.isLocked())) {
				quad.rotateClockwise(rotations);
				quad.swap(target);
			}
		}
	}

	/**
	 * Method addGridObserver.
	 * 
	 * @param observer
	 *            GridObserver
	 */
	public void addGridObserver(GridObserver observer) {
		this.gridObservers.add(observer);
	}

	/**
	 * Method removeGridObserver.
	 * 
	 * @param observer
	 *            GridObserver
	 */
	public void removeGridObserver(GridObserver observer) {
		this.gridObservers.remove(observer);
	}

	/**
	 * Method isComplete.
	 * 
	 * 
	 * @return boolean
	 */
	public boolean isComplete() {
		return countPairs() == countConnections();
	}

	/**
	 * Method countConnections.
	 * 
	 * 
	 * @return int
	 */
	@Override
	public int countConnections() {
		return 2 * getSize() * (getSize() - 1);
	}

	/**
	 * Method countPairs.
	 * 
	 * 
	 * @return int
	 */
	public int countPairs() {
		int pairs = 0;

		for (int y = 0; y < getSize(); y++) {
			for (int x = 0; x < getSize(); x++) {
				Cases quad = getQuad(x, y);

				if (x < getSize() - 1) {
					Cases eastquad = getQuad(x + 1, y);
					Pieces eastpat = quad.getPattern(1);

					if ((eastpat != this.defaultpat)
							&& (eastpat == eastquad.getPattern(3))) {
						pairs++;
					}
				}

				if (y < getSize() - 1) {
					Cases southquad = getQuad(x, y + 1);
					Pieces southpat = quad.getPattern(2);

					if ((southpat != this.defaultpat)
							&& (southpat == southquad.getPattern(0))) {
						pairs++;
					}
				}
			}
		}

		return pairs;
	}

	/**
	 * Method countPairs.
	 * 
	 * @param index
	 *            int
	 * 
	 * @return int
	 */
	public int countPairs(int index) {
		return countPairs(index % getSize(), index / getSize());
	}

	/**
	 * Method countPairs.
	 * 
	 * @param x
	 *            int
	 * @param y
	 *            int
	 * 
	 * @return int
	 */
	public int countPairs(int x, int y) {
		return countPairs(x, y, 1);
	}

	/**
	 * Method countPairs.
	 * 
	 * @param x
	 *            int
	 * @param y
	 *            int
	 * @param borderweight
	 *            int
	 * 
	 * @return int
	 */
	public int countPairs(int x, int y, int borderweight) {
		if ((x < 0) || (x >= getSize()) || (y < 0) || (y >= getSize())) {
			return 0;
		}

		int pairs = 0;
		Cases quad = getQuad(x, y);

		if (x == 0) {
			if (quad.getPattern(3) == this.defaultpat)
				pairs += borderweight;
		} else {
			Cases westquad = getQuad(x - 1, y);
			Pieces westpat = quad.getPattern(3);

			if ((westpat != this.defaultpat)
					&& (westpat == westquad.getPattern(1))) {
				pairs++;
			}
		}

		if (x < getSize() - 1) {
			Cases eastquad = getQuad(x + 1, y);
			Pieces eastpat = quad.getPattern(1);

			if ((eastpat != this.defaultpat)
					&& (eastpat == eastquad.getPattern(3))) {
				pairs++;
			}
		} else if (quad.getPattern(1) == this.defaultpat) {
			pairs += borderweight;
		}

		if (y == 0) {
			if (quad.getPattern(0) == this.defaultpat)
				pairs += borderweight;
		} else {
			Cases northquad = getQuad(x, y - 1);
			Pieces northpat = quad.getPattern(0);

			if ((northpat != this.defaultpat)
					&& (northpat == northquad.getPattern(2))) {
				pairs++;
			}
		}

		if (y < getSize() - 1) {
			Cases southquad = getQuad(x, y + 1);
			Pieces southpat = quad.getPattern(2);

			if ((southpat != this.defaultpat)
					&& (southpat == southquad.getPattern(0))) {
				pairs++;
			}
		} else if (quad.getPattern(2) == this.defaultpat) {
			pairs += borderweight;
		}

		return pairs;
	}

	/**
	 * Method countOccurences.
	 * 
	 * @param pattern
	 *            Pieces
	 * 
	 * @return int
	 */
	public int countOccurences(Pieces pattern) {
		int occurences = 0;

		for (Cases quad : this.gridQuads) {
			if (quad.getPattern(0) == pattern) {
				occurences++;
			}
			if (quad.getPattern(2) == pattern) {
				occurences++;
			}
			if (quad.getPattern(1) == pattern) {
				occurences++;
			}
			if (quad.getPattern(3) == pattern) {
				occurences++;
			}
		}

		return occurences;
	}

	/**
	 * Method countOpenOccurences.
	 * 
	 * @param pattern
	 *            Pieces
	 * 
	 * @return int
	 */
	public int countOpenOccurences(Pieces pattern) {
		int result = 0;

		for (int y = 0; y < getSize(); y++) {
			for (int x = 0; x < getSize(); x++) {
				Cases quad = getQuad(x, y);
				Cases quad_n = getQuad(x, y - 1);
				Cases quad_e = getQuad(x + 1, y);
				Cases quad_s = getQuad(x, y + 1);
				Cases quad_w = getQuad(x - 1, y);
				if ((quad.getPattern(0) == pattern) && (quad_n != null)
						&& (quad_n.isClear())) {
					result++;
				}

				if ((quad.getPattern(1) == pattern) && (quad_e != null)
						&& (quad_e.isClear())) {
					result++;
				}

				if ((quad.getPattern(2) == pattern) && (quad_s != null)
						&& (quad_s.isClear())) {
					result++;
				}

				if ((quad.getPattern(3) == pattern) && (quad_w != null)
						&& (quad_w.isClear())) {
					result++;
				}
			}
		}

		return result;
	}

	/**
	 * Method getStatusMessage.
	 * 
	 * 
	 * @return String
	 */
	public String getStatusMessage() {
		String message = null;

		List<Pieces> allpatterns = Pieces.getAllPatterns();

		for (Pieces pattern : allpatterns) {
			int occurences = countOccurences(pattern);

			if (pattern == Pieces.getDefaultPattern()) {
				int desired = 4 * getSize();

				if (occurences < desired)
					message = "Too few border tiles";
				else if (occurences > desired) {
					message = "Too many border tiles";
				}
			} else if (occurences % 2 == 1) {
				message = "Odd amount of pat. " + pattern.getCode();
			}

		}

		if (message == null) {
			message = "Ok";
		}

		return message;
	}

	/**
	 * Method fromQuadString.
	 * 
	 * @param text
	 *            String
	 * 
	 * @throws GestionExceptionCases
	 */
	public void fromQuadString(String text) throws GestionExceptionCases {
		assert (!this.readOnly);

		text = stripComments(text);

		StringTokenizer stok = new StringTokenizer(text);
		int patternCount = countTextPatterns(text);
		double gridsize = Math.sqrt(patternCount / 4); // $codepro.audit.disable
														// integerDivisionInFloatingPointExpression
		if ((gridsize != Math.round(gridsize)) || (gridsize < 2.0D)) {
			throw new GestionExceptionCases("Inconsistent grid size. "
					+ patternCount + " values found instead of n * n * 4");
		}
		int i_gridsize = (int) Math.round(gridsize);
		int ix_quad = 0;
		int ix_dir = 0;
		boolean lock = false;
		List<Cases> quadbuffer = new ArrayList<Cases>();
		while ((stok.hasMoreTokens()) && (ix_quad < i_gridsize * i_gridsize)) {
			String token = stok.nextToken();
			if (token.contains("[")) {
				lock = true;
				token = token.replaceAll("\\[", "");
			}

			if (token.contains("]")) {
				lock = false;
				token = token.replaceAll("\\]", "");
			}

			if (token.length() > 0) {
				int pattern_code;
				try {
					pattern_code = Integer.parseInt(token);
				} catch (NumberFormatException ex) {
					throw new GestionExceptionCases("Incorrect number format '"
							+ token + "'");
				}

				Pieces pattern = Pieces.getPatternByCode(pattern_code);

				if (pattern == null) {
					throw new GestionExceptionCases("Unknown pattern code "
							+ pattern_code);
				}
				while (ix_quad >= quadbuffer.size()) {
					Cases quad = new Cases();
					quad.setLocked(lock);
					quadbuffer.add(quad);
				}
				if (pattern != null) {
					quadbuffer.get(ix_quad).setPattern(ix_dir, pattern);
					ix_dir++;
					if (ix_dir == 4) {
						ix_dir = 0;
						ix_quad++;
					}
				}
			}
		}
		setSize(i_gridsize);
		for (int qi = 0; qi < quadbuffer.size(); qi++)
			quadbuffer.get(qi).copyTo(this.gridQuads.get(qi));
	}

	/**
	 * Method stripComments.
	 * 
	 * @param text
	 *            String
	 * 
	 * @return String
	 */
	private String stripComments(String text) {
		text = text.replace('\r', '\n');
		java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(
				"#.*[\n]", 8);
		Matcher matcher = pattern.matcher(text);
		text = matcher.replaceAll("");
		return text;
	}

	/**
	 * Method countTextPatterns.
	 * 
	 * @param text
	 *            String
	 * 
	 * @return int
	 */
	private static int countTextPatterns(String text) {
		StringTokenizer stok = new StringTokenizer(text, "\n \t[]");
		return stok.countTokens();
	}

	private void notifyGridSizeUpdated() {
		for (GridObserver observer : this.gridObservers)
			observer.gridSizeUpdated(getSize());
	}

	private void notifyGridUpdated() {
		for (GridObserver observer : this.gridObservers)
			observer.gridUpdated();
	}

	/**
	 * Method optimizeQuadRotation.
	 * 
	 * @param index
	 *            int
	 * 
	 * @return int
	 */
	public int optimizeQuadRotation(int index) {
		assert (!this.readOnly);

		int bestOrientation = 0;
		int best_pairs = 0;
		int x = index % getSize();
		int y = index / getSize();

		Cases quad = getQuad(index);

		for (int i = 0; i < 4; i++) {
			int pairs = countPairs(x, y, 4);

			if (pairs > best_pairs) {
				best_pairs = pairs;
				bestOrientation = i;
			}

			quad.rotateClockwise();
		}

		quad.rotateClockwise(bestOrientation);

		return bestOrientation;
	}

	/**
	 * Method swap.
	 * 
	 * @param indexA
	 *            int
	 * @param indexB
	 *            int
	 */
	public void swap(int indexA, int indexB) {
		assert (!this.readOnly);

		Cases quadA = getQuad(indexA);
		Cases quadB = getQuad(indexB);

		Cases buffer = new Cases();
		quadA.copyTo(buffer);
		quadB.copyTo(quadA);
		buffer.copyTo(quadB);
	}

	/**
	 * Method getMissingQuad.
	 * 
	 * @param index
	 *            int
	 * 
	 * @return Cases
	 */
	public Cases getMissingQuad(int index) {
		int x = index % getSize();
		int y = index / getSize();
		return getMissingQuad(x, y);
	}

	/**
	 * Method getMissingQuad.
	 * 
	 * @param x
	 *            int
	 * @param y
	 *            int
	 * 
	 * @return Cases
	 */
	public Cases getMissingQuad(int x, int y) {
		Cases quad = new Cases();

		for (int d = 0; d < 4; d++) {
			Cases neighbor = getNeighbor(x, y, d);
			Pieces missingPattern;

			if (neighbor == null) {
				missingPattern = this.defaultpat;
			} else {
				int oppD = (d + 2) % 4;
				missingPattern = neighbor.getPattern(oppD);

				if (missingPattern == this.defaultpat) {
					missingPattern = null;
				}
			}

			quad.setPattern(d, missingPattern);
		}

		return quad;
	}

	/**
	 * Method getMatchingQuads.
	 * 
	 * @param missing
	 *            Cases
	 * @param degrees
	 *            int
	 * 
	 * @return List<Integer>
	 */
	public List<Integer> getMatchingQuads(Cases missing, int degrees) {
		List<Integer> matches = new ArrayList<Integer>();
		int sides = missing.countPattern(this.defaultpat);

		for (int i = 0; i < this.gridQuads.size(); i++) {
			Cases q = this.gridQuads.get(i);
			if ((q.equalsIgnoreRotation(missing, degrees))
					&& (q.countPattern(this.defaultpat) == sides)) {
				matches.add(Integer.valueOf(i));
			}
		}
		return matches;
	}

	/**
	 * Method isHSymetric.
	 * 
	 * 
	 * @return boolean
	 */
	public boolean isHSymetric() {
		Terrain g2 = clone();
		g2.flipHorizontal();
		return equals(g2);
	}

	/**
	 * Method isVSymetric.
	 * 
	 * 
	 * @return boolean
	 */
	public boolean isVSymetric() {
		Terrain g2 = clone();
		g2.flipVertical();
		return equals(g2);
	}

	/**
	 * Method isRSymetric.
	 * 
	 * 
	 * @return boolean
	 */
	public boolean isRSymetric() {
		Terrain g2 = clone();
		g2.rotateClockwise();
		return equals(g2);
	}

	/**
	 * Method countExternalBorders.
	 * 
	 * @param index
	 *            int
	 * 
	 * @return int
	 */
	public int countExternalBorders(int index) {
		int borders = countExternalBorders(index % getSize(), index / getSize());
		return borders;
	}

	/**
	 * Method countExternalBorders.
	 * 
	 * @param x
	 *            int
	 * @param y
	 *            int
	 * 
	 * @return int
	 */
	public int countExternalBorders(int x, int y) {
		int borders = 0;

		if ((x == 0) || (x == getSize() - 1)) {
			borders++;
		}

		if ((y == 0) || (y == getSize() - 1)) {
			borders++;
		}

		return borders;
	}

	/**
	 * Method rotateClockwise.
	 * 
	 * @param steps
	 *            int
	 */
	public void rotateClockwise(int steps) {
		assert (!this.readOnly);

		for (int i = 0; i < steps; i++)
			rotateClockwise();
	}

	/**
	 * Method rotateCounterclockwise.
	 * 
	 * @param steps
	 *            int
	 */
	public void rotateCounterclockwise(int steps) {
		assert (!this.readOnly);

		for (int i = 0; i < steps; i++)
			rotateCounterclockwise();
	}

	public void rotateCounterclockwise() {
		assert (!this.readOnly);
		rotateClockwise(3);
	}

	public void rotateClockwise() {
		assert (!this.readOnly);

		List<Cases> originalQuads = new ArrayList<Cases>();
		for (Cases quad : this.gridQuads) {
			originalQuads.add(quad.clone());
		}

		for (int y = 0; y < getSize(); y++)
			for (int x = 0; x < getSize(); x++) {
				Cases source = originalQuads.get(x + getSize() * y);
				Cases destination = this.gridQuads.get(getSize() - 1 - y
						+ getSize() * x);
				source.copyTo(destination);
				destination.rotateClockwise();
			}
	}

	/**
	 * Method rotateCenterClockwise.
	 * 
	 * @param steps
	 *            int
	 */
	public void rotateCenterClockwise(int steps) {
		assert (!this.readOnly);

		for (int i = 0; i < steps; i++)
			rotateCenterClockwise();
	}

	public void rotateCenterClockwise() {
		assert (!this.readOnly);

		List<Cases> originalQuads = new ArrayList<Cases>();
		for (Cases quad : this.gridQuads) {
			originalQuads.add(quad.clone());
		}

		for (int y = getSize() / 2 - 1; y <= (getSize() + 1) / 2; y++)
			for (int x = getSize() / 2 - 1; x <= (getSize() + 1) / 2; x++) {
				Cases source = originalQuads.get(x + getSize() * y);
				Cases destination = this.gridQuads.get(getSize() - 1 - y
						+ getSize() * x);
				source.copyTo(destination);
				destination.rotateClockwise();
			}
	}

	/**
	 * Method rotateCenterCounterclockwise.
	 * 
	 * @param steps
	 *            int
	 */
	public void rotateCenterCounterclockwise(int steps) {
		assert (!this.readOnly);

		for (int i = 0; i < steps; i++)
			rotateCenterCounterclockwise();
	}

	public void rotateCenterCounterclockwise() {
		assert (!this.readOnly);
		rotateCenterClockwise(3);
	}

	public void flipVertical() {
		assert (!this.readOnly);
		rotateClockwise();
		flipHorizontal();
		rotateCounterclockwise();
	}

	public void flipHorizontal() {
		assert (!this.readOnly);
		List<Cases> originalQuads = new ArrayList<Cases>();
		for (Cases quad : this.gridQuads) {
			originalQuads.add(quad.clone());
		}

		int size = getSize();

		for (int y = 0; y < size; y++)
			for (int x = 0; x < size; x++) {
				Cases source = originalQuads.get(x + size * y);
				Cases destination = this.gridQuads.get(size - 1 - x + size * y);
				source.copyTo(destination);
				destination.flipHorizontal();
			}
	}

	/**
	 * Method sort.
	 * 
	 * @param reference
	 *            Cases
	 */
	public void sort(Cases reference) {
		Comparator<Cases> comparator = new ComparerCases(reference);
		sort(comparator);
	}

	/**
	 * Method sort.
	 * 
	 * @param comparator
	 *            Comparator<Cases>
	 */
	public void sort(Comparator<Cases> comparator) {
		boolean updated = true;

		while (updated) {
			updated = false;

			for (int i = 0; i < this.gridQuads.size() - 1; i++) {
				Cases a = this.gridQuads.get(i);
				Cases b = this.gridQuads.get(i + 1);

				if (comparator.compare(a, b) > 0) {
					a.swap(b);
					updated = true;
				}
			}
		}
	}

	/**
	 * Method getPiecesStats.
	 * 
	 * @return PiecesStats
	 */

}
