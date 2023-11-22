import javax.swing.*;
import java.awt.event.*;

public class Welcome extends JPanel implements ActionListener {

  JButton start = new JButton("Start");
  JButton exit = new JButton("Exit");

  public Welcome() {
    this.setLayout(null);

    add(start);
    start.setBounds(100, 100, 100, 40);

    add(exit);
    exit.setBounds(200, 100, 100, 40);

    start.addActionListener(this);
    exit.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == exit) {
      System.exit(0);
    } if (e.getSource() == start) {
      Information ifm = new Information();
      ifm.setVisible(true);
    }
  }
}
