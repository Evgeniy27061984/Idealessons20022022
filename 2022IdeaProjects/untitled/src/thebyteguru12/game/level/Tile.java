package thebyteguru12.game.level;

import thebyteguru11.graphics.Sprite;
import thebyteguru11.graphics.SpriteSheet;
import thebyteguru12.utils.Utils;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Tile { // этот класс будет делить окно на таблицу где будут расположены картинки
    private BufferedImage image; //изображение для нашего Tile
    private TileType type;

    protected Tile (BufferedImage image, int scale, TileType type) {
        this.type = type;
        this.image = Utils.resize(image, image.getWidth() * scale, image.getWidth() * scale);
        // изображение с изменненом размером

    }

    protected void render (Graphics2D g, int x, int y) { // x, y для того чтоб знать где все рисовать
        g.drawImage(image, x , y, null); // null на imageObserver

    }
    protected TileType type() {
            return type;
    }



}
