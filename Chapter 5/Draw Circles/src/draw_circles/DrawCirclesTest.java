package draw_circles;

import javax.swing.JFrame;

/*
 * Jason Matthew Wiley
 * 01/11/2020
 * Draw Circles Application
 * 
 * Draw 12 concentric circles in the center of a JPanel (Fig. 5.29). The innermost circle should 
 * have a radius of 10 pixels, and each successive circle should have a radius 10 pixels larger 
 * than the previous one. Begin by finding the center of the JPanel. To get the upper-left corner 
 * of a circle, move up one radius and to the left one radius from the center. The width and 
 * height of the bounding rectangle are both the same as the circle’s diameter (i.e., twice the 
 * radius). 
 */

public class DrawCirclesTest 
{
	public static void main(String[] args) 
	{
		
		// create the panel with the user's input
		DrawCircles panel = new DrawCircles();
		
		JFrame application = new JFrame(); // creates a new JFrame
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(316,339);
		application.setVisible(true);
	}
}