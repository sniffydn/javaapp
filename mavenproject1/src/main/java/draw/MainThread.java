/*
 * PanelThread.java
 *
 * Created on July 19, 2007, 9:34 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package draw;

import util.DFactory;

/**
 *
 * @author doubleD
 */
public class MainThread extends Thread
{
    Panel [] panel;
    PanelThread [] threads;
    boolean stop = false;
    /** Creates a new instance of PanelThread */
    public MainThread(Panel [] p)
    {
        panel = p;
        this.setPriority(4);

        threads = new PanelThread[panel.length];
        for(int j = 0; j < panel.length; j++)
        {
            threads[j] = new PanelThread(panel[j]);
            threads[j].setPriority(PanelThread.MIN_PRIORITY);
        }
        this.start();
    }

    public void run()
    {
        for(int j = 0; j < panel.length; j++)
        {
            if(stop)
            {
                stop = false;
                return;
            }
            threads[j].start();
        }
    }

    public void stopThread()
    {
        stop = true;
        for(int j = 0; j < threads.length; j++)
        {
            threads[j].stopThread();
        }
    }
}
