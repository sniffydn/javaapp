/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package obsolete;

import clts.*;
import draw.Panel;
import util.Color;
import util.GraphicsMap;
import java.util.ArrayList;
import java.util.Hashtable;
import clts.Piece;
import pieces.p.Star0;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class L1 extends GenericC
{
    Piece piece = null;
    /** Creates a new instance of GenericClothes */

    public L1()
    {
        super();
    }

    public L1(String middle)
    {
        super(middle);
        piece = new Star0();
    }

    public L1(String middle, ColorArray colorSwitch)
    {
        super(middle, colorSwitch);
        piece = new Star0(colorSwitch);
    }

    public L1(String middle, Piece p)
    {
        super(middle);
        piece = p;
    }

    public L1(String middle, ColorArray colorSwitch, Piece p)
    {
        super(middle, colorSwitch);
        piece = p;
    }
    public void drawLower(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(108 + x, 65 + y, 2, 1);
        g2d.fillRect(111 + x, 65 + y, 2, 1);
        g2d.fillRect(110 + x, 66 + y, 1, 1);
        g2d.fillRect(108 + x, 67 + y, 2, 1);
        g2d.fillRect(111 + x, 67 + y, 2, 1);
        g2d.fillRect(109 + x, 69 + y, 1, 1);
        g2d.fillRect(111 + x, 69 + y, 1, 1);
        g2d.fillRect(110 + x, 70 + y, 1, 1);
        g2d.fillRect(109 + x, 71 + y, 1, 1);
        g2d.fillRect(111 + x, 71 + y, 1, 1);
        g2d.fillRect(109 + x, 73 + y, 1, 1);
        g2d.fillRect(111 + x, 73 + y, 1, 1);
        g2d.fillRect(110 + x, 74 + y, 1, 1);
        g2d.fillRect(109 + x, 75 + y, 1, 1);
        g2d.fillRect(111 + x, 75 + y, 1, 1);
        g2d.fillRect(109 + x, 77 + y, 1, 1);
        g2d.fillRect(110 + x, 78 + y, 1, 1);
        g2d.fillRect(110 + x, 80 + y, 1, 1);
        g2d.fillRect(107 + x, 61 + y, 2, 1);
        g2d.fillRect(111 + x, 61 + y, 2, 1);
        g2d.fillRect(109 + x, 62 + y, 2, 1);
        g2d.fillRect(107 + x, 63 + y, 3, 1);
        g2d.fillRect(111 + x, 63 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(100 + x, 41 + y, 3, 2);
        g2d.fillRect(99 + x, 43 + y, 1, 2);
        g2d.fillRect(102 + x, 43 + y, 1, 2);
        g2d.fillRect(111 + x, 40 + y, 3, 1);
        g2d.fillRect(112 + x, 41 + y, 1, 4);
        g2d.fillRect(113 + x, 43 + y, 1, 2);
        g2d.fillRect(115 + x, 43 + y, 1, 2);
        g2d.fillRect(104 + x, 64 + y, 1, 1);
        g2d.fillRect(105 + x, 64 + y, 1, 2);
        g2d.fillRect(107 + x, 64 + y, 1, 5);
        g2d.fillRect(106 + x, 67 + y, 1, 1);
        g2d.fillRect(105 + x, 68 + y, 1, 1);
        g2d.fillRect(104 + x, 69 + y, 1, 1);
        g2d.fillRect(104 + x, 66 + y, 1, 1);
        g2d.fillRect(103 + x, 67 + y, 1, 2);
        g2d.fillRect(108 + x, 69 + y, 1, 11);
        g2d.fillRect(107 + x, 70 + y, 1, 1);
        g2d.fillRect(105 + x, 70 + y, 1, 1);
        g2d.fillRect(106 + x, 71 + y, 1, 1);
        g2d.fillRect(105 + x, 72 + y, 1, 1);
        g2d.fillRect(104 + x, 73 + y, 1, 2);
        g2d.fillRect(105 + x, 75 + y, 1, 1);
        g2d.fillRect(107 + x, 75 + y, 1, 1);
        g2d.fillRect(106 + x, 76 + y, 1, 1);
        g2d.fillRect(105 + x, 77 + y, 1, 2);
        g2d.fillRect(106 + x, 79 + y, 1, 1);
        g2d.fillRect(107 + x, 80 + y, 1, 1);
        g2d.fillRect(106 + x, 81 + y, 1, 2);
        g2d.fillRect(107 + x, 83 + y, 1, 1);
        g2d.fillRect(108 + x, 84 + y, 1, 1);
        g2d.fillRect(109 + x, 85 + y, 1, 1);
        g2d.fillRect(109 + x, 79 + y, 1, 2);
        g2d.fillRect(110 + x, 81 + y, 1, 2);
        g2d.fillRect(109 + x, 83 + y, 1, 1);
        g2d.fillRect(108 + x, 86 + y, 1, 2);
        g2d.fillRect(109 + x, 88 + y, 1, 2);
        g2d.fillRect(110 + x, 90 + y, 3, 1);
        g2d.fillRect(113 + x, 87 + y, 1, 3);
        g2d.fillRect(110 + x, 87 + y, 1, 1);
        g2d.fillRect(111 + x, 86 + y, 2, 1);
        g2d.fillRect(112 + x, 85 + y, 1, 1);
        g2d.fillRect(111 + x, 83 + y, 1, 2);
        g2d.fillRect(112 + x, 83 + y, 1, 1);
        g2d.fillRect(113 + x, 84 + y, 1, 1);
        g2d.fillRect(114 + x, 78 + y, 1, 6);
        g2d.fillRect(113 + x, 81 + y, 1, 1);
        g2d.fillRect(111 + x, 77 + y, 1, 4);
        g2d.fillRect(112 + x, 78 + y, 1, 1);
        g2d.fillRect(112 + x, 80 + y, 1, 1);
        g2d.fillRect(113 + x, 77 + y, 1, 1);
        g2d.fillRect(112 + x, 69 + y, 1, 8);
        g2d.fillRect(113 + x, 64 + y, 1, 6);
        g2d.fillRect(113 + x, 72 + y, 1, 1);
        g2d.fillRect(114 + x, 66 + y, 1, 1);
        g2d.fillRect(114 + x, 73 + y, 1, 2);
        g2d.fillRect(115 + x, 75 + y, 1, 3);
        g2d.fillRect(115 + x, 71 + y, 1, 2);
        g2d.fillRect(114 + x, 70 + y, 1, 1);
        g2d.fillRect(115 + x, 69 + y, 1, 1);
        g2d.fillRect(116 + x, 68 + y, 1, 1);
        g2d.fillRect(115 + x, 67 + y, 1, 1);
        g2d.fillRect(115 + x, 64 + y, 1, 1);
        g2d.fillRect(116 + x, 65 + y, 1, 1);
        g2d.fillRect(117 + x, 66 + y, 1, 2);

        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(115 + x, 68 + y, 1, 1);
        g2d.fillRect(114 + x, 68 + y, 1, 2);
        g2d.fillRect(113 + x, 70 + y, 1, 1);
        g2d.fillRect(114 + x, 71 + y, 1, 1);
        g2d.fillRect(113 + x, 73 + y, 1, 2);
        g2d.fillRect(114 + x, 75 + y, 1, 3);
        g2d.fillRect(113 + x, 78 + y, 1, 2);

        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(100 + x, 43 + y, 1, 2);
        g2d.fillRect(114 + x, 41 + y, 1, 1);
        g2d.fillRect(113 + x, 42 + y, 1, 1);
        g2d.fillRect(115 + x, 42 + y, 1, 1);
        g2d.fillRect(114 + x, 43 + y, 1, 2);
        g2d.fillRect(106 + x, 64 + y, 1, 3);
        g2d.fillRect(114 + x, 64 + y, 1, 2);
        g2d.fillRect(115 + x, 66 + y, 1, 1);
        g2d.fillRect(114 + x, 67 + y, 1, 1);
        g2d.fillRect(116 + x, 67 + y, 1, 1);
        g2d.fillRect(105 + x, 67 + y, 1, 1);
        g2d.fillRect(104 + x, 67 + y, 1, 2);
        g2d.fillRect(106 + x, 68 + y, 1, 1);
        g2d.fillRect(107 + x, 69 + y, 1, 1);
        g2d.fillRect(105 + x, 69 + y, 1, 1);
        g2d.fillRect(106 + x, 70 + y, 1, 1);
        g2d.fillRect(107 + x, 71 + y, 1, 2);
        g2d.fillRect(106 + x, 72 + y, 1, 1);
        g2d.fillRect(105 + x, 73 + y, 1, 2);
        g2d.fillRect(107 + x, 74 + y, 1, 1);
        g2d.fillRect(106 + x, 75 + y, 1, 1);
        g2d.fillRect(107 + x, 76 + y, 1, 1);
        g2d.fillRect(106 + x, 77 + y, 1, 2);
        g2d.fillRect(107 + x, 79 + y, 1, 1);
        g2d.fillRect(108 + x, 80 + y, 1, 1);
        g2d.fillRect(107 + x, 81 + y, 1, 2);
        g2d.fillRect(109 + x, 81 + y, 1, 2);
        g2d.fillRect(108 + x, 83 + y, 1, 1);
        g2d.fillRect(109 + x, 84 + y, 1, 1);
        g2d.fillRect(113 + x, 71 + y, 1, 1);
        g2d.fillRect(114 + x, 72 + y, 1, 1);
        g2d.fillRect(113 + x, 75 + y, 1, 1);
        g2d.fillRect(112 + x, 77 + y, 1, 1);
        g2d.fillRect(112 + x, 79 + y, 1, 1);
        g2d.fillRect(113 + x, 80 + y, 1, 1);
        g2d.fillRect(112 + x, 81 + y, 1, 1);
        g2d.fillRect(111 + x, 81 + y, 1, 2);
        g2d.fillRect(110 + x, 83 + y, 1, 1);
        g2d.fillRect(113 + x, 83 + y, 1, 1);
        g2d.fillRect(112 + x, 84 + y, 1, 1);
        g2d.fillRect(111 + x, 85 + y, 1, 1);
        g2d.fillRect(110 + x, 86 + y, 1, 1);
        g2d.fillRect(109 + x, 86 + y, 1, 2);
        g2d.fillRect(110 + x, 88 + y, 1, 2);
        g2d.fillRect(111 + x, 87 + y, 1, 1);
        g2d.fillRect(112 + x, 87 + y, 1, 3);
        g2d.fillRect(111 + x, 89 + y, 1, 1);

        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(113 + x, 41 + y, 1, 1);
        g2d.fillRect(114 + x, 42 + y, 1, 1);
        g2d.fillRect(101 + x, 43 + y, 1, 2);
        g2d.fillRect(115 + x, 65 + y, 1, 1);
        g2d.fillRect(116 + x, 66 + y, 1, 1);
        g2d.fillRect(105 + x, 66 + y, 1, 1);
        g2d.fillRect(106 + x, 69 + y, 1, 1);
        g2d.fillRect(107 + x, 73 + y, 1, 1);
        g2d.fillRect(106 + x, 73 + y, 1, 2);
        g2d.fillRect(107 + x, 77 + y, 1, 2);
        g2d.fillRect(108 + x, 81 + y, 1, 2);
        g2d.fillRect(110 + x, 84 + y, 1, 2);
        g2d.fillRect(111 + x, 88 + y, 1, 1);
        g2d.fillRect(112 + x, 82 + y, 2, 1);
        g2d.fillRect(113 + x, 76 + y, 1, 1);

    }

    public void drawUpper(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_7));
        g2d.fillRect(105 + x, 50 + y, 3, 1);
        g2d.fillRect(111 + x, 50 + y, 2, 1);
        g2d.fillRect(108 + x, 51 + y, 3, 1);
        g2d.fillRect(106 + x, 52 + y, 2, 1);
        g2d.fillRect(111 + x, 52 + y, 3, 1);
        g2d.fillRect(106 + x, 54 + y, 3, 1);
        g2d.fillRect(111 + x, 54 + y, 3, 1);
        g2d.fillRect(109 + x, 55 + y, 2, 1);
        g2d.fillRect(106 + x, 56 + y, 3, 1);
        g2d.fillRect(111 + x, 56 + y, 3, 1);
        g2d.fillRect(106 + x, 58 + y, 3, 1);
        g2d.fillRect(111 + x, 58 + y, 3, 1);
        g2d.fillRect(109 + x, 59 + y, 2, 1);
        g2d.fillRect(106 + x, 60 + y, 3, 1);
        g2d.fillRect(111 + x, 60 + y, 2, 1);

        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(99 + x, 44 + y, 1, 2);
        g2d.fillRect(102 + x, 44 + y, 1, 2);
        g2d.fillRect(100 + x, 46 + y, 1, 1);
        g2d.fillRect(101 + x, 46 + y, 1, 2);
        g2d.fillRect(100 + x, 48 + y, 1, 1);
        g2d.fillRect(101 + x, 49 + y, 1, 1);
        g2d.fillRect(100 + x, 50 + y, 1, 2);
        g2d.fillRect(103 + x, 46 + y, 1, 3);
        g2d.fillRect(104 + x, 47 + y, 1, 5);
        g2d.fillRect(105 + x, 52 + y, 1, 11);
        g2d.fillRect(106 + x, 61 + y, 1, 5);
        g2d.fillRect(103 + x, 63 + y, 1, 3);
        g2d.fillRect(104 + x, 62 + y, 1, 1);
        g2d.fillRect(103 + x, 61 + y, 1, 1);
        g2d.fillRect(102 + x, 60 + y, 1, 2);
        g2d.fillRect(103 + x, 59 + y, 1, 1);
        g2d.fillRect(104 + x, 58 + y, 1, 1);
        g2d.fillRect(102 + x, 58 + y, 1, 1);
        g2d.fillRect(101 + x, 56 + y, 1, 2);
        g2d.fillRect(102 + x, 55 + y, 1, 1);
        g2d.fillRect(103 + x, 54 + y, 1, 1);
        g2d.fillRect(104 + x, 53 + y, 1, 1);
        g2d.fillRect(102 + x, 53 + y, 1, 1);
        g2d.fillRect(101 + x, 52 + y, 1, 1);
        g2d.fillRect(102 + x, 51 + y, 1, 1);
        g2d.fillRect(103 + x, 50 + y, 1, 1);
        g2d.fillRect(112 + x, 44 + y, 1, 4);
        g2d.fillRect(113 + x, 48 + y, 1, 3);
        g2d.fillRect(114 + x, 51 + y, 1, 9);
        g2d.fillRect(113 + x, 60 + y, 1, 6);
        g2d.fillRect(114 + x, 64 + y, 1, 1);
        g2d.fillRect(115 + x, 59 + y, 1, 2);
        g2d.fillRect(116 + x, 61 + y, 1, 1);
        g2d.fillRect(116 + x, 64 + y, 1, 2);
        g2d.fillRect(117 + x, 60 + y, 1, 4);
        g2d.fillRect(118 + x, 59 + y, 1, 1);
        g2d.fillRect(114 + x, 44 + y, 1, 2);
        g2d.fillRect(115 + x, 46 + y, 1, 1);
        g2d.fillRect(115 + x, 48 + y, 1, 1);
        g2d.fillRect(116 + x, 49 + y, 1, 1);
        g2d.fillRect(115 + x, 50 + y, 1, 1);
        g2d.fillRect(116 + x, 51 + y, 1, 1);
        g2d.fillRect(117 + x, 52 + y, 1, 2);
        g2d.fillRect(118 + x, 53 + y, 1, 3);
        g2d.fillRect(115 + x, 53 + y, 1, 1);
        g2d.fillRect(116 + x, 54 + y, 1, 2);
        g2d.fillRect(117 + x, 56 + y, 1, 3);

        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(115 + x, 49 + y, 1, 1);
        g2d.fillRect(114 + x, 49 + y, 1, 2);
        g2d.fillRect(115 + x, 51 + y, 1, 1);
        g2d.fillRect(116 + x, 52 + y, 1, 1);
        g2d.fillRect(115 + x, 54 + y, 1, 2);
        g2d.fillRect(116 + x, 56 + y, 1, 2);
        g2d.fillRect(114 + x, 61 + y, 2, 1);

        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(101 + x, 44 + y, 1, 1);
        g2d.fillRect(100 + x, 45 + y, 2, 1);
        g2d.fillRect(113 + x, 44 + y, 1, 4);
        g2d.fillRect(114 + x, 47 + y, 1, 2);
        g2d.fillRect(116 + x, 48 + y, 1, 1);
        g2d.fillRect(102 + x, 46 + y, 1, 3);
        g2d.fillRect(103 + x, 49 + y, 1, 1);
        g2d.fillRect(102 + x, 50 + y, 1, 1);
        g2d.fillRect(101 + x, 50 + y, 1, 2);
        g2d.fillRect(103 + x, 51 + y, 1, 1);
        g2d.fillRect(104 + x, 52 + y, 1, 1);
        g2d.fillRect(102 + x, 52 + y, 1, 1);
        g2d.fillRect(103 + x, 53 + y, 1, 1);
        g2d.fillRect(104 + x, 54 + y, 1, 2);
        g2d.fillRect(103 + x, 55 + y, 1, 1);
        g2d.fillRect(102 + x, 56 + y, 1, 2);
        g2d.fillRect(104 + x, 57 + y, 1, 1);
        g2d.fillRect(103 + x, 58 + y, 1, 1);
        g2d.fillRect(104 + x, 59 + y, 1, 1);
        g2d.fillRect(103 + x, 60 + y, 1, 1);
        g2d.fillRect(104 + x, 63 + y, 1, 1);
        g2d.fillRect(104 + x, 64 + y, 2, 2);
        g2d.fillRect(115 + x, 52 + y, 1, 1);
        g2d.fillRect(116 + x, 53 + y, 1, 1);
        g2d.fillRect(117 + x, 54 + y, 1, 2);
        g2d.fillRect(115 + x, 56 + y, 1, 1);
        g2d.fillRect(115 + x, 58 + y, 1, 1);
        g2d.fillRect(116 + x, 59 + y, 1, 2);
        g2d.fillRect(114 + x, 60 + y, 1, 1);
        g2d.fillRect(114 + x, 62 + y, 1, 2);
        g2d.fillRect(116 + x, 62 + y, 1, 2);
        g2d.fillRect(115 + x, 64 + y, 1, 2);
        g2d.fillRect(114 + x, 65 + y, 1, 1);

        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(100 + x, 44 + y, 1, 1);
        g2d.fillRect(114 + x, 46 + y, 1, 1);
        g2d.fillRect(115 + x, 47 + y, 1, 1);
        g2d.fillRect(101 + x, 48 + y, 1, 1);
        g2d.fillRect(102 + x, 49 + y, 1, 1);
        g2d.fillRect(103 + x, 52 + y, 1, 1);
        g2d.fillRect(104 + x, 56 + y, 1, 1);
        g2d.fillRect(103 + x, 56 + y, 1, 2);
        g2d.fillRect(115 + x, 57 + y, 1, 1);
        g2d.fillRect(116 + x, 58 + y, 1, 1);
        g2d.fillRect(117 + x, 59 + y, 1, 1);
        g2d.fillRect(104 + x, 60 + y, 1, 2);
        g2d.fillRect(105 + x, 63 + y, 1, 1);
        g2d.fillRect(115 + x, 62 + y, 1, 2);
    }

    public void paintVeryBack(int offsetX, int offsetY, GraphicsMap g2d) {
    }

    public void paintBack(int offsetX, int offsetY, GraphicsMap g2d) {
    }

    public void paintMiddle(int offsetX, int offsetY, GraphicsMap g2d)
    {
        drawLower(offsetX, 0, g2d);
    }

    public void paintFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
        drawUpper(offsetX, offsetY, g2d);
    }

    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d) {
    }

    public void setStep(int iStep, int iDirection, int iLeftArm, int iRightArm,int eye) {
    }

    public void paintStationaryFront(int offsetX, int offsetY, GraphicsMap g2d) {
    }
}
