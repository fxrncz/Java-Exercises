import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BorderTest extends JFrame {
    private JPanel contentPane;

    public BorderTest() {
        setTitle("Border Color Changer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        contentPane = new JPanel();
        contentPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));

        JButton changeColorButton = new JButton("Change Border Color");
        changeColorButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                changeBorderColor();
            }
        });
        contentPane.add(changeColorButton, BorderLayout.SOUTH);
    }

    private void changeBorderColor() {
        Color newColor = JColorChooser.showDialog(this, "Choose Border Color", Color.BLACK);
        if (newColor != null) {
            contentPane.setBorder(BorderFactory.createLineBorder(newColor, 2));
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception e) {
                    e.printStackTrace();
                }

                BorderTest frame = new BorderTest();
                frame.setVisible(true);
            }
        });
    }
}