import javax.swing.JFrame;

public class Main {
  public static void main(String[] args) {
    Sub sub = new Sub();
    sub.setSize(500, 400);
    sub.setVisible(true);
    sub.setResizable(false);
    sub.setLocationRelativeTo(null);
    sub.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
