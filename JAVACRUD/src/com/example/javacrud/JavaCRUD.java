package com.example.javacrud;
import java.sql.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class JavaCRUD {

	private JFrame frame;
	private JTextField txtBookName;
	private JTextField txtEdition;
	private JTextField txtPrice;
	private JTable table;
	private JTextField txtBookId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaCRUD window = new JavaCRUD();
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
	public JavaCRUD() {
		initialize();
		
		//call the database connection method as soon as form  is initialized
		Connect();
		
		//Display the data when the form loads
		table_load();
	}
	
	Connection con;
	PreparedStatement pst; 
	ResultSet rs;
	
	//Connect function to connect with database
	public void Connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/javacrud","root","");
			
		}catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//Lets view the data
	public void table_load()
    {
     try
     {
    pst = con.prepareStatement("select * from book");
    rs = pst.executeQuery();
    table.setModel(DbUtils.resultSetToTableModel(rs));
}
     catch (SQLException e)
     {
     e.printStackTrace();
  }
    }

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 907, 504);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Book Shop");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel.setBounds(269, 11, 244, 59);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Registration Form", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(22, 88, 384, 176);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Book Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(10, 32, 118, 34);
		panel.add(lblNewLabel_1);
		
		JLabel lblEdition = new JLabel("Edition");
		lblEdition.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEdition.setBounds(10, 77, 118, 33);
		panel.add(lblEdition);
		
		JLabel lblNewLabel_1_2 = new JLabel("Price");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_2.setBounds(10, 121, 75, 30);
		panel.add(lblNewLabel_1_2);
		
		txtBookName = new JTextField();
		txtBookName.setBounds(138, 32, 212, 30);
		panel.add(txtBookName);
		txtBookName.setColumns(10);
		
		txtEdition = new JTextField();
		txtEdition.setColumns(10);
		txtEdition.setBounds(138, 77, 212, 32);
		panel.add(txtEdition);
		
		txtPrice = new JTextField();
		txtPrice.setColumns(10);
		txtPrice.setBounds(138, 120, 212, 31);
		panel.add(txtPrice);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String bookName = txtBookName.getText().toString().trim();
				Integer bookEdition = Integer.parseInt(txtEdition.getText().toString().trim());
				Integer bookPrice = Integer.parseInt(txtPrice.getText().toString().trim());
				
				//Inserting the record in the database
				try {
					pst = con.prepareStatement("insert into book(name,edition,price)values(?,?,?)");
					pst.setString(1, bookName);
					pst.setInt(2, bookEdition);
					pst.setInt(3, bookPrice);
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "Record Inserted Successfully!!!!!");
					
					table_load();
					          
					txtBookName.setText("");
					txtEdition.setText("");
					txtPrice.setText("");
					txtBookName.requestFocus();
					   }
					 
					catch (SQLException e1)
					        {
					e1.printStackTrace();
					}
			}
		});
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSave.setBounds(32, 297, 89, 39);
		frame.getContentPane().add(btnSave);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnExit.setBounds(151, 297, 89, 39);
		frame.getContentPane().add(btnExit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtBookName.setText("");
				txtEdition.setText("");
				txtPrice.setText("");
				txtBookName.requestFocus();
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnReset.setBounds(269, 297, 89, 39);
		frame.getContentPane().add(btnReset);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(437, 88, 408, 271);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Search", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(22, 360, 399, 79);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblBookId = new JLabel("Book ID");
		lblBookId.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBookId.setBounds(10, 23, 118, 33);
		panel_1.add(lblBookId);
		
		txtBookId = new JTextField();
		txtBookId.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
				
				try {
			          
		            String id = txtBookId.getText().toString().trim();
		 
		                pst = con.prepareStatement("select name,edition,price from book where id = ?");
		                pst.setString(1, id);
		                ResultSet rs = pst.executeQuery();
		 
		            if(rs.next()==true)
		            {
		              
		                String name = rs.getString(1);
		                Integer edition = rs.getInt(2);
		                Integer price = rs.getInt(3);
		                
		                txtBookName.setText(name);
		                txtEdition.setText(String.valueOf(edition));
		                txtPrice.setText(String.valueOf(price));
		                
		                
		            }  
		            else
		            {
		             txtBookName.setText("");
		             txtEdition.setText("");
		             txtPrice.setText("");
		                
		            }
		            
		 
		 
		        }
		catch (SQLException ex) {
		          
		        }
		}
			
		});
		txtBookId.setColumns(10);
		txtBookId.setBounds(163, 23, 212, 32);
		panel_1.add(txtBookId);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String bname,edition,price,bid;
				bname = txtBookName.getText();
				edition = txtEdition.getText();
				price = txtPrice.getText();
				bid  = txtBookId.getText();
				try {
				pst = con.prepareStatement("update book set name= ?,edition=?,price=? where id =?");
				pst.setString(1, bname);
				            pst.setString(2, edition);
				            pst.setString(3, price);
				            pst.setString(4, bid);
				            pst.executeUpdate();
				            JOptionPane.showMessageDialog(null, "Record Updated Successfully!!!!!");
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
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnUpdate.setBounds(452, 382, 113, 39);
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
		btnDelete.setBounds(599, 382, 121, 39);
		frame.getContentPane().add(btnDelete);
	}
}
