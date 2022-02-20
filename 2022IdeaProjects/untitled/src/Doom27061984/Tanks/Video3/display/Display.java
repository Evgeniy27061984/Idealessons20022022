package Doom27061984.Tanks.Video3.display;

import javax.swing.*;
import java.awt.*;

public class Display {
    private static boolean created = false;
    private static JFrame window;
    private static Canvas content;

    public static void created (int width, int height, String title) {
        if(created) {
            return;
        }
        window = new JFrame("Tanks");
        content = new Canvas() {
            @Override
            public void paint(Graphics g) {
                super.paint(g);
                render(g);
            }
        };
        Dimension size = new Dimension(width, height);
        content.setPreferredSize(size);
        window.getContentPane().add(content);
        content.setBackground(Color.BLACK);
        window.pack();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setVisible(true);
        window.setLocationRelativeTo(null);
    }

    public static void render() {
        content.repaint();
    }
    public static void render(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillOval(100,100,100,100);
    }
}
