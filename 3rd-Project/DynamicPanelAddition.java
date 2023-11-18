import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DynamicPanelAddition extends JFrame {
    private JPanel mainPanel;

    public DynamicPanelAddition() {
        setTitle("Dynamic Panel Addition");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);

        mainPanel = new JPanel(null); // Use null layout for absolute positioning

        JButton addButton = new JButton("Add Panel");
        addButton.setBounds(10, 10, 120, 30); // Set the position and size of the "Add Panel" button

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addNewPanel();
            }
        });

        JButton deleteButton = new JButton("Delete Panel");
        deleteButton.setBounds(140, 10, 120, 30); // Set the position and size of the "Delete Panel" button

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteLastPanel();
            }
        });

        mainPanel.add(addButton);
        mainPanel.add(deleteButton);
        add(new JScrollPane(mainPanel)); // Use JScrollPane to enable scrolling

        setVisible(true);
    }

    private void addNewPanel() {
        JPanel panel = new JPanel(null); // Use null layout for absolute positioning
        panel.setBounds(37, mainPanel.getComponentCount() * 100 + 10, 312, 88); // Set the position and size of the new panel
        panel.setBackground(Color.GRAY);

        JTextField textField = new JTextField();
        textField.setBounds(10, 11, 272, 30); // Set the position and size of the text field

        JButton innerButton = new JButton("Inner Button");
        innerButton.setBounds(10, 52, 115, 25); // Set the position and size of the inner button

        innerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add action for the inner button if needed
                JOptionPane.showMessageDialog(DynamicPanelAddition.this, "Inner button clicked in panel with text: " + textField.getText());
            }
        });

        panel.add(new JLabel("Text Field: "));
        panel.add(textField);
        panel.add(innerButton);

        mainPanel.add(panel);
        mainPanel.setPreferredSize(new Dimension(400, panel.getY() + 100)); // Update the preferred size of the main panel

        revalidate(); // Revalidate the frame to update the layout
    }

    private void deleteLastPanel() {
        int panelCount = mainPanel.getComponentCount();
        if (panelCount > 1) { // Ensure there is at least one panel remaining
            mainPanel.remove(panelCount - 1); // Remove the last panel
            mainPanel.setPreferredSize(new Dimension(400, mainPanel.getComponent(panelCount - 2).getY() + 100)); // Update the preferred size
            mainPanel.getComponent(panelCount - 2).repaint(); // Repaint the component to fix the issue
            revalidate(); // Revalidate the frame to update the layout
        } else {
            JOptionPane.showMessageDialog(this, "Cannot delete the last panel.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new DynamicPanelAddition();
        });
    }
}