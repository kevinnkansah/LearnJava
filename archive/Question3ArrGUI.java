import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Question3ArrGUI extends JFrame {
    private ArrayList<Integer> arrayList = new ArrayList<>();

    public Question3ArrGUI() {
        setTitle("Integer File Processing");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 300);


        JLabel label = new JLabel("Enter the absolute file path:");
        JTextField filePathField = new JTextField(12);
        JButton processButton = new JButton("Process File");
        JTextArea resultArea = new JTextArea(2, 10);


        processButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String path = filePathField.getText();
                processFile(path);
                resultArea.setText(displayResults());
            }
        });

        // Layout
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(label);
        panel.add(filePathField);
        panel.add(processButton);

        JPanel resultPanel = new JPanel();
        resultPanel.setLayout(new BorderLayout());
        resultPanel.add(new JScrollPane(resultArea), BorderLayout.CENTER);


        add(panel, BorderLayout.NORTH);
        add(resultPanel, BorderLayout.CENTER);
    }

    private void processFile(String filePath) {
        BufferedReader read = null;
        arrayList.clear();

        try {
            read = new BufferedReader(new FileReader(filePath));
            String line;

            while ((line = read.readLine()) != null) {
                int value = Integer.parseInt(line);
                arrayList.add(value);
            }
        } catch (IOException e) {
            arrayList.clear();
            arrayList.add(-1); // An error flag to indicate file read error
        } catch (NumberFormatException e) {
            arrayList.clear();
            arrayList.add(-2); // An error flag to indicate invalid content in the file
        } finally {
            try {
                if (read != null) {
                    read.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    //Method that displays results of the computations (Min, Max, Sum)
    private String displayResults() {
        if (arrayList.isEmpty()) {
            return "File processing failed. Check the file path or content.";
        } else if (arrayList.get(0) == -1) {
            return "File not found or error reading file.";
        } else if (arrayList.get(0) == -2) {
            return "Invalid content in the file. Only integers are allowed.";
        } else {
            int sum = arrayList.stream().mapToInt(Integer::intValue).sum();
            int minValue = Collections.min(arrayList);
            int maxValue = Collections.max(arrayList);

            Integer[] array = arrayList.toArray(new Integer[0]);
            bubbleSort(array);

            return "Sum of values: " + sum + "\n" +
                    "Minimum value: " + minValue + "\n" +
                    "Maximum value: " + maxValue + "\n" +
                    "Sorted values: " + Arrays.toString(array);
        }
    }

    // Sorting algorithm
    private void bubbleSort(Integer[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
    // Running the GUI
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Question3ArrGUI().setVisible(true);
            }
        });
    }
}
