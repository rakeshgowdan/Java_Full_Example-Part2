package com.niit.login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Toolkit;

public class Login {

	private JFrame frmLogin;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
   Connection conn=null;
	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
		conn=SqlConnection.DbConnector();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setTitle("LOGIN");
		frmLogin.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Raksh\\Downloads\\icons\\kisspng-computer-icons-user-clip-art-user-5abf13db5624e4.1771742215224718993529.png"));
		frmLogin.setBounds(100, 100, 544, 391);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI Historic", Font.BOLD, 14));
		textField.setBounds(307, 59, 113, 20);
		frmLogin.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Segoe UI Historic", Font.BOLD, 14));
		textField_1.setBounds(307, 112, 113, 20);
		frmLogin.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblUserId = new JLabel("USER ID");
		lblUserId.setForeground(Color.WHITE);
		lblUserId.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblUserId.setBounds(64, 62, 86, 14);
		frmLogin.getContentPane().add(lblUserId);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPassword.setBounds(64, 115, 96, 14);
		frmLogin.getContentPane().add(lblPassword);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=textField.getText();
				String pass=textField_1.getText();
				
				/*if(name.equalsIgnoreCase("java") && pass.equals("java"))
			    {
			      JOptionPane.showMessageDialog(frame,"login successful");
			      
			      Window w=new Window();
			    }
			    else
			    {
			    	 JOptionPane.showMessageDialog(frame,"ERROR!!!!login Unsuccessful");
			    }*/
				
				try {
					String query="select * from user where name=? and password=?";
					PreparedStatement pst=conn.prepareStatement(query);
					pst.setString(1,name);
					pst.setString(2,pass);
					ResultSet rs=pst.executeQuery();
					
					int count=0;
					while(rs.next())
					{
						count++;
					}
					if(count==1)
					{
						frmLogin.dispose();
						Data d=new Data();
						
					}else if(count>1)
					{
						JOptionPane.showMessageDialog(frmLogin,"ERROR!!!! duplicate password");
					}else
					{
						JOptionPane.showMessageDialog(frmLogin,"ERROR!!!! incorrect user name n pass");
					}
				}
				catch(Exception ie)
				{
					JOptionPane.showMessageDialog(null,ie);
				}
			  }
			
		});
		btnSubmit.setFont(new Font("Segoe UI Historic", Font.BOLD, 11));
		btnSubmit.setBounds(64, 174, 89, 23);
		frmLogin.getContentPane().add(btnSubmit);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmLogin.dispose();
			}
		});
		btnCancel.setFont(new Font("Segoe UI Historic", Font.BOLD, 11));
		btnCancel.setBounds(344, 174, 89, 23);
		frmLogin.getContentPane().add(btnCancel);
		
		JButton btnNewUserSign = new JButton("NEW USER? SIGN UP");
		btnNewUserSign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Register R=new Register();
			}
		});
		btnNewUserSign.setFont(new Font("Segoe UI Historic", Font.BOLD, 12));
		btnNewUserSign.setBounds(179, 231, 163, 23);
		frmLogin.getContentPane().add(btnNewUserSign);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("F:\\hd wallpapers\\Wood-Wallpaper-1080p.jpg"));
		lblNewLabel.setBounds(0, 0, 528, 352);
		frmLogin.getContentPane().add(lblNewLabel);
	}
}
