package Window;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;



class AfficheImage extends JPanel
{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
Image eau;

AfficheImage(String s)
{
eau = getToolkit().getImage(s);
}

public void paintComponent(Graphics g)
{
super.paintComponent(g);
g.drawImage(eau, 0, 0, this);
}
}
