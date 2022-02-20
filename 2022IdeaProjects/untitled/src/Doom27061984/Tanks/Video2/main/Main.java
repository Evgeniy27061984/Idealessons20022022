package Doom27061984.Tanks.Video2.main;


import Doom27061984.Tanks.Video2.display.Display;

import javax.swing.*;
import java.awt.event.ActionEvent;


public class Main {
    public static void main(String[] args) {
        Display.created(800, 600, "Tanks");
        Timer t = new Timer(1000 / 600, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // эта функция будет вызываться 60 раз в секунду
                Display.render();
            }
        });

        // 1 параметр: 1/60 секунды будет вызываться функция То есть 60 раз в секунду будет вызываться функция
        // 2 параметр: что мы хотим делать 1/60 секунды

        t.setRepeats(true); // повторяет actionPerformed если ее не запустить то всего один раз запуститься
        t.start();

    }
}
