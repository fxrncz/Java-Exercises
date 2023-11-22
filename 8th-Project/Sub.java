import javax.swing.*;
import java.awt.*;

import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.*;


public class Sub extends JFrame { 

  Welcome wc = new Welcome();
  BufferedImage image;

  public Sub() {

    this.add(wc);
    wc.setVisible(true);

    try {
      image = ImageIO.read(getClass().getResourceAsStream("19.jpg"));
    } catch (IOException io) {
      io.printStackTrace();
    }
  }

  public void paint(Graphics g) {
    g.drawImage(image, 0, 0, 500, 400, null);
  }
}
