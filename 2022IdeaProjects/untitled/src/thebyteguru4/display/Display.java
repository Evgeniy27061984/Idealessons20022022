package thebyteguru4.display;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;
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
    private static BufferStrategy bufferStrategy; // implements buffers



    public static void create (int width, int height, String title, int _clearColor, int numBuffers) {

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
        ((Graphics2D)bufferGraphics).setRenderingHint
                (RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); // сглаживание
        clearColor = _clearColor;

        content.createBufferStrategy(numBuffers);// sent количество buffers
        bufferStrategy = content.getBufferStrategy();// will implements количество buffers



        created = true;
    }

    public static void clear() { //clear color buffer on int clearColor
        Arrays.fill (bufferData, clearColor); //take array and заполняет какими то values
        //all exchanges in bufferData will отражаться buffer
        //it заменяет for loop при котором мы заполняли bufferData clearColor(ами)
    }


    public static void swapBuffers() { // поменять который мы смотрим (content) на buffer
        Graphics g = bufferStrategy.getDrawGraphics(); // return than graphic on которм мы должны рисовать
        g.drawImage(buffer,0,0,null); //size our image
        bufferStrategy.show(); // show

    }

    public static Graphics2D getGraphics () // return from object Graphics2D
    {
        return (Graphics2D) bufferGraphics;
    }
    public static void destroy() { // уничтожить наше окно
        if (!created)
            return;
            window.dispose();

    }

    public static void setTitle(String title) { //меняет имя окна
        window.setTitle(title);
    }
}
