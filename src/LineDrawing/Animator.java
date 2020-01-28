package LineDrawing;

import javax.swing.*;

public class Animator implements Runnable {
    private LiningPanel dpanel;
    private boolean stopped = false;
    public Animator (LiningPanel aPanel){
        dpanel = aPanel;
    }
    @Override
    public void run(){
        while (true){
            if (!isStopped()){
                dpanel.repaint();
                dpanel.increaseCounter();
            }
            if (dpanel.getCounter() > 15){
                setStopped(true);
            }



            try {
                Thread.sleep(1000);
            }
            catch (Exception e){

            }
        }
    }

    public void setDpanel(LiningPanel dpanel){
        this.dpanel = dpanel;
    }

    public boolean isStopped(){
        return stopped;
    }

    public void setStopped(boolean stopped){
        this.stopped = stopped;
    }


}

