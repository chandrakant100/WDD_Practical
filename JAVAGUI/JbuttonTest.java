import javax.swing.*;

class MyFrame {
    // buttons

    MyFrame(String st) {
        // super(st);
        JFrame frame = new JFrame("Basic GUI in JAVA");

        JLabel lable = new JLabel("GUI Program");
        JTextArea textArea = new JTextArea();
        JButton button = new JButton("Click Here");
        JCheckBox checkBox1 = new JCheckBox("Male");
        JCheckBox checkBox2 = new JCheckBox("Female");

        lable.setBounds(100, 0, 100, 30);
        textArea.setBounds(50, 50, 250, 100);
        button.setBounds(330, 100, 100, 30);
        checkBox1.setBounds(50, 160, 70, 50);
        checkBox2.setBounds(100, 160, 70, 50);

        frame.add(lable);
        frame.add(textArea);
        frame.add(button);
        frame.add(checkBox1);
        frame.add(checkBox2);

        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}

public class JbuttonTest {
    public static void main(String[] args) {
        new MyFrame("jFrame with buttons...");

    }
}