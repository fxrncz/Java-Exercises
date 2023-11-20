import javax.swing.*;
import java.awt.*;

public class _7Sevent extends JFrame {
  
  public void paint(Graphics g) {
    super.paint(g);

    g.drawRect(50, 50, 500, 20);
    g.setColor(Color.getHSBColor(43, 100, 66));
    g.fillRect(50, 50, 500, 20);
  }

  public static void main(String[] args) {
    _7Sevent seven = new _7Sevent();
    seven.setVisible(true);
    seven.setSize(500,500);
    seven.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
