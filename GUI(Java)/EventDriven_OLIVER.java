import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventDriven_OLIVER extends JFrame implements ActionListener{

  JPanel panel = new JPanel();

  JLabel lbFname = new JLabel("First Name:");
  JTextField txtFname = new JTextField();

  JLabel lbLname = new JLabel("Last name:");
  JTextField txtLname = new JTextField();

  JLabel lbMname = new JLabel("Middle Name:");
  JTextField txtMname = new JTextField();

  JLabel lbMobile = new JLabel("Mobile Number:");
  JTextField txtMobile = new JTextField();

  JLabel lbEmail = new JLabel("Email:");
  JTextField txtEmail = new JTextField();

  JButton submit = new JButton("Submit");
  JButton clear = new JButton("Clear");


  public EventDriven_OLIVER() {
    
    this.setSize(500, 350);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);
    this.setLocationRelativeTo(null);
    this.setUndecorated(false);
    

    this.add(panel);
    panel.setLayout(null);

    panel.add(lbFname);
    lbFname.setBounds(215, 0, 100, 50);
    lbFname.setFont(new Font("Century Gothic", Font.BOLD, 13));
    panel.add(txtFname);
    txtFname.setBounds(150, 35, 200, 20);
    txtFname.setBackground(new Color(229, 229, 220));
    txtFname.setForeground(new Color(38, 73, 92));
    txtFname.setFont(new Font("Century Gothic", Font.BOLD, 15));

    panel.add(lbLname);
    lbLname.setBounds(215, 45, 100, 50);
    lbLname.setFont(new Font("Century Gothic", Font.BOLD, 13));
    panel.add(txtLname);
    txtLname.setBounds(150, 80, 200, 20);
    txtLname.setBackground(new Color(229, 229, 220));
    txtLname.setForeground(new Color(38, 73, 92));
    txtLname.setFont(new Font("Century Gothic", Font.BOLD, 15));

    panel.add(lbMname);
    lbMname.setBounds(215, 90, 250, 50);
    lbMname.setFont(new Font("Century Gothic", Font.BOLD, 13));
    panel.add(txtMname);
    txtMname.setBounds(150, 125, 200, 20);
    txtMname.setBackground(new Color(229, 229, 220));
    txtMname.setForeground(new Color(38, 73, 92));
    txtMname.setFont(new Font("Century Gothic", Font.BOLD, 15));

    panel.add(lbMobile);
    lbMobile.setBounds(215, 135, 200, 50);
    lbMobile.setFont(new Font("Century Gothic", Font.BOLD, 13));
    panel.add(txtMobile);
    txtMobile.setBounds(150, 170, 200, 20);
    txtMobile.setBackground(new Color(229, 229, 220));
    txtMobile.setForeground(new Color(38, 73, 92));
    txtMobile.setFont(new Font("Century Gothic", Font.BOLD, 15));

    panel.add(lbEmail);
    lbEmail.setBounds(215, 180, 100, 50);
    lbEmail.setFont(new Font("Century Gothic", Font.BOLD, 13));
    panel.add(txtEmail);
    txtEmail.setBounds(150, 215, 200, 20);
    txtEmail.setBackground(new Color(229, 229, 220));
    txtEmail.setForeground(new Color(38, 73, 92));
    txtEmail.setFont(new Font("Century Gothic", Font.BOLD, 15));

    panel.add(submit);
    submit.setBounds(150, 250, 90, 35);
    submit.setBackground(new Color(38, 73, 92));
    submit.setForeground(new Color(229, 229, 220));
    submit.setFont(new Font("Century Gothic", Font.BOLD, 13));

    panel.add(clear);
    clear.setBounds(259, 250, 90, 35);
    clear.setBackground(new Color(38, 73, 92));
    clear.setForeground(new Color(229, 229, 220));
    clear.setFont(new Font("Century Gothic", Font.BOLD, 13));

    submit.addMouseListener(new MouseAdapter() {
      
      public void mouseEntered(MouseEvent e) {
        submit.setBackground(new Color(3, 0, 46));
      }

      public void mouseExited(MouseEvent e) {
        submit.setBackground(new Color(38, 73, 92));
      }

    });

    clear.addMouseListener(new MouseAdapter() {
      
      public void mouseEntered(MouseEvent e) {
        clear.setBackground(new Color(3, 0, 46));
      }

      public void mouseExited(MouseEvent e) {
        clear.setBackground(new Color(38, 73, 92));
      }

    });

    submit.addActionListener(this);
    clear.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e) {

    if (e.getSource() == submit) {

      if (txtFname.getText().isEmpty() || txtLname.getText().isEmpty() || txtMname.getText().isEmpty() || txtMobile.getText().isEmpty() || txtEmail.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please, input information!", "WARNING", JOptionPane.YES_OPTION);
      } else {
        Output op = new Output(txtFname.getText(), txtLname.getText(), txtMname.getText(), txtMobile.getText(), txtEmail.getText());
        op.setVisible(true);
        dispose();
      }

      
    } else if (e.getSource() == clear) {
      txtFname.setText(null);
      txtLname.setText(null);
      txtMname.setText(null);
      txtMobile.setText(null);
      txtEmail.setText(null);
    }
  }

  public static void main(String[] args) {
    EventDriven_OLIVER obj = new EventDriven_OLIVER();
    obj.setVisible(true);
  }
}


