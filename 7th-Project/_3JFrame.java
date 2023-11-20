import javax.swing.*;
import java.awt.event.*;

public class _3JFrame {
  public static void main(String[] args) {
    
    JFrame fr = new JFrame("Frame");

    fr.setSize(500, 500);
    fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fr.setResizable(false);
    fr.setVisible(true);

    JPanel panel = new JPanel();

    fr.add(panel);

    JButton button = new JButton("ENTER");
    panel.add(button);

    button.addActionListener(new Action());
  }

    static class Action implements ActionListener {

      public void actionPerformed (ActionEvent e) {
        JFrame frame1 = new JFrame("Clicked");
        frame1.setVisible(true);
        frame1.setSize(200, 200);

        JLabel label = new JLabel("YOU CLICKED IT!"); 
        JPanel panel1 = new JPanel();

        frame1.add(panel1);
        panel1.add(label);
      }
    }
}
