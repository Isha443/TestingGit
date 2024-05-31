package Str;

public class SquareCalculator {
    import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class SquareCalculator extends JFrame {

        private JTextField inputField;
        private JLabel resultLabel;

        public SquareCalculator() {
            setTitle("Square Calculator");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(new BorderLayout());
            setSize(300, 200);

            // North Panel for input
            JPanel northPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
            inputField = new JTextField(10);
            JButton calculateButton = new JButton("Calculate Square");
            northPanel.add(new JLabel("Enter any number: "));
            northPanel.add(inputField);
            northPanel.add(calculateButton);

            // Center Panel for result
            JPanel centerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
            result
}

        private void setLayout(BorderLayout borderLayout) {
        }
