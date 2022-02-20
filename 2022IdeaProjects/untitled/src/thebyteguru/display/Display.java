package thebyteguru.display;

import javax.swing.*;
import java.awt.*;

public abstract class Display {
    private static boolean created = false; // no window
    private static JFrame window; // window main
    private static Canvas content; // list in window

    public static void create (int width, int height, String title) {
        if (created) { // if created = true - return
            return;
        }
        window = new JFrame(title); // create window
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close game
        //content = new Canvas(); // create list
        // create list 1 variant
        content = new Canvas() {
            public void paint(Graphics g) {
                super.paint(g);
                render(g);
            }
        };

        // create list 1 variant

        Dimension size = new Dimension(width, height); // size of list
        content.setPreferredSize(size); // set content
        content.setBackground(Color.BLACK); // черный экран
        window.setResizable(false); // user do not change window
        window.getContentPane().add(content); // add list in window without обрезки(cropping)
        window.pack(); // change window == list
        window.setLocationRelativeTo(null); // see window
        window.setVisible(true); // center window


    }

    public static void render () { // вызывает paint
        content.repaint();
    }
    private static void render(Graphics g) {
        g.setColor(Color.white); // цвет круга
        g.fillOval(400-50,300-50,100,100); // диаметр круга
    }
}
