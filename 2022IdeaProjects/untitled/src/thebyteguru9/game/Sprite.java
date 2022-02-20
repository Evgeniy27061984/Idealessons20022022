package thebyteguru9.game;

import java.awt.*;
import java.awt.image.BufferedImage;

// хранит информацию которую нужно вытащить
//этот класс держит одно изображение
//в дальнейшем это класс будет extend другой класс, который будет держать много изображений
public class Sprite {
    private SpriteSheet sheet;
    private float       scale; //это не в пикселях а на сколько изображение будет большим

    public Sprite (SpriteSheet sheet, float scale) {
        this.sheet = sheet;
        this.scale = scale;
    }

    public void render (Graphics2D g, float x, float y) {
        BufferedImage image =sheet.getSprite(0);
        g.drawImage(image,(int)(x),(int)(y),(int)(image.getWidth() * scale),
                (int)(image.getHeight() * scale),null); // с какими размерами мы их должны нарисовать


    }
}
