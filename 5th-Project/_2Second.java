import javax.swing.*;
import java.awt.event.*;

public class _2Second extends JFrame implements ActionListener {

  JLabel user = new JLabel("Username:");
  JLabel pass = new JLabel("Password:");
  JTextField txtuser = new JTextField();
  JTextField txtpass = new JTextField();
  JButton button = new JButton("Login");
  JLabel label = new JLabel();
  
  public _2Second() {
    this.setSize(300, 300);
    this.setResizable(false);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);

    this.setLayout(null);

    add(user);
    user.setBounds(10, 30, 100, 30);
    add(txtuser);
    txtuser.setBounds(90, 30, 130, 30);

    add(pass);
    pass.setBounds(10, 80, 100, 30);
    add(txtpass);
    txtpass.setBounds(90, 80, 130, 30);

    add(button);
    button.setBounds(100, 120, 100, 30);

    add(label);
    label.setBounds(100, 150, 100, 30);

    button.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == button) {

      if (txtuser.getText().equals("Admin") && txtpass.getText().equals("1366454")) {
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        JOptionPane.showMessageDialog(null, "Login Successfully");
      } else {
        label.setText("Invalid");
      }
    }
  }

  public static void main(String[] args) {
    _2Second nd = new _2Second();
    nd.setVisible(true);
  }
}
