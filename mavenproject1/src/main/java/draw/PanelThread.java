/*
 * PanelThread.java
 *
 * Created on July 19, 2007, 11:11 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package draw;

/**
 *
 * @author doubleD
 */
public class PanelThread extends Thread
{
    Panel panel;
    boolean stop = false;
    /** Creates a new instance of PanelThread */
    public PanelThread(Panel p)
    {
        panel = p;
    }

    public void run()
    {
        System.out.println(panel.labelText + " Started " + panel.stepArray.length);
        long startTime = System.currentTimeMillis();
        for(int index = 0; index < panel.stepArray.length; index++)
        {
            if(stop)
            {
                stop = false;
                return;
            }
            panel.primeIndex(index);
        }
        System.out.println(panel.labelText + " Done " + panel.stepArray.length + " Steps in " + ((System.currentTimeMillis() - startTime) / 1000) + " Seconds");
    }

    public void stopThread()
    {
        stop = true;
    }
}
