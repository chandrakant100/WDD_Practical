import java.awt.*;
import java.awt.event.*;

class MyFrame {
    // buttons

    MyFrame(String st) {
        // super(st);
        Button b1, b2, b3;
        Frame frame = new Frame(st);
        // con = new getContentPane();

        b1 = new Button("button1");
        b2 = new Button("button2");
        b3 = new Button("button3");
        b1.setBounds(100, 100, 100, 40);
        b2.setBounds(300, 100, 100, 40);
        b3.setBounds(500, 100, 100, 40);

        frame.setSize(400, 500);
        // b1.set

        frame.add(b1);
        frame.add(b2);
        frame.add(b3);

        frame.setLayout(null);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}

public class ButtonTest {
    public static void main(String args[]) {
        new MyFrame("Frame with buttons...");
    }
}
