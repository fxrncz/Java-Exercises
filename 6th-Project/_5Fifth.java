import javax.swing.*;
import java.awt.*;

public class _5Fifth extends JFrame {
  public void paint(Graphics g) {
    super.paint(g);
    final int WIDTH = 60, HEIGHT = 80;
    g.setColor(Color.BLUE);
    g.fill3DRect(20, 40, WIDTH, HEIGHT, true);
    g.fill3DRect(100, 40, WIDTH, HEIGHT, false);
  }

  public static void main(String[] args) {
    _5Fifth fifth = new _5Fifth();
    fifth.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fifth.setSize(180, 150);
    fifth.setVisible(true);
  }
}
