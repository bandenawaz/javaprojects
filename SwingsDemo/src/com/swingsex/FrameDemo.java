package com.swingsex;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameDemo extends JFrame {
	
	JFrame jf ;
	
	FrameDemo() {
		
		JButton btn = new JButton("Click Me!");
		btn.setBounds(100,50,150,40);
		
		add(btn);   //This will add a button to the frame
		setSize(300,200);
		setLayout(null);
		setVisible(true);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FrameDemo fd = new FrameDemo();

	}

}
