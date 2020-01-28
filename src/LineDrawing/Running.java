package LineDrawing;

import javax.swing.*;

public class Running implements Runnable{
    @Override
    public void run() {
        JFrame application = new JFrame();
        LiningPanel panel = new LiningPanel();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(300, 300);
        application.setTitle("Lining Art");
        application.setVisible(true);


    }
}
