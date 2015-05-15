package création_pièces_terrain;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Dimension2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/**
 * @author ange__000
 * @version $Revision: 1.0 $
 */
public enum Pieces implements Comparable<Pieces>, Serializable {
	PAT_00(0, CouleurPieces.COL_DARKRED, CouleurPieces.COL_DARKBLUE,
			MotifPieces.SHAPE_NONE), PAT_01(1, CouleurPieces.COL_DARKGREEN,
			CouleurPieces.COL_DARKRED, MotifPieces.SHAPE_ROUNDCROSS), PAT_02(2,
			CouleurPieces.COL_DARKBLUE, CouleurPieces.COL_YELLOW,
			MotifPieces.SHAPE_FLOWER), PAT_03(3, CouleurPieces.COL_PINK,
			CouleurPieces.COL_YELLOW, MotifPieces.SHAPE_HOLLOWCROSS), PAT_04(4,
			CouleurPieces.COL_GREEN, CouleurPieces.COL_PEACH,
			MotifPieces.SHAPE_BOULON), PAT_05(5, CouleurPieces.COL_BROWN,
			CouleurPieces.COL_ORANGE, MotifPieces.SHAPE_ROUNDCASTLE), PAT_06(6,
			CouleurPieces.COL_VIOLET, CouleurPieces.COL_BLUEGRAY,
			MotifPieces.SHAPE_CROSSBALLS), PAT_07(7,
			CouleurPieces.COL_DARKPURPLE, CouleurPieces.COL_MELON,
			MotifPieces.SHAPE_LYS), PAT_08(8, CouleurPieces.COL_YELLOW,
			CouleurPieces.COL_GREEN, MotifPieces.SHAPE_STAR),

	PAT_09(9, CouleurPieces.COL_DARKPURPLE, CouleurPieces.COL_YELLOW,
			MotifPieces.SHAPE_TOXIC), PAT_10(10, CouleurPieces.COL_GREEN,
			CouleurPieces.COL_PINK, MotifPieces.SHAPE_CROSSBALLS), PAT_11(11,
			CouleurPieces.COL_DARKPURPLE, CouleurPieces.COL_GREEN,
			MotifPieces.SHAPE_TOXIC), PAT_12(12, CouleurPieces.COL_GREEN,
			CouleurPieces.COL_ORANGE, MotifPieces.SHAPE_LYS), PAT_13(13,
			CouleurPieces.COL_DARKPURPLE, CouleurPieces.COL_YELLOW,
			MotifPieces.SHAPE_STAR), PAT_14(14, CouleurPieces.COL_BLUEGRAY,
			CouleurPieces.COL_PINK, MotifPieces.SHAPE_CASTLE), PAT_15(15,
			CouleurPieces.COL_YELLOW, CouleurPieces.COL_GREEN,
			MotifPieces.SHAPE_SQUARE), PAT_16(16, CouleurPieces.COL_PEACH,
			CouleurPieces.COL_PINK, MotifPieces.SHAPE_LYS), PAT_17(17,
			CouleurPieces.COL_YELLOW, CouleurPieces.COL_DARKBLUE,
			MotifPieces.SHAPE_CASTLE), PAT_18(18, CouleurPieces.COL_ORANGE,
			CouleurPieces.COL_DARKPURPLE, MotifPieces.SHAPE_STAR), PAT_19(19,
			CouleurPieces.COL_DARKBLUE, CouleurPieces.COL_ORANGE,
			MotifPieces.SHAPE_CROSSBALLS), PAT_20(20,
			CouleurPieces.COL_DARKBLUE, CouleurPieces.COL_DARKRED,
			MotifPieces.SHAPE_SQUARE), PAT_21(21, CouleurPieces.COL_PINK,
			CouleurPieces.COL_YELLOW, MotifPieces.SHAPE_CASTLE), PAT_22(22,
			CouleurPieces.COL_DARKBLUE, CouleurPieces.COL_PINK,
			MotifPieces.SHAPE_TOXIC),

