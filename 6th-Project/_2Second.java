import javax.swing.*;
import java.awt.*;

public class _2Second extends JFrame {
  Font bigfont = new Font("Serif", Font.ITALIC, 48);
  String str = "Oliver";

  public void paint(Graphics pen) {
    super.setTitle("asdasdas");
    super.paint(pen);
    pen.setFont(bigfont);
    pen.drawString(str, 10, 100);
    pen.drawLine(50, 150, 170, 50);
    pen.drawRect(30, 170, 100, 100);
    pen.setColor(Color.GREEN);
    pen.fillRect(20, 50, 100, 80);
  }

  public static void main(String[] args) {
    _2Second second = new _2Second();
    second.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    second.setSize(500, 500);
    second.setVisible(true);
  }
}
