package options_du_jeu;

/**
 * @author ange__000
 * @version $Revision: 1.0 $
 */
public class LancerActionEnArrierePlan {
	/**
	 * Method run.
	 * @param action Runnable
	 */
	public static void run(Runnable action) {
		Thread thread = new SynchronizedThread(action);
		thread.start();
	}

	/**
	 * @author ange__000
	 * @version $Revision: 1.0 $
	 */
	private static class SynchronizedThread extends Thread {
		private Runnable action;

		/**
		 * Constructor for SynchronizedThread.
		 * @param action Runnable
		 */
		public SynchronizedThread(Runnable action) {
			this.action = action;
		}

		/**
		 * Method run.
		 * @see java.lang.Runnable#run()
		 */
		@Override
		public void run() {
			synchronized (ActionLockFactory.getActionLock()) {
				this.action.run();
			}
		}
	}
}