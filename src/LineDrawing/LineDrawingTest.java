/*
This program draws 4 Parabolic curves in a frame
 */

package LineDrawing;

//Import Packages
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static LineDrawing.Animator.*;

public class LineDrawingTest {

    public static void main(String[] args) {
        //Initiate frame and panel
        JFrame application = new JFrame();
        LiningPanel panel = new LiningPanel();
        application.add(panel);
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setSize(300, 325);
        application.setTitle("Lining Art");
        application.setVisible(true);

        //add new panel for new button
        JPanel bPanel = new JPanel();
        JButton b1 = new JButton("Draw");
        bPanel.add(b1);
        application.add(bPanel, BorderLayout.PAGE_START);

        //Create new runnable object and pass to new thread
        Runnable r1 = new Animator(panel);
        Thread t1 = new Thread(r1);

        //Start Thread
        t1.start();

        //Action Listener to alter button text when pressed
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (b1.getActionCommand().equals("Draw")) {
                    b1.setText("Stop");


                }
                else if (b1.getActionCommand().equals("Stop"))
                    b1.setText("Resume");

                else
                    b1.setText("Stop");
            }


        });
        application.setVisible(true);
    }
}










