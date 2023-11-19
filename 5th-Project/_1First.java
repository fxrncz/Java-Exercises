import javax.swing.*;
import java.awt.event.*;

public class _1First extends JFrame implements ActionListener {

  JLabel num1 = new JLabel("First Number:");
  JLabel num2 = new JLabel("Second Number: ");
  JTextField txtnum1 = new JTextField();
  JTextField txtnum2 = new JTextField();
  JButton submit = new JButton("Submit");
  JLabel blank = new JLabel("Here");

  public _1First() {
    this.setSize(300, 300);
    this.setResizable(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);

    this.setLayout(null);

    add(num1);
    num1.setBounds(30, 20, 100, 30);
    add(txtnum1);
    txtnum1.setBounds(130, 20, 100, 30);

    add(num2);
    num2.setBounds(30, 60, 100, 30);
    add(txtnum2);
    txtnum2.setBounds(130, 60, 100, 30);

    add(submit);
    submit.setBounds(50, 100, 100, 30);

    add(blank);
    blank.setBounds(50, 150, 100, 30);

    submit.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == submit) {

      float number1 = Float.parseFloat(txtnum1.getText());
      float number2 = Float.parseFloat(txtnum2.getText());

      if (number1 == number2 && number2 == number1){
        blank.setText("Equal");
      } else {
        blank.setText("Not Equal");
      }
    }
  }

  public static void main(String[] args) {
    _1First first = new _1First();
    first.setVisible(true);
  }
}