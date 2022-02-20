package thebyteguru11.game;

import thebyteguru11.IO.Input;
import thebyteguru11.graphics.Sprite;
import thebyteguru11.graphics.SpriteSheet;
import thebyteguru11.graphics.TexturesAtlas;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;

public class Player extends Entity{

    public static final int SPRITE_SCALE = 16;
    public static final int SPRITE_PER_HEADING = 1; // сколько картинок берем



    private enum Heading { //в какую сторону смотрит наш Player
        NORTH (0 * SPRITE_SCALE,0 * SPRITE_SCALE,1 * SPRITE_SCALE,1 * SPRITE_SCALE),
        //вырезает 1 танк впереди ставлю цифры чтобы можно было что то поменять
        EAST (6 * SPRITE_SCALE,0 * SPRITE_SCALE,1 * SPRITE_SCALE,1 * SPRITE_SCALE),
        //вырезает 6 танк впереди ставлю цифры чтобы можно было что то поменять
        SOUTH (4 * SPRITE_SCALE,0 * SPRITE_SCALE,1 * SPRITE_SCALE,1 * SPRITE_SCALE),

        WEST (2 * SPRITE_SCALE,0 * SPRITE_SCALE,1 * SPRITE_SCALE,1 * SPRITE_SCALE);

        private int x, y, h, w; //хранят координаты картинки
       Heading (int x,int y,int h,int w) {
                this.x = x;
           this.x = x;
           this.y = y;
           this.h = h;
           this.w = w;
        }

        protected BufferedImage texture (TexturesAtlas atlas) { // метод будет вырезать изображение
            return atlas.cut(x,y,h,w);
        }

    }

    private Heading heading; //в какую сторону смотрит наш Player из enum
    private Map<Heading, Sprite> spriteMap; //хранит куда направлен и sprite
    //то есть по направлению будем вытаскивать правильную  картинку
    private float scale; // размер танка
    private float speed; // скорость

    public Player( float x, float y, float scale,float speed, thebyteguru11.graphics.TexturesAtlas atlas) { // public пока мы не создали доп класс
        super(EntityType.Player, x, y); //EntityType.Player тк мы знаем это класс Player
        heading = Heading.NORTH;
        spriteMap = new HashMap<Heading, Sprite>(); // в эту карту положим все значения
        this.speed = speed;
        this.scale = scale;
        for (Heading h: Heading.values()) { //Heading.values() хранит все значение
            SpriteSheet sheet = new SpriteSheet(h.texture(atlas),SPRITE_PER_HEADING,SPRITE_SCALE);
            Sprite sprite = new Sprite(sheet, scale);// размер картинки
            spriteMap.put(h,sprite);//связывает направление и изображение


        }
    }


    @Override
    public void update(Input input) { //эта функции из game  класса будет вызываться 60 раз в секунду
        float newX = x; // x от класса Entity так как extend
        float newY = y; // y от класса Entity так как extend
        // верх нужен для проверки
        if (input.getKey(KeyEvent.VK_UP)) { // проверка кнопки вверх
            newY -= speed; //скорость
            heading = Heading.NORTH;// изменить направление танка
            // что бы наискось не ехал строго на 90 градусов а не if
        }  else if (input.getKey(KeyEvent.VK_RIGHT)) { // проверка кнопки вверх
            newX += speed; //скорость
            heading = Heading.EAST;// изменить направление танка
        } else if (input.getKey(KeyEvent.VK_DOWN)) { // проверка кнопки вверх
            newY += speed; //скорость
            heading = Heading.SOUTH;// изменить направление танка
        } else if (input.getKey(KeyEvent.VK_LEFT)) { // проверка кнопки вверх
            newX -= speed; //скорость
            heading = Heading.WEST;// изменить направление танка
        }
        if(newX < 0) {
            newX = 0;
        }else if (newX > Game.WIDTH -SPRITE_SCALE * scale) { //чтоб за ширину экрана не зашел
            // а scale так танк может быть увеличен или уменьшен
            newX = Game.WIDTH -SPRITE_SCALE * scale;
        }
        if(newY < 0) {
            newY = 0;
        }else if (newY > Game.HEIGHT -SPRITE_SCALE * scale) { //чтоб за ширину экрана не зашел
            // а scale так танк может быть увеличен или уменьшен
            newY = Game.HEIGHT -SPRITE_SCALE * scale;
        }
        x = newX;
        y = newY;


    }

    @Override
    public void render(Graphics2D g) { // должен вытащить правильный sprite
        // в зависимости куда смотрит танк
        spriteMap.get(heading).render(g,x,y); // heading это ключ через который получим sprite

    }
}
