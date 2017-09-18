package frames;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;

public class SampleFrame1 {
	
	public SampleFrame1(){	// we are making a constructor so that it can be called automatically while creating its object
		initialize();
	}
	
	private void initialize(){
		
		/*
		 * creating an object of JFrame class and then setting the title of this app
		 */
		JFrame frame = new JFrame("My First App"); 
		/*
		 * setDefaultCloseOperation() is a method in JFrame class
		 * its main function is to determine what to do after user closes our application
		 * in our case we don't want to run our app in the background. so we terminate it using JFrame.EXIT_ON_CLOSE
		 * EXIT_ON_CLOSE is just an integer value which is defined in JFrame class.
		 */
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/*
		 * setLocation(int x, int y) is a method which is used to determine the location of our application window when it is opened
		 * in this example, our app will start in location (350,100) where 350 is the distance in pixels (horizontal) of your particular
		 * screen and 100 is the distance in pixels (vertical) of your particular screen
		 */
		frame.setLocation(350, 100);
		/*
		 * setSize(int x, int y) method is used to set a default size of our application
		 */
		frame.setSize(500, 500);
		/*
		 * Make the window of the application fixed
		 */
		frame.setResizable(false);
		/*
		 * change the background of the frame
		 */
		frame.getContentPane().setBackground(Color.CYAN);
		/*
		 * it's one of the most important method. after initializing all the components it's important to make our frame visible as soon as user
		 * opens our app
		 */
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		/*
		 * Swing event handling code runs on a special thread known as the event dispatch thread. We need to run every GUI components in 
		 * this thread for thread safety. Otherwise our GUI may not be responsive all the time.
		 * invokeLater method causes runnable to have its run method called in the dispatch thread of the system EventQueue. 
		 * This will happen after all pending events are processed.
		 * So EventQueue.invokeLater() will not let other threads interrupt with our GUI. Thus making our GUI responsive.
		 */ 
		
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new SampleFrame1();		// an object of SampleFrame1 is created	
			}
		});
	}

}
