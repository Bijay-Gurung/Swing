// Displaying image on button
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Button2 {
    Button2() {
        JFrame f = new JFrame("Button");
        JButton b = new JButton(new ImageIcon("E:\\Java\\Swing\\tryout\\Images\\Picsart_22-08-08_14-28-06-930.jpg"));
        b.setBounds(100, 100, 100, 40);
        f.add(b);
        f.setSize(300, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Button2();
    }
}
