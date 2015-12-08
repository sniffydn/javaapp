package clts.b;

import clts.SuperB;
import util.Color;
import util.GraphicsMap;
import util.ImageUtilities;
import util.ColorArray;

public class Skrt9 extends SuperB {

    {
        jean = true;
        skt = true;
        shrt = true;
    }

    public Skrt9() {
        super();
    }

    public Skrt9(int layer) {
        super(layer);
    }

    public Skrt9(ColorArray colorSwitch) {
        super(colorSwitch);
    }

    public Skrt9(int layer, ColorArray colorSwitch) {
        super(layer, colorSwitch);
    }

    public void draw(int x, int y, GraphicsMap g2d) {
        if (step < 6 || step > 13) {
            paintR(x,y,g2d);
        } else {
            paintL(x,y,g2d);
        }
    }

    public void paintR(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(122 + x, 84 + y, 1, 1);
        g2d.fillRect(122 + x, 87 + y, 1, 1);
        g2d.fillRect(108 + x, 90 + y, 1, 1);
        g2d.fillRect(119 + x, 90 + y, 1, 1);
        g2d.fillRect(109 + x, 91 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(119 + x, 82 + y, 1, 1);
        g2d.fillRect(120 + x, 83 + y, 2, 1);
        g2d.fillRect(114 + x, 84 + y, 1, 1);
        g2d.fillRect(118 + x, 84 + y, 1, 1);
        g2d.fillRect(115 + x, 85 + y, 1, 1);
        g2d.fillRect(120 + x, 85 + y, 2, 1);
        g2d.fillRect(102 + x, 86 + y, 1, 1);
        g2d.fillRect(106 + x, 86 + y, 1, 1);
        g2d.fillRect(117 + x, 86 + y, 1, 1);
        g2d.fillRect(122 + x, 86 + y, 1, 1);
        g2d.fillRect(107 + x, 87 + y, 1, 1);
        g2d.fillRect(112 + x, 87 + y, 1, 1);
        g2d.fillRect(99 + x, 88 + y, 1, 1);
        g2d.fillRect(109 + x, 88 + y, 1, 1);
        g2d.fillRect(118 + x, 88 + y, 1, 1);
        g2d.fillRect(100 + x, 89 + y, 1, 1);
        g2d.fillRect(106 + x, 89 + y, 1, 1);
        g2d.fillRect(113 + x, 89 + y, 2, 1);
        g2d.fillRect(114 + x, 90 + y, 1, 1);
        g2d.fillRect(99 + x, 91 + y, 1, 1);
        g2d.fillRect(98 + x, 92 + y, 1, 1);
        g2d.fillRect(100 + x, 92 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(118 + x, 85 + y, 1, 1);
        g2d.fillRect(122 + x, 85 + y, 1, 1);
        g2d.fillRect(120 + x, 86 + y, 2, 1);
        g2d.fillRect(123 + x, 86 + y, 1, 1);
        g2d.fillRect(103 + x, 87 + y, 1, 3);
        g2d.fillRect(113 + x, 87 + y, 1, 2);
        g2d.fillRect(114 + x, 87 + y, 1, 2);
        g2d.fillRect(115 + x, 87 + y, 1, 1);
        g2d.fillRect(117 + x, 87 + y, 1, 1);
        g2d.fillRect(119 + x, 87 + y, 1, 1);
        g2d.fillRect(121 + x, 87 + y, 1, 2);
        g2d.fillRect(100 + x, 88 + y, 1, 1);
        g2d.fillRect(110 + x, 88 + y, 2, 1);
        g2d.fillRect(116 + x, 88 + y, 1, 1);
        g2d.fillRect(120 + x, 88 + y, 1, 1);
        g2d.fillRect(104 + x, 89 + y, 1, 2);
        g2d.fillRect(105 + x, 89 + y, 1, 2);
        g2d.fillRect(107 + x, 89 + y, 3, 1);
        g2d.fillRect(115 + x, 89 + y, 1, 2);
        g2d.fillRect(119 + x, 89 + y, 1, 1);
        g2d.fillRect(99 + x, 90 + y, 2, 1);
        g2d.fillRect(102 + x, 90 + y, 1, 1);
        g2d.fillRect(106 + x, 90 + y, 1, 2);
        g2d.fillRect(109 + x, 90 + y, 3, 1);
        g2d.fillRect(110 + x, 91 + y, 2, 1);
        g2d.fillRect(99 + x, 92 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(118 + x, 80 + y, 1, 4);
        g2d.fillRect(119 + x, 80 + y, 1, 2);
        g2d.fillRect(102 + x, 81 + y, 1, 2);
        g2d.fillRect(120 + x, 81 + y, 1, 2);
        g2d.fillRect(100 + x, 82 + y, 1, 5);
        g2d.fillRect(101 + x, 82 + y, 1, 4);
        g2d.fillRect(117 + x, 82 + y, 1, 1);
        g2d.fillRect(121 + x, 82 + y, 1, 1);
        g2d.fillRect(115 + x, 83 + y, 1, 2);
        g2d.fillRect(116 + x, 83 + y, 1, 1);
        g2d.fillRect(102 + x, 84 + y, 1, 2);
        g2d.fillRect(103 + x, 84 + y, 1, 3);
        g2d.fillRect(104 + x, 84 + y, 1, 2);
        g2d.fillRect(106 + x, 84 + y, 1, 2);
        g2d.fillRect(107 + x, 84 + y, 1, 2);
        g2d.fillRect(108 + x, 84 + y, 6, 1);
        g2d.fillRect(121 + x, 84 + y, 1, 1);
        g2d.fillRect(105 + x, 85 + y, 1, 4);
        g2d.fillRect(109 + x, 85 + y, 2, 1);
        g2d.fillRect(114 + x, 85 + y, 1, 1);
        g2d.fillRect(116 + x, 85 + y, 1, 2);
        g2d.fillRect(123 + x, 85 + y, 1, 1);
        g2d.fillRect(110 + x, 86 + y, 2, 1);
        g2d.fillRect(119 + x, 86 + y, 1, 1);
        g2d.fillRect(124 + x, 86 + y, 1, 1);
        g2d.fillRect(101 + x, 87 + y, 1, 1);
        g2d.fillRect(104 + x, 87 + y, 1, 1);
        g2d.fillRect(106 + x, 87 + y, 1, 1);
        g2d.fillRect(108 + x, 87 + y, 1, 1);
        g2d.fillRect(120 + x, 87 + y, 1, 1);
        g2d.fillRect(122 + x, 88 + y, 1, 1);
        g2d.fillRect(99 + x, 89 + y, 1, 1);
        g2d.fillRect(102 + x, 89 + y, 1, 1);
        g2d.fillRect(111 + x, 89 + y, 1, 1);
        g2d.fillRect(107 + x, 90 + y, 1, 1);
        g2d.fillRect(100 + x, 91 + y, 1, 1);
        g2d.fillRect(103 + x, 91 + y, 1, 1);
        g2d.fillRect(105 + x, 91 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(103 + x, 81 + y, 1, 3);
        g2d.fillRect(104 + x, 81 + y, 1, 3);
        g2d.fillRect(105 + x, 82 + y, 1, 3);
        g2d.fillRect(106 + x, 82 + y, 1, 2);
        g2d.fillRect(107 + x, 82 + y, 1, 2);
        g2d.fillRect(108 + x, 82 + y, 1, 2);
        g2d.fillRect(109 + x, 82 + y, 1, 2);
        g2d.fillRect(110 + x, 82 + y, 1, 2);
        g2d.fillRect(115 + x, 82 + y, 1, 1);
        g2d.fillRect(102 + x, 83 + y, 1, 1);
        g2d.fillRect(111 + x, 83 + y, 1, 1);
        g2d.fillRect(117 + x, 83 + y, 1, 2);
        g2d.fillRect(119 + x, 83 + y, 1, 1);
        g2d.fillRect(116 + x, 84 + y, 1, 1);
        g2d.fillRect(108 + x, 85 + y, 1, 2);
        g2d.fillRect(111 + x, 85 + y, 3, 1);
        g2d.fillRect(101 + x, 86 + y, 1, 1);
        g2d.fillRect(104 + x, 86 + y, 1, 1);
        g2d.fillRect(107 + x, 86 + y, 1, 1);
        g2d.fillRect(109 + x, 86 + y, 1, 1);
        g2d.fillRect(112 + x, 86 + y, 1, 1);
        g2d.fillRect(118 + x, 86 + y, 1, 2);
        g2d.fillRect(102 + x, 87 + y, 1, 1);
        g2d.fillRect(119 + x, 88 + y, 1, 1);
        g2d.fillRect(101 + x, 89 + y, 1, 3);
        g2d.fillRect(118 + x, 89 + y, 1, 1);
        g2d.fillRect(103 + x, 90 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(115 + x, 80 + y, 1, 2);
        g2d.fillRect(116 + x, 80 + y, 1, 3);
        g2d.fillRect(117 + x, 80 + y, 1, 2);
        g2d.fillRect(111 + x, 81 + y, 1, 2);
        g2d.fillRect(112 + x, 81 + y, 1, 3);
        g2d.fillRect(113 + x, 81 + y, 1, 3);
        g2d.fillRect(114 + x, 81 + y, 1, 3);
        g2d.fillRect(122 + x, 83 + y, 1, 1);
        g2d.fillRect(119 + x, 84 + y, 1, 2);
        g2d.fillRect(120 + x, 84 + y, 1, 1);
        g2d.fillRect(117 + x, 85 + y, 1, 1);
        g2d.fillRect(113 + x, 86 + y, 3, 1);
        g2d.fillRect(100 + x, 87 + y, 1, 1);
        g2d.fillRect(109 + x, 87 + y, 3, 1);
        g2d.fillRect(116 + x, 87 + y, 1, 1);
        g2d.fillRect(101 + x, 88 + y, 2, 1);
        g2d.fillRect(104 + x, 88 + y, 1, 1);
        g2d.fillRect(106 + x, 88 + y, 3, 1);
        g2d.fillRect(112 + x, 88 + y, 1, 3);
        g2d.fillRect(115 + x, 88 + y, 1, 1);
        g2d.fillRect(117 + x, 88 + y, 1, 1);
        g2d.fillRect(110 + x, 89 + y, 1, 1);
        g2d.fillRect(113 + x, 90 + y, 1, 1);
    }

    public void paintL(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(99 + x, 84 + y, 1, 1);
        g2d.fillRect(99 + x, 87 + y, 1, 1);
        g2d.fillRect(102 + x, 90 + y, 1, 1);
        g2d.fillRect(113 + x, 90 + y, 1, 1);
        g2d.fillRect(112 + x, 91 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(102 + x, 82 + y, 1, 1);
        g2d.fillRect(100 + x, 83 + y, 2, 1);
        g2d.fillRect(103 + x, 84 + y, 1, 1);
        g2d.fillRect(107 + x, 84 + y, 1, 1);
        g2d.fillRect(100 + x, 85 + y, 2, 1);
        g2d.fillRect(106 + x, 85 + y, 1, 1);
        g2d.fillRect(99 + x, 86 + y, 1, 1);
        g2d.fillRect(104 + x, 86 + y, 1, 1);
        g2d.fillRect(115 + x, 86 + y, 1, 1);
        g2d.fillRect(119 + x, 86 + y, 1, 1);
        g2d.fillRect(109 + x, 87 + y, 1, 1);
        g2d.fillRect(114 + x, 87 + y, 1, 1);
        g2d.fillRect(103 + x, 88 + y, 1, 1);
        g2d.fillRect(112 + x, 88 + y, 1, 1);
        g2d.fillRect(122 + x, 88 + y, 1, 1);
        g2d.fillRect(107 + x, 89 + y, 1, 2);
        g2d.fillRect(108 + x, 89 + y, 1, 1);
        g2d.fillRect(115 + x, 89 + y, 1, 1);
        g2d.fillRect(121 + x, 89 + y, 1, 1);
        g2d.fillRect(122 + x, 91 + y, 1, 1);
        g2d.fillRect(121 + x, 92 + y, 1, 1);
        g2d.fillRect(123 + x, 92 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(99 + x, 85 + y, 1, 1);
        g2d.fillRect(103 + x, 85 + y, 1, 1);
        g2d.fillRect(98 + x, 86 + y, 1, 1);
        g2d.fillRect(100 + x, 86 + y, 1, 3);
        g2d.fillRect(101 + x, 86 + y, 1, 1);
        g2d.fillRect(102 + x, 87 + y, 1, 1);
        g2d.fillRect(104 + x, 87 + y, 1, 1);
        g2d.fillRect(106 + x, 87 + y, 3, 1);
        g2d.fillRect(118 + x, 87 + y, 1, 3);
        g2d.fillRect(101 + x, 88 + y, 1, 1);
        g2d.fillRect(105 + x, 88 + y, 1, 1);
        g2d.fillRect(107 + x, 88 + y, 2, 1);
        g2d.fillRect(110 + x, 88 + y, 2, 1);
        g2d.fillRect(121 + x, 88 + y, 1, 1);
        g2d.fillRect(102 + x, 89 + y, 1, 1);
        g2d.fillRect(106 + x, 89 + y, 1, 2);
        g2d.fillRect(112 + x, 89 + y, 1, 2);
        g2d.fillRect(113 + x, 89 + y, 2, 1);
        g2d.fillRect(116 + x, 89 + y, 1, 2);
        g2d.fillRect(117 + x, 89 + y, 1, 2);
        g2d.fillRect(110 + x, 90 + y, 1, 2);
        g2d.fillRect(111 + x, 90 + y, 1, 2);
        g2d.fillRect(115 + x, 90 + y, 1, 2);
        g2d.fillRect(119 + x, 90 + y, 1, 1);
        g2d.fillRect(121 + x, 90 + y, 2, 1);
        g2d.fillRect(122 + x, 92 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(100 + x, 80 + y, 1, 3);
        g2d.fillRect(101 + x, 80 + y, 1, 3);
        g2d.fillRect(102 + x, 80 + y, 1, 2);
        g2d.fillRect(103 + x, 80 + y, 1, 4);
        g2d.fillRect(119 + x, 81 + y, 1, 2);
        g2d.fillRect(120 + x, 81 + y, 1, 5);
        g2d.fillRect(104 + x, 82 + y, 1, 1);
        g2d.fillRect(121 + x, 82 + y, 1, 5);
        g2d.fillRect(105 + x, 83 + y, 2, 1);
        g2d.fillRect(100 + x, 84 + y, 1, 1);
        g2d.fillRect(106 + x, 84 + y, 1, 1);
        g2d.fillRect(108 + x, 84 + y, 8, 1);
        g2d.fillRect(117 + x, 84 + y, 1, 2);
        g2d.fillRect(118 + x, 84 + y, 1, 3);
        g2d.fillRect(119 + x, 84 + y, 1, 2);
        g2d.fillRect(98 + x, 85 + y, 1, 1);
        g2d.fillRect(105 + x, 85 + y, 1, 2);
        g2d.fillRect(107 + x, 85 + y, 1, 1);
        g2d.fillRect(111 + x, 85 + y, 1, 2);
        g2d.fillRect(112 + x, 85 + y, 1, 1);
        g2d.fillRect(114 + x, 85 + y, 3, 1);
        g2d.fillRect(97 + x, 86 + y, 1, 1);
        g2d.fillRect(102 + x, 86 + y, 1, 1);
        g2d.fillRect(110 + x, 86 + y, 1, 1);
        g2d.fillRect(116 + x, 86 + y, 1, 3);
        g2d.fillRect(101 + x, 87 + y, 1, 1);
        g2d.fillRect(113 + x, 87 + y, 1, 1);
        g2d.fillRect(115 + x, 87 + y, 1, 1);
        g2d.fillRect(117 + x, 87 + y, 1, 1);
        g2d.fillRect(120 + x, 87 + y, 1, 1);
        g2d.fillRect(99 + x, 88 + y, 1, 1);
        g2d.fillRect(110 + x, 89 + y, 1, 1);
        g2d.fillRect(119 + x, 89 + y, 1, 1);
        g2d.fillRect(122 + x, 89 + y, 1, 1);
        g2d.fillRect(114 + x, 90 + y, 1, 1);
        g2d.fillRect(116 + x, 91 + y, 1, 1);
        g2d.fillRect(118 + x, 91 + y, 1, 1);
        g2d.fillRect(121 + x, 91 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(117 + x, 81 + y, 1, 3);
        g2d.fillRect(118 + x, 81 + y, 1, 3);
        g2d.fillRect(106 + x, 82 + y, 1, 1);
        g2d.fillRect(111 + x, 82 + y, 1, 2);
        g2d.fillRect(112 + x, 82 + y, 1, 2);
        g2d.fillRect(113 + x, 82 + y, 1, 2);
        g2d.fillRect(114 + x, 82 + y, 1, 2);
        g2d.fillRect(115 + x, 82 + y, 1, 2);
        g2d.fillRect(116 + x, 82 + y, 1, 3);
        g2d.fillRect(102 + x, 83 + y, 1, 1);
        g2d.fillRect(104 + x, 83 + y, 1, 2);
        g2d.fillRect(110 + x, 83 + y, 1, 1);
        g2d.fillRect(119 + x, 83 + y, 1, 1);
        g2d.fillRect(105 + x, 84 + y, 1, 1);
        g2d.fillRect(108 + x, 85 + y, 3, 1);
        g2d.fillRect(113 + x, 85 + y, 1, 2);
        g2d.fillRect(103 + x, 86 + y, 1, 2);
        g2d.fillRect(109 + x, 86 + y, 1, 1);
        g2d.fillRect(112 + x, 86 + y, 1, 1);
        g2d.fillRect(114 + x, 86 + y, 1, 1);
        g2d.fillRect(117 + x, 86 + y, 1, 1);
        g2d.fillRect(120 + x, 86 + y, 1, 1);
        g2d.fillRect(119 + x, 87 + y, 1, 1);
        g2d.fillRect(102 + x, 88 + y, 1, 1);
        g2d.fillRect(103 + x, 89 + y, 1, 1);
        g2d.fillRect(120 + x, 89 + y, 1, 3);
        g2d.fillRect(118 + x, 90 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(104 + x, 80 + y, 1, 2);
        g2d.fillRect(105 + x, 80 + y, 1, 3);
        g2d.fillRect(106 + x, 80 + y, 1, 2);
        g2d.fillRect(107 + x, 81 + y, 1, 3);
        g2d.fillRect(108 + x, 81 + y, 1, 3);
        g2d.fillRect(109 + x, 81 + y, 1, 3);
        g2d.fillRect(110 + x, 81 + y, 1, 2);
        g2d.fillRect(99 + x, 83 + y, 1, 1);
        g2d.fillRect(101 + x, 84 + y, 2, 1);
        g2d.fillRect(102 + x, 85 + y, 1, 1);
        g2d.fillRect(104 + x, 85 + y, 1, 1);
        g2d.fillRect(106 + x, 86 + y, 3, 1);
        g2d.fillRect(105 + x, 87 + y, 1, 1);
        g2d.fillRect(110 + x, 87 + y, 3, 1);
        g2d.fillRect(121 + x, 87 + y, 1, 1);
        g2d.fillRect(104 + x, 88 + y, 1, 1);
        g2d.fillRect(106 + x, 88 + y, 1, 1);
        g2d.fillRect(109 + x, 88 + y, 1, 3);
        g2d.fillRect(113 + x, 88 + y, 3, 1);
        g2d.fillRect(117 + x, 88 + y, 1, 1);
        g2d.fillRect(119 + x, 88 + y, 2, 1);
        g2d.fillRect(111 + x, 89 + y, 1, 1);
        g2d.fillRect(108 + x, 90 + y, 1, 1);
    }

    public void setOriginalColorArray(boolean b) {
        COLORS.set(ImageUtilities.NEG_GREY_3, new Color(173, 173, 173));
        COLORS.set(ImageUtilities.NEG_GREY_2, new Color(189, 189, 189));
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(230, 214, 189));
        COLORS.set(ImageUtilities.GREY, new Color(222, 222, 222));
        COLORS.set(ImageUtilities.GREY_1, new Color(239, 239, 239));
        COLORS.set(ImageUtilities.GREY_2, new Color(255, 255, 255));
    }

    public boolean getOriginalColorArray() {
        return false;
    }
}
