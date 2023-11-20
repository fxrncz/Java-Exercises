package _4Fourth;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Sub extends JFrame implements ActionListener {

  private JLabel enterName = new JLabel("Username: ");;
  private JTextField inputName = new JTextField();
  private JButton button = new JButton("Submit");
  private static JButton button2 = new JButton("ENTER");
  private String storeName;
  
  public Sub() {

    this.setLayout(null);
    this.setSize(300, 250);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    add(enterName);
    add(inputName);
    add(button);
    add(button2);

    enterName.setBounds(60, 30, 120, 30);
    inputName.setBounds(80, 60, 130, 30);
    button.setBounds(100, 170, 60, 30);
    button2.setBounds(100, 140, 80, 30);

    button.addActionListener(this);
    button2.addActionListener(new Hotdog());
   
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == button) {
      storeName = inputName.getText();
      JOptionPane.showMessageDialog(null, "Hello" + storeName);

    }
  }

  static class Hotdog implements ActionListener {

    public void actionPerformed(ActionEvent e1) {
      if (e1.getSource() == button2) {
        JFrame frame2 = new JFrame();
        frame2.setSize(500, 400);
        frame2.setVisible(true);
        
        JPanel panel1 = new JPanel();
        frame2.add(panel1);
      }
    }    
  }
}
