package clts.s.so;

import obsolete.B;
import util.GraphicsMap;
import util.ColorArray;

public class SK9 extends B
{
    public SK9()
    {
        super();
        slenderS = true;
        sch = true;
        sock = true;
        nurse = true;
    }

    public SK9(ColorArray colorSwitch)
    {
        super(colorSwitch);
        sch = true;
        sock = true;
        slenderS = true;
        nurse = true;
    }


    public void paintRight(int x, GraphicsMap g2d)
    {
        super.paintRight(x, g2d);
    }

    public void paintLeft(int x, GraphicsMap g2d)
    {
        super.paintLeft(x, g2d);
    }
}