class Output extends JFrame implements ActionListener {

  JPanel panel = new JPanel();

  JLabel fname = new JLabel("First name: ");
  JLabel lname = new JLabel("Last name: ");
  JLabel mname = new JLabel("Middle name: ");
  JLabel mobile = new JLabel("Mobile: ");
  JLabel email = new JLabel("Email: ");

  JLabel j1 = new JLabel("a");
  JLabel j2 = new JLabel("a");
  JLabel j3 = new JLabel("a");
  JLabel j4 = new JLabel("a");
  JLabel j5 = new JLabel("a");

  JButton okay = new JButton("Okay");


  public Output(String input1, String input2, String input3, String input4, String input5) {
    
    j1.setText(input1);
    j2.setText(input2);
    j3.setText(input3);
    j4.setText(input4);
    j5.setText(input5);
    
    this.setSize(500, 300);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);
    this.setLocationRelativeTo(null);
    this.setUndecorated(false);

    this.add(panel);
    panel.setLayout(null);

    panel.add(fname);
    fname.setBounds(50, 0, 100, 100);
    fname.setFont(new Font("Century Gothic", Font.BOLD, 15));
    panel.add(lname);
    lname.setBounds(50, 30, 200, 100);
    lname.setFont(new Font("Century Gothic", Font.BOLD, 15));
    panel.add(mname);
    mname.setBounds(50, 60, 200, 100);
    mname.setFont(new Font("Century Gothic", Font.BOLD, 15));
    panel.add(mobile);
    mobile.setBounds(50, 90, 200, 100);
    mobile.setFont(new Font("Century Gothic", Font.BOLD, 15));
    panel.add(email);
    email.setBounds(50, 120, 200, 100);
    email.setFont(new Font("Century Gothic", Font.BOLD, 15));
    
    panel.add(j1);
    j1.setBounds(160, 0, 100, 100);
    j1.setFont(new Font("Century Gothic", Font.BOLD, 15));
    panel.add(j2);
    j2.setBounds(160, 30, 100, 100);
    j2.setFont(new Font("Century Gothic", Font.BOLD, 15));
    panel.add(j3);
    j3.setBounds(160, 60, 200, 100);
    j3.setFont(new Font("Century Gothic", Font.BOLD, 15));
    panel.add(j4);
    j4.setBounds(160, 90, 200, 100);
    j4.setFont(new Font("Century Gothic", Font.BOLD, 15));
    panel.add(j5);
    j5.setBounds(160, 120, 200, 100);
    j5.setFont(new Font("Century Gothic", Font.BOLD, 15));

    panel.add(okay);
    okay.setBounds(160, 190, 90, 35);
    okay.setBackground(new Color(38, 73, 92));
    okay.setForeground(new Color(229, 229, 220));
    okay.setFont(new Font("Century Gothic", Font.BOLD, 15));

    okay.addMouseListener(new MouseAdapter(){

      public void mouseEntered(MouseEvent e) {
        okay.setBackground(new Color(3, 0, 46));
      }

      public void mouseExited(MouseEvent e) {
        okay.setBackground(new Color(38, 73, 92));
      }
    });

    okay.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e) {
    if(e.getSource() == okay) {
      EventDriven_OLIVER ly = new EventDriven_OLIVER();
      ly.setVisible(true);
      dispose();
    }
  }
}




