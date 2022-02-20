package Doom27061984.Tanks.Video2.display;

import javax.swing.*;
import java.awt.*;

public class Display {
    private static boolean created = false;
    private static JFrame window;
    private static Canvas content;
    private static int count = 0;

    public static void created (int width, int height, String Title) {
        if (created) {
            return;
        }
        window = new JFrame("Tanks");
        content = new Canvas() {
            @Override
            public void paint(Graphics g) {
                super.paint(g); // обязательно необходимо вызвать так как за кулисами многое делает
                render(g);
            }
        };

        //pain вызывается автоматически но мы решили ее изменить  @Override

        Dimension size = new Dimension(width, height);
        content.setPreferredSize(size);
        content.setBackground(Color.black);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().add(content);
        window.setResizable(false);
        window.pack();
        window.setVisible(true);
        window.setLocationRelativeTo(null);
    }

    public static void render() {
        content.repaint();
    }

    public static void render(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillOval(400,300,200,100);


    }

}
