package draw_curved_corner;

import java.awt.Graphics;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class DrawCurvedCorner extends JPanel
{
	//draws from the corners of the panel
	public void paintComponent(Graphics g) 
	{
		//call paintComponent to ensure the panel displays correctly
		super.paintComponent(g);
		
		//stored variables
		int width = getWidth();
		int height = getHeight();
		int steps = 15;
		
		//draw line from upper left to bottom middle curved
		g.drawLine(0, 0, 0, height);
		
		for(int counter = 2; counter <= steps; counter++) 
		{
			//draw line from upper left to bottom middle curved
			g.drawLine(0, (height / steps) * counter , (width / steps) * counter, height);
		}
	}
}