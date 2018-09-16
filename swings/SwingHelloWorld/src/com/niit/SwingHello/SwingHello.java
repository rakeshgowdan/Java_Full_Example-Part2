package com.niit.SwingHello;

import javax.swing.*;    
import java.awt.*;

public class SwingHello {
	

	    public static void main(String[] args) {

	        JFrame frame = new JFrame("FrameDemo");
	        frame.setMinimumSize(new Dimension(800, 400));
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
            //text area
	        JLabel myLabel = new JLabel("Hello World !!!", SwingConstants.CENTER);
	        //font style
	        myLabel.setFont(new Font("Serif", Font.BOLD, 22));
	        //bg of hello world
	        myLabel.setBackground(Color.CYAN);
	        //visibility
	        myLabel.setOpaque(true);
	        //size
	        myLabel.setPreferredSize(new Dimension(100, 80));

	        frame.getContentPane().add(myLabel, BorderLayout.NORTH);
	        //to make window true
	        frame.setVisible(true);

	    }
	}
