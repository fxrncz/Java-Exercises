import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScrollableTextFieldAddition {
    private JFrame frame;
    private JPanel mainPanel;
    private JPanel textFieldPanel;
    private JButton addButton;
    private int textFieldCount = 0;

    public ScrollableTextFieldAddition() {
        frame = new JFrame("Scrollable TextField Addition");
        mainPanel = new JPanel(new BorderLayout()); // Use BorderLayout for the main panel
        textFieldPanel = new JPanel(null); // Use null layout for absolute positioning inside the text field panel
        addButton = new JButton("Add Text Field");

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addNewTextField();
            }
        });

        mainPanel.add(addButton, BorderLayout.NORTH); // Add the button to the top of the main panel
        mainPanel.add(new JScrollPane(textFieldPanel), BorderLayout.CENTER); // Use JScrollPane for the text field panel

        frame.add(mainPanel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        frame.setVisible(true);
    }

    private void addNewTextField() {
        JTextField newTextField = new JTextField(20);
        newTextField.setBounds(10, 10 + textFieldCount * 40, 200, 30); // Adjust the position within the text field panel
        textFieldPanel.add(newTextField);
        textFieldCount++;

        textFieldPanel.setPreferredSize(new Dimension(250, 10 + textFieldCount * 40)); // Update the text field panel's preferred size

        mainPanel.revalidate(); // Revalidate the main panel to update the layout
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ScrollableTextFieldAddition();
        });
    }
}