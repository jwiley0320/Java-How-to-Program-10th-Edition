package draw_circles;

import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class DrawCircles extends JPanel
{
	int increaseValue1 = 10;
	int increaseValue2 = 5;
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		//counter = 10
		//if counter < getHeight and counter < getWidth
		//counter += 10
		for(int counter = 10; counter < getHeight() - 10 && counter < getWidth() - 10; counter+=10) 
		{
			g.drawOval(getWidth() / 2 - increaseValue2, getHeight() / 2 - increaseValue2, counter, counter);
			increaseValue1 += 10;
			increaseValue2 += 5;
		}
		//end loop
	}
}
