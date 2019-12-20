package draw_fan;

//821311102215368686

import java.awt.Graphics;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class DrawFan extends JPanel
{
	//draws a fan from the corners of the panel
	public void paintComponent(Graphics g) 
	{
		//call paintComponent to ensure the panel displays correctly
		super.paintComponent(g);

		//stored variables
		int width = getWidth();
		int height = getHeight();
		int steps = 15;

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
