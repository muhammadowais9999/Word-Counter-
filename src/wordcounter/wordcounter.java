package wordcounter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.MatteBorder;

public class wordcounter extends JFrame {
    
	private static final long serialVersionUID = 1L;
	private JLabel resultLabel;
    private JTextField inputField;
    private JButton countButton;
    private JButton backButton;  

    public wordcounter() {
        setResizable(false);  
        setBackground(new Color(255, 255, 240));
        setTitle("Word Counter");
        setSize(702, 463);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    
        JPanel inputPanel = new JPanel();
        inputPanel.setBackground(new Color(211, 211, 211));
        inputPanel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));

        
        resultLabel = new JLabel("");
        resultLabel.setBounds(153, 254, 293, 20);
        resultLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
        inputField = new JTextField(10);
        inputField.setBackground(new Color(255, 255, 224));
        inputField.setForeground(new Color(0, 0, 255));
        inputField.setFont(new Font("Tahoma", Font.PLAIN, 15));
        inputField.setBounds(83, 131, 409, 54);
        countButton = new JButton("Count");
        countButton.setForeground(new Color(128, 0, 128));
        countButton.setBackground(new Color(255, 250, 205));
        countButton.setBounds(516, 140, 111, 35);
        countButton.setFont(new Font("Tahoma", Font.PLAIN, 23));
        backButton = new JButton("Back");  // Added Back button
        backButton.setForeground(new Color(128, 0, 128));
        backButton.setBackground(new Color(255, 250, 205));
        backButton.setBounds(83, 196, 111, 35);
        backButton.setFont(new Font("Tahoma", Font.PLAIN, 23));

        countButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                countWords();
            }
        });

        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
            }
        });

        inputPanel.setLayout(null);

      
        inputPanel.add(resultLabel);
        inputPanel.add(inputField);
        inputPanel.add(countButton);
        inputPanel.add(backButton);  

        
        getContentPane().add(inputPanel);

        
        resultLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        inputField.setAlignmentX(Component.CENTER_ALIGNMENT);
        countButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel lblNewLabel = new JLabel("WORD COUNTER");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
        lblNewLabel.setBackground(new Color(255, 248, 220));
        lblNewLabel.setForeground(new Color(165, 42, 42));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(172, 45, 272, 54);
        inputPanel.add(lblNewLabel);
    }

    public void countWords() {
        String inputText = inputField.getText();
        String[] words = inputText.split("\\s+");
        int wordCount = words.length;
        resultLabel.setText("Word Count: " + wordCount);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                wordcounter wordCounter = new wordcounter();
                wordCounter.setVisible(true);
            }
        });
    }
}

