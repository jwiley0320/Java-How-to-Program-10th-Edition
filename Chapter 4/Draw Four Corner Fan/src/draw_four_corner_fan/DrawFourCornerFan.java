package draw_four_corner_fan;

import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class DrawFourCornerFan extends JPanel
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

		leftUpperFan(g, width, height, steps);
		bottomLeftFan(g, width, height, steps);
		rightUpperFan(g, width, height, steps);
		bottomRightFan(g, width, height, steps);
	}
	private void bottomRightFan(Graphics g, int width, int height, int steps) 
	{
		//draw line from upper-right to bottom-right
		g.drawLine(width, height, width, 0);

		//Repeat 16 times
		for(int counter = 2; counter <= steps; counter++) 
		{
			//draw line from upper-right to bottom-right
			g.drawLine(width, height, width - ((width / steps) * counter), (height / steps) * counter);
		}
	}
	private void rightUpperFan(Graphics g, int width, int height, int steps) 
	{
		//draw line from upper-right to bottom-right
		g.drawLine(width, 0, width, height);

		//Repeat 16 times
		for(int counter = 2; counter <= steps; counter++) 
		{
			//draw line from upper-right to bottom-right
			g.drawLine(width, 0, width - ((width /steps) * counter), height - ((height /steps) * counter));
		}
	}
	private void bottomLeftFan(Graphics g, int width, int height, int steps)
	{
		//draw line from bottom-left to upper-left
		g.drawLine(0, height, 0, 0);

		//Repeat 16 times
		for(int counter = 2; counter <= steps; counter++) 
		{
			//draw line from bottom-left to upper-left
			g.drawLine(0, height, width - ((width / steps) * counter) , height - ((height / steps) * counter));
		}
	}
	private void leftUpperFan(Graphics g, int width, int height, int steps) 
	{
		//draw line from upper-left to lower-left (0,height - (0 * 15))
		g.drawLine(0, 0, 0, height);

		//Repeat 16 times
		for(int counter = 2; counter <= steps; counter++) 
		{
			//draw line from upper-left to lower-left (width - (height - (counter * 15),height - (counter * 15))
			g.drawLine(0, 0, (width / steps) * counter, height - ((height / steps) * counter));
		}
	}
}
