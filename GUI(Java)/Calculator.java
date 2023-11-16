package obj;

import java.awt.EventQueue;
import javax.swing.border.EmptyBorder;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Calculator extends JFrame implements ActionListener{

	private JPanel contentPane;
	
	JButton[] numButtons = new JButton[10];
	JButton[] funcButton = new JButton[9];
	JButton decButton, equButton, delButton, clrButton, negButton;
	JButton addButton,subButton,mulButton,divButton;
	double num1=0,num2=0,result=0;
	char operator;
	private JTextField textfield;

	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setBackground(new Color(204, 204, 255));
		contentPane.setLayout(null);
		
		textfield = new JTextField();
		textfield.setBackground(new Color(255, 179, 204));
		textfield.setForeground(Color.WHITE);
		textfield.setFont(new Font("Blue", Font.BOLD, 20));
		textfield.setHorizontalAlignment(SwingConstants.CENTER);
		textfield.setBounds(44, 29, 246, 35);
		contentPane.add(textfield);
		textfield.setColumns(10);
		
		addButton = new JButton("+");
		subButton = new JButton("-");
		mulButton = new JButton("*");
		divButton = new JButton("/");
		decButton = new JButton(".");
		equButton = new JButton("=");
		delButton = new JButton("DELETE");
		clrButton = new JButton("CLEAR");
		negButton = new JButton("(-)");

		funcButton[0] = addButton;
		funcButton[1] = subButton;
		funcButton[2] = mulButton;
		funcButton[3] = divButton;
		funcButton[4] = decButton;
		funcButton[5] = equButton;
		funcButton[6] = delButton;
		funcButton[7] = clrButton;
		funcButton[8] = negButton;
		
		for(int i =0;i<9;i++) {
			funcButton[i].addActionListener(this);
			funcButton[i].setFocusable(false);
			funcButton[i].setFont(new Font("Blue", Font.BOLD, 20));
			funcButton[i].setBackground(new Color(255, 179, 204));
			funcButton[i].setForeground(Color.WHITE);
		}
		
		for(int i =0;i<10;i++) {
			numButtons[i] = new JButton(String.valueOf(i));
			numButtons[i].addActionListener(this);
			numButtons[i].setFont(new Font("Blue", Font.BOLD, 20));
			numButtons[i].setFocusable(false);
			numButtons[i].setBackground(new Color(255, 179, 204));
			numButtons[i].setForeground(Color.WHITE);
		}

		numButtons[1].setBounds(44, 75, 61, 45);
		contentPane.add(numButtons[1]);
		
		
		numButtons[2].setBounds(109, 75, 61, 45);
		contentPane.add(numButtons[2]);
		
		numButtons[3].setBounds(174, 75, 61, 45);
		contentPane.add(numButtons[3]);
		
		funcButton[0].setBounds(242, 75, 48, 45);
		contentPane.add(funcButton[0]);
		
		numButtons[4].setBounds(44, 131, 61, 45);
		contentPane.add(numButtons[4]);

		numButtons[5].setBounds(109, 131, 61, 45);
		contentPane.add(numButtons[5]);
		
		numButtons[6].setBounds(174, 131, 61, 45);
		contentPane.add(numButtons[6]);
		
		funcButton[1].setBounds(242, 131, 48, 45);
		contentPane.add(funcButton[1]);
		
		numButtons[7].setBounds(44, 187, 61, 45);
		contentPane.add(numButtons[7]);
		
		numButtons[8].setBounds(109, 187, 61, 45);
		contentPane.add(numButtons[8]);
		
		numButtons[9].setBounds(174, 187, 61, 45);
		contentPane.add(numButtons[9]);
		
		funcButton[2].setBounds(242, 187, 48, 45);
		contentPane.add(funcButton[2]);
		
		funcButton[4].setBounds(44, 243, 61, 45);
		contentPane.add(funcButton[4]);
		
		numButtons[0].setBounds(109, 243, 61, 45);
		contentPane.add(numButtons[0]);
		
		funcButton[5].setBounds(174, 243, 61, 45);
		contentPane.add(funcButton[5]);
		
		funcButton[3].setBounds(242, 243, 48, 45);
		contentPane.add(funcButton[3]);
		
		funcButton[6].setBounds(44, 302, 116, 45);
		contentPane.add(funcButton[6]);
		
		funcButton[7].setBounds(174, 302, 116, 45);
		contentPane.add(funcButton[7]);

	}
	
	public void actionPerformed(ActionEvent e) {
		
		for(int i=0;i<10;i++) {
			if(e.getSource() == numButtons[i]) {
				textfield.setText(textfield.getText().concat(String.valueOf(i)));
			}
		}

		if(e.getSource()==decButton) {
			textfield.setText(textfield.getText().concat("."));
		}

		if(e.getSource()==addButton) {
			num1 = Double.parseDouble(textfield.getText());
			operator ='+';
			textfield.setText("");
		}

		if(e.getSource()==subButton) {
			num1 = Double.parseDouble(textfield.getText());
			operator ='-';
			textfield.setText("");
		}

		if(e.getSource()==mulButton) {
			num1 = Double.parseDouble(textfield.getText());
			operator ='*';
			textfield.setText("");
		}

		if(e.getSource()==divButton) {
			num1 = Double.parseDouble(textfield.getText());
			operator ='/';
			textfield.setText("");
		}

		if(e.getSource()==equButton) {
			num2=Double.parseDouble(textfield.getText());
			switch(operator) {
				case'+':
					result = num1 + num2;
					break;
				case'-':
					result = num1 - num2;
					break;
				case'*':
					result = num1 * num2;
					break;
				case'/':
					result = num1 / num2;
					break;
			}
			textfield.setText(String.valueOf(result));
			num1=result;
		}

		if(e.getSource()==clrButton) {
			textfield.setText("");
		}

		if(e.getSource()==delButton) {
			String string = textfield.getText();
			textfield.setText("");
			for(int i=0;i<string.length()-1;i++) {
				textfield.setText(textfield.getText()+string.charAt(i));
			}
		}

		if(e.getSource()==negButton) {
			double temp = Double.parseDouble(textfield.getText());
			temp*=-1;
			textfield.setText(String.valueOf(temp));
		}
	}


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
