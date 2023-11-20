import javax.swing.*;
import java.awt.event.*;

public class _2Second {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Main");

    frame.setSize(250, 250);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.setResizable(false);

    JPanel panel = new JPanel();
    frame.add(panel);

    JButton button = new JButton("PRESS");

    panel.add(button);

    button.addActionListener(new PressedButton());
  }

  static class PressedButton implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      JFrame frame2 = new JFrame("Pressed");
      
      frame2.setSize(100, 100);
      frame2.setVisible(true);

      JPanel panel2 = new JPanel();
      frame2.add(panel2);
      
      JLabel label = new JLabel("Pressed");

      panel2.add(label);
    }
  }
}
