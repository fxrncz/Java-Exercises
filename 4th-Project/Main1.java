import javax.swing.*;
import java.awt.event.*;

public class Main1 extends JFrame implements ActionListener {
  
  JPanel panel = new JPanel();
  JLabel num1 = new JLabel("First Number: ");
  JLabel num2 = new JLabel("Second Number: ");
  JLabel num3 = new JLabel("Third Number: ");
  JTextField txtnum1 = new JTextField();
  JTextField txtnum2 = new JTextField();
  JTextField txtnum3 = new JTextField();
  JButton submit = new JButton("Enter");

  JLabel res = new JLabel("Here");

  public Main1() {
    this.setSize(500, 500);
    this.setResizable(false);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    this.add(panel);
    panel.setLayout(null);

    panel.add(num1);
    num1.setBounds(50, 50, 100, 20);
    panel.add(txtnum1);
    txtnum1.setBounds(150, 50, 150, 20);

    panel.add(num2);
    num2.setBounds(50, 150, 100, 20);
    panel.add(txtnum2);
    txtnum2.setBounds(150, 150, 150, 20);

    panel.add(num3);
    num3.setBounds(50, 250, 100, 20);
    panel.add(txtnum3);
    txtnum3.setBounds(150, 250, 150, 20);

    panel.add(submit);
    submit.setBounds(100, 300, 150, 25);

    panel.add(res);
    res.setBounds(100, 350, 250, 25);

    submit.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == submit) {

      double number1 = Double.parseDouble(txtnum1.getText());
      double number2 = Double.parseDouble(txtnum2.getText());
      double number3 = Double.parseDouble(txtnum3.getText());
      
      if (number1 > number2 && number1 > number3) {
        res.setText("The greatest number is " + number1);
      } else if (number2 > number1 && number2 > number3) {
        res.setText("The greatest number is " + number2);
      } else if (number3 > number1 && number3 > number2) {
        res.setText("The greatest number is " + number3);
      } 
    }
  }

  public static void main(String[] args) {
    Main1 run = new Main1();
    run.setVisible(true);
  }
}
