import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UndecoratedMovableFrame extends JFrame {

    private int xOffset, yOffset;

    public UndecoratedMovableFrame() {
        // Set undecorated to true
        setUndecorated(true);

        // Create a custom title bar
        JPanel titleBar = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        titleBar.setBackground(Color.GRAY);

        JLabel titleLabel = new JLabel("Undecorated Movable Frame");
        titleBar.add(titleLabel);

        // Add the title bar to the frame
        add(titleBar, BorderLayout.NORTH);

        // Make the frame movable by dragging the title bar
        titleBar.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                xOffset = e.getX();
                yOffset = e.getY();
            }
        });

        titleBar.addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent e) {
                setLocation(e.getXOnScreen() - xOffset, e.getYOnScreen() - yOffset);
            }
        });

        // Set frame properties
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame on the screen
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(UndecoratedMovableFrame::new);
    }
}