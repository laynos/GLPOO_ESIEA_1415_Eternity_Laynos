package création_pièces_terrain;

import java.util.Comparator;

/**
 * @author ange__000
 * @version $Revision: 1.0 $
 */
public class ComparerCases implements Comparator<Cases> {
	private Cases referenceQuad;
	private boolean inverted;

	/**
	 * Constructor for QuadMatchingComparator.
	 * 
	 * @param reference
	 *            Cases
	 */
	public ComparerCases(Cases reference) {
		this(reference, false);
	}

	/**
	 * Constructor for QuadMatchingComparator.
	 * 
	 * @param reference
	 *            Cases
	 * @param inverted
	 *            boolean
	 */
	public ComparerCases(Cases reference, boolean inverted) {
		this.referenceQuad = reference.clone();
		this.inverted = inverted;
	}

	/**
	 * Method compare.
	 * 
	 * @param q1
	 *            Cases
	 * @param q2
	 *            Cases
	
	 * @return int */
	@Override
	public int compare(Cases q1, Cases q2) {
		int result = 0;

		int def1 = this.referenceQuad.countDefaultPattern()
				- q1.countDefaultPattern();
		int def2 = this.referenceQuad.countDefaultPattern()
				- q2.countDefaultPattern();

		if ((def1 != 0) || (def2 != 0)) {
			if ((def1 != 0) && (def2 == 0))
				result = 1;
			else if ((def1 == 0) && (def2 != 0)) {
				result = -1;
			} else if (def1 > def2)
				result = 1;
			else {
				result = -1;
			}

		}

		if (result == 0) {
			int matches1 = this.referenceQuad.matchDegrees(q1);
			int matches2 = this.referenceQuad.matchDegrees(q2);
			result = matches2 - matches1;
		}

		if (result == 0) {
			int patScore1 = computePatternScore(q1);
			int patScore2 = computePatternScore(q2);
			result = patScore2 - patScore1;
		}

		if (this.inverted) {
			result = -result;
		}
		return result;
	}

	/**
	 * Method computePatternScore.
	 * 
	 * @param q
	 *            Cases
	
	 * @return int */
	private int computePatternScore(Cases q) {
		int score = 0;

		for (int i = 0; i < 4; i++) {
			Pieces pat = q.getPattern(i);

			for (int j = 0; j < 4; j++) {
				Pieces refPat = this.referenceQuad.getPattern(j);
				if (refPat == pat) {
					score++;
				}
			}
		}

		return score;
	}
}