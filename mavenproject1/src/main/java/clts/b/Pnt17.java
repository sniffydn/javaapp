package clts.b;

import clts.SuperB;
import util.Color;
import util.GraphicsMap;
import util.ImageUtilities;
import util.ColorArray;

public class Pnt17 extends SuperB {

    {
        slenderB = true;
        under = true;
        platzHeight = 0;
        noWalk = true;
        jean = true;
        pant = true;
    }

    public Pnt17() {
        super();
    }

    public Pnt17(int layer) {
        super(layer);
    }

    public Pnt17(ColorArray colorSwitch) {
        super(colorSwitch);
    }

    public Pnt17(int layer, ColorArray colorSwitch) {
        super(layer, colorSwitch);
    }

    public void draw(int x, int y, GraphicsMap g2d) {
        paintH(x, y, g2d);
    }

    public void drawBody(b.Bd bd) {
        bd.paintLegs = false;
    }

    public void paintH(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(101 + x, 82 + y, 1, 3);
        g2d.fillRect(100 + x, 83 + y, 1, 2);
        g2d.fillRect(104 + x, 83 + y, 1, 3);
        g2d.fillRect(105 + x, 83 + y, 1, 1);
        g2d.fillRect(120 + x, 83 + y, 1, 3);
        g2d.fillRect(121 + x, 83 + y, 1, 2);
        g2d.fillRect(114 + x, 84 + y, 4, 1);
        g2d.fillRect(116 + x, 85 + y, 1, 2);
        g2d.fillRect(117 + x, 85 + y, 1, 2);
        g2d.fillRect(107 + x, 86 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(105 + x, 84 + y, 1, 2);
        g2d.fillRect(106 + x, 84 + y, 1, 2);
        g2d.fillRect(107 + x, 84 + y, 1, 2);
        g2d.fillRect(112 + x, 85 + y, 1, 1);
        g2d.fillRect(114 + x, 85 + y, 1, 2);
        g2d.fillRect(115 + x, 85 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(100 + x, 85 + y, 1, 1);
        g2d.fillRect(102 + x, 86 + y, 1, 2);
        g2d.fillRect(104 + x, 86 + y, 1, 1);
        g2d.fillRect(106 + x, 86 + y, 1, 1);
        g2d.fillRect(119 + x, 86 + y, 2, 1);
        g2d.fillRect(107 + x, 87 + y, 1, 1);
        g2d.fillRect(110 + x, 87 + y, 2, 1);
        g2d.fillRect(113 + x, 87 + y, 1, 1);
        g2d.fillRect(115 + x, 87 + y, 1, 1);
        g2d.fillRect(118 + x, 87 + y, 1, 1);
        g2d.fillRect(101 + x, 88 + y, 1, 1);
        g2d.fillRect(109 + x, 88 + y, 1, 3);
        g2d.fillRect(112 + x, 88 + y, 1, 5);
        g2d.fillRect(119 + x, 88 + y, 1, 1);
        g2d.fillRect(99 + x, 89 + y, 2, 1);
        g2d.fillRect(120 + x, 89 + y, 2, 1);
        g2d.fillRect(110 + x, 90 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(89 + x, 158 + y, 1, 3);
        g2d.fillRect(110 + x, 158 + y, 1, 5);
        g2d.fillRect(103 + x, 160 + y, 1, 1);
        g2d.fillRect(111 + x, 160 + y, 4, 1);
        g2d.fillRect(123 + x, 160 + y, 1, 2);
        g2d.fillRect(124 + x, 160 + y, 1, 1);
        g2d.fillRect(90 + x, 161 + y, 2, 1);
        g2d.fillRect(98 + x, 161 + y, 5, 1);
        g2d.fillRect(113 + x, 161 + y, 3, 1);
        g2d.fillRect(117 + x, 161 + y, 6, 1);
        g2d.fillRect(92 + x, 162 + y, 6, 1);
        g2d.fillRect(111 + x, 162 + y, 1, 2);
        g2d.fillRect(112 + x, 163 + y, 1, 1);
        g2d.fillRect(90 + x, 164 + y, 1, 1);
        g2d.fillRect(114 + x, 164 + y, 1, 1);
        g2d.fillRect(92 + x, 165 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(100 + x, 82 + y, 1, 1);
        g2d.fillRect(120 + x, 82 + y, 1, 1);
        g2d.fillRect(109 + x, 85 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(109 + x, 84 + y, 1, 1);
        g2d.fillRect(108 + x, 86 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(102 + x, 82 + y, 1, 4);
        g2d.fillRect(118 + x, 82 + y, 1, 2);
        g2d.fillRect(119 + x, 82 + y, 1, 4);
        g2d.fillRect(103 + x, 83 + y, 1, 1);
        g2d.fillRect(106 + x, 83 + y, 1, 1);
        g2d.fillRect(114 + x, 83 + y, 4, 1);
        g2d.fillRect(101 + x, 85 + y, 1, 3);
        g2d.fillRect(103 + x, 85 + y, 1, 5);
        g2d.fillRect(118 + x, 85 + y, 1, 2);
        g2d.fillRect(121 + x, 85 + y, 1, 4);
        g2d.fillRect(100 + x, 86 + y, 1, 3);
        g2d.fillRect(105 + x, 86 + y, 1, 4);
        g2d.fillRect(99 + x, 87 + y, 1, 2);
        g2d.fillRect(104 + x, 87 + y, 1, 2);
        g2d.fillRect(106 + x, 87 + y, 1, 2);
        g2d.fillRect(108 + x, 87 + y, 1, 7);
        g2d.fillRect(109 + x, 87 + y, 1, 1);
        g2d.fillRect(112 + x, 87 + y, 1, 1);
        g2d.fillRect(114 + x, 87 + y, 1, 17);
        g2d.fillRect(116 + x, 87 + y, 1, 3);
        g2d.fillRect(117 + x, 87 + y, 1, 2);
        g2d.fillRect(119 + x, 87 + y, 2, 1);
        g2d.fillRect(107 + x, 88 + y, 1, 5);
        g2d.fillRect(110 + x, 88 + y, 1, 2);
        g2d.fillRect(111 + x, 88 + y, 1, 3);
        g2d.fillRect(113 + x, 88 + y, 1, 5);
        g2d.fillRect(115 + x, 88 + y, 1, 1);
        g2d.fillRect(118 + x, 88 + y, 1, 3);
        g2d.fillRect(120 + x, 88 + y, 1, 1);
        g2d.fillRect(101 + x, 89 + y, 1, 2);
        g2d.fillRect(119 + x, 89 + y, 1, 4);
        g2d.fillRect(99 + x, 90 + y, 1, 19);
        g2d.fillRect(100 + x, 90 + y, 1, 2);
        g2d.fillRect(115 + x, 90 + y, 1, 1);
        g2d.fillRect(120 + x, 90 + y, 1, 3);
        g2d.fillRect(121 + x, 90 + y, 1, 11);
        g2d.fillRect(109 + x, 91 + y, 1, 1);
        g2d.fillRect(115 + x, 93 + y, 1, 24);
        g2d.fillRect(107 + x, 96 + y, 1, 2);
        g2d.fillRect(106 + x, 100 + y, 1, 1);
        g2d.fillRect(104 + x, 105 + y, 1, 6);
        g2d.fillRect(105 + x, 105 + y, 1, 1);
        g2d.fillRect(98 + x, 108 + y, 1, 6);
        g2d.fillRect(103 + x, 110 + y, 1, 6);
        g2d.fillRect(97 + x, 113 + y, 1, 7);
        g2d.fillRect(96 + x, 118 + y, 1, 4);
        g2d.fillRect(114 + x, 118 + y, 1, 19);
        g2d.fillRect(102 + x, 120 + y, 1, 1);
        g2d.fillRect(95 + x, 122 + y, 1, 4);
        g2d.fillRect(94 + x, 126 + y, 1, 3);
        g2d.fillRect(93 + x, 130 + y, 1, 14);
        g2d.fillRect(113 + x, 130 + y, 1, 22);
        g2d.fillRect(122 + x, 131 + y, 1, 1);
        g2d.fillRect(92 + x, 136 + y, 1, 17);
        g2d.fillRect(123 + x, 139 + y, 1, 6);
        g2d.fillRect(91 + x, 141 + y, 1, 16);
        g2d.fillRect(98 + x, 141 + y, 1, 7);
        g2d.fillRect(112 + x, 142 + y, 1, 15);
        g2d.fillRect(124 + x, 143 + y, 1, 11);
        g2d.fillRect(90 + x, 148 + y, 1, 13);
        g2d.fillRect(119 + x, 148 + y, 1, 13);
        g2d.fillRect(111 + x, 150 + y, 1, 10);
        g2d.fillRect(99 + x, 153 + y, 1, 8);
        g2d.fillRect(102 + x, 153 + y, 1, 8);
        g2d.fillRect(125 + x, 153 + y, 1, 10);
        g2d.fillRect(123 + x, 154 + y, 1, 6);
        g2d.fillRect(89 + x, 156 + y, 1, 2);
        g2d.fillRect(118 + x, 156 + y, 1, 5);
        g2d.fillRect(110 + x, 157 + y, 1, 1);
        g2d.fillRect(98 + x, 158 + y, 1, 3);
        g2d.fillRect(120 + x, 158 + y, 1, 3);
        g2d.fillRect(121 + x, 158 + y, 1, 3);
        g2d.fillRect(124 + x, 158 + y, 1, 2);
        g2d.fillRect(100 + x, 160 + y, 2, 1);
        g2d.fillRect(111 + x, 161 + y, 2, 1);
        g2d.fillRect(112 + x, 162 + y, 2, 1);
        g2d.fillRect(124 + x, 162 + y, 1, 2);
        g2d.fillRect(102 + x, 163 + y, 1, 1);
        g2d.fillRect(113 + x, 163 + y, 1, 2);
        g2d.fillRect(123 + x, 163 + y, 1, 2);
        g2d.fillRect(120 + x, 164 + y, 3, 1);
        g2d.fillRect(93 + x, 165 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(113 + x, 84 + y, 1, 3);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(108 + x, 84 + y, 1, 1);
        g2d.fillRect(109 + x, 86 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(103 + x, 84 + y, 1, 1);
        g2d.fillRect(118 + x, 84 + y, 1, 1);
        g2d.fillRect(102 + x, 88 + y, 1, 4);
        g2d.fillRect(104 + x, 89 + y, 1, 4);
        g2d.fillRect(106 + x, 89 + y, 1, 11);
        g2d.fillRect(115 + x, 89 + y, 1, 1);
        g2d.fillRect(117 + x, 89 + y, 1, 3);
        g2d.fillRect(105 + x, 90 + y, 1, 3);
        g2d.fillRect(116 + x, 90 + y, 1, 1);
        g2d.fillRect(101 + x, 91 + y, 1, 5);
        g2d.fillRect(115 + x, 91 + y, 1, 2);
        g2d.fillRect(118 + x, 91 + y, 1, 2);
        g2d.fillRect(102 + x, 93 + y, 1, 5);
        g2d.fillRect(107 + x, 93 + y, 1, 3);
        g2d.fillRect(116 + x, 93 + y, 1, 51);
        g2d.fillRect(117 + x, 93 + y, 1, 7);
        g2d.fillRect(119 + x, 93 + y, 2, 1);
        g2d.fillRect(120 + x, 94 + y, 1, 24);
        g2d.fillRect(100 + x, 95 + y, 1, 19);
        g2d.fillRect(101 + x, 97 + y, 1, 1);
        g2d.fillRect(105 + x, 97 + y, 1, 8);
        g2d.fillRect(102 + x, 101 + y, 1, 3);
        g2d.fillRect(104 + x, 102 + y, 1, 3);
        g2d.fillRect(102 + x, 106 + y, 1, 14);
        g2d.fillRect(103 + x, 106 + y, 1, 4);
        g2d.fillRect(119 + x, 106 + y, 1, 22);
        g2d.fillRect(99 + x, 109 + y, 1, 5);
        g2d.fillRect(101 + x, 109 + y, 1, 7);
        g2d.fillRect(117 + x, 110 + y, 1, 11);
        g2d.fillRect(118 + x, 110 + y, 1, 4);
        g2d.fillRect(98 + x, 114 + y, 1, 10);
        g2d.fillRect(115 + x, 117 + y, 1, 24);
        g2d.fillRect(97 + x, 120 + y, 1, 9);
        g2d.fillRect(101 + x, 121 + y, 1, 8);
        g2d.fillRect(96 + x, 122 + y, 1, 12);
        g2d.fillRect(121 + x, 122 + y, 1, 11);
        g2d.fillRect(95 + x, 126 + y, 1, 15);
        g2d.fillRect(98 + x, 126 + y, 1, 2);
        g2d.fillRect(100 + x, 126 + y, 1, 2);
        g2d.fillRect(94 + x, 129 + y, 1, 9);
        g2d.fillRect(98 + x, 129 + y, 1, 1);
        g2d.fillRect(100 + x, 130 + y, 1, 4);
        g2d.fillRect(98 + x, 132 + y, 1, 9);
        g2d.fillRect(97 + x, 137 + y, 1, 25);
        g2d.fillRect(99 + x, 137 + y, 1, 1);
        g2d.fillRect(114 + x, 137 + y, 1, 23);
        g2d.fillRect(101 + x, 138 + y, 1, 22);
        g2d.fillRect(102 + x, 139 + y, 1, 14);
        g2d.fillRect(99 + x, 140 + y, 1, 1);
        g2d.fillRect(117 + x, 141 + y, 1, 4);
        g2d.fillRect(121 + x, 141 + y, 1, 17);
        g2d.fillRect(95 + x, 142 + y, 1, 2);
        g2d.fillRect(119 + x, 142 + y, 1, 6);
        g2d.fillRect(93 + x, 144 + y, 1, 12);
        g2d.fillRect(99 + x, 144 + y, 1, 6);
        g2d.fillRect(120 + x, 145 + y, 1, 13);
        g2d.fillRect(123 + x, 145 + y, 1, 9);
        g2d.fillRect(118 + x, 146 + y, 1, 10);
        g2d.fillRect(98 + x, 148 + y, 1, 10);
        g2d.fillRect(96 + x, 150 + y, 1, 4);
        g2d.fillRect(117 + x, 150 + y, 1, 11);
        g2d.fillRect(99 + x, 152 + y, 1, 1);
        g2d.fillRect(113 + x, 152 + y, 1, 8);
        g2d.fillRect(92 + x, 153 + y, 1, 5);
        g2d.fillRect(122 + x, 153 + y, 1, 8);
        g2d.fillRect(100 + x, 154 + y, 1, 6);
        g2d.fillRect(124 + x, 154 + y, 1, 4);
        g2d.fillRect(91 + x, 157 + y, 1, 4);
        g2d.fillRect(112 + x, 157 + y, 1, 3);
        g2d.fillRect(115 + x, 158 + y, 1, 3);
        g2d.fillRect(92 + x, 160 + y, 1, 2);
        g2d.fillRect(116 + x, 160 + y, 1, 3);
        g2d.fillRect(89 + x, 161 + y, 1, 3);
        g2d.fillRect(93 + x, 161 + y, 4, 1);
        g2d.fillRect(103 + x, 161 + y, 1, 2);
        g2d.fillRect(90 + x, 162 + y, 1, 2);
        g2d.fillRect(91 + x, 162 + y, 1, 1);
        g2d.fillRect(98 + x, 162 + y, 1, 3);
        g2d.fillRect(99 + x, 162 + y, 1, 2);
        g2d.fillRect(100 + x, 162 + y, 1, 2);
        g2d.fillRect(101 + x, 162 + y, 1, 2);
        g2d.fillRect(102 + x, 162 + y, 1, 1);
        g2d.fillRect(114 + x, 162 + y, 1, 2);
        g2d.fillRect(115 + x, 162 + y, 1, 3);
        g2d.fillRect(94 + x, 163 + y, 4, 1);
        g2d.fillRect(91 + x, 164 + y, 3, 1);
        g2d.fillRect(96 + x, 164 + y, 2, 1);
        g2d.fillRect(116 + x, 164 + y, 1, 1);
        g2d.fillRect(119 + x, 164 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(103 + x, 90 + y, 1, 16);
        g2d.fillRect(116 + x, 91 + y, 1, 2);
        g2d.fillRect(102 + x, 92 + y, 1, 1);
        g2d.fillRect(117 + x, 92 + y, 1, 1);
        g2d.fillRect(104 + x, 93 + y, 1, 4);
        g2d.fillRect(118 + x, 93 + y, 1, 5);
        g2d.fillRect(104 + x, 100 + y, 1, 2);
        g2d.fillRect(118 + x, 100 + y, 1, 10);
        g2d.fillRect(102 + x, 104 + y, 1, 2);
        g2d.fillRect(101 + x, 108 + y, 1, 1);
        g2d.fillRect(117 + x, 108 + y, 1, 1);
        g2d.fillRect(99 + x, 114 + y, 1, 11);
        g2d.fillRect(100 + x, 114 + y, 1, 7);
        g2d.fillRect(118 + x, 114 + y, 1, 16);
        g2d.fillRect(120 + x, 118 + y, 1, 14);
        g2d.fillRect(117 + x, 121 + y, 1, 1);
        g2d.fillRect(98 + x, 124 + y, 1, 2);
        g2d.fillRect(99 + x, 126 + y, 1, 11);
        g2d.fillRect(100 + x, 128 + y, 1, 2);
        g2d.fillRect(119 + x, 128 + y, 1, 2);
        g2d.fillRect(97 + x, 129 + y, 1, 3);
        g2d.fillRect(122 + x, 132 + y, 1, 21);
        g2d.fillRect(119 + x, 133 + y, 1, 9);
        g2d.fillRect(121 + x, 133 + y, 1, 5);
        g2d.fillRect(96 + x, 134 + y, 1, 3);
        g2d.fillRect(100 + x, 134 + y, 1, 10);
        g2d.fillRect(117 + x, 137 + y, 1, 4);
        g2d.fillRect(94 + x, 138 + y, 1, 7);
        g2d.fillRect(96 + x, 138 + y, 1, 12);
        g2d.fillRect(120 + x, 138 + y, 1, 7);
        g2d.fillRect(115 + x, 141 + y, 1, 11);
        g2d.fillRect(118 + x, 141 + y, 1, 5);
        g2d.fillRect(117 + x, 145 + y, 1, 5);
        g2d.fillRect(100 + x, 152 + y, 1, 2);
        g2d.fillRect(116 + x, 152 + y, 1, 8);
        g2d.fillRect(94 + x, 153 + y, 1, 4);
        g2d.fillRect(96 + x, 154 + y, 1, 7);
        g2d.fillRect(93 + x, 156 + y, 1, 5);
        g2d.fillRect(115 + x, 157 + y, 1, 1);
        g2d.fillRect(92 + x, 158 + y, 1, 2);
        g2d.fillRect(94 + x, 158 + y, 1, 3);
        g2d.fillRect(95 + x, 160 + y, 1, 1);
        g2d.fillRect(124 + x, 161 + y, 1, 1);
        g2d.fillRect(119 + x, 162 + y, 1, 2);
        g2d.fillRect(120 + x, 162 + y, 1, 2);
        g2d.fillRect(121 + x, 162 + y, 1, 2);
        g2d.fillRect(122 + x, 162 + y, 1, 2);
        g2d.fillRect(123 + x, 162 + y, 1, 1);
        g2d.fillRect(91 + x, 163 + y, 3, 1);
        g2d.fillRect(94 + x, 164 + y, 2, 1);
        g2d.fillRect(99 + x, 164 + y, 2, 1);
        g2d.fillRect(117 + x, 164 + y, 2, 1);
        g2d.fillRect(95 + x, 165 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(100 + x, 92 + y, 1, 3);
        g2d.fillRect(105 + x, 93 + y, 1, 4);
        g2d.fillRect(119 + x, 94 + y, 1, 12);
        g2d.fillRect(101 + x, 96 + y, 1, 1);
        g2d.fillRect(104 + x, 97 + y, 1, 3);
        g2d.fillRect(101 + x, 98 + y, 1, 10);
        g2d.fillRect(102 + x, 98 + y, 1, 3);
        g2d.fillRect(118 + x, 98 + y, 1, 2);
        g2d.fillRect(117 + x, 100 + y, 1, 8);
        g2d.fillRect(117 + x, 109 + y, 1, 1);
        g2d.fillRect(101 + x, 116 + y, 1, 5);
        g2d.fillRect(100 + x, 121 + y, 1, 5);
        g2d.fillRect(117 + x, 122 + y, 1, 15);
        g2d.fillRect(99 + x, 125 + y, 1, 1);
        g2d.fillRect(98 + x, 128 + y, 1, 1);
        g2d.fillRect(98 + x, 130 + y, 1, 2);
        g2d.fillRect(118 + x, 130 + y, 1, 11);
        g2d.fillRect(119 + x, 130 + y, 1, 3);
        g2d.fillRect(97 + x, 132 + y, 1, 5);
        g2d.fillRect(120 + x, 132 + y, 1, 6);
        g2d.fillRect(96 + x, 137 + y, 1, 1);
        g2d.fillRect(99 + x, 138 + y, 1, 2);
        g2d.fillRect(121 + x, 138 + y, 1, 3);
        g2d.fillRect(95 + x, 141 + y, 1, 1);
        g2d.fillRect(99 + x, 141 + y, 1, 3);
        g2d.fillRect(95 + x, 144 + y, 1, 16);
        g2d.fillRect(100 + x, 144 + y, 1, 8);
        g2d.fillRect(116 + x, 144 + y, 1, 8);
        g2d.fillRect(94 + x, 145 + y, 1, 8);
        g2d.fillRect(99 + x, 150 + y, 1, 2);
        g2d.fillRect(115 + x, 152 + y, 1, 5);
        g2d.fillRect(94 + x, 157 + y, 1, 1);
        g2d.fillRect(117 + x, 162 + y, 1, 2);
        g2d.fillRect(118 + x, 162 + y, 1, 2);
        g2d.fillRect(116 + x, 163 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_6));
        g2d.fillRect(110 + x, 84 + y, 3, 1);
        g2d.fillRect(108 + x, 85 + y, 1, 1);
        g2d.fillRect(110 + x, 86 + y, 3, 1);
    }

    public void setOriginalColorArray(boolean b) {
        COLORS.set(ImageUtilities.NEG_GREY_2, new Color(180, 199, 211));
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(202, 218, 227));
        COLORS.set(ImageUtilities.GREY, new Color(218, 230, 237));
        COLORS.set(ImageUtilities.GREY_1, new Color(255, 255, 255));
        COLORS.set(ImageUtilities.NEG_GREY_4, new Color(102, 127, 85));
        COLORS.set(ImageUtilities.NEG_GREY_3, new Color(102, 191, 85));
        COLORS.set(ImageUtilities.NEG_GREY_2, new Color(170, 170, 170));
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(153, 223, 170));
        COLORS.set(ImageUtilities.GREY, new Color(204, 223, 170));
        COLORS.set(ImageUtilities.GREY_1, new Color(204, 204, 204));
        COLORS.set(ImageUtilities.GREY_2, new Color(238, 238, 238));
        COLORS.set(ImageUtilities.GREY_3, new Color(255, 255, 255));
        COLORS.set(ImageUtilities.NEG_GREY_6, new Color(102, 63, 0));
        COLORS.set(ImageUtilities.NEG_GREY_5, new Color(153, 95, 0));
        COLORS.set(ImageUtilities.NEG_GREY_4, new Color(51, 63, 170));
        COLORS.set(ImageUtilities.NEG_GREY_3, new Color(51, 95, 170));
        COLORS.set(ImageUtilities.NEG_GREY_2, new Color(204, 127, 0));
        COLORS.set(ImageUtilities.NEG_GREY_1, new Color(119, 119, 119));
        COLORS.set(ImageUtilities.GREY, new Color(102, 127, 170));
        COLORS.set(ImageUtilities.GREY_1, new Color(136, 136, 136));
        COLORS.set(ImageUtilities.GREY_2, new Color(153, 153, 153));
        COLORS.set(ImageUtilities.GREY_3, new Color(153, 159, 170));
        COLORS.set(ImageUtilities.GREY_4, new Color(204, 191, 170));
        COLORS.set(ImageUtilities.GREY_5, new Color(153, 191, 255));
        COLORS.set(ImageUtilities.GREY_6, new Color(204, 204, 204));
    }

    public boolean getOriginalColorArray() {
        return false;
    }
}
