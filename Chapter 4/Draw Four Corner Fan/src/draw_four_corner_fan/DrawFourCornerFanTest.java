package draw_four_corner_fan;

import javax.swing.JFrame;

/*
 * Jason Matthew Wiley
 * 12/16/2019
 * Draw Four Corner Fan
 * 
 * Modify part (a) to have lines fan out from all four corners, as shown in the right 
 * screen capture of Fig. 4.20. Lines from opposite corners should intersect along the 
 * middle.
 */

public class DrawFourCornerFanTest 
{
	public static void main(String[] args) 
	{
		//create a panel that contains our drawing
		DrawFourCornerFan drawFourCornerFan = new DrawFourCornerFan();
		//create a new frame to hold the panel
		JFrame application = new JFrame();

		//set the frame to exit when it is closed
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//add the panel to the frame
		application.add(drawFourCornerFan);
		//set the size of the frame
		application.setSize(196, 249);
		//make the frame visible
		application.setVisible(true);
	}
}