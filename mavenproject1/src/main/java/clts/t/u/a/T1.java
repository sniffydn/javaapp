package clts.t.u.a;

import clts.SuperTL;
import util.Color;
import util.ColorArray;
import util.GraphicsMap;
import util.ImageUtilities;

public class T1 extends SuperTL {

    public T1() {
        super();
    }

    public T1(ColorArray colorSwitch) {
        super(colorSwitch);
    }

    public void draw(int x, int y, GraphicsMap g2d) {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(103 + x, 40 + y, 1, 2);
        g2d.fillRect(104 + x, 40 + y, 1, 2);
        g2d.fillRect(114 + x, 40 + y, 1, 1);
        g2d.fillRect(107 + x, 42 + y, 1, 2);
        g2d.fillRect(106 + x, 43 + y, 1, 1);
        g2d.fillRect(112 + x, 43 + y, 1, 2);
        g2d.fillRect(111 + x, 44 + y, 1, 3);
        g2d.fillRect(109 + x, 46 + y, 1, 3);
        g2d.fillRect(111 + x, 50 + y, 2, 1);
        g2d.fillRect(112 + x, 51 + y, 1, 1);
        g2d.fillRect(108 + x, 53 + y, 1, 3);
        g2d.fillRect(107 + x, 55 + y, 1, 2);
        g2d.fillRect(112 + x, 55 + y, 1, 2);
        g2d.fillRect(113 + x, 55 + y, 1, 2);
        g2d.fillRect(114 + x, 59 + y, 1, 3);
        g2d.fillRect(113 + x, 60 + y, 1, 1);
        g2d.fillRect(106 + x, 61 + y, 1, 3);
        g2d.fillRect(107 + x, 61 + y, 1, 2);
        g2d.fillRect(109 + x, 64 + y, 1, 2);
        g2d.fillRect(110 + x, 65 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(114 + x, 41 + y, 1, 1);
        g2d.fillRect(113 + x, 42 + y, 1, 1);
        g2d.fillRect(110 + x, 45 + y, 1, 3);
        g2d.fillRect(111 + x, 51 + y, 1, 2);
        g2d.fillRect(109 + x, 52 + y, 1, 3);
        g2d.fillRect(111 + x, 56 + y, 1, 2);
        g2d.fillRect(112 + x, 57 + y, 1, 1);
        g2d.fillRect(108 + x, 59 + y, 1, 3);
        g2d.fillRect(107 + x, 60 + y, 1, 1);
        g2d.fillRect(109 + x, 60 + y, 1, 1);
        g2d.fillRect(113 + x, 61 + y, 1, 2);
        g2d.fillRect(110 + x, 63 + y, 1, 2);
        g2d.fillRect(111 + x, 64 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(108 + x, 42 + y, 1, 2);
        g2d.fillRect(110 + x, 51 + y, 1, 3);
        g2d.fillRect(110 + x, 57 + y, 1, 3);
        g2d.fillRect(109 + x, 58 + y, 1, 2);
        g2d.fillRect(111 + x, 58 + y, 1, 1);
        g2d.fillRect(112 + x, 61 + y, 1, 3);
        g2d.fillRect(111 + x, 62 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(113 + x, 40 + y, 1, 2);
        g2d.fillRect(105 + x, 41 + y, 1, 2);
        g2d.fillRect(111 + x, 41 + y, 1, 3);
        g2d.fillRect(112 + x, 41 + y, 1, 2);
        g2d.fillRect(104 + x, 42 + y, 1, 1);
        g2d.fillRect(106 + x, 42 + y, 1, 1);
        g2d.fillRect(109 + x, 43 + y, 1, 3);
        g2d.fillRect(110 + x, 43 + y, 1, 2);
        g2d.fillRect(108 + x, 44 + y, 1, 1);
        g2d.fillRect(111 + x, 47 + y, 1, 3);
        g2d.fillRect(112 + x, 47 + y, 1, 1);
        g2d.fillRect(110 + x, 48 + y, 1, 3);
        g2d.fillRect(109 + x, 49 + y, 1, 3);
        g2d.fillRect(108 + x, 50 + y, 1, 3);
        g2d.fillRect(112 + x, 52 + y, 1, 3);
        g2d.fillRect(111 + x, 53 + y, 1, 3);
        g2d.fillRect(110 + x, 54 + y, 1, 3);
        g2d.fillRect(109 + x, 55 + y, 1, 3);
        g2d.fillRect(108 + x, 56 + y, 1, 3);
        g2d.fillRect(107 + x, 57 + y, 1, 3);
        g2d.fillRect(113 + x, 57 + y, 1, 3);
        g2d.fillRect(112 + x, 58 + y, 1, 3);
        g2d.fillRect(106 + x, 59 + y, 1, 2);
        g2d.fillRect(111 + x, 59 + y, 1, 3);
        g2d.fillRect(110 + x, 60 + y, 1, 3);
        g2d.fillRect(109 + x, 61 + y, 1, 3);
        g2d.fillRect(108 + x, 62 + y, 1, 3);
        g2d.fillRect(114 + x, 62 + y, 1, 2);
        g2d.fillRect(107 + x, 63 + y, 1, 2);
        g2d.fillRect(113 + x, 63 + y, 1, 2);
        g2d.fillRect(112 + x, 64 + y, 1, 2);
        g2d.fillRect(111 + x, 65 + y, 1, 2);
        g2d.fillRect(110 + x, 66 + y, 1, 1);
    }

    public void setOriginalColorArray(boolean b) {
        COLORS.set(ImageUtilities.NEG_GREY_2, new Color(0, 151, 0));
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(0, 168, 0));
        COLORS.set(ImageUtilities.GREY, new Color(0, 193, 0));
        COLORS.set(ImageUtilities.GREY_1, new Color(187, 187, 187));
    }

    public boolean getOriginalColorArray() {
        return false;
    }

    public void paintFront(int offsetX, int offsetY, GraphicsMap g2d) {
        super.paintFront(offsetX, offsetY, g2d);
        draw(offsetX, 0, g2d);
    }
}
