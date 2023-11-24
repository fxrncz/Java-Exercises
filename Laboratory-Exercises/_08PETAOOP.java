package test;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class _08PETAOOP extends JFrame {

	private JPanel contentPane;
	private JTextField txtname;
	
	public _08PETAOOP() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 343, 150);
		setResizable(false);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(BorderFactory.createLineBorder(new Color(17, 124, 170), 6));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter your name: ");
		lblNewLabel.setFont(new Font("Lucida Fax", Font.PLAIN, 12));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(22, 21, 110, 14);
		contentPane.add(lblNewLabel);
		
		txtname = new JTextField();
		txtname.setFont(new Font("Lucida Fax", Font.PLAIN, 12));
		txtname.setBounds(142, 19, 99, 20);
		contentPane.add(txtname);
		txtname.setColumns(10);
		
		
		JLabel lblNewLabel_1 = new JLabel("Press 1 or 2 to select your game mode.");
		lblNewLabel_1.setFont(new Font("Lucida Fax", Font.PLAIN, 12));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(22, 46, 297, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("2 - Survival");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Lucida Fax", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(22, 83, 77, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("1 - Story");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Lucida Fax", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(22, 67, 77, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel output = new JLabel("Press 'P' to start playing, .");
		output.setForeground(Color.WHITE);
		output.setFont(new Font("Lucida Fax", Font.PLAIN, 12));
		output.setBounds(22, 108, 297, 14);
		contentPane.add(output);
		
		txtname.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String userName = txtname.getText();
				output.setText("Press 'P' to start playing, " + userName + ".");
			}
			
		});
		
		
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_08PETAOOP frame = new _08PETAOOP();
					frame.setUndecorated(true);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
