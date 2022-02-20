package thebyteguru11.graphics;

import thebyteguru8.utils.ResourceLoader;

import java.awt.image.BufferedImage;

//отвечает за изображение
public class TexturesAtlas {
    BufferedImage image;

    public TexturesAtlas(String imageName) {
        image = ResourceLoader.loadImage (imageName); //загружаем картинку
    }

    public BufferedImage cut (int x, int y, int w, int h) { //вырезать картинку
        // x откуда резать. y длина. w ширина h высота
       return image.getSubimage(x, y, w, h);

    }
}
