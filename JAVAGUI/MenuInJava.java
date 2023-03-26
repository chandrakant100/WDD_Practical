import java.util.Scanner;

import javax.swing.*;

class Menu {

    JMenu menu1, menu2;

    Menu(String name, int items) {
        JFrame f = new JFrame(name);
        JMenuBar mb = new JMenuBar();

        menu1 = new JMenu("Total item list");
        menu2 = new JMenu("Available Computers");

        menu1 = new JMenu("Menu");
        for (int i = 0; i < items; i++) {
            JMenuItem it = new JMenuItem("Item " + i);
            JMenuItem mc = new JMenuItem("MCA" + (i + 1));
            menu1.add(it);
            menu2.add(mc);
        }

        mb.add(menu1);
        mb.add(menu2);

        f.setJMenuBar(mb);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }
}

public class MenuInJava {
    public static void main(String args[]) {

        System.out.print("Enter the total Items:");
        Scanner sc = new Scanner(System.in);
        int items = sc.nextInt();

        new Menu("Menu Based Program", items);
    }
}
