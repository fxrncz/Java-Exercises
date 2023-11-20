import javax.swing.*;
import java.awt.*;

public class OLIVER_Francis_10TM1_CP3_0520 extends JFrame {

  public void paint(Graphics gfx) {
    super.paint(gfx);
    Font f = new Font("Arial", Font.BOLD, 70);
    Font ace = new Font("Arial", Font.BOLD, 90);
    String first = "f";
    String second = "acebook";
    int x = 40;
    int y = 60;
    final int WIDTH = 80, HEIGHT = 80;

    gfx.setFont(f);
    gfx.setColor(Color.BLUE);
    gfx.drawString(second, 125, 138);

    gfx.drawRoundRect(x, y, WIDTH, HEIGHT, 10, 10);
    gfx.setColor(Color.blue);
    gfx.fillRoundRect(x, y, WIDTH, HEIGHT, 10, 10);
  
    gfx.setFont(ace);
    gfx.setColor(Color.WHITE);
    gfx.drawString(first, 78, 142);
  }

  public static void main(String[] args) {
    OLIVER_Francis_10TM1_CP3_0520 seven = new OLIVER_Francis_10TM1_CP3_0520();
    seven.setSize(500, 200);
    seven.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    seven.setVisible(true);
  }
}
