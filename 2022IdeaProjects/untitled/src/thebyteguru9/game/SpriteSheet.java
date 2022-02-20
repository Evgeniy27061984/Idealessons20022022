package thebyteguru9.game;

import java.awt.image.BufferedImage;
import java.nio.Buffer;

// класс будет содержать более мелкое изображение
public class SpriteSheet {
    private BufferedImage       sheet;
    private int                 spriteCount; // кол-во индивидуальных изображений
    private int                 scale; // размер одного sprite в пикселях
    private int                 spritesInWidth; // кол-во sprite в ширину

    public SpriteSheet(BufferedImage sheet, int spriteCount, int scale) {
        this.sheet = sheet;
        this.spriteCount = spriteCount;
        this.scale = scale;

        this.spritesInWidth = sheet.getWidth()/scale; // кол-во отдельных изображений

    }

    public BufferedImage getSprite (int index) { // выбор танка по индексу
        index = index % spriteCount; //если позиция девять например произошел сброс
        int x = index % spritesInWidth * scale; // для выреза картинки scale чтоб была ширина танка а не пиксель
        int y = index / spritesInWidth * scale; // для выреза высоты
        return sheet.getSubimage(x,y,scale,scale);
    }
}