	PAT_23(23, CouleurPieces.COL_MAGENTA, CouleurPieces.COL_PURPLE,
			MotifPieces.SHAPE_TOXIC), PAT_24(24, CouleurPieces.COL_GREEN,
			CouleurPieces.COL_ORANGE, MotifPieces.SHAPE_SQUARE), PAT_25(25,
			CouleurPieces.COL_BROWN, CouleurPieces.COL_PINK,
			MotifPieces.SHAPE_SQUARE), PAT_26(26, CouleurPieces.COL_YELLOW,
			CouleurPieces.COL_GREEN, MotifPieces.SHAPE_FLOWER), PAT_27(27,
			CouleurPieces.COL_MAGENTA, CouleurPieces.COL_MELON,
			MotifPieces.SHAPE_LYS), PAT_28(28, CouleurPieces.COL_PURPLE,
			CouleurPieces.COL_YELLOW, MotifPieces.SHAPE_CASTLE), PAT_29(29,
			CouleurPieces.COL_GREEN, CouleurPieces.COL_DARKRED,
			MotifPieces.SHAPE_STAR), PAT_30(30, CouleurPieces.COL_YELLOW,
			CouleurPieces.COL_ORANGE, MotifPieces.SHAPE_BOULON),

	PAT_31(31, CouleurPieces.COL_MAGENTA, CouleurPieces.COL_GREEN,
			MotifPieces.SHAPE_BOULON), PAT_32(32, CouleurPieces.COL_MAGENTA,
			CouleurPieces.COL_GREEN, MotifPieces.SHAPE_HOLLOWCROSS), PAT_33(33,
			CouleurPieces.COL_PURPLE, CouleurPieces.COL_MAGENTA,
			MotifPieces.SHAPE_ROUNDCROSS), PAT_34(34,
			CouleurPieces.COL_DARKPURPLE, CouleurPieces.COL_ORANGE,
			MotifPieces.SHAPE_CROSSBALLS), PAT_35(35, CouleurPieces.COL_ORANGE,
			CouleurPieces.COL_GREEN, MotifPieces.SHAPE_LYS), PAT_36(36,
			CouleurPieces.COL_DARKRED, CouleurPieces.COL_DARKBLUE,
			MotifPieces.SHAPE_STAR), PAT_37(37, CouleurPieces.COL_PURPLE,
			CouleurPieces.COL_GREEN, MotifPieces.SHAPE_CASTLE), PAT_38(38,
			CouleurPieces.COL_YELLOW, CouleurPieces.COL_PURPLE,
			MotifPieces.SHAPE_HOLLOWCROSS), PAT_39(39, CouleurPieces.COL_GREEN,
			CouleurPieces.COL_YELLOW, MotifPieces.SHAPE_STAR);

	private int patternCode;
	private CouleurPieces patternBg;
	private CouleurPieces patternFg;
	private MotifPieces patternShape;

	/**
	 * Constructor for Pieces.
	 * 
	 * @param code
	 *            int
	 * @param bg
	 *            CouleurPieces
	 * @param fg
	 *            CouleurPieces
	 * @param shape
	 *            MotifPieces
	 */
	private Pieces(int code, CouleurPieces bg, CouleurPieces fg,
			MotifPieces shape) {
		this.patternCode = code;
		this.patternBg = bg;
		this.patternFg = fg;
		this.patternShape = shape;
	}

	/**
	 * Method getCode.
	 * 
	
	 * @return int */
	public int getCode() {
		return this.patternCode;
	}

	/**
	 * Method getPatternBg.
	 * 
	
	 * @return CouleurPieces */
	public CouleurPieces getPatternBg() {
		return this.patternBg;
	}

	/**
	 * Method getPatternFg.
	 * 
	
	 * @return CouleurPieces */
	public CouleurPieces getPatternFg() {
		return this.patternFg;
	}

	/**
	 * Method getPatternShape.
	 * 
	
	 * @return MotifPieces */
	public MotifPieces getPatternShape() {
		return this.patternShape;
	}

	/**
	 * Method getCodeString.
	 * 
	
	 * @return String */
	public String getCodeString() {
		String result = null;
		if (this.patternCode < 10)
			result = " " + this.patternCode;
		else {
			result = Integer.toString(this.patternCode);
		}

		return result;
	}

