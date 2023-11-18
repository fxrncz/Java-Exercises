import javax.swing.*;
import java.awt.event.*;

public class Main2 extends JFrame implements ActionListener {

  JLabel num = new JLabel("Input a number: ");
  JTextField txt = new JTextField();
  JLabel res = new JLabel("Here");
  JButton submit = new JButton("Submit");

  public Main2() {
    this.setSize(250, 250);
    this.setResizable(false);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    this.setLayout(null);

    add(num);
    num.setBounds(50, 10, 100, 20);
    add(txt);
    txt.setBounds(20, 50, 150, 30);
    add(submit);
    submit.setBounds(20, 90, 70, 30);
    add(res);
    res.setBounds(20, 150, 150, 30);

    submit.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == submit){

      int number = Integer.parseInt(txt.getText());

      switch (number) {
        case 1:
          res.setText("Monday");
          break;
        case 2:
          res.setText("Tuesday");
          break;
        case 3:
          res.setText("Wednesday");
          break;
        case 4:
          res.setText("Thursday");
          break;
        case 5:
          res.setText("Friday");
          break;
        case 6:
          res.setText("Saturday");
          break;
        case 7:
          res.setText("Sunday");
          break;
        default:
          res.setText("Out of bounds");
      }
    }
  }

  public static void main(String[] args) {
    Main2 two = new Main2();
    two.setVisible(true);
  }
}
