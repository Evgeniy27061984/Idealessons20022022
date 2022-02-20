package thebyteguru12.game;

import thebyteguru12.IO.Input;

import java.awt.*;

// на прямую из него делать не будем Все объекты будут его extend
public abstract class Entity {
    public final EntityType type; //будем знать какой тип

    protected float x;
    protected float y; // местонахождение наших тел

    protected Entity (EntityType type, float x, float y) {
        this.type = type;
        this.x = x;
        this.y = y;

    }

    public abstract void update (Input input);
    public abstract void render (Graphics2D g);

}
