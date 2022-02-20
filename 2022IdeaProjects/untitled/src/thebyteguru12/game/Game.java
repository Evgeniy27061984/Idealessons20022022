package thebyteguru12.game;


import thebyteguru12.IO.Input;
import thebyteguru12.display.Display;
import thebyteguru12.game.level.Level;
import thebyteguru12.graphics.TexturesAtlas;
import thebyteguru12.utils.Time;

import java.awt.*;


public class Game implements Runnable{

    // int width, int height, String title, int _clearColor, int numBuffers

    public static final int     WIDTH = 800;
    public static final int     HEIGHT = 600;
    public static final String  TITLE = "Tanks";
    public static final int     CLEAR_COLOR = 0xff000000;
    public static final int     NUM_BUFFERS = 3;
    public static final float   UPRATE_DATE = 60.0f; //СКОЛЬКО РАЗ МЫ СЧИТАЕМ НАШУ ФИЗИКУ (update())
    // если update поменять на 2000 то будет догонять updl
    //float чтоб было точнее
    public static final float   UPDATE_INTERVAL = Time.SECOND/UPRATE_DATE; // СКОЛЬКО ВРЕМЕНИ МЕЖДУ КАЖДЫМ update
    public static final long    IDLE_TIME = 1; //необходимо дышать каждому thread в миллисекундах
    public static final String  ATLAS_FILE_NAME = "texture_atlas.png"; //картинка

    private boolean             running; //проверка game бежит или нет (check game run or not)
    private Thread              gameThread; // процесс который дополнительно будем запускаться
    private Graphics2D          graphics;
    private Input input;
    private TexturesAtlas atlas;
    private Player player;
    private Level lvl;






    public Game () {
        running = false; // game no run
        Display.create(WIDTH, HEIGHT, TITLE, CLEAR_COLOR, NUM_BUFFERS);
        graphics = Display.getGraphics(); // вытащить нашу графику и рисовать на нашем окне
        input = new Input();
        Display.addInputListener(input);
        atlas  = new TexturesAtlas(ATLAS_FILE_NAME);
        player = new Player(300,300, 2,3, atlas);
        lvl = new Level(atlas);


    }

    public synchronized void start() { // two thread cant start
        if (running)  // если игра запущена то ни чего не нужно делать
            return;
        running = true; // если не запущена игра
        gameThread = new Thread(this);
        gameThread.start(); // так как выше this она запустит run

    }

    public synchronized void stop() { // two thread cant stop
        if (!running)  // если игра не запущена то ни чего не нужно делать
            return;

        running = false; // если запущена игра
        try {
            gameThread.join(); // ждет пока наш thread закончит нашу работу
        } catch (InterruptedException e) {
            e.printStackTrace(); // распечатать ошибку
        }
        cleanUp(); // функция очищения

    }

    private void update() { //считать всю физику движения
        player.update(input);
        lvl.update();
        }



    private void render() { // после того как подсчитается определится в update здесь прорисуется
        Display.clear(); //очищает наш буффер
        lvl.render(graphics); // перед так как мы закроем нашего player
        player.render(graphics);
        lvl.renderGrass(graphics);
        Display.swapBuffers(); // поменять наш буффер мы зкончили перерисовывать
    }

    private void cleanUp() { // будет все ресурсы закрывать
        Display.destroy(); // унижтожит окно после закрытия
    }

    //will use доп поток
    @Override
    public void run() { //это луп который будет вызывать несколько раз в секунду
                        // бесконечный loop
        int fps = 0;
        int upd = 0; // колво update
        int updl = 0; // сколько мы пытадись догнать на update

        long count = 0; // высвечивать на верху экран fps upd updl


        float delta = 0;
        long lastTime = Time.get(); //будет держать время которое сейчас
        while (running) { //будет вызывать update 60 раз в секунду


            long now = Time.get(); // now > lastTime
            long elapsedTime = now - lastTime; // сколько прошло времени
            lastTime = now; // прошлое приравняем к текущему
            // delta кол-во update
            // например 10 наносекунд а интервал 20 секунд то получится 0.5
            // значит нен надо update только когда 1 или более
            count += elapsedTime; // кол-во времени которое прошло
            boolean render = false; // перерисовывать наш экран если нет каких то изменений не надо
            delta += (elapsedTime/UPDATE_INTERVAL); // UPDATE_INTERVAL кол-во времени между update
            while (delta > 1) {
                update();
                upd++; // сделан update добавь update
                delta--;
                if (render) { //то есть уже пробежал loop
                    updl++; // уже update сделали
                }else {
                    render = true;
                }

                render = true; // если есть изменения - перерисовывать
            }
            if (render) { // если надо рисовать
                render(); //нарисует всю нашу сцену заново
                fps++; //сколько перерисовывался
            } else {
                try {
                    Thread.sleep(IDLE_TIME); //дать программе подышать другим поработать 1 миллисекунду
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


            if (count >= Time.SECOND) { // для отражение в титульнике
                Display.setTitle(TITLE + "|| fps" +  fps + "| upd" +  upd + "| updl" +  updl );
                upd = 0;
                fps = 0;
                updl = 0;
                count = 0;
            }


        }
    }


}