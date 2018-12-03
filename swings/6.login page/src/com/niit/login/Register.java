package com.niit.login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Register extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
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
	public Register() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Raksh\\Downloads\\icons\\help-desk-png-31.png"));
		setTitle("REGISTER");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 464, 455);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(247, 54, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(247, 116, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(247, 178, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(247, 244, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(247, 306, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.setBounds(86, 362, 89, 23);
		contentPane.add(btnSubmit);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
              
			}
		});
		btnCancel.setBounds(244, 362, 89, 23);
		contentPane.add(btnCancel);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setBounds(56, 57, 46, 14);
		contentPane.add(lblName);
		
		JLabel lblAddress = new JLabel("ADDRESS");
		lblAddress.setBounds(56, 119, 46, 14);
		contentPane.add(lblAddress);
		
		JLabel lblPhoneNo = new JLabel("PHONE NO");
		lblPhoneNo.setBounds(56, 181, 60, 14);
		contentPane.add(lblPhoneNo);
		
		JLabel lblUid = new JLabel("UID");
		lblUid.setBounds(56, 247, 46, 14);
		contentPane.add(lblUid);
		
		JLabel lblPanNo = new JLabel("PAN NO");
		lblPanNo.setBounds(56, 309, 46, 14);
		contentPane.add(lblPanNo);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("F:\\hd wallpapers\\wallpaper\\299743.jpg"));
		lblNewLabel.setBounds(-637, -167, 1970, 914);
		contentPane.add(lblNewLabel);
		setVisible(true);
	}

}
