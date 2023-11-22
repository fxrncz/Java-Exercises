import javax.swing.*;

public class Information extends JFrame {

  JLabel label = new JLabel("HATDOG");
  JPanel panel = new JPanel();

  public Information() {

    this.setSize(500, 600);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
    this.setResizable(false);
    this.setLocationRelativeTo(null);

    this.add(panel);
    
    panel.add(label);

  }
}