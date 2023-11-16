import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class ArrayGUI extends JFrame {

  JPanel panel = new JPanel();
  JTextField txt1 = new JTextField();
  ArrayList<String> array = new ArrayList<>();
  
  public ArrayGUI() {
    this.setSize(300, 300);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);
    this.setLocationRelativeTo(null);

    this.add(panel);
    panel.setLayout(null);

    JButton btn1 = new JButton("CLICK ME");
    JButton btn2 = new JButton("DISPLAY");

    panel.add(txt1);
    txt1.setBounds(50, 50, 120, 18);
    txt1.setBackground(new Color(255, 0, 0));
    txt1.setForeground(new Color(255, 255, 255));

    panel.add(btn1);
    btn1.setBounds(90, 130, 150, 35);
    btn1.setBackground(new Color(0, 0, 0));
    btn1.setForeground(new Color(255, 255, 255));
    btn1.setFont(new Font("Century Gothic", Font.BOLD, 18));
    
    btn1.addMouseListener(new MouseAdapter() {

      public void mouseEntered(MouseEvent e) {
        btn1.setBackground(new Color(153, 0, 51));
        btn1.setForeground(new Color(153, 230, 255));
      }

      public void mouseExited(MouseEvent e) {
        btn1.setBackground(new Color(0, 0, 0));
        btn1.setForeground(new Color(255, 255, 255));
      }
    });
    
    btn1.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        String input = txt1.getText();
        if (!input.isEmpty()) {
          array.add(input);
          txt1.setText(null);
        }
      }
      
    });

    panel.add(btn2);
    btn2.setBounds(90, 170, 150, 35);
    btn2.setBackground(new Color(0, 0, 0));
    btn2.setForeground(new Color(255, 255, 255));
    btn2.setFont(new Font("Century Gothic", Font.BOLD, 18));

    btn2.addMouseListener(new MouseAdapter() {

      public void mouseClicked(MouseEvent e) {
        Hatdog op = new Hatdog(array);
        op.setVisible(true);
      }

      public void mouseEntered(MouseEvent e) {
        btn2.setBackground(new Color(153, 0, 51));
        btn2.setForeground(new Color(153, 230, 255));
      }

      public void mouseExited(MouseEvent e) {
        btn2.setBackground(new Color(0, 0, 0));
        btn2.setForeground(new Color(255, 255, 255));
      }
    });
    
    btn2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        StringBuilder sb = new StringBuilder();

        for(String list : array) {
          sb.append(list).append("\n");
        }
      }
    });
  }


  public static void main(String[] args) {
    ArrayGUI obj = new ArrayGUI();
    obj.setVisible(true);
  }
}

class Hatdog extends JFrame{

  TextArea ta = new TextArea();

  public Hatdog(ArrayList<String> arrays) {
    this.setSize(300, 300);
    this.setResizable(false);
    this.setLocationRelativeTo(null);

    ta.setEditable(false);
    this.add(new JScrollPane(ta));

    StringBuilder sa = new StringBuilder();
    for(String lists : arrays) {
      sa.append(lists).append("\n");
    }

    ta.setText(sa.toString());
  }
}
