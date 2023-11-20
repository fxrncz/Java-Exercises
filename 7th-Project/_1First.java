import javax.swing.*;
import java.awt.event.*;

public class _1First {
  public static void main(String[] args) {
    
    JFrame frame = new JFrame("Event");
    
    frame.setSize(250, 250);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setResizable(false);

    JPanel panel = new JPanel();
    frame.add(panel);

    JButton button = new JButton("submit");
    
    panel.add(button);

    button.addActionListener(new Hotdog());
  }

    static class Hotdog implements ActionListener {

      public void actionPerformed(ActionEvent e) {
        JFrame frame1 = new JFrame();
        frame1.setSize(100, 100);
        frame1.setVisible(true);

        JLabel label = new JLabel("Bakit mo clinick");
        JPanel panel1 = new JPanel();

        frame1.add(panel1);
        panel1.add(label);
      }
    }
}
