import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PalindromeChecker {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Palindrome Checker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        
        JPanel panel = new JPanel();
        
        JLabel label = new JLabel("Enter a number: ");
        panel.add(label);
        
        JTextField textField = new JTextField(10);
        panel.add(textField);
        
        JButton checkButton = new JButton("Check");
        panel.add(checkButton);
        
        JLabel resultLabel = new JLabel("");
        panel.add(resultLabel);
        
        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = textField.getText();
                if (isPalindrome(input)) {
                    resultLabel.setText("The number is a palindrome.");
                } else {
                    resultLabel.setText("The number is not a palindrome.");
                }
            }
        });
        
        frame.add(panel);
        frame.setVisible(true);
    }

    public static boolean isPalindrome(String number) {
        int len = number.length();
        for (int i = 0; i < len / 2; i++) {
            if (number.charAt(i) != number.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
