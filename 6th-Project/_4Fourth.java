import javax.swing.*;
import java.awt.*;

public class _4Fourth extends JFrame {
  public void paint(Graphics gfx) {
    super.paint(gfx);
    int x = 40;
    int y = 60;
    final int WIDTH = 80, HEIGHT = 80;

    gfx.drawRoundRect(x, y, WIDTH, HEIGHT, 50, 30);
  }
  public static void main(String[] args) {
    _4Fourth fourth = new _4Fourth();
    fourth.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fourth.setSize(500, 500);
    fourth.setVisible(true);

  }
}
