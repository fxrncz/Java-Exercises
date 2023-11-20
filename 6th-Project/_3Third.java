import javax.swing.*;
import java.awt.*;

public class _3Third extends JFrame {
  Container con = getContentPane();

  public _3Third() {
    con.setBackground(Color.CYAN);
    con.setLayout(new FlowLayout());
  }

  public void paint(Graphics g) {
    super.paint(g);
    g.setColor(Color.DARK_GRAY);
    g.fillRect(100, 100, 200, 300);
    g.setColor(Color.ORANGE);
    g.fillRect(200, 200, 300, 350);
    g.clearRect(80, 70, 100, 200);
  }

  public static void main(String[] args) {
    _3Third third = new _3Third();
    third.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    third.setSize(500, 500);
    third.setVisible(true);
  }
}
