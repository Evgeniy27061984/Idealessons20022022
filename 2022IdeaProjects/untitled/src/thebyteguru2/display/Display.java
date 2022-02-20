package thebyteguru2.display;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.util.Arrays;

public abstract class Display {
    private static boolean created = false; // no window
    private static JFrame window; // window main
    private static Canvas content; // list in window
    private static BufferedImage buffer; // class have image
    private static int[] bufferData; // info about image
    private static Graphics bufferGraphics; // in 1 variant paint auto, and here hand
    private static int clearColor; //color clear buffer

    //temp
    public static float delta = 0;

    //temp end

    public static void create (int width, int height, String title, int _clearColor) {

        if (created) { // if created = true - return
            return;
        }
        window = new JFrame(title); // create window
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close game
        //content = new Canvas(); // create list
        // create list 1 variant
        content = new Canvas();


        // create list 1 variant

        Dimension size = new Dimension(width, height); // size of list
        content.setPreferredSize(size); // set content
        window.setResizable(false); // user do not change window
        window.getContentPane().add(content); // add list in window without обрезки(cropping)
        window.pack(); // change window == list
        window.setLocationRelativeTo(null); // see window
        window.setVisible(true); // center window

        //created image ONLY after window
        buffer = new BufferedImage(width, height,BufferedImage.TYPE_INT_ARGB);
        // color alfa (прозрачность) red green blue
        bufferData = ((DataBufferInt)(buffer.getRaster().getDataBuffer())).getData(); //create array
        bufferGraphics = buffer.getGraphics();
        clearColor = _clearColor;
        created = true;
    }

    public static void clear() { //clear color buffer on int clearColor
        Arrays.fill (bufferData, clearColor); //take array and заполняет какими то values
        //all exchanges in bufferData will отражаться buffer
        //it заменяет for loop при котором мы заполняли bufferData clearColor(ами)
    }
    public static void render() { //all that we want add in our window
        bufferGraphics.setColor(new Color(0xff0000ff)); // круг цвет синий
        bufferGraphics.fillOval((int)(350 + (Math.sin(delta) * 200)),250,100,100); //центр круга
        delta += 0.02f;

    }

    public static void swapBuffers() { // поменять который мы смотрим (content) на buffer
        Graphics g = content.getGraphics(); // остаем графику
        g.drawImage(buffer,0,0,null); //size our image

    }
}
