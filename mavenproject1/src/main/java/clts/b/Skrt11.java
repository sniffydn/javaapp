package clts.b;

import clts.SuperB;
import util.Color;
import util.GraphicsMap;
import util.ImageUtilities;
import util.ColorArray;

public class Skrt11 extends SuperB {

    {
        includeY = true;
        jean = true;
        skt = true;
        shrt = true;
    }

    public Skrt11() {
        super();
    }

    public Skrt11(int layer) {
        super(layer);
    }

    public Skrt11(ColorArray colorSwitch) {
        super(colorSwitch);
    }

    public Skrt11(int layer, ColorArray colorSwitch) {
        super(layer, colorSwitch);
    }

    public void draw(int x, int y, GraphicsMap g2d) {
        if(y > 0)
        {
            paintB3(x,0,g2d);
        }else if(y < 0)
        {
            paintB1(x,0,g2d);
        }else
        {
            paintB2(x,0,g2d);
        }
    }

    public void paintB3(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(100 + x, 81 + y, 1, 2);
        g2d.fillRect(103 + x, 81 + y, 3, 1);
        g2d.fillRect(106 + x, 82 + y, 1, 1);
        g2d.fillRect(110 + x, 82 + y, 3, 1);
        g2d.fillRect(115 + x, 82 + y, 1, 1);
        g2d.fillRect(114 + x, 83 + y, 1, 1);
        g2d.fillRect(100 + x, 84 + y, 1, 1);
        g2d.fillRect(121 + x, 84 + y, 1, 2);
        g2d.fillRect(109 + x, 86 + y, 1, 1);
        g2d.fillRect(111 + x, 86 + y, 1, 2);
        g2d.fillRect(110 + x, 87 + y, 1, 4);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(100 + x, 80 + y, 1, 1);
        g2d.fillRect(120 + x, 80 + y, 1, 4);
        g2d.fillRect(101 + x, 81 + y, 1, 5);
        g2d.fillRect(102 + x, 81 + y, 1, 1);
        g2d.fillRect(116 + x, 81 + y, 1, 2);
        g2d.fillRect(117 + x, 81 + y, 3, 1);
        g2d.fillRect(104 + x, 82 + y, 1, 3);
        g2d.fillRect(107 + x, 82 + y, 3, 1);
        g2d.fillRect(113 + x, 82 + y, 2, 1);
        g2d.fillRect(118 + x, 82 + y, 1, 3);
        g2d.fillRect(121 + x, 82 + y, 1, 2);
        g2d.fillRect(100 + x, 83 + y, 1, 1);
        g2d.fillRect(102 + x, 83 + y, 2, 1);
        g2d.fillRect(109 + x, 83 + y, 1, 3);
        g2d.fillRect(111 + x, 83 + y, 1, 3);
        g2d.fillRect(117 + x, 83 + y, 1, 1);
        g2d.fillRect(119 + x, 83 + y, 1, 1);
        g2d.fillRect(105 + x, 84 + y, 4, 1);
        g2d.fillRect(110 + x, 84 + y, 1, 1);
        g2d.fillRect(112 + x, 84 + y, 5, 1);
        g2d.fillRect(102 + x, 85 + y, 2, 1);
        g2d.fillRect(119 + x, 85 + y, 2, 1);
        g2d.fillRect(100 + x, 86 + y, 1, 3);
        g2d.fillRect(110 + x, 86 + y, 1, 1);
        g2d.fillRect(121 + x, 86 + y, 1, 3);
        g2d.fillRect(106 + x, 90 + y, 2, 1);
        g2d.fillRect(120 + x, 90 + y, 2, 1);
        g2d.fillRect(109 + x, 91 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(121 + x, 81 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(102 + x, 82 + y, 1, 1);
        g2d.fillRect(105 + x, 82 + y, 1, 1);
        g2d.fillRect(117 + x, 82 + y, 1, 1);
        g2d.fillRect(119 + x, 82 + y, 1, 1);
        g2d.fillRect(108 + x, 83 + y, 1, 1);
        g2d.fillRect(110 + x, 83 + y, 1, 1);
        g2d.fillRect(116 + x, 83 + y, 1, 1);
        g2d.fillRect(103 + x, 84 + y, 1, 1);
        g2d.fillRect(117 + x, 84 + y, 1, 1);
        g2d.fillRect(100 + x, 85 + y, 1, 1);
        g2d.fillRect(105 + x, 85 + y, 4, 1);
        g2d.fillRect(110 + x, 85 + y, 1, 1);
        g2d.fillRect(112 + x, 85 + y, 1, 6);
        g2d.fillRect(113 + x, 85 + y, 1, 3);
        g2d.fillRect(114 + x, 85 + y, 3, 1);
        g2d.fillRect(118 + x, 85 + y, 1, 2);
        g2d.fillRect(108 + x, 86 + y, 1, 5);
        g2d.fillRect(117 + x, 86 + y, 1, 1);
        g2d.fillRect(107 + x, 87 + y, 1, 3);
        g2d.fillRect(109 + x, 87 + y, 1, 4);
        g2d.fillRect(114 + x, 87 + y, 2, 1);
        g2d.fillRect(104 + x, 88 + y, 1, 2);
        g2d.fillRect(111 + x, 88 + y, 1, 3);
        g2d.fillRect(100 + x, 89 + y, 4, 1);
        g2d.fillRect(105 + x, 89 + y, 2, 1);
        g2d.fillRect(113 + x, 89 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(103 + x, 82 + y, 1, 1);
        g2d.fillRect(107 + x, 83 + y, 1, 1);
        g2d.fillRect(112 + x, 83 + y, 2, 1);
        g2d.fillRect(119 + x, 84 + y, 1, 1);
        g2d.fillRect(104 + x, 85 + y, 1, 3);
        g2d.fillRect(117 + x, 85 + y, 1, 1);
        g2d.fillRect(101 + x, 86 + y, 1, 3);
        g2d.fillRect(102 + x, 86 + y, 1, 3);
        g2d.fillRect(103 + x, 86 + y, 1, 3);
        g2d.fillRect(105 + x, 86 + y, 1, 3);
        g2d.fillRect(106 + x, 86 + y, 1, 3);
        g2d.fillRect(107 + x, 86 + y, 1, 1);
        g2d.fillRect(114 + x, 86 + y, 3, 1);
        g2d.fillRect(119 + x, 86 + y, 1, 7);
        g2d.fillRect(120 + x, 86 + y, 1, 4);
        g2d.fillRect(116 + x, 87 + y, 1, 1);
        g2d.fillRect(118 + x, 87 + y, 1, 7);
        g2d.fillRect(113 + x, 88 + y, 2, 1);
        g2d.fillRect(114 + x, 89 + y, 1, 6);
        g2d.fillRect(115 + x, 89 + y, 1, 3);
        g2d.fillRect(116 + x, 89 + y, 1, 3);
        g2d.fillRect(117 + x, 89 + y, 1, 4);
        g2d.fillRect(121 + x, 89 + y, 1, 1);
        g2d.fillRect(100 + x, 90 + y, 1, 2);
        g2d.fillRect(101 + x, 90 + y, 1, 2);
        g2d.fillRect(102 + x, 90 + y, 4, 1);
        g2d.fillRect(122 + x, 90 + y, 1, 1);
        g2d.fillRect(103 + x, 91 + y, 6, 1);
        g2d.fillRect(110 + x, 91 + y, 1, 4);
        g2d.fillRect(111 + x, 91 + y, 1, 2);
        g2d.fillRect(112 + x, 91 + y, 1, 2);
        g2d.fillRect(113 + x, 91 + y, 1, 3);
        g2d.fillRect(120 + x, 91 + y, 2, 1);
        g2d.fillRect(106 + x, 92 + y, 1, 2);
        g2d.fillRect(107 + x, 92 + y, 1, 1);
        g2d.fillRect(109 + x, 92 + y, 1, 2);
        g2d.fillRect(121 + x, 92 + y, 1, 1);
        g2d.fillRect(122 + x, 93 + y, 1, 1);
        g2d.fillRect(99 + x, 96 + y, 1, 1);
        g2d.fillRect(119 + x, 96 + y, 1, 2);
        g2d.fillRect(123 + x, 96 + y, 1, 2);
        g2d.fillRect(102 + x, 97 + y, 1, 3);
        g2d.fillRect(103 + x, 97 + y, 1, 1);
        g2d.fillRect(109 + x, 97 + y, 1, 1);
        g2d.fillRect(115 + x, 97 + y, 1, 2);
        g2d.fillRect(124 + x, 97 + y, 1, 2);
        g2d.fillRect(97 + x, 98 + y, 1, 1);
        g2d.fillRect(101 + x, 98 + y, 1, 1);
        g2d.fillRect(110 + x, 98 + y, 1, 2);
        g2d.fillRect(114 + x, 98 + y, 1, 1);
        g2d.fillRect(100 + x, 99 + y, 1, 1);
        g2d.fillRect(105 + x, 99 + y, 1, 2);
        g2d.fillRect(108 + x, 99 + y, 1, 2);
        g2d.fillRect(113 + x, 99 + y, 1, 1);
        g2d.fillRect(116 + x, 99 + y, 1, 1);
        g2d.fillRect(121 + x, 99 + y, 1, 1);
        g2d.fillRect(104 + x, 100 + y, 1, 1);
        g2d.fillRect(106 + x, 100 + y, 2, 1);
        g2d.fillRect(112 + x, 100 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(99 + x, 91 + y, 1, 3);
        g2d.fillRect(122 + x, 91 + y, 1, 2);
        g2d.fillRect(98 + x, 92 + y, 1, 4);
        g2d.fillRect(101 + x, 92 + y, 1, 6);
        g2d.fillRect(105 + x, 92 + y, 1, 7);
        g2d.fillRect(108 + x, 92 + y, 1, 5);
        g2d.fillRect(115 + x, 92 + y, 1, 5);
        g2d.fillRect(116 + x, 92 + y, 1, 1);
        g2d.fillRect(120 + x, 92 + y, 1, 1);
        g2d.fillRect(102 + x, 93 + y, 1, 4);
        g2d.fillRect(107 + x, 93 + y, 1, 1);
        g2d.fillRect(111 + x, 93 + y, 2, 1);
        g2d.fillRect(117 + x, 93 + y, 1, 1);
        g2d.fillRect(121 + x, 93 + y, 1, 1);
        g2d.fillRect(124 + x, 93 + y, 1, 1);
        g2d.fillRect(97 + x, 94 + y, 1, 4);
        g2d.fillRect(106 + x, 94 + y, 1, 6);
        g2d.fillRect(109 + x, 94 + y, 1, 3);
        g2d.fillRect(112 + x, 94 + y, 2, 1);
        g2d.fillRect(118 + x, 94 + y, 1, 6);
        g2d.fillRect(110 + x, 95 + y, 1, 3);
        g2d.fillRect(113 + x, 95 + y, 1, 4);
        g2d.fillRect(114 + x, 95 + y, 1, 3);
        g2d.fillRect(119 + x, 95 + y, 1, 1);
        g2d.fillRect(122 + x, 95 + y, 1, 4);
        g2d.fillRect(123 + x, 95 + y, 1, 1);
        g2d.fillRect(125 + x, 95 + y, 1, 2);
        g2d.fillRect(96 + x, 96 + y, 1, 3);
        g2d.fillRect(100 + x, 96 + y, 1, 3);
        g2d.fillRect(116 + x, 96 + y, 1, 3);
        g2d.fillRect(126 + x, 96 + y, 1, 1);
        g2d.fillRect(98 + x, 97 + y, 1, 3);
        g2d.fillRect(104 + x, 97 + y, 1, 3);
        g2d.fillRect(111 + x, 97 + y, 1, 3);
        g2d.fillRect(117 + x, 97 + y, 1, 1);
        g2d.fillRect(99 + x, 98 + y, 1, 1);
        g2d.fillRect(103 + x, 98 + y, 1, 3);
        g2d.fillRect(109 + x, 98 + y, 1, 2);
        g2d.fillRect(112 + x, 98 + y, 1, 2);
        g2d.fillRect(120 + x, 98 + y, 2, 1);
        g2d.fillRect(107 + x, 99 + y, 1, 1);
        g2d.fillRect(117 + x, 99 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(105 + x, 83 + y, 2, 1);
        g2d.fillRect(115 + x, 83 + y, 1, 1);
        g2d.fillRect(102 + x, 84 + y, 1, 1);
        g2d.fillRect(120 + x, 84 + y, 1, 1);
        g2d.fillRect(117 + x, 87 + y, 1, 2);
        g2d.fillRect(115 + x, 88 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(102 + x, 91 + y, 1, 2);
        g2d.fillRect(100 + x, 92 + y, 1, 4);
        g2d.fillRect(103 + x, 92 + y, 1, 5);
        g2d.fillRect(104 + x, 92 + y, 1, 5);
        g2d.fillRect(123 + x, 92 + y, 1, 3);
        g2d.fillRect(116 + x, 93 + y, 1, 3);
        g2d.fillRect(119 + x, 93 + y, 1, 2);
        g2d.fillRect(120 + x, 93 + y, 1, 5);
        g2d.fillRect(99 + x, 94 + y, 1, 2);
        g2d.fillRect(107 + x, 94 + y, 1, 5);
        g2d.fillRect(111 + x, 94 + y, 1, 3);
        g2d.fillRect(117 + x, 94 + y, 1, 3);
        g2d.fillRect(121 + x, 94 + y, 1, 4);
        g2d.fillRect(122 + x, 94 + y, 1, 1);
        g2d.fillRect(124 + x, 94 + y, 1, 3);
        g2d.fillRect(112 + x, 95 + y, 1, 3);
        g2d.fillRect(98 + x, 96 + y, 1, 1);
        g2d.fillRect(99 + x, 97 + y, 1, 1);
        g2d.fillRect(108 + x, 97 + y, 1, 2);
        g2d.fillRect(117 + x, 98 + y, 1, 1);
        g2d.fillRect(123 + x, 98 + y, 1, 1);
    }

    public void paintB1(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(100 + x, 81 + y, 1, 2);
        g2d.fillRect(103 + x, 81 + y, 3, 1);
        g2d.fillRect(106 + x, 82 + y, 1, 1);
        g2d.fillRect(110 + x, 82 + y, 3, 1);
        g2d.fillRect(115 + x, 82 + y, 1, 1);
        g2d.fillRect(114 + x, 83 + y, 1, 1);
        g2d.fillRect(100 + x, 84 + y, 1, 1);
        g2d.fillRect(121 + x, 84 + y, 1, 2);
        g2d.fillRect(109 + x, 86 + y, 1, 1);
        g2d.fillRect(111 + x, 86 + y, 1, 2);
        g2d.fillRect(110 + x, 87 + y, 1, 4);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(100 + x, 80 + y, 1, 1);
        g2d.fillRect(120 + x, 80 + y, 1, 4);
        g2d.fillRect(101 + x, 81 + y, 1, 5);
        g2d.fillRect(102 + x, 81 + y, 1, 1);
        g2d.fillRect(116 + x, 81 + y, 1, 2);
        g2d.fillRect(117 + x, 81 + y, 3, 1);
        g2d.fillRect(104 + x, 82 + y, 1, 3);
        g2d.fillRect(107 + x, 82 + y, 3, 1);
        g2d.fillRect(113 + x, 82 + y, 2, 1);
        g2d.fillRect(118 + x, 82 + y, 1, 3);
        g2d.fillRect(121 + x, 82 + y, 1, 2);
        g2d.fillRect(100 + x, 83 + y, 1, 1);
        g2d.fillRect(102 + x, 83 + y, 2, 1);
        g2d.fillRect(109 + x, 83 + y, 1, 3);
        g2d.fillRect(111 + x, 83 + y, 1, 3);
        g2d.fillRect(117 + x, 83 + y, 1, 1);
        g2d.fillRect(119 + x, 83 + y, 1, 1);
        g2d.fillRect(105 + x, 84 + y, 4, 1);
        g2d.fillRect(110 + x, 84 + y, 1, 1);
        g2d.fillRect(112 + x, 84 + y, 5, 1);
        g2d.fillRect(102 + x, 85 + y, 2, 1);
        g2d.fillRect(119 + x, 85 + y, 2, 1);
        g2d.fillRect(100 + x, 86 + y, 1, 3);
        g2d.fillRect(110 + x, 86 + y, 1, 1);
        g2d.fillRect(121 + x, 86 + y, 1, 3);
        g2d.fillRect(106 + x, 90 + y, 2, 1);
        g2d.fillRect(120 + x, 90 + y, 2, 1);
        g2d.fillRect(109 + x, 91 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(121 + x, 81 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(102 + x, 82 + y, 1, 1);
        g2d.fillRect(105 + x, 82 + y, 1, 1);
        g2d.fillRect(117 + x, 82 + y, 1, 1);
        g2d.fillRect(119 + x, 82 + y, 1, 1);
        g2d.fillRect(108 + x, 83 + y, 1, 1);
        g2d.fillRect(110 + x, 83 + y, 1, 1);
        g2d.fillRect(116 + x, 83 + y, 1, 1);
        g2d.fillRect(103 + x, 84 + y, 1, 1);
        g2d.fillRect(117 + x, 84 + y, 1, 1);
        g2d.fillRect(100 + x, 85 + y, 1, 1);
        g2d.fillRect(105 + x, 85 + y, 4, 1);
        g2d.fillRect(110 + x, 85 + y, 1, 1);
        g2d.fillRect(112 + x, 85 + y, 1, 6);
        g2d.fillRect(113 + x, 85 + y, 1, 3);
        g2d.fillRect(114 + x, 85 + y, 3, 1);
        g2d.fillRect(118 + x, 85 + y, 1, 2);
        g2d.fillRect(108 + x, 86 + y, 1, 5);
        g2d.fillRect(117 + x, 86 + y, 1, 1);
        g2d.fillRect(107 + x, 87 + y, 1, 3);
        g2d.fillRect(109 + x, 87 + y, 1, 4);
        g2d.fillRect(114 + x, 87 + y, 2, 1);
        g2d.fillRect(104 + x, 88 + y, 1, 2);
        g2d.fillRect(111 + x, 88 + y, 1, 3);
        g2d.fillRect(100 + x, 89 + y, 4, 1);
        g2d.fillRect(105 + x, 89 + y, 2, 1);
        g2d.fillRect(113 + x, 89 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(103 + x, 82 + y, 1, 1);
        g2d.fillRect(107 + x, 83 + y, 1, 1);
        g2d.fillRect(112 + x, 83 + y, 2, 1);
        g2d.fillRect(119 + x, 84 + y, 1, 1);
        g2d.fillRect(104 + x, 85 + y, 1, 3);
        g2d.fillRect(117 + x, 85 + y, 1, 1);
        g2d.fillRect(101 + x, 86 + y, 1, 3);
        g2d.fillRect(102 + x, 86 + y, 1, 3);
        g2d.fillRect(103 + x, 86 + y, 1, 3);
        g2d.fillRect(105 + x, 86 + y, 1, 3);
        g2d.fillRect(106 + x, 86 + y, 1, 3);
        g2d.fillRect(107 + x, 86 + y, 1, 1);
        g2d.fillRect(114 + x, 86 + y, 3, 1);
        g2d.fillRect(119 + x, 86 + y, 1, 7);
        g2d.fillRect(120 + x, 86 + y, 1, 4);
        g2d.fillRect(116 + x, 87 + y, 1, 1);
        g2d.fillRect(118 + x, 87 + y, 1, 7);
        g2d.fillRect(113 + x, 88 + y, 2, 1);
        g2d.fillRect(114 + x, 89 + y, 1, 6);
        g2d.fillRect(115 + x, 89 + y, 1, 3);
        g2d.fillRect(116 + x, 89 + y, 1, 3);
        g2d.fillRect(117 + x, 89 + y, 1, 4);
        g2d.fillRect(121 + x, 89 + y, 1, 1);
        g2d.fillRect(100 + x, 90 + y, 1, 2);
        g2d.fillRect(101 + x, 90 + y, 1, 2);
        g2d.fillRect(102 + x, 90 + y, 4, 1);
        g2d.fillRect(122 + x, 90 + y, 1, 1);
        g2d.fillRect(103 + x, 91 + y, 6, 1);
        g2d.fillRect(110 + x, 91 + y, 1, 4);
        g2d.fillRect(111 + x, 91 + y, 1, 2);
        g2d.fillRect(112 + x, 91 + y, 1, 2);
        g2d.fillRect(113 + x, 91 + y, 1, 3);
        g2d.fillRect(120 + x, 91 + y, 2, 1);
        g2d.fillRect(106 + x, 92 + y, 1, 2);
        g2d.fillRect(107 + x, 92 + y, 1, 1);
        g2d.fillRect(109 + x, 92 + y, 1, 2);
        g2d.fillRect(121 + x, 92 + y, 1, 1);
        g2d.fillRect(99 + x, 94 + y, 1, 1);
        g2d.fillRect(119 + x, 94 + y, 1, 2);
        g2d.fillRect(123 + x, 94 + y, 1, 2);
        g2d.fillRect(102 + x, 95 + y, 1, 3);
        g2d.fillRect(103 + x, 95 + y, 1, 1);
        g2d.fillRect(115 + x, 95 + y, 1, 2);
        g2d.fillRect(124 + x, 95 + y, 1, 2);
        g2d.fillRect(97 + x, 96 + y, 1, 1);
        g2d.fillRect(101 + x, 96 + y, 1, 1);
        g2d.fillRect(109 + x, 96 + y, 1, 1);
        g2d.fillRect(114 + x, 96 + y, 1, 1);
        g2d.fillRect(100 + x, 97 + y, 1, 1);
        g2d.fillRect(105 + x, 97 + y, 1, 2);
        g2d.fillRect(108 + x, 97 + y, 1, 2);
        g2d.fillRect(110 + x, 97 + y, 1, 1);
        g2d.fillRect(113 + x, 97 + y, 1, 1);
        g2d.fillRect(116 + x, 97 + y, 1, 1);
        g2d.fillRect(121 + x, 97 + y, 1, 1);
        g2d.fillRect(104 + x, 98 + y, 1, 1);
        g2d.fillRect(106 + x, 98 + y, 2, 1);
        g2d.fillRect(112 + x, 98 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(99 + x, 91 + y, 1, 2);
        g2d.fillRect(122 + x, 91 + y, 1, 2);
        g2d.fillRect(98 + x, 92 + y, 1, 2);
        g2d.fillRect(101 + x, 92 + y, 1, 4);
        g2d.fillRect(105 + x, 92 + y, 1, 5);
        g2d.fillRect(108 + x, 92 + y, 1, 4);
        g2d.fillRect(115 + x, 92 + y, 1, 3);
        g2d.fillRect(116 + x, 92 + y, 1, 1);
        g2d.fillRect(120 + x, 92 + y, 1, 1);
        g2d.fillRect(97 + x, 93 + y, 1, 3);
        g2d.fillRect(102 + x, 93 + y, 1, 2);
        g2d.fillRect(107 + x, 93 + y, 1, 1);
        g2d.fillRect(111 + x, 93 + y, 2, 1);
        g2d.fillRect(117 + x, 93 + y, 1, 1);
        g2d.fillRect(121 + x, 93 + y, 1, 1);
        g2d.fillRect(123 + x, 93 + y, 1, 1);
        g2d.fillRect(125 + x, 93 + y, 1, 2);
        g2d.fillRect(96 + x, 94 + y, 1, 3);
        g2d.fillRect(100 + x, 94 + y, 1, 3);
        g2d.fillRect(106 + x, 94 + y, 1, 4);
        g2d.fillRect(109 + x, 94 + y, 1, 2);
        g2d.fillRect(112 + x, 94 + y, 2, 1);
        g2d.fillRect(116 + x, 94 + y, 1, 3);
        g2d.fillRect(118 + x, 94 + y, 1, 4);
        g2d.fillRect(122 + x, 94 + y, 1, 3);
        g2d.fillRect(126 + x, 94 + y, 1, 1);
        g2d.fillRect(98 + x, 95 + y, 1, 3);
        g2d.fillRect(104 + x, 95 + y, 1, 3);
        g2d.fillRect(110 + x, 95 + y, 1, 2);
        g2d.fillRect(113 + x, 95 + y, 1, 2);
        g2d.fillRect(114 + x, 95 + y, 1, 1);
        g2d.fillRect(117 + x, 95 + y, 1, 1);
        g2d.fillRect(99 + x, 96 + y, 1, 1);
        g2d.fillRect(103 + x, 96 + y, 1, 3);
        g2d.fillRect(111 + x, 96 + y, 1, 2);
        g2d.fillRect(120 + x, 96 + y, 2, 1);
        g2d.fillRect(107 + x, 97 + y, 1, 1);
        g2d.fillRect(109 + x, 97 + y, 1, 1);
        g2d.fillRect(112 + x, 97 + y, 1, 1);
        g2d.fillRect(117 + x, 97 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(105 + x, 83 + y, 2, 1);
        g2d.fillRect(115 + x, 83 + y, 1, 1);
        g2d.fillRect(102 + x, 84 + y, 1, 1);
        g2d.fillRect(120 + x, 84 + y, 1, 1);
        g2d.fillRect(117 + x, 87 + y, 1, 2);
        g2d.fillRect(115 + x, 88 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(102 + x, 91 + y, 1, 2);
        g2d.fillRect(123 + x, 91 + y, 1, 2);
        g2d.fillRect(100 + x, 92 + y, 1, 2);
        g2d.fillRect(103 + x, 92 + y, 1, 3);
        g2d.fillRect(104 + x, 92 + y, 1, 3);
        g2d.fillRect(124 + x, 92 + y, 1, 3);
        g2d.fillRect(99 + x, 93 + y, 1, 1);
        g2d.fillRect(116 + x, 93 + y, 1, 1);
        g2d.fillRect(119 + x, 93 + y, 2, 1);
        g2d.fillRect(122 + x, 93 + y, 1, 1);
        g2d.fillRect(98 + x, 94 + y, 1, 1);
        g2d.fillRect(107 + x, 94 + y, 1, 3);
        g2d.fillRect(111 + x, 94 + y, 1, 2);
        g2d.fillRect(117 + x, 94 + y, 1, 1);
        g2d.fillRect(120 + x, 94 + y, 1, 2);
        g2d.fillRect(121 + x, 94 + y, 1, 2);
        g2d.fillRect(99 + x, 95 + y, 1, 1);
        g2d.fillRect(112 + x, 95 + y, 1, 2);
        g2d.fillRect(108 + x, 96 + y, 1, 1);
        g2d.fillRect(117 + x, 96 + y, 1, 1);
        g2d.fillRect(123 + x, 96 + y, 1, 1);
    }

    public void paintB2(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(100 + x, 81 + y, 1, 2);
        g2d.fillRect(103 + x, 81 + y, 3, 1);
        g2d.fillRect(106 + x, 82 + y, 1, 1);
        g2d.fillRect(110 + x, 82 + y, 3, 1);
        g2d.fillRect(115 + x, 82 + y, 1, 1);
        g2d.fillRect(114 + x, 83 + y, 1, 1);
        g2d.fillRect(100 + x, 84 + y, 1, 1);
        g2d.fillRect(121 + x, 84 + y, 1, 2);
        g2d.fillRect(109 + x, 86 + y, 1, 1);
        g2d.fillRect(111 + x, 86 + y, 1, 2);
        g2d.fillRect(110 + x, 87 + y, 1, 4);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(100 + x, 80 + y, 1, 1);
        g2d.fillRect(120 + x, 80 + y, 1, 4);
        g2d.fillRect(101 + x, 81 + y, 1, 5);
        g2d.fillRect(102 + x, 81 + y, 1, 1);
        g2d.fillRect(116 + x, 81 + y, 1, 2);
        g2d.fillRect(117 + x, 81 + y, 3, 1);
        g2d.fillRect(104 + x, 82 + y, 1, 3);
        g2d.fillRect(107 + x, 82 + y, 3, 1);
        g2d.fillRect(113 + x, 82 + y, 2, 1);
        g2d.fillRect(118 + x, 82 + y, 1, 3);
        g2d.fillRect(121 + x, 82 + y, 1, 2);
        g2d.fillRect(100 + x, 83 + y, 1, 1);
        g2d.fillRect(102 + x, 83 + y, 2, 1);
        g2d.fillRect(109 + x, 83 + y, 1, 3);
        g2d.fillRect(111 + x, 83 + y, 1, 3);
        g2d.fillRect(117 + x, 83 + y, 1, 1);
        g2d.fillRect(119 + x, 83 + y, 1, 1);
        g2d.fillRect(105 + x, 84 + y, 4, 1);
        g2d.fillRect(110 + x, 84 + y, 1, 1);
        g2d.fillRect(112 + x, 84 + y, 5, 1);
        g2d.fillRect(102 + x, 85 + y, 2, 1);
        g2d.fillRect(119 + x, 85 + y, 2, 1);
        g2d.fillRect(100 + x, 86 + y, 1, 3);
        g2d.fillRect(110 + x, 86 + y, 1, 1);
        g2d.fillRect(121 + x, 86 + y, 1, 3);
        g2d.fillRect(106 + x, 90 + y, 2, 1);
        g2d.fillRect(120 + x, 90 + y, 2, 1);
        g2d.fillRect(109 + x, 91 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(121 + x, 81 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(102 + x, 82 + y, 1, 1);
        g2d.fillRect(105 + x, 82 + y, 1, 1);
        g2d.fillRect(117 + x, 82 + y, 1, 1);
        g2d.fillRect(119 + x, 82 + y, 1, 1);
        g2d.fillRect(108 + x, 83 + y, 1, 1);
        g2d.fillRect(110 + x, 83 + y, 1, 1);
        g2d.fillRect(116 + x, 83 + y, 1, 1);
        g2d.fillRect(103 + x, 84 + y, 1, 1);
        g2d.fillRect(117 + x, 84 + y, 1, 1);
        g2d.fillRect(100 + x, 85 + y, 1, 1);
        g2d.fillRect(105 + x, 85 + y, 4, 1);
        g2d.fillRect(110 + x, 85 + y, 1, 1);
        g2d.fillRect(112 + x, 85 + y, 1, 6);
        g2d.fillRect(113 + x, 85 + y, 1, 3);
        g2d.fillRect(114 + x, 85 + y, 3, 1);
        g2d.fillRect(118 + x, 85 + y, 1, 2);
        g2d.fillRect(108 + x, 86 + y, 1, 5);
        g2d.fillRect(117 + x, 86 + y, 1, 1);
        g2d.fillRect(107 + x, 87 + y, 1, 3);
        g2d.fillRect(109 + x, 87 + y, 1, 4);
        g2d.fillRect(114 + x, 87 + y, 2, 1);
        g2d.fillRect(104 + x, 88 + y, 1, 2);
        g2d.fillRect(111 + x, 88 + y, 1, 3);
        g2d.fillRect(100 + x, 89 + y, 4, 1);
        g2d.fillRect(105 + x, 89 + y, 2, 1);
        g2d.fillRect(113 + x, 89 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(103 + x, 82 + y, 1, 1);
        g2d.fillRect(107 + x, 83 + y, 1, 1);
        g2d.fillRect(112 + x, 83 + y, 2, 1);
        g2d.fillRect(119 + x, 84 + y, 1, 1);
        g2d.fillRect(104 + x, 85 + y, 1, 3);
        g2d.fillRect(117 + x, 85 + y, 1, 1);
        g2d.fillRect(101 + x, 86 + y, 1, 3);
        g2d.fillRect(102 + x, 86 + y, 1, 3);
        g2d.fillRect(103 + x, 86 + y, 1, 3);
        g2d.fillRect(105 + x, 86 + y, 1, 3);
        g2d.fillRect(106 + x, 86 + y, 1, 3);
        g2d.fillRect(107 + x, 86 + y, 1, 1);
        g2d.fillRect(114 + x, 86 + y, 3, 1);
        g2d.fillRect(119 + x, 86 + y, 1, 7);
        g2d.fillRect(120 + x, 86 + y, 1, 4);
        g2d.fillRect(116 + x, 87 + y, 1, 1);
        g2d.fillRect(118 + x, 87 + y, 1, 7);
        g2d.fillRect(113 + x, 88 + y, 2, 1);
        g2d.fillRect(114 + x, 89 + y, 1, 6);
        g2d.fillRect(115 + x, 89 + y, 1, 3);
        g2d.fillRect(116 + x, 89 + y, 1, 3);
        g2d.fillRect(117 + x, 89 + y, 1, 4);
        g2d.fillRect(121 + x, 89 + y, 1, 1);
        g2d.fillRect(100 + x, 90 + y, 1, 2);
        g2d.fillRect(101 + x, 90 + y, 1, 2);
        g2d.fillRect(102 + x, 90 + y, 4, 1);
        g2d.fillRect(122 + x, 90 + y, 1, 1);
        g2d.fillRect(103 + x, 91 + y, 6, 1);
        g2d.fillRect(110 + x, 91 + y, 1, 4);
        g2d.fillRect(111 + x, 91 + y, 1, 2);
        g2d.fillRect(112 + x, 91 + y, 1, 2);
        g2d.fillRect(113 + x, 91 + y, 1, 3);
        g2d.fillRect(120 + x, 91 + y, 2, 1);
        g2d.fillRect(106 + x, 92 + y, 1, 2);
        g2d.fillRect(107 + x, 92 + y, 1, 1);
        g2d.fillRect(109 + x, 92 + y, 1, 2);
        g2d.fillRect(121 + x, 92 + y, 1, 1);
        g2d.fillRect(99 + x, 95 + y, 1, 1);
        g2d.fillRect(119 + x, 95 + y, 1, 2);
        g2d.fillRect(123 + x, 95 + y, 1, 2);
        g2d.fillRect(102 + x, 96 + y, 1, 3);
        g2d.fillRect(103 + x, 96 + y, 1, 1);
        g2d.fillRect(109 + x, 96 + y, 1, 1);
        g2d.fillRect(115 + x, 96 + y, 1, 2);
        g2d.fillRect(124 + x, 96 + y, 1, 2);
        g2d.fillRect(97 + x, 97 + y, 1, 1);
        g2d.fillRect(101 + x, 97 + y, 1, 1);
        g2d.fillRect(110 + x, 97 + y, 1, 2);
        g2d.fillRect(114 + x, 97 + y, 1, 1);
        g2d.fillRect(100 + x, 98 + y, 1, 1);
        g2d.fillRect(105 + x, 98 + y, 1, 2);
        g2d.fillRect(108 + x, 98 + y, 1, 2);
        g2d.fillRect(113 + x, 98 + y, 1, 1);
        g2d.fillRect(116 + x, 98 + y, 1, 1);
        g2d.fillRect(121 + x, 98 + y, 1, 1);
        g2d.fillRect(104 + x, 99 + y, 1, 1);
        g2d.fillRect(106 + x, 99 + y, 2, 1);
        g2d.fillRect(112 + x, 99 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(99 + x, 91 + y, 1, 2);
        g2d.fillRect(122 + x, 91 + y, 1, 2);
        g2d.fillRect(98 + x, 92 + y, 1, 3);
        g2d.fillRect(101 + x, 92 + y, 1, 5);
        g2d.fillRect(105 + x, 92 + y, 1, 6);
        g2d.fillRect(108 + x, 92 + y, 1, 4);
        g2d.fillRect(115 + x, 92 + y, 1, 4);
        g2d.fillRect(116 + x, 92 + y, 1, 1);
        g2d.fillRect(120 + x, 92 + y, 1, 1);
        g2d.fillRect(97 + x, 93 + y, 1, 4);
        g2d.fillRect(102 + x, 93 + y, 1, 3);
        g2d.fillRect(107 + x, 93 + y, 1, 1);
        g2d.fillRect(111 + x, 93 + y, 2, 1);
        g2d.fillRect(117 + x, 93 + y, 1, 1);
        g2d.fillRect(121 + x, 93 + y, 1, 1);
        g2d.fillRect(106 + x, 94 + y, 1, 5);
        g2d.fillRect(109 + x, 94 + y, 1, 2);
        g2d.fillRect(112 + x, 94 + y, 2, 1);
        g2d.fillRect(118 + x, 94 + y, 1, 5);
        g2d.fillRect(119 + x, 94 + y, 1, 1);
        g2d.fillRect(122 + x, 94 + y, 1, 4);
        g2d.fillRect(123 + x, 94 + y, 1, 1);
        g2d.fillRect(125 + x, 94 + y, 1, 2);
        g2d.fillRect(96 + x, 95 + y, 1, 3);
        g2d.fillRect(100 + x, 95 + y, 1, 3);
        g2d.fillRect(110 + x, 95 + y, 1, 2);
        g2d.fillRect(113 + x, 95 + y, 1, 3);
        g2d.fillRect(114 + x, 95 + y, 1, 2);
        g2d.fillRect(116 + x, 95 + y, 1, 3);
        g2d.fillRect(126 + x, 95 + y, 1, 1);
        g2d.fillRect(98 + x, 96 + y, 1, 3);
        g2d.fillRect(104 + x, 96 + y, 1, 3);
        g2d.fillRect(111 + x, 96 + y, 1, 3);
        g2d.fillRect(117 + x, 96 + y, 1, 1);
        g2d.fillRect(99 + x, 97 + y, 1, 1);
        g2d.fillRect(103 + x, 97 + y, 1, 3);
        g2d.fillRect(109 + x, 97 + y, 1, 2);
        g2d.fillRect(112 + x, 97 + y, 1, 2);
        g2d.fillRect(120 + x, 97 + y, 2, 1);
        g2d.fillRect(107 + x, 98 + y, 1, 1);
        g2d.fillRect(117 + x, 98 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(105 + x, 83 + y, 2, 1);
        g2d.fillRect(115 + x, 83 + y, 1, 1);
        g2d.fillRect(102 + x, 84 + y, 1, 1);
        g2d.fillRect(120 + x, 84 + y, 1, 1);
        g2d.fillRect(117 + x, 87 + y, 1, 2);
        g2d.fillRect(115 + x, 88 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(102 + x, 91 + y, 1, 2);
        g2d.fillRect(100 + x, 92 + y, 1, 3);
        g2d.fillRect(103 + x, 92 + y, 1, 4);
        g2d.fillRect(104 + x, 92 + y, 1, 4);
        g2d.fillRect(123 + x, 92 + y, 1, 2);
        g2d.fillRect(99 + x, 93 + y, 1, 2);
        g2d.fillRect(116 + x, 93 + y, 1, 2);
        g2d.fillRect(119 + x, 93 + y, 2, 1);
        g2d.fillRect(122 + x, 93 + y, 1, 1);
        g2d.fillRect(124 + x, 93 + y, 1, 3);
        g2d.fillRect(107 + x, 94 + y, 1, 4);
        g2d.fillRect(111 + x, 94 + y, 1, 2);
        g2d.fillRect(117 + x, 94 + y, 1, 2);
        g2d.fillRect(120 + x, 94 + y, 1, 3);
        g2d.fillRect(121 + x, 94 + y, 1, 3);
        g2d.fillRect(98 + x, 95 + y, 1, 1);
        g2d.fillRect(112 + x, 95 + y, 1, 2);
        g2d.fillRect(99 + x, 96 + y, 1, 1);
        g2d.fillRect(108 + x, 96 + y, 1, 2);
        g2d.fillRect(117 + x, 97 + y, 1, 1);
        g2d.fillRect(123 + x, 97 + y, 1, 1);
    }

    public void setOriginalColorArray(boolean b) {
        COLORS.set(ImageUtilities.NEG_GREY_4, new Color(99, 99, 99));
        COLORS.set(ImageUtilities.NEG_GREY_3, new Color(99, 123, 173));
        COLORS.set(ImageUtilities.NEG_GREY_2, new Color(140, 140, 140));
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(156, 156, 173));
        COLORS.set(ImageUtilities.GREY, new Color(189, 189, 189));
        COLORS.set(ImageUtilities.GREY_1, new Color(222, 222, 222));
        COLORS.set(ImageUtilities.GREY_2, new Color(206, 222, 255));
        COLORS.set(ImageUtilities.GREY_3, new Color(255, 255, 255));
    }

    public boolean getOriginalColorArray() {
        return false;
    }
}
