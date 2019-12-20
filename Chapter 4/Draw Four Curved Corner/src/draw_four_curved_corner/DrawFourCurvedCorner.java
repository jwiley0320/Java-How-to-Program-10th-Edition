package draw_four_curved_corner;

import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class DrawFourCurvedCorner extends JPanel 
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
		
		bottomLeftCorner(g, width, height, steps);
		topLeftCorner(g, width, height, steps);
		topRightCorner(g, width, height, steps);
		bottomRightCorner(g, width, height, steps);
	}
	private void bottomRightCorner(Graphics g, int width, int height, int steps)
	{
		//draw line from upper left to bottom middle curved
		g.drawLine(width, 0, width, height);

		for(int counter = 2; counter <= steps; counter++) 
		{
			//draw line from upper left to bottom middle curved
			g.drawLine(width, (height / steps) * counter , width - ((width / steps) * counter), height);
		}
	}
	private void topRightCorner(Graphics g, int width, int height, int steps)
	{
		//draw line from upper left to bottom middle curved
		g.drawLine(width, height, width, 0);

		for(int counter = 2; counter <= steps; counter++) 
		{
			//draw line from upper left to bottom middle curved
			g.drawLine(width, height - ((width/ steps) * counter), width - ((width / steps) * counter), 0);
		}
	}
	private void topLeftCorner(Graphics g, int width, int height, int steps) 
	{
		//draw line from upper left to bottom middle curved
		g.drawLine(0, height, 0, 0);

		for(int counter = 2; counter <= steps; counter++) 
		{
			//draw line from upper left to bottom middle curved
			g.drawLine(0,height - ((height / steps) * counter), (width / steps) * counter, 0);
		}
	}
	private void bottomLeftCorner(Graphics g, int width, int height, int steps) 
	{
		//draw line from upper left to bottom middle curved
		g.drawLine(0, 0, 0, height);
		
		for(int counter = 2; counter <= steps; counter++) 
		{
			//draw line from upper left to bottom middle curved
			g.drawLine(0, (height / steps) * counter , (width / steps) * counter, height);
		}
	}
}