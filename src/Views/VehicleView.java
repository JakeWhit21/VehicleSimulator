package Views;
import javax.swing.*;
import java.awt.event.ActionListener;

public class VehicleView {
    private JFrame frame;
    private JTextField makeText;
    private JButton createVehicleButton;
    private JLabel outputMakeLabel;

    public VehicleView() {
        // Create a new JFrame (window)
        frame = new JFrame("Create a vehicle");
        frame.setSize(700, 700);  // Set the size of the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Close the application when the window is closed

        // Create a JPanel (container for components)
        JPanel panel = new JPanel();
        panel.setLayout(null); // Set the layout of the panel
        frame.add(panel);

        // Create a JLabel (label)
        JLabel makeLabel = new JLabel("Enter the make of the vehicle: ");
        makeLabel.setBounds(10, 20, 200, 25);  // Set the position and size of the label
        panel.add(makeLabel);  // Add the label to the panel

        // Create a JTextField (text field)
        makeText = new JTextField(20);
        makeText.setBounds(180, 20, 200, 25);  // Set the position and size of the text field
        panel.add(makeText);  // Add the text field to the panel

        // Create a JButton (button)
        createVehicleButton = new JButton("Create Vehicle");
        createVehicleButton.setBounds(10, 80, 150, 25);  // Set the position and size of the button
        panel.add(createVehicleButton);  // Add the button to the panel

        // Create a JLabel to display the output
        outputMakeLabel = new JLabel("");
        outputMakeLabel.setBounds(10, 120, 350, 25);  // Set the position and size of the output label
        panel.add(outputMakeLabel);  // Add the output label to the panel

        // Make the frame visible
        frame.setVisible(true);
    }

    public String getMakeInput() {
        return makeText.getText();
    }

    public void setResult(String result) {
        outputMakeLabel.setText("<html>" + result.replace("\n", "<br>") + "</html>");
    }

    public void addCreateButtonListener(ActionListener listener) {
        // Add an ActionListener to the button
        createVehicleButton.addActionListener(listener);
    }
}
