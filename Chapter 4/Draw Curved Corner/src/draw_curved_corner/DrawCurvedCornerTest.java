package draw_curved_corner;

import javax.swing.JFrame;

/*
 * Jason Matthew Wiley
 * 12/17/2019
 * Draw Curved Corner Application
 * 
 * Create the design in the left screen capture of Fig. 4.21. Begin by dividing each edge 
 * into an equal number of increments (we chose 15 again). The first line starts in the 
 * topleft corner and ends one step right on the bottom edge. For each successive line, 
 * move down one increment on the left edge and right one increment on the bottom edge. 
 * Continue drawing lines until you reach the bottom-right corner. The figure should scale 
 * as you resize the window so that the endpoints always touch the edges.
 */

public class DrawCurvedCornerTest 
{
	public static void main(String[] args) 
	{
		//create a panel that contains our drawing
		DrawCurvedCorner drawCurvedCorner = new DrawCurvedCorner();
		//create a new frame to hold the panel
		JFrame application = new JFrame();

		//set the frame to exit when it is closed
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//add the panel to the frame
		application.add(drawCurvedCorner);
		//set the size of the frame
		application.setSize(250, 250);
		//make the frame visible
		application.setVisible(true);	
	}
}