package thebyteguru8.IO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Arrays;

public class Input extends JComponent {
    private boolean [] map;
    public Input() {
        map = new boolean[256];
        for (int i = 0; i < map.length; i++) {
            final int KEY_CODE = i; // для использования в анонимусе классе все должно быть final
            getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
                    put(KeyStroke.getKeyStroke(i,0, false), i * 2);
            // возвращает карту в которую можно довалять значения
            // параметры обозначают слушают кнопки то есть нажимаются кнопки если выбрано окно или нет
            //put добавить какое то значение какую кнопку мы хотим мониторить
            // второй параметр отвечает за добавки ctrl shift и т п
            // false кнопка нажата
            // начало действие с первым ASCII кодом если кнопка нажата
            // i * 2 это название
            getActionMap().put(i * 2, new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //эта функция будет бежать если эта кнопка (i * 2) нажата
                    map[KEY_CODE] = true; // только если final
                }
            }); //действие при нажатии кнопки

            // это тоже самое когда кнопка отпускается
            getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
                    put(KeyStroke.getKeyStroke(i,0, true), i * 2 + 1);

            getActionMap().put(i * 2 + 1, new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //эта функция будет бежать если эта кнопка (i * 2) нажата
                    map[KEY_CODE] = false; // только если final
                }
            }); //действие при нажатии кнопки

        }
    }

    public boolean [] getMap() { // will return нажатые кнопки
        return Arrays.copyOf(map, map.length); //copy map что б не меняли нашу карту
    }

    public boolean getKey(int keyCode) { //ASCii значение которое нужно проверить
        return map [keyCode];
    }
}
