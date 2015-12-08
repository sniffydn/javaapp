/*
 * LittleBow1.java
 *
 * Created on March 6, 2007, 9:56 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package pieces.p;

import clts.Piece;
import util.Color;
import util.ColorArray;
import util.GraphicsMap;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class LittleBow1 extends Piece
{
    int prevX = -1;
    int prevY = -1;
    int prevDiffX = 0;
    int prevDiffY = 0;
    int length = 2;
    boolean right = true;


    /** Creates a new instance of LittleBow1 */
    public LittleBow1(int length, boolean isRight)
    {
        super();
        this.length = length;
        right = isRight;
    }

    public LittleBow1()
    {
        super();
    }


    public LittleBow1(ColorArray colorSwitch)
    {
        super(colorSwitch);
    }

    public LittleBow1(int length, boolean isRight, ColorArray colorSwitch)
    {
        super(colorSwitch);
        this.length = length;
        right = isRight;
    }

    public void paint(int x, int y, GraphicsMap g2d)
    {
        int tempLen = length;
        if(prevX == -1 && prevY == -1)
        {
            prevX = x;
            prevY = y;
        }

        int diffX = prevX - x;
        int diffY = prevY - y;

        if(right)
        {
            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(x, y, 1, 2);
            g2d.fillRect(x + 1, y + 1, 1, 1);
            g2d.fillRect(x + 2, y - 1, 1, 2);

            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(x, y - 1, 2, 1);

            int xOffset = 0;
            if(diffX < prevDiffX)
                xOffset = -1;

            if(diffY < prevDiffY)
                tempLen--;
            else if(diffY > prevDiffY)
                tempLen++;

            g2d.fillRect(x + xOffset + 2, y + 2, 1, 1);
            g2d.fillRect(x + xOffset + 1, y + 3, 1, (int)Math.floor(tempLen / 2.0));

            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(x + xOffset + 1, y + 3 + (int)Math.floor(tempLen / 2.0), 1, (int)Math.ceil(tempLen / 2.0));
            g2d.fillRect(x + xOffset + 3, y + 3, 1, tempLen);
        }
        else
        {
            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(x, y, 1, 2);
            g2d.fillRect(x - 1, y + 1, 1, 1);
            g2d.fillRect(x - 2, y - 1, 1, 2);

            g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
            g2d.fillRect(x - 1, y - 1, 2, 1);


            int xOffset = 0;
            if(diffX > prevDiffX)
                xOffset = 1;

            if(diffY < prevDiffY)
                tempLen--;
            else if(diffY > prevDiffY)
                tempLen++;

            g2d.fillRect(x + xOffset - 2, y + 2, 1, 1);
            g2d.fillRect(x + xOffset - 3, y + 3, 1, (int)Math.floor(tempLen / 2.0));

            g2d.setColor(COLORS.get(ImageUtilities.GREY));
            g2d.fillRect(x + xOffset - 3, y + 3 + (int)Math.floor(tempLen / 2.0), 1, (int)Math.ceil(tempLen / 2.0));
            g2d.fillRect(x + xOffset - 1, y + 3, 1, tempLen);
        }

        prevDiffX = diffX;
        prevDiffY = diffY;
        prevX = x;
        prevY = y;
    }

}
