import javax.swing.*;

public class TryoutOne {
    public static void main(String[] args) {
        JFrame f = new JFrame(); // Creating an instance of JFrame
        JButton b = new JButton("Click"); // Creating an instance of JButton
        b.setBounds(130, 100, 100, 40); // x-axis, y-axis, width, height
        f.add(b); // Adding the button to JFrame
        f.setSize(400, 500); // Setting width and height of the frame
        f.setLayout(null); // Using no layout manager
        f.setVisible(true); // Making the frame visible
    }
}
