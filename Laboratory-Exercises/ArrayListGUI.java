import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ArrayListGUI {
    private JFrame frame;
    private JTextField textField;
    private JButton addButton;
    private ArrayList<String> arrayList;

    public ArrayListGUI() {
        frame = new JFrame("ArrayList GUI Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        textField = new JTextField(20);
        addButton = new JButton("Add to ArrayList");

        arrayList = new ArrayList<>();

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                if (!text.isEmpty()) {
                    arrayList.add(text);
                    textField.setText(""); // Clear the text field
                }
            }
        });

        frame.add(textField);
        frame.add(addButton);

        JButton displayButton = new JButton("Display ArrayList");
        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ArrayListDisplay(arrayList); // Open the second JFrame
            }
        });

        frame.add(displayButton);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ArrayListGUI());
    }
}

class ArrayListDisplay {
  private JFrame frame;
  private JTextArea textArea;

  public ArrayListDisplay(ArrayList<String> arrayList) {
      frame = new JFrame("ArrayList Display");
      frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

      textArea = new JTextArea(10, 30);
      textArea.setEditable(false); // Make the text area read-only

      frame.add(new JScrollPane(textArea));

      StringBuilder sb = new StringBuilder();
      for (String element : arrayList) {
          sb.append(element).append("\n");
      }
      textArea.setText(sb.toString());

      frame.pack();
      frame.setVisible(true);
  }
}