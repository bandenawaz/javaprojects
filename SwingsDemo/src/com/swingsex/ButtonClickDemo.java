package com.swingsex;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ButtonClickDemo {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Button Click Demo");
		final JTextField txt = new JTextField();
		txt.setBounds(50, 100, 150, 75);
		final JLabel lbl = new JLabel();
		lbl.setBounds(70, 250, 250, 95);
		
		JButton btn = new JButton("Click ME!");
		btn.setBounds(20, 50, 75, 30);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String msg = txt.getText().toString().trim();
				lbl.setText(msg);
				
			}
		});
		
		//Lets add the widgets to the frame
		frame.add(txt);
		frame.add(btn);
		frame.add(lbl);
		frame.setSize(400,400);
		
		
		
		frame.setLayout(null);
		frame.setVisible(true);

	}

}
