import javax.swing.*;
import javax.swing.border.AbstractBorder;

import java.awt.*;
import java.awt.geom.RoundRectangle2D;

// Custom JTextField component with rounded corners
class RoundedJTextField extends JTextField {
    private int arcWidth;
    private int arcHeight;

    // Constructor to set the number of columns, arcWidth, and arcHeight
    public RoundedJTextField(int columns, int arcWidth, int arcHeight) {
        super(columns);
        this.arcWidth = arcWidth;
        this.arcHeight = arcHeight;
        setOpaque(false); // Make the text field transparent
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (!isOpaque() && getBorder() instanceof RoundedBorder) {
            Graphics2D g2 = (Graphics2D) g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(getBackground());

            // Draw the rounded background
            g2.fill(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), arcWidth, arcHeight));
        }
        super.paintComponent(g);
    }

    @Override
    protected void paintBorder(Graphics g) {
        if (getBorder() instanceof RoundedBorder) {
            Graphics2D g2 = (Graphics2D) g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(getForeground());

            // Draw the rounded border
            g2.draw(new RoundRectangle2D.Double(0, 0, getWidth() - 1, getHeight() - 1, arcWidth, arcHeight));
        } else {
            super.paintBorder(g);
        }
    }
}

// Custom border for the rounded text field
class RoundedBorder extends AbstractBorder {
    private int arcWidth;
    private int arcHeight;

    // Constructor to set the arcWidth and arcHeight
    public RoundedBorder(int arcWidth, int arcHeight) {
        this.arcWidth = arcWidth;
        this.arcHeight = arcHeight;
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(c.getForeground());

        // Draw the rounded border
        g2.draw(new RoundRectangle2D.Double(x, y, width - 1, height - 1, arcWidth, arcHeight));
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(arcHeight, arcWidth, arcHeight, arcWidth);
    }

    @Override
    public Insets getBorderInsets(Component c, Insets insets) {
        insets.left = insets.top = insets.right = insets.bottom = Math.max(arcWidth, arcHeight);
        return insets;
    }
}

public class RoundedJTextFieldExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Rounded JTextField Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);

            JPanel panel = new JPanel();
            frame.add(panel);

            int arcWidth = 35;
            int arcHeight = 10;

            // Create a rounded text field
            RoundedJTextField textField = new RoundedJTextField(20, arcWidth, arcHeight);
            textField.setBorder(new RoundedBorder(arcWidth, arcHeight));
            panel.add(textField);

            frame.setVisible(true);
        });
    }
}