import javax.swing.*;
import javax.swing.text.NumberFormatter;

import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;

public class Practice extends JFrame {

  JPanel panel = new JPanel();
  JButton btn1 = new JButton("RED");
  JButton btn2 = new JButton("BLUE");
  JButton btn3 = new JButton("GREEN");

  JButton math = new JButton("Add");

  public Practice() {
    this.setSize(500, 400);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    this.setResizable(false);

    this.add(panel);
    panel.setLayout(null);
    panel.setBackground(new Color(255, 255, 255));

    panel.add(btn1);
    btn1.setBounds(180, 50, 100, 30);
    btn1.setBackground(new Color(255, 0, 0));
    btn1.setForeground(new Color(255, 255, 255));
    btn1.setFont(new Font("Century Gothic", Font.BOLD, 15));

    panel.add(btn2);
    btn2.setBounds(180, 90, 100, 30);
    btn2.setBackground(new Color(0, 102, 255));
    btn2.setForeground(new Color(255, 255, 255));
    btn2.setFont(new Font("Century Gothic", Font.BOLD, 15));

    panel.add(btn3);
    btn3.setBounds(180, 130, 100, 30);
    btn3.setBackground(new Color(0, 153, 0));
    btn3.setForeground(new Color(255, 255, 255));
    btn3.setFont(new Font("Century Gothic", Font.BOLD, 15));

    panel.add(math);
    math.setBounds(180, 180, 100, 30);
    math.setBackground(new Color(0, 0, 0));
    math.setForeground(new Color(255, 255, 255));
    math.setFont(new Font("Century Gothic", Font.BOLD, 15));

    btn1.addMouseListener(new MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        panel.setBackground(new Color(255, 0, 0));
      }
    });

    btn2.addMouseListener(new MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        panel.setBackground(new Color(0, 102, 255));
      }
    });

    btn3.addMouseListener(new MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        panel.setBackground(new Color(0, 153, 0));
      }
    });

    math.addMouseListener(new MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        Adding obj = new Adding();
        obj.setVisible(true);
        dispose();
      }
    });
  }
  
  public static void main(String[] args) {
    Practice obj = new Practice();
    obj.setVisible(true);
  }
}

class Adding extends JFrame {

  

  JPanel panel = new JPanel();
  
  JButton add = new JButton("ADD");
  JLabel output = new JLabel("A");

  public Adding() {
    this.setSize(400, 400);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    this.setResizable(false);

    NumberFormatter numberFormatter = new NumberFormatter();
    numberFormatter.setValueClass(Integer.class);
    numberFormatter.setMinimum(0);
    numberFormatter.setMaximum(Integer.MAX_VALUE);
    numberFormatter.setAllowsInvalid(false);

    JFormattedTextField num1 = new JFormattedTextField(numberFormatter);
    JFormattedTextField num2 = new JFormattedTextField(numberFormatter);

    this.add(panel);
    panel.setLayout(null);

    panel.add(num1);
    num1.setBounds(95, 50, 200, 30);

    panel.add(num2);
    num2.setBounds(95, 100, 200, 30);

    panel.add(add);
    add.setBounds(115, 150, 150, 30);

    panel.add(output);
    output.setBounds(95, 200, 200, 30);

    add.addMouseListener(new MouseAdapter() {
      
      public void mouseClicked(MouseEvent e) {
        Integer n1 = (Integer) num1.getValue();
        Integer n2 = (Integer) num2.getValue();

        int res = n1 + n2;

        output.setText(res + "");
      }
    });
  }
}