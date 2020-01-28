package LineDrawing;

import javax.swing.JFrame;

public class LineDrawingTest {

    public static void main(String[] args) {

        Running r1 = new Running();
        Thread t1 = new Thread(r1);
        t1.start();
    }
}
