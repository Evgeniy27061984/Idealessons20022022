package Doom27061984.Tanks.Video1.display;

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
        window = new JFrame(title); // создали рамку
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // добавили автоматическое выключение
        content = new Canvas(); // создали лист
        Dimension size = new Dimension(width,height); // размер листа
        content.setPreferredSize(size); // размер листа установали в Canvas
        window.setResizable(false); // выключили изменение окна
        window.add(content); // добавили лист  в окно
        content.setBackground(Color.BLACK); // цвет листа черный
        window.pack();//растягивает окно по листу заданых width, height
        window.setLocationRelativeTo(null);//установили центр (обязательно после pack)
        window.setVisible(true); // сделали окно видимым
    }

}
