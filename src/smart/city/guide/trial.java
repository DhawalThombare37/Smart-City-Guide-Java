package smart.city.guide;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class trial extends JPanel implements ActionListener {
    private JTextField initialTempField, finalTempField, timeField, coolingRateField;
    private JButton calculateButton;
    private JTextArea resultArea;
    private double initialTemp, finalTemp, time, coolingRate;
    private int timeInterval = 1; // Time interval for plotting (in seconds)
    private Timer timer;

    public trial() {
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(4, 2));
        JLabel initialTempLabel = new JLabel("Initial Temperature:");
        initialTempField = new JTextField();
        JLabel finalTempLabel = new JLabel("Final Temperature:");
        finalTempField = new JTextField();
        JLabel timeLabel = new JLabel("Time (in minutes):");
        timeField = new JTextField();
        JLabel coolingRateLabel = new JLabel("Cooling Rate:");
        coolingRateField = new JTextField();

        inputPanel.add(initialTempLabel);
        inputPanel.add(initialTempField);
        inputPanel.add(finalTempLabel);
        inputPanel.add(finalTempField);
        inputPanel.add(timeLabel);
        inputPanel.add(timeField);
        inputPanel.add(coolingRateLabel);
        inputPanel.add(coolingRateField);

        JPanel buttonPanel = new JPanel();
        calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(this);
        buttonPanel.add(calculateButton);

        resultArea = new JTextArea(10, 30);
        resultArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(resultArea);

        add(inputPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        add(scrollPane, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculateButton) {
            try {
                initialTemp = Double.parseDouble(initialTempField.getText());
                finalTemp = Double.parseDouble(finalTempField.getText());
                time = Double.parseDouble(timeField.getText());
                coolingRate = Double.parseDouble(coolingRateField.getText());

                double currentTemp = initialTemp;
                resultArea.setText("Time\tTemperature\n");

                while (currentTemp > finalTemp) {
                    resultArea.append(String.format("%.2f\t%.2f\n", time, currentTemp));
                    currentTemp = calculateTemperature(currentTemp, coolingRate, timeInterval);
                    time += timeInterval / 60.0; // Convert minutes to hours for the formula
                }

                // Start plotting the graph
                plotGraph();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter valid numeric values.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private double calculateTemperature(double currentTemp, double coolingRate, int timeInterval) {
        return finalTemp + (currentTemp - finalTemp) * Math.exp(-coolingRate * timeInterval);
    }

    private void plotGraph() {
        JFrame frame = new JFrame("Temperature vs Time");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel graphPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                double x = 20;
                double y = getHeight() - 20;
                double xScale = getWidth() / (time * 60); // Convert minutes to seconds
                double yScale = getHeight() / (initialTemp - finalTemp);
                g.setColor(Color.BLUE);

                double currentTemp = initialTemp;
                double currentTime = 0;

                while (currentTemp > finalTemp) {
                    double nextTemp = calculateTemperature(currentTemp, coolingRate, timeInterval);
                    double nextTime = currentTime + timeInterval;
                    g.drawLine((int) x, (int) y, (int) (x + xScale * timeInterval), (int) (y - yScale * (currentTemp - nextTemp)));
                    x += xScale * timeInterval;
                    y -= yScale * (currentTemp - nextTemp);
                    currentTemp = nextTemp;
                    currentTime = nextTime;
                }
            }
        };

        frame.add(graphPanel);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Newton's Law of Cooling");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setContentPane(new trial());
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
