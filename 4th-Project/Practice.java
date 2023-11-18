import javax.swing.*;
import java.awt.event.*;

public class Practice extends JFrame implements ActionListener {

  JPanel con = new JPanel(); 
  JLabel label = new JLabel("Input a number:");
  JTextField txt = new JTextField();
  JButton button = new JButton("Submit");
  JLabel result = new JLabel("Here");
  
  public Practice() {
    this.setSize(500, 500);
    this.setResizable(false);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    this.add(con);
    con.setLayout(null);

    con.add(label);
    label.setBounds(50, 50, 100, 20);
    con.add(txt);
    txt.setBounds(150, 50, 100, 25);
    con.add(button);
    button.setBounds(100, 100, 100, 30);
    con.add(result);
    result.setBounds(100, 200, 100, 30);

    button.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == button) {

      Double doub = Double.parseDouble(txt.getText());

      if (doub < 1) {
        result.setText("Negative || Small ");
      } else if (doub == 0) {
        result.setText("Zero");
      } else if (doub > 0 && doub < 1000000) {
        result.setText("Positive");
      } else if (doub > 1000000) {
        result.setText("Large");
      }
    }
  }
}
