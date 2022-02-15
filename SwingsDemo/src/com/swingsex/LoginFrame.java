package com.swingsex;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldEmail;
	private JPasswordField passwordField;
	private JLabel lblSuccess;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Stalwart Login Screen");
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.BOLD, 26));
		lblNewLabel.setBounds(59, 11, 311, 44);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Email");
		lblNewLabel_1.setBounds(10, 66, 106, 25);
		contentPane.add(lblNewLabel_1);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setBounds(183, 66, 216, 25);
		contentPane.add(textFieldEmail);
		textFieldEmail.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Enter Password");
		lblNewLabel_2.setBounds(10, 122, 106, 14);
		contentPane.add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(183, 114, 216, 25);
		contentPane.add(passwordField);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String email = textFieldEmail.getText().toString().trim();
				String pwd = passwordField.getText().toString().trim();
				
				if(email.equals("abc@xyz.com") && pwd.equals("asdfghjkl")) {
					
					lblSuccess.setText("Account Authenticated");
				
				}else {
					lblSuccess.setText("Access Denied");
				}
			}
		});
		btnSubmit.setBackground(Color.WHITE);
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSubmit.setBounds(110, 186, 126, 23);
		contentPane.add(btnSubmit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textFieldEmail.setText(null);
				passwordField.setText(null);
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnReset.setBounds(273, 189, 126, 23);
		contentPane.add(btnReset);
		
		lblSuccess = new JLabel("");
		lblSuccess.setBounds(145, 220, 197, 30);
		contentPane.add(lblSuccess);
	}
}
