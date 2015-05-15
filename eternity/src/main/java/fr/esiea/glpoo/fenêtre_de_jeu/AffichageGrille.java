package fenêtre_de_jeu;

import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

import création_pièces_terrain.Terrain;
import création_pièces_terrain.GridObserver;
import création_pièces_terrain.Cases;

// TODO from UCDetector: Change visibility of Class "GridView" to default - May cause compile errors!
/**
 * @author ange__000
 * @version $Revision: 1.0 $
 */
public class AffichageGrille extends JPanel implements GridObserver, // NO_UCD
																		// (use
		// default)
		EditableStatusProvider, GridLocalizable {
	private static final long serialVersionUID = 1L;
	private Terrain gridModel;
	private List<AffichageCases> affichageCases;
	private boolean editable = true;
	private Set<EditableStatusListener> editableListeners;
	private JPopupMenu popup;
	private Cases selectedQuad = null;

	// TODO from UCDetector: Change visibility of Constructor
	// "GridView.GridView(GridModel)" to default
	/**
	 * Constructor for AffichageGrille.
	 * 
	 * @param grid
	 *            Terrain
	 */
	public AffichageGrille(Terrain grid) { // NO_UCD (use default)
		this.gridModel = grid;
		this.affichageCases = new ArrayList<AffichageCases>();
		this.editableListeners = new HashSet<EditableStatusListener>();

		this.popup = new JPopupMenu();

		setLayout(new GridLayout(this.gridModel.getSize(),
				this.gridModel.getSize()));
		updateStructure();
		this.gridModel.addGridObserver(this);
		setBorder(BorderFactory.createEtchedBorder());
	}

	/**
	 * Method addEditableStatusListener.
	 * 
	 * @param listener
	 *            EditableStatusListener
	
	 * @see fenêtre_de_jeu.EditableStatusProvider#addEditableStatusListener(EditableStatusListener) */
	@Override
	public void addEditableStatusListener(EditableStatusListener listener) {
		this.editableListeners.add(listener);
	}

	/**
	 * Method removeEditableStatusListener.
	 * 
	 * @param listener
	 *            EditableStatusListener
	 */
	public void removeEditableStatusListener(EditableStatusListener listener) {
		this.editableListeners.remove(listener);
	}

	private void notifyEditableStatusUpdated() {
		for (EditableStatusListener listener : this.editableListeners)
			listener.editableStatusUpdated(this.editable);
	}

	/**
	 * Method getGridModel.
	 * 
	
	 * @return Terrain */
	public Terrain getGridModel() {
		return this.gridModel;
	}

	private void updateStructure() {
		setLayout(new GridLayout(this.gridModel.getSize(),
				this.gridModel.getSize()));

		removeAll();
		this.affichageCases.clear();

		for (Cases quad : this.gridModel.getQuads()) {
			AffichageCases affichageCases = new AffichageCases(quad);
			affichageCases.setEditable(this.editable);
			affichageCases.setComponentPopupMenu(this.popup);
			this.affichageCases.add(affichageCases);
			affichageCases.addMouseMotionListener(new QuadSelectionUpdater(quad));
			add(affichageCases);
		}
		doLayout();
	}

	/**
	 * Method gridSizeUpdated.
	 * 
	 * @param size
	 *            int
	
	 * @see création_pièces_terrain.GridObserver#gridSizeUpdated(int) */
	@Override
	public void gridSizeUpdated(int size) {
		updateStructure();
		repaint();
	}

	/**
	 * Method gridUpdated.
	 * 
	 * @see création_pièces_terrain.GridObserver#gridUpdated()
	 */
	@Override
	public void gridUpdated() {
		repaint();
	}

	/**
	 * Method getQuadViews.
	 * 
	
	 * @return List<AffichageCases> */
	public List<AffichageCases> getQuadViews() {
		return this.affichageCases;
	}

	/**
	 * Method setEditable.
	 * 
	 * @param editable
	 *            boolean
	 */
	public void setEditable(boolean editable) {
		this.editable = editable;

		for (AffichageCases quad : this.affichageCases) {
			quad.setEditable(editable);
		}
		notifyEditableStatusUpdated();
	}

	/**
	 * Method isEditable.
	 * 
	
	 * @return boolean */
	public boolean isEditable() {
		return this.editable;
	}

	
	/**
	 * Method getSelectedQuad.
	 * 
	
	
	 * @return Cases * @see fenêtre_de_jeu.GridLocalizable#getSelectedQuad() */
	@Override
	public Cases getSelectedQuad() {
		return this.selectedQuad;
	}

	/**
	 * @author ange__000
	 * @version $Revision: 1.0 $
	 */
	private class QuadSelectionUpdater implements MouseMotionListener {
		private Cases quad;

		/**
		 * Constructor for QuadSelectionUpdater.
		 * 
		 * @param quad
		 *            Cases
		 */
		public QuadSelectionUpdater(Cases quad) {
			this.quad = quad;
		}

		/**
		 * Method mouseDragged.
		 * 
		 * @param e
		 *            MouseEvent
		
		 * @see java.awt.event.MouseMotionListener#mouseDragged(MouseEvent) */
		@Override
		public void mouseDragged(MouseEvent e) {
			updateSelectedQuad();
		}

		/**
		 * Method mouseMoved.
		 * 
		 * @param e
		 *            MouseEvent
		
		 * @see java.awt.event.MouseMotionListener#mouseMoved(MouseEvent) */
		@Override
		public void mouseMoved(MouseEvent e) {
			updateSelectedQuad();
		}

		private void updateSelectedQuad() {
			AffichageGrille.this.selectedQuad = this.quad;
		}
	}
}