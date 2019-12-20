package draw_four_curved_corner;

import javax.swing.JFrame;

/*
 * Jason Matthew Wiley
 * 12/17/2019
 * Draw Four Curved Corner Application
 * 
 * Modify your answer in part (a) to mirror the design in all four corners, as shown in 
 * the right screen capture of Fig. 4.21.
 */
public class DrawFourCurvedCornerTest 
{
	public static void main(String[] args) 
	{
		//create a panel that contains our drawing
		DrawFourCurvedCorner drawFourCurvedCorner = new DrawFourCurvedCorner();
		//create a new frame to hold the panel
		JFrame application = new JFrame();

		//set the frame to exit when it is closed
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//add the panel to the frame
		application.add(drawFourCurvedCorner);
		//set the size of the frame
		application.setSize(250, 250);
		//make the frame visible
		application.setVisible(true);	
	}
}