	/**
	 * Method paint.
	 * 
	 * @param g2d
	 *            Graphics2D
	 * @param size
	 *            Dimension2D
	 */
	public void paint(Graphics2D g2d, Dimension2D size) {
		double w = size.getWidth();
		double h = size.getHeight();

		Color bg = this.patternBg.getColor();

		if (this.patternBg != CouleurPieces.COL_BLUEGRAY) {
			bg = bg.darker();
		}

		GradientPaint grad_back = new GradientPaint(new Point2D.Double(0.0D,
				0.0D), this.patternBg.getColor().brighter(),
				new Point2D.Double(0.0D, h), bg);
		g2d.setPaint(grad_back);

		GeneralPath globalshape = new GeneralPath();
		globalshape.moveTo(0.0F, (float) h / 2.0F);
		globalshape.lineTo((float) w / 2.0F, 0.0F);
		globalshape.lineTo((float) w, (float) h / 2.0F);
		globalshape.lineTo((float) w / 2.0F, (float) h);

		Shape previous_clip = g2d.getClip();
		g2d.fill(globalshape);
		g2d.clip(globalshape);

		double cx = w / 2.0D;
		double cy = h / 2.0D;
		double minsize = Math.min(w, h);

		if (this.patternShape != MotifPieces.SHAPE_NONE) {
			if (this.patternShape == MotifPieces.SHAPE_ROUNDCROSS) {
				double rad_ext = minsize * 0.6D;
				g2d.setColor(this.patternFg.getColor());
				g2d.fill(new Ellipse2D.Double(cx - rad_ext / 2.0D, cy - rad_ext
						/ 2.0D, rad_ext, rad_ext));

				double rad_in = minsize * 0.28D;
				double rad_out = minsize * 0.22D;

				g2d.setPaint(grad_back);
				g2d.fill(new Ellipse2D.Double(cx - rad_out - rad_in / 2.0D, cy
						- rad_out - rad_in / 2.0D, rad_in, rad_in));

				g2d.fill(new Ellipse2D.Double(cx - rad_out - rad_in / 2.0D, cy
						+ rad_out - rad_in / 2.0D, rad_in, rad_in));

				g2d.fill(new Ellipse2D.Double(cx + rad_out - rad_in / 2.0D, cy
						- rad_out - rad_in / 2.0D, rad_in, rad_in));

				g2d.fill(new Ellipse2D.Double(cx + rad_out - rad_in / 2.0D, cy
						+ rad_out - rad_in / 2.0D, rad_in, rad_in));
			} else if (this.patternShape == MotifPieces.SHAPE_HOLLOWCROSS) {
				double rad_ext = minsize * 0.6D;
				g2d.setColor(this.patternFg.getColor());
				g2d.fill(new Rectangle2D.Double(cx - rad_ext / 2.0D, cy
						- rad_ext / 2.0D, rad_ext, rad_ext));

				double rad_in = minsize * 0.4D;
				double rad_out = rad_ext * 0.52D;

				g2d.setPaint(grad_back);
				g2d.fill(new Ellipse2D.Double(cx - rad_out - rad_in / 2.0D, cy
						- rad_out - rad_in / 2.0D, rad_in, rad_in));

				g2d.fill(new Ellipse2D.Double(cx - rad_out - rad_in / 2.0D, cy
						+ rad_out - rad_in / 2.0D, rad_in, rad_in));

				g2d.fill(new Ellipse2D.Double(cx + rad_out - rad_in / 2.0D, cy
						- rad_out - rad_in / 2.0D, rad_in, rad_in));

				g2d.fill(new Ellipse2D.Double(cx + rad_out - rad_in / 2.0D, cy
						+ rad_out - rad_in / 2.0D, rad_in, rad_in));

				double rad_hole = minsize * 0.15D;

				GeneralPath inside = new GeneralPath();
				inside.moveTo((float) cx, (float) (cy - rad_hole));
				inside.lineTo((float) (cx + rad_hole), (float) cy);
				inside.lineTo((float) cx, (float) (cy + rad_hole));
				inside.lineTo((float) (cx - rad_hole), (float) cy);
				g2d.fill(inside);
			} else if (this.patternShape == MotifPieces.SHAPE_BOULON) {
				double p1 = minsize * 0.4D;
				double p2 = p1 * 0.66D;
				double p3 = p1 * 0.33D;

				GeneralPath boulon = new GeneralPath();
				boulon.moveTo((float) (cx - p2), (float) cy);
				boulon.lineTo((float) (cx - p2), (float) (cy - p3));
				boulon.lineTo((float) (cx - p3), (float) (cy - p2));
				boulon.lineTo((float) cx, (float) (cy - p2));
				boulon.lineTo((float) (cx + p3), (float) (cy - p2));
				boulon.lineTo((float) (cx + p2), (float) (cy - p3));
				boulon.lineTo((float) (cx + p2), (float) cy);
				boulon.lineTo((float) (cx + p2), (float) (cy + p3));
				boulon.lineTo((float) (cx + p3), (float) (cy + p2));
				boulon.lineTo((float) cx, (float) (cy + p2));
				boulon.lineTo((float) (cx - p3), (float) (cy + p2));
				boulon.lineTo((float) (cx - p2), (float) (cy + p3));
				g2d.setColor(this.patternFg.getColor());
				g2d.fill(boulon);

				double rad_in = minsize * 0.27D;

				g2d.setPaint(grad_back);
				g2d.fill(new Ellipse2D.Double(cx - rad_in / 2.0D, cy - rad_in
						/ 2.0D, rad_in, rad_in));
			} else if (this.patternShape == MotifPieces.SHAPE_FLOWER) {
				double rad = minsize / 7.0D;

				g2d.setColor(this.patternFg.getColor());
				g2d.fill(new Ellipse2D.Double(cx - 2.0D * rad, cy - 1.0D * rad,
						2.0D * rad, 2.0D * rad));
				g2d.fill(new Ellipse2D.Double(cx - 1.0D * rad, cy - 2.0D * rad,
						2.0D * rad, 2.0D * rad));
				g2d.fill(new Ellipse2D.Double(cx + 0.0D * rad, cy - 1.0D * rad,
						2.0D * rad, 2.0D * rad));
				g2d.fill(new Ellipse2D.Double(cx - 1.0D * rad, cy + 0.0D * rad,
						2.0D * rad, 2.0D * rad));

				rad *= 0.9D;

				g2d.setPaint(grad_back);
				g2d.fill(new Ellipse2D.Double(cx - rad, cy - rad, 2.0D * rad,
						2.0D * rad));
			} else if (this.patternShape == MotifPieces.SHAPE_LYS) {
				double p1 = minsize * 0.35D;
				double p2 = p1 * 0.66D;
				double p3 = p1 * 0.33D;
				double p4 = p1 * 0.2D;

				g2d.setColor(this.patternFg.getColor());
				GeneralPath lys = new GeneralPath();
				lys.moveTo((float) (cx - p1), (float) cy);
				lys.lineTo((float) (cx - p2), (float) (cy - p3));
				lys.lineTo((float) (cx - p4), (float) (cy - p4));
				lys.lineTo((float) (cx - p3), (float) (cy - p2));
				lys.lineTo((float) cx, (float) (cy - p1));
				lys.lineTo((float) (cx + p3), (float) (cy - p2));
				lys.lineTo((float) (cx + p4), (float) (cy - p4));
				lys.lineTo((float) (cx + p2), (float) (cy - p3));
				lys.lineTo((float) (cx + p1), (float) cy);
				lys.lineTo((float) (cx + p2), (float) (cy + p3));
				lys.lineTo((float) (cx + p4), (float) (cy + p4));
				lys.lineTo((float) (cx + p3), (float) (cy + p2));
				lys.lineTo((float) cx, (float) (cy + p1));
				lys.lineTo((float) (cx - p3), (float) (cy + p2));
				lys.lineTo((float) (cx - p4), (float) (cy + p4));
				lys.lineTo((float) (cx - p2), (float) (cy + p3));
				g2d.setColor(this.patternFg.getColor());
				g2d.fill(lys);
			} else if (this.patternShape == MotifPieces.SHAPE_ROUNDCASTLE) {
				double p1 = minsize * 0.23D;
				double p2 = p1 * 0.9D;
				double p3 = p1 * 0.45D;
				double p4 = p1 * 0.9D;
				double p5 = p1 * 0.3D;
				g2d.setColor(this.patternFg.getColor());
				g2d.fill(new Ellipse2D.Double(cx - p2, cy - p2, 2.0D * p2,
						2.0D * p2));
				g2d.fill(new Ellipse2D.Double(cx - p1 - p3, cy - p3, 2.0D * p3,
						2.0D * p3));
				g2d.fill(new Ellipse2D.Double(cx - p3, cy - p1 - p3, 2.0D * p3,
						2.0D * p3));
				g2d.fill(new Ellipse2D.Double(cx + p1 - p3, cy - p3, 2.0D * p3,
						2.0D * p3));
				g2d.fill(new Ellipse2D.Double(cx - p3, cy + p1 - p3, 2.0D * p3,
						2.0D * p3));

				GeneralPath innerStar = new GeneralPath();
				innerStar.moveTo((float) cx, (float) (cy - p4));
				innerStar.lineTo((float) (cx + p5), (float) (cy - p5));
				innerStar.lineTo((float) (cx + p4), (float) cy);
				innerStar.lineTo((float) (cx + p5), (float) (cy + p5));
				innerStar.lineTo((float) cx, (float) (cy + p4));
				innerStar.lineTo((float) (cx - p5), (float) (cy + p5));
				innerStar.lineTo((float) (cx - p4), (float) cy);
				innerStar.lineTo((float) (cx - p5), (float) (cy - p5));
				innerStar.lineTo((float) cx, (float) (cy - p4));

				g2d.setColor(this.patternBg.getColor());
				g2d.fill(innerStar);
			} else if (this.patternShape == MotifPieces.SHAPE_CROSSBALLS) {
				double p1 = minsize * 0.23D;
				double p2 = p1 * 0.3D;
				double p3 = p1 * 0.45D;
				g2d.setColor(this.patternFg.getColor());
				g2d.fill(new Rectangle2D.Double(cx - p1, cy - p2, 2.0D * p1,
						2.0D * p2));
				g2d.fill(new Rectangle2D.Double(cx - p2, cy - p1, 2.0D * p2,
						2.0D * p1));
				g2d.fill(new Ellipse2D.Double(cx - p1 - p3, cy - p3, 2.0D * p3,
						2.0D * p3));
				g2d.fill(new Ellipse2D.Double(cx - p3, cy - p1 - p3, 2.0D * p3,
						2.0D * p3));
				g2d.fill(new Ellipse2D.Double(cx + p1 - p3, cy - p3, 2.0D * p3,
						2.0D * p3));
				g2d.fill(new Ellipse2D.Double(cx - p3, cy + p1 - p3, 2.0D * p3,
						2.0D * p3));
			} else if (this.patternShape == MotifPieces.SHAPE_CASTLE) {
				double p1 = minsize * 0.35D;
				double p2 = p1 * 0.66D;
				double p3 = p1 * 0.33D;
				double p4 = p1 * 0.15D;

				GeneralPath castle = new GeneralPath();
				castle.moveTo((float) (cx - p1), (float) cy);
				castle.lineTo((float) (cx - p2), (float) (cy - p3));
				castle.lineTo((float) (cx - p2 + p4), (float) (cy - p3 + p4));
				castle.lineTo((float) (cx - p3 + p4), (float) (cy - p2 + p4));
				castle.lineTo((float) (cx - p3), (float) (cy - p2));
				castle.lineTo((float) cx, (float) (cy - p1));
				castle.lineTo((float) (cx + p3), (float) (cy - p2));
				castle.lineTo((float) (cx + p3 - p4), (float) (cy - p2 + p4));
				castle.lineTo((float) (cx + p2 - p4), (float) (cy - p3 + p4));
				castle.lineTo((float) (cx + p2), (float) (cy - p3));
				castle.lineTo((float) (cx + p1), (float) cy);
				castle.lineTo((float) (cx + p2), (float) (cy + p3));
				castle.lineTo((float) (cx + p2 - p4), (float) (cy + p3 - p4));
				castle.lineTo((float) (cx + p3 - p4), (float) (cy + p2 - p4));
				castle.lineTo((float) (cx + p3), (float) (cy + p2));
				castle.lineTo((float) cx, (float) (cy + p1));
				castle.lineTo((float) (cx - p3), (float) (cy + p2));
				castle.lineTo((float) (cx - p3 + p4), (float) (cy + p2 - p4));
				castle.lineTo((float) (cx - p2 + p4), (float) (cy + p3 - p4));
				castle.lineTo((float) (cx - p2), (float) (cy + p3));
				g2d.setColor(this.patternFg.getColor());
				g2d.fill(castle);
				g2d.setColor(this.patternFg.getColor().darker());
				g2d.draw(castle);
			} else if (this.patternShape == MotifPieces.SHAPE_SQUARE) {
				double p1 = minsize * 0.35D;
				double p2 = p1 * 0.5D;

				GeneralPath square_ext = new GeneralPath();
				square_ext.moveTo((float) (cx - p1), (float) cy);
				square_ext.lineTo((float) cx, (float) (cy - p1));
				square_ext.lineTo((float) (cx + p1), (float) cy);
				square_ext.lineTo((float) cx, (float) (cy + p1));
				g2d.setColor(this.patternFg.getColor());
				g2d.fill(square_ext);
				g2d.setColor(this.patternFg.getColor().darker());
				g2d.draw(square_ext);

				GeneralPath square_int = new GeneralPath();
				square_int.moveTo((float) (cx - p2), (float) cy);
				square_int.lineTo((float) cx, (float) (cy - p2));
				square_int.lineTo((float) cx, (float) (cy + p2));
				g2d.setColor(this.patternBg.getColor());
				g2d.fill(square_int);
				g2d.setColor(this.patternBg.getColor().darker());
				g2d.draw(square_int);
			} else if (this.patternShape == MotifPieces.SHAPE_TOXIC) {
				double p1 = minsize * 0.3D;
				double p2 = p1 * 0.3D;
				double p3 = p2 * 1.1D;

				Ellipse2D circle_ext = new Ellipse2D.Double(cx - p1, cy - p1,
						2.0D * p1, 2.0D * p1);
				g2d.setColor(this.patternFg.getColor());
				g2d.fill(circle_ext);
				g2d.setColor(this.patternFg.getColor().darker());
				g2d.draw(circle_ext);

				GeneralPath cross_int = new GeneralPath();
				cross_int.moveTo((float) (cx - p2), (float) cy);
				cross_int.lineTo((float) (cx - p2 - p3), (float) (cy - p3));
				cross_int.lineTo((float) (cx - p3), (float) (cy - p2 - p3));

				cross_int.lineTo((float) cx, (float) (cy - p2));
				cross_int.lineTo((float) (cx + p3), (float) (cy - p2 - p3));
				cross_int.lineTo((float) (cx + p2 + p3), (float) (cy - p3));

				cross_int.lineTo((float) (cx + p2), (float) cy);
				cross_int.lineTo((float) (cx + p2 + p3), (float) (cy + p3));
				cross_int.lineTo((float) (cx + p3), (float) (cy + p2 + p3));

				cross_int.lineTo((float) cx, (float) (cy + p2));
				cross_int.lineTo((float) (cx - p3), (float) (cy + p2 + p3));
				cross_int.lineTo((float) (cx - p2 - p3), (float) (cy + p3));

				g2d.setColor(this.patternBg.getColor());
				g2d.fill(cross_int);
				g2d.setColor(this.patternBg.getColor().darker());
				g2d.draw(cross_int);
			} else if (this.patternShape == MotifPieces.SHAPE_STAR) {
				double rad1 = minsize * 0.3D;
				double rad2 = rad1 * 0.5D;

				g2d.setColor(this.patternFg.getColor());
				GeneralPath star = new GeneralPath();
				star.moveTo((float) (cx - rad1), (float) cy);

				for (int a = 0; a <= 360; a += 30) {
					double rad;

					if (a % 60 == 0)
						rad = rad1;
					else {
						rad = rad2;
					}

					double arad = 6.283185307179586D * a / 360.0D;

					star.lineTo((float) (cx + rad * Math.cos(arad)),
							(float) (cy + rad * Math.sin(arad)));
				}

				g2d.fill(star);
			}
		}
		g2d.setClip(previous_clip);
	}

	/**
	 * Method getAllPatterns.
	 * 
	
	 * @return List<Pieces> */
	public static List<Pieces> getAllPatterns() {
		return Arrays.asList(values());
	}

	/**
	 * Method getNonDefaultPatterns.
	 * 
	
	 * @return List<Pieces> */
	public static List<Pieces> getNonDefaultPatterns() {
		List<Pieces> allPatterns = getAllPatterns();
		return allPatterns.subList(1, allPatterns.size());
	}

	/**
	 * Method getDefaultPattern.
	 * 
	
	 * @return Pieces */
	public static Pieces getDefaultPattern() {
		return PAT_00;
	}

	/**
	 * Method getPatternByCode.
	 * 
	 * @param patternCode
	 *            int
	
	 * @return Pieces */
	public static Pieces getPatternByCode(int patternCode) {
		Pieces result = null;
		for (Pieces pattern : getAllPatterns()) {
			if (pattern.getCode() == patternCode) {
				result = pattern;
			}
		}

		return result;
	}

	/**
	 * Method toString.
	 * 
	
	 * @return String */
	@Override
	public String toString() {
		return String.format("Pat%02d",
				new Object[] { Integer.valueOf(this.patternCode) });
	}
}
