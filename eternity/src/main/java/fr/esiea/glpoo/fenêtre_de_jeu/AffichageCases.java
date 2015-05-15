package fenêtre_de_jeu;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.dnd.DragGestureEvent;
import java.awt.dnd.DragGestureListener;
import java.awt.dnd.DragSource;
import java.awt.dnd.DragSourceDragEvent;
import java.awt.dnd.DragSourceDropEvent;
import java.awt.dnd.DragSourceEvent;
import java.awt.dnd.DragSourceListener;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.Dimension2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;

import création_pièces_terrain.Cases;
import création_pièces_terrain.QuadObserver;

/**
 * @author ange__000
 * @version $Revision: 1.0 $
 */
public class AffichageCases extends JComponent implements QuadObserver,
		MouseListener, MouseWheelListener, MouseMotionListener,
		DragGestureListener, DragSourceListener, DropTargetListener,
		KeyListener {
	private static final Color COLOR_UNLOCKED = Color.RED;
	private static final Color COLOR_LOCKED = Color.YELLOW;
	private static final Color COLOR_ERROR = Color.BLACK;
	private static final Color COLOR_CURSOR = new Color(15923453);
	private static final long serialVersionUID = 1L;
	private Cases model;
	private boolean editable;
	private boolean showPatternIds;
	private boolean[] error = new boolean[4];

	private Integer cursor = null;
	private DragSource dragSource;
	private Point2D lastPoint = null;

	/**
	 * Constructor for AffichageCases.
	 * 
	 * @param model
	 *            Cases
	 */
	public AffichageCases(Cases model) {
		this.model = model;
		this.model.addQuadObserver(this);
		setEditable(true);
		setShowPatternIds(false);
		addMouseListener(this);
		addMouseWheelListener(this);
		addMouseMotionListener(this);
		addKeyListener(this);
		this.dragSource = DragSource.getDefaultDragSource();
		this.dragSource.createDefaultDragGestureRecognizer(this, 3, this);
		setDropTarget(new DropTarget(this, this));
		setFocusable(true);

		setError(0, false);
		setError(1, false);
		setError(3, false);
		setError(2, false);
	}

	/**
	 * Method setEditable.
	 * 
	 * @param editable
	 *            boolean
	 */
	public void setEditable(boolean editable) {
		this.editable = editable;
	}

	/**
	 * Method setShowPatternIds.
	 * 
	 * @param show
	 *            boolean
	 */
	public void setShowPatternIds(boolean show) {
		this.showPatternIds = show;
		repaint();
	}

	/**
	 * Method getShowPatternIds.
	 * 
	
	 * @return boolean */
	public boolean getShowPatternIds() {
		return this.showPatternIds;
	}

	// TODO from UCDetector: Change visibility of Method
	// "AffichageCases.setError(int,boolean)" to private
	/**
	 * Method setError.
	 * 
	 * @param direction
	 *            int
	 * @param error
	 *            boolean
	
	 * @see création_pièces_terrain.QuadObserver#setError(int, boolean) */
	@Override
	public void setError(int direction, boolean error) { // NO_UCD (use private)
		if (error != this.error[direction]) {
			this.error[direction] = error;
			repaint();
		}
	}

	// TODO from UCDetector: Change visibility of Method
	// "AffichageCases.setError(int,boolean)" to private
	/**
	 * Method getModel.
	 * 
	
	 * @return Cases */
	public Cases getModel() { // NO_UCD (use private)
		return this.model;
	}

	/**
	 * Method quadUpdated.
	 * 
	 * @see création_pièces_terrain.QuadObserver#quadUpdated()
	 */
	@Override
	public void quadUpdated() {
		repaint();
	}

	/**
	 * Method paint.
	 * 
	 * @param graphics
	 *            Graphics
	 */
	@Override
	public void paint(Graphics graphics) {
		Dimension2D size = getSize();
		double wd = size.getWidth();
		double ht = size.getHeight();
		double minsize = Math.min(wd, ht);
		Graphics2D g2d = (Graphics2D) graphics;

		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		double dx = wd / 2.0D;
		double dy = ht / 2.0D;
		Shape prev_clip = g2d.getClip();
		g2d.clip(new Rectangle2D.Double(0.0D, 0.0D, wd - 0.5D, ht - 0.5D));
		AffineTransform prev_trx = g2d.getTransform();

		g2d.translate(0.0D, -dy);
		this.model.getPattern(0).paint(g2d, size);
		g2d.translate(dx, dy);
		this.model.getPattern(1).paint(g2d, size);
		g2d.translate(-dx, dy);
		this.model.getPattern(2).paint(g2d, size);
		g2d.translate(-dx, -dy);
		this.model.getPattern(3).paint(g2d, size);

		g2d.setTransform(prev_trx);
		g2d.setClip(prev_clip);

		if (this.model.isLocked())
			g2d.setColor(COLOR_LOCKED);
		else {
			g2d.setColor(COLOR_UNLOCKED);
		}

		g2d.setStroke(new BasicStroke((float) (minsize / 50.0D)));
		g2d.draw(new Rectangle2D.Double(0.0D, 0.0D, wd, ht));

		g2d.draw(new Line2D.Double(0.0D, 0.0D, wd, ht));
		g2d.draw(new Line2D.Double(wd, 0.0D, 0.0D, ht));

		if ((this.cursor != null) && (this.editable)) {
			g2d.setColor(COLOR_CURSOR);
			if (this.cursor.intValue() == 5) {
				drawTriangle(g2d, dx, dy, wd, ht, 0);
				drawTriangle(g2d, dx, dy, wd, ht, 1);
				drawTriangle(g2d, dx, dy, wd, ht, 2);
				drawTriangle(g2d, dx, dy, wd, ht, 3);
			} else {
				drawTriangle(g2d, dx, dy, wd, ht, this.cursor.intValue());
			}
		}

		g2d.setColor(COLOR_ERROR);
		g2d.setStroke(new BasicStroke((float) (minsize / 20.0D)));
		for (int direction = 0; direction < 4; direction++) {
			if (!this.error[direction]) {

				drawTriangle(g2d, dx, dy, wd, ht, direction);
			}
		}

		if (this.showPatternIds) {
			Font font = new Font("SansSerif", 0, (int) (dy / 3.0D));
			g2d.setFont(font);

			g2d.setColor(Color.RED);
			drawPatternIds(g2d, dx, 1.0D, dy, 1.0D);
			g2d.setColor(Color.WHITE);
			drawPatternIds(g2d, dx, 0.0D, dy, 0.0D);
		}
	}

	/**
	 * Method drawPatternIds.
	 * 
	 * @param g2d
	 *            Graphics2D
	 * @param dx
	 *            double
	 * @param ox
	 *            double
	 * @param dy
	 *            double
	 * @param oy
	 *            double
	 */
	private void drawPatternIds(Graphics2D g2d, double dx, double ox,
			double dy, double oy) {
		drawPatternId(g2d,
				Integer.toString(this.model.getPattern(0).getCode()), dx + ox,
				0.3D * dy + oy);

		drawPatternId(g2d,
				Integer.toString(this.model.getPattern(2).getCode()), dx + ox,
				1.7D * dy + oy);

		drawPatternId(g2d,
				Integer.toString(this.model.getPattern(1).getCode()), 1.7D * dx
						+ ox, dy + oy);

		drawPatternId(g2d,
				Integer.toString(this.model.getPattern(3).getCode()), 0.3D * dx
						+ ox, dy + oy);
	}

	/**
	 * Method drawPatternId.
	 * 
	 * @param g2d
	 *            Graphics2D
	 * @param text
	 *            String
	 * @param x
	 *            double
	 * @param y
	 *            double
	 */
	private void drawPatternId(Graphics2D g2d, String text, double x, double y) {
		Rectangle2D bounds = g2d.getFont().getStringBounds(text,
				g2d.getFontRenderContext());
		g2d.drawString(text, (float) (x - bounds.getWidth() / 2.0D),
				(float) (y + bounds.getHeight() / 3.0D));
	}

	/**
	 * Method drawTriangle.
	 * 
	 * @param g2d
	 *            Graphics2D
	 * @param dx
	 *            double
	 * @param dy
	 *            double
	 * @param wd
	 *            double
	 * @param ht
	 *            double
	 * @param direction
	 *            int
	 */
	private void drawTriangle(Graphics2D g2d, double dx, double dy, double wd,
			double ht, int direction) {
		GeneralPath triangle = new GeneralPath();
		triangle.moveTo((float) dx, (float) dy);

		if (direction == 0) {
			triangle.lineTo(0.0F, 0.0F);
			triangle.lineTo((float) wd, 0.0F);
		} else if (direction == 1) {
			triangle.lineTo((float) wd, 0.0F);
			triangle.lineTo((float) wd, (float) ht);
		} else if (direction == 2) {
			triangle.lineTo((float) wd, (float) ht);
			triangle.lineTo(0.0F, (float) ht);
		} else if (direction == 3) {
			triangle.lineTo(0.0F, (float) ht);
			triangle.lineTo(0.0F, 0.0F);
		}

		triangle.lineTo((float) dx, (float) dy);

		g2d.draw(triangle);
	}

	/**
	 * Method mouseReleased.
	 * 
	 * @param event
	 *            MouseEvent
	
	 * @see java.awt.event.MouseListener#mouseReleased(MouseEvent) */
	@Override
	public void mouseReleased(MouseEvent event) {
		if (this.editable)
			switch (event.getButton()) {
			case 1:
				Point2D mouse = event.getPoint();
				this.model.rotatePattern(computeDirection(mouse));
				break;
			case 2:
				this.model.setLocked(!this.model.isLocked());
			}
	}

	/**
	 * Method mouseEntered.
	 * 
	 * @param arg0
	 *            MouseEvent
	
	 * @see java.awt.event.MouseListener#mouseEntered(MouseEvent) */
	@Override
	public void mouseEntered(MouseEvent arg0) {
		if (!hasFocus())
			requestFocus();
	}

	/**
	 * Method mouseExited.
	 * 
	 * @param arg0
	 *            MouseEvent
	
	 * @see java.awt.event.MouseListener#mouseExited(MouseEvent) */
	@Override
	public void mouseExited(MouseEvent arg0) {
		this.cursor = null;
		repaint();
	}

	/**
	 * Method mouseClicked.
	 * 
	 * @param arg0
	 *            MouseEvent
	
	 * @see java.awt.event.MouseListener#mouseClicked(MouseEvent) */
	@Override
	public void mouseClicked(MouseEvent arg0) {
	}

	/**
	 * Method mousePressed.
	 * 
	 * @param arg0
	 *            MouseEvent
	
	 * @see java.awt.event.MouseListener#mousePressed(MouseEvent) */
	@Override
	public void mousePressed(MouseEvent arg0) {
	}

	/**
	 * Method mouseDragged.
	 * 
	 * @param e
	 *            MouseEvent
	
	 * @see java.awt.event.MouseMotionListener#mouseDragged(MouseEvent) */
	@Override
	public void mouseDragged(MouseEvent e) {
	}

	/**
	 * Method mouseMoved.
	 * 
	 * @param e
	 *            MouseEvent
	
	 * @see java.awt.event.MouseMotionListener#mouseMoved(MouseEvent) */
	@Override
	public void mouseMoved(MouseEvent e) {
		Point point = e.getPoint();
		handleMouseHover(point, e.isShiftDown());
	}

	/**
	 * Method mouseWheelMoved.
	 * 
	 * @param e
	 *            MouseWheelEvent
	
	 * @see java.awt.event.MouseWheelListener#mouseWheelMoved(MouseWheelEvent) */
	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		if (this.editable)
			if (e.getWheelRotation() < 0)
				this.model.rotateClockwise();
			else
				this.model.rotateCounterclockwise();
	}

	/**
	 * Method keyPressed.
	 * 
	 * @param e
	 *            KeyEvent
	
	 * @see java.awt.event.KeyListener#keyPressed(KeyEvent) */
	@Override
	public void keyPressed(KeyEvent e) {
		if ((this.editable) && (this.cursor != null)) {
			switch (e.getKeyCode()) {
			case 39:
				if (this.cursor.intValue() == 5) {
					this.model.rotatePattern(0, true);
					this.model.rotatePattern(1, true);
					this.model.rotatePattern(2, true);
					this.model.rotatePattern(3, true);
				} else {
					this.model.rotatePattern(this.cursor.intValue(), true);
				}
				break;
			case 37:
				if (this.cursor.intValue() == 5) {
					this.model.rotatePattern(0, false);
					this.model.rotatePattern(1, false);
					this.model.rotatePattern(2, false);
					this.model.rotatePattern(3, false);
				} else {
					this.model.rotatePattern(this.cursor.intValue(), false);
				}
				break;
			}

			handleMouseHover(null, e.isShiftDown());
			repaint();
		}
	}

	/**
	 * Method keyReleased.
	 * 
	 * @param e
	 *            KeyEvent
	
	 * @see java.awt.event.KeyListener#keyReleased(KeyEvent) */
	@Override
	public void keyReleased(KeyEvent e) {
		handleMouseHover(null, e.isShiftDown());
	}

	/**
	 * Method keyTyped.
	 * 
	 * @param e
	 *            KeyEvent
	
	 * @see java.awt.event.KeyListener#keyTyped(KeyEvent) */
	@Override
	public void keyTyped(KeyEvent e) {
	}

	/**
	 * Method dragDropEnd.
	 * 
	 * @param dsde
	 *            DragSourceDropEvent
	
	 * @see java.awt.dnd.DragSourceListener#dragDropEnd(DragSourceDropEvent) */
	@Override
	public void dragDropEnd(DragSourceDropEvent dsde) {
		this.cursor = null;
		repaint();
	}

	/**
	 * Method dragEnter.
	 * 
	 * @param dsde
	 *            DragSourceDragEvent
	
	 * @see java.awt.dnd.DragSourceListener#dragEnter(DragSourceDragEvent) */
	@Override
	public void dragEnter(DragSourceDragEvent dsde) {
	}

	/**
	 * Method dragExit.
	 * 
	 * @param dse
	 *            DragSourceEvent
	
	 * @see java.awt.dnd.DragSourceListener#dragExit(DragSourceEvent) */
	@Override
	public void dragExit(DragSourceEvent dse) {
	}

	/**
	 * Method dragOver.
	 * 
	 * @param dsde
	 *            DragSourceDragEvent
	
	 * @see java.awt.dnd.DragSourceListener#dragOver(DragSourceDragEvent) */
	@Override
	public void dragOver(DragSourceDragEvent dsde) {
	}

	/**
	 * Method dropActionChanged.
	 * 
	 * @param dsde
	 *            DragSourceDragEvent
	
	 * @see java.awt.dnd.DragSourceListener#dropActionChanged(DragSourceDragEvent) */
	@Override
	public void dropActionChanged(DragSourceDragEvent dsde) {
	}

	/**
	 * Method dragEnter.
	 * 
	 * @param dtde
	 *            DropTargetDragEvent
	
	 * @see java.awt.dnd.DropTargetListener#dragEnter(DropTargetDragEvent) */
	@Override
	public void dragEnter(DropTargetDragEvent dtde) {
	}

	/**
	 * Method dragExit.
	 * 
	 * @param dte
	 *            DropTargetEvent
	
	 * @see java.awt.dnd.DropTargetListener#dragExit(DropTargetEvent) */
	@Override
	public void dragExit(DropTargetEvent dte) {
	}

	/**
	 * Method dragOver.
	 * 
	 * @param dtde
	 *            DropTargetDragEvent
	
	 * @see java.awt.dnd.DropTargetListener#dragOver(DropTargetDragEvent) */
	@Override
	public void dragOver(DropTargetDragEvent dtde) {
	}

	/**
	 * Method dropActionChanged.
	 * 
	 * @param dtde
	 *            DropTargetDragEvent
	
	 * @see java.awt.dnd.DropTargetListener#dropActionChanged(DropTargetDragEvent) */
	@Override
	public void dropActionChanged(DropTargetDragEvent dtde) {
	}

	/**
	 * Method handleMouseHover.
	 * 
	 * @param point
	 *            Point2D
	 * @param fullQuad
	 *            boolean
	 */
	private void handleMouseHover(Point2D point, boolean fullQuad) {
		if (point == null)
			point = this.lastPoint;
		else
			this.lastPoint = point;
		int cursor;
		if (fullQuad)
			cursor = 5;
		else {
			cursor = computeDirection(point);
		}

		if ((this.cursor == null) || (cursor != this.cursor.intValue())) {
			this.cursor = Integer.valueOf(cursor);
			repaint();
		}
	}

	/**
	 * Method computeDirection.
	 * 
	 * @param point
	 *            Point2D
	
	 * @return int */
	private int computeDirection(Point2D point) {
		Dimension2D size = getSize();
		Point2D relative = new Point2D.Double(point.getX() / size.getWidth(),
				point.getY() / size.getHeight());

		boolean ne = relative.getX() > relative.getY();
		boolean nw = relative.getX() + relative.getY() <= 1.0D;
		int direction;
		if (ne) {
			if (nw)
				direction = 0;
			else
				direction = 1;
		} else {
			if (nw)
				direction = 3;
			else {
				direction = 2;
			}
		}

		return direction;
	}

	/**
	 * Method dragGestureRecognized.
	 * 
	 * @param arg0
	 *            DragGestureEvent
	
	 * @see java.awt.dnd.DragGestureListener#dragGestureRecognized(DragGestureEvent) */
	@Override
	public void dragGestureRecognized(DragGestureEvent arg0) {
		// TODO Auto-generated method stub

	}

	/**
	 * Method drop.
	 * 
	 * @param dtde
	 *            DropTargetDropEvent
	
	 * @see java.awt.dnd.DropTargetListener#drop(DropTargetDropEvent) */
	@Override
	public void drop(DropTargetDropEvent dtde) {
		// TODO Auto-generated method stub

	}
}