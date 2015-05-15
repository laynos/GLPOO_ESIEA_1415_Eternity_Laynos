package options_du_jeu;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * The class <code>TestAll</code> builds a suite that can be used to run all
 * of the tests within its package as well as within any subpackages of its
 * package.
 *
 * @generatedBy CodePro at 15/05/15 23:08
 * @author ange__000
 * @version $Revision: 1.0 $
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	EnregistrerSousTest.class,
	ResetJeuTest.class,
	MelangerPiecesTest.class,
	ActionLockFactoryTest.class,
	MAJGrilleTest.class,
	QuitterJeuTest.class,
	RemplirGrilleDuCentreTest.class,
	GridActionTest.class,
	RemplirGrilleDuBordTest.class,
	LancerActionEnArrierePlanTest.class,
	OuvrirFichierTest.class,
	RemplirGrilleTest.class,
	FairePivoterPiecesTest.class,
	NouveauJeuTest.class,
	AboutActionTest.class,
	ChargerTerrainTest.class,
	FaireTournerPiecesTest.class,
	RedimensionnerTerrainTest.class,
})
public class TestAll {

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 15/05/15 23:08
	 */
	public static void main(String[] args) {
		JUnitCore.runClasses(new Class[] { TestAll.class });
	}
}
