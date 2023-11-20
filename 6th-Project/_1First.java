import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class _1First extends JFrame implements ActionListener {
  JButton pressButton = new JButton("ENTER");

  public _1First() {
    setTitle("Painterist");
    setLayout(new FlowLayout());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    add(pressButton);
    pressButton.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e) {
    System.out.println("Button is pressed");
    repaint();
  }

  public void paint(Graphics g) {
    super.paint(g);
    System.out.println("In paint method");
  }

  public static void main(String[] args) {
   _1First first = new _1First();
   first.setSize(500, 500);
   first.setVisible(true);
  }
  
}