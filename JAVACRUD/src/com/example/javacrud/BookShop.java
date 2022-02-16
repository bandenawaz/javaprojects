package com.example.javacrud;

import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import net.proteanit.sql.DbUtils;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class BookShop {

	private JFrame frame;
	private JTextField txtBookName;
	private JTextField txtEdition;
	private JTextField txtPrice;
	private JTextField txtBookId;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookShop window = new BookShop();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BookShop() {
		initialize();
		
		//Lets call connect method here
		Connect();
		
		//Lets display the data
		table_load();
	}
	
	//Step: 1 Establish Connection
	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	
	//Lets define a method to establish connection
	public void Connect() {
		
		try {
			//Lets establish the connection using CLass.forName
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/books", "root", "");
		
		}catch (ClassNotFoundException e) {
			
			e.printStackTrace();
			
		}catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	//Lets display the data
	public void table_load() {
		
		try {
			pst = con.prepareStatement("select * from book");
			rs = pst.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));
			
		}catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 840, 477);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nawaz's Book Gallery");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel.setBounds(164, 11, 379, 49);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Registeration Form", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED));
		panel.setBounds(20, 59, 395, 205);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Book Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(10, 37, 123, 32);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Edition");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(10, 97, 123, 32);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Price");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_2.setBounds(10, 150, 123, 35);
		panel.add(lblNewLabel_1_2);
		
		txtBookName = new JTextField();
		txtBookName.setBounds(143, 37, 212, 32);
		panel.add(txtBookName);
		txtBookName.setColumns(10);
		
		txtEdition = new JTextField();
		txtEdition.setColumns(10);
		txtEdition.setBounds(143, 100, 212, 32);
		panel.add(txtEdition);
		
		txtPrice = new JTextField();
		txtPrice.setColumns(10);
		txtPrice.setBounds(143, 150, 212, 35);
		panel.add(txtPrice);
		
		//Handling event listener for save button
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String bookName = txtBookName.getText().toString().trim();
				Integer edition = Integer.parseInt(txtEdition.getText().toString().trim());
				Integer price = Integer.parseInt(txtPrice.getText().toString().trim());
				
				//Lets insert the values to the database
				try {
					pst = con.prepareStatement("insert into book(name, edition, price) values(?,?,?)");
					pst.setString(1, bookName);
					pst.setInt(2, edition);
					pst.setInt(3, price);
					
					//Lets push it our db
					pst.executeUpdate();
					
					//Lets display a alertbox for success message
					JOptionPane.showMessageDialog(null, "Data inserted successfully");
					table_load();
					
					//lets clear textfields for new entry
					txtBookName.setText(null);
					txtEdition.setText(null);
					txtPrice.setText(null);
					
				}catch (SQLException e1) {
					
					e1.printStackTrace();
				}
			}
		});
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSave.setBounds(20, 286, 101, 39);
		frame.getContentPane().add(btnSave);
		
		
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Lets quit the execution
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnExit.setBounds(165, 286, 101, 39);
		frame.getContentPane().add(btnExit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtBookName.setText(null);
				txtEdition.setText(null);
				txtPrice.setText(null);
				txtBookId.setText(null);
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnReset.setBounds(314, 286, 101, 39);
		frame.getContentPane().add(btnReset);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Search", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		panel_1.setBounds(20, 351, 401, 76);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Book ID");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1_1.setBounds(10, 30, 123, 32);
		panel_1.add(lblNewLabel_1_1_1);
		
		txtBookId = new JTextField();
		txtBookId.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
				try {
					//Lets search the book by id
					String id = txtBookId.getText().toLowerCase().trim();
					
					pst = con.prepareStatement("select name,edition,price from book where id = ?");
					pst.setString(1, id);
					ResultSet rs = pst.executeQuery();
					
					if(rs.next() == true) {
						
						String name = rs.getString(1);
						Integer edition = rs.getInt(2);
						Integer price = rs.getInt(3);
						
						txtBookName.setText(name);
						txtEdition.setText(String.valueOf(edition));
						txtPrice.setText(String.valueOf(price));
						
					}else {
						txtBookName.setText(null);
						txtEdition.setText(null);
						txtPrice.setText(null);
						
					}
				}catch (Exception e2) {
					
					e2.printStackTrace();
				}
			}
		});
		txtBookId.setColumns(10);
		txtBookId.setBounds(143, 33, 235, 32);
		panel_1.add(txtBookId);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(425, 59, 367, 259);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String bookName = txtBookName.getText().toString().trim();
				Integer edition = Integer.parseInt(txtEdition.getText().toString().trim());
				Integer price = Integer.parseInt(txtPrice.getText().toString().trim());
				String bookId = txtBookId.getText().toString().trim();
				
				try {
					pst = con.prepareStatement("update book set name=?, edition=?, price=? where id=?");
					pst.setString(1, bookName);
					pst.setInt(2, edition);
					pst.setInt(3, price);
					pst.setString(4, bookId);
					
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "Data updated Successfully!!!");
					table_load();
					
					txtBookName.setText(null);
					txtEdition.setText(null);
					txtPrice.setText(null);
					txtBookId.setText(null);
				}catch (SQLException se) {
					
					se.printStackTrace();
				}
				
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnUpdate.setBounds(447, 347, 101, 39);
		frame.getContentPane().add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String bid  = txtBookId.getText();
				try {
				pst = con.prepareStatement("delete from book where id =?");
				            pst.setString(1, bid);
				            pst.executeUpdate();
				            JOptionPane.showMessageDialog(null, "Record Deleted Sucessfully!!!!!");
				            table_load();
				          
				            txtBookName.setText("");
				            txtEdition.setText("");
				            txtPrice.setText("");
				            txtBookName.requestFocus();
				}
				 
				            catch (SQLException e1) {
				e1.printStackTrace();
				}
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDelete.setBounds(586, 347, 101, 39);
		frame.getContentPane().add(btnDelete);
	}
}
