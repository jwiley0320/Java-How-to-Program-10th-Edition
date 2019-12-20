package draw_fan;

import javax.swing.JFrame;

/*
 * Jason Matthew Wiley
 * 12/16/2019
 * Draw Fan Application
 * 
 * Create the design in the left screen capture of Fig. 4.20. This design draws lines from
 * the top-left corner, fanning them out until they cover the upper-left half of the panel.
 * One approach is to divide the width and height into an equal number of steps (we found
 * 15 steps worked well). The first endpoint of a line will always be in the top-left 
 * corner (0, 0). The second endpoint can be found by starting at the bottom-left corner 
 * and moving up one vertical step and right one horizontal step. Draw a line between the 
 * two endpoints. Continue moving up and to the right one step to find each successive 
 * endpoint. The figure should scale accordingly as you resize the window.
 */

public class DrawFanTest 
{
	public static void main(String[] args) 
	{
		//create a panel that contains our drawing
		DrawFan drawFan = new DrawFan();
		//create a new frame to hold the panel
		JFrame application = new JFrame();
		
		//set the frame to exit when it is closed
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		//add the panel to the frame
		application.add(drawFan);
		//set the size of the frame
		application.setSize(250, 250);
		//make the frame visible
		application.setVisible(true);
	}
}