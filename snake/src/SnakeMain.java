package src;

import java.awt.BorderLayout;
import java.util.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SnakeMain extends JFrame {
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) throws InterruptedException {
		// Creates a JFrame object
		SnakeMain frame = new SnakeMain();
		
        // Creates panel object of Snake class
    	SnakeGraphics panel = new SnakeGraphics();
        // Center pane
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        // Make frame visible
        frame.setVisible(true);
        //play the entire game
        panel.doAll();
	    	
	    }
	
	public SnakeMain() {
		// Sets the size of the window
        setSize(516, 587);
        setResizable(false);
     	
        // Exit application when window is closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
	}
}
