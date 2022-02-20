package thebyteguru2.main;

import thebyteguru2.display.Display;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Main {
    public static void main(String[] args) {
        Display.create(800,600,"Tanks",0xff00ff00); //clearColor цве т которым будем очищать наш экран
        //0xff не прозрачное 00 без красного ff максимальное значение зеленого 00 без синего цвета
        //123456789abcdef
        //byte 0xff два значения ff 1 байт
        //int  0xffffffff  с конца первые ff-blue 2-ff -green 3 - red 4 -alfa(ff прозрачность не нужна)
        /////////////Create Time 1 Variant
        Timer t = new Timer(1000 / 60, new AbstractAction() {// запускает функции 60 раз в секунду
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.clear(); // clear color buffer on int clearColor
                Display.render(); // здесь будем что то рисовать
                Display.swapBuffers(); // показали на экране что заменили
            }
        });
           t.setRepeats(true); // повторяет бесконечно
           t.start();//запуск


    }
}
