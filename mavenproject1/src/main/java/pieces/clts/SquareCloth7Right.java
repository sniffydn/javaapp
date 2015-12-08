/*
 * LittleBow1.java
 *
 * Created on March 6, 2007, 9:56 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package pieces.clts;

import util.Color;
import java.util.ArrayList;
import util.ColorArray;
import util.GraphicsMap;
import util.ImageUtilities;
import clts.Piece;

/**
 *
 * @author nyffeldd
 */
public class SquareCloth7Right extends Piece
{
    int prevY = -1;
    public int height = 6;

    /** Creates a new instance of DrawString0 */

    public SquareCloth7Right()
    {
    }

    public SquareCloth7Right(ColorArray colorSwitch)
    {
        super(colorSwitch);
    }

    public void paint(int x, int y, GraphicsMap g2d)
    {
        if(prevY == -1)
        {
            prevY = y;
        }

        int offsetY = 1;
        if(prevY - y < 0)
            offsetY = 0;

        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        ArrayList lineOne = ImageUtilities.drawLine(x, y, x, height + y + offsetY - 1, g2d);
        ArrayList lineThree = ImageUtilities.drawLine(4 + x, y, 5 + x, height + y + offsetY - 1, g2d);

        g2d.fillRect(0 + x, 0 + height + y + offsetY, 1, 1);
        g2d.fillRect(0 + x, 1 + height + y + offsetY, 6, 1);
        g2d.fillRect(6 + x, 0 + height + y + offsetY, 1, 1);



        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        ArrayList lineTwo = ImageUtilities.drawLine(2 + x, y, 3 + x, height + y + offsetY - 1, g2d);
        ImageUtilities.drawTrap(lineOne, lineTwo, y, y + height + offsetY - 1, g2d);

        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        ImageUtilities.drawTrap(lineTwo, lineThree, y, y + height + offsetY - 1, g2d);

        g2d.fillRect(1 + x, 0 + height + y + offsetY, 5, 1);

        prevY = y;
    }
}
