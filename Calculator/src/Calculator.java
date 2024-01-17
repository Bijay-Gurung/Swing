// Basic Calculator
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculator {
    public static void main(String[] args) {
        JFrame f = new JFrame("Calculator");
        
        JLabel l1 = new JLabel("Enter First Number: ");
        l1.setBounds(50, 50, 150, 30);
        
        final JTextField tf = new JTextField();
        tf.setBounds(200, 50, 100, 30);

        JLabel l2 = new JLabel("Enter Second Number: ");
        l2.setBounds(50, 100, 150, 30);
        
        final JTextField tf1 = new JTextField();
        tf1.setBounds(200, 100, 100, 30);

        JButton b = new JButton("Total");
        b.setBounds(50, 150, 100, 30);
        
        JTextField tf2 = new JTextField();
        tf2.setBounds(200,150,100,30);
        
        b.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		try {
        			double num1 = Double.parseDouble(tf.getText());
        			double num2 = Double.parseDouble(tf1.getText());
        			double sum = num1 + num2;
        			tf2.setText(String.valueOf(sum));
        		}catch(NumberFormatException ex){
        			JOptionPane.showMessageDialog(f,"Invalid input. Please Enter valid Numbers.");
        		}
        	}
        });

        f.add(l1);
        f.add(tf);
        f.add(l2);
        f.add(tf1);
        f.add(b);
        f.add(tf2);

        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
