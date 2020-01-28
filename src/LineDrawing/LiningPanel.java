package LineDrawing;


import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class LiningPanel extends javax.swing.JPanel {

    //counter to track number of iterations
    private int counter = 0;


    public LiningPanel() {
    }

    //drawing lines
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int w = getWidth();
        int h = getHeight();
        double lines = counter;

        //for loop to calculate start and/or endpoints and to draw lines
        for (int i = 0; i < lines; i++) {
            int w2 = (int) ((i / lines) * w);
            int h2 = (int) ((i / lines) * h);

            Random rand = new Random();
            float R = rand.nextFloat();
            float G = rand.nextFloat();
            float B = rand.nextFloat();
            Color randomColor = new Color(R, G, B);
            g.setColor(randomColor);
            g.drawLine(0, h2, w2, h);

            g.drawLine(w2, 0, w, h2);

            g.drawLine(w2, h, w, h - h2);

            g.drawLine(w - w2, 0, 0, h2);

        }
    }

    //to get counter value
    public int getCounter() {
        return counter;
    }

    //to increase counter if less than 16
    public void increaseCounter() {
        if (counter < 16) {
            counter++;
        }
    }
}





