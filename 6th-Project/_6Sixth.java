import javax.swing.*;
import java.awt.*;

public class _6Sixth extends JFrame {
  public void paint(Graphics gfx) {
    super.paint(gfx);
    int xpoints[] = {42, 52, 72, 52, 60, 40, 15, 28, 9, 32, 42};
    int ypoints[] = {38, 62, 68, 80, 105, 85, 102, 75, 58, 60, 38};
    gfx.drawPolygon(xpoints, ypoints, xpoints.length);
  }

  public static void main(String[] args) {
    _6Sixth sixth = new _6Sixth();
    sixth.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    sixth.setSize(500, 500);
    sixth.setVisible(true);
  }
}
