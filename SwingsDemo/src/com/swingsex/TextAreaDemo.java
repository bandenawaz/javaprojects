package com.swingsex;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class TextAreaDemo {
	
	TextAreaDemo() {
		
		JFrame frame = new JFrame();
		JTextArea txtArea = new JTextArea("JTetArea Example");
		txtArea.setBounds(10,30, 250, 70);
		frame.add(txtArea);
		frame.setSize(400, 300);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new TextAreaDemo();

	}

}
