// Creating JButton with Action Listner
import javax.swing.*;
import java.awt.event.*;

public class Button1 {
	public static void main(String[] args) {
		JFrame f = new JFrame("Button");
		final JTextField tf = new JTextField();
		tf.setBounds(50,50,150,20);
		JButton b = new JButton("Click Here");
		b.setBounds(50,100,95,30);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText("Hello World");
			}
		});
		f.add(b);
		f.add(tf);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
}
