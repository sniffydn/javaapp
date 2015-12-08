/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package clts.b;

import clts.SuperB;
import util.GraphicsMap;
import util.ImageUtilities;
import util.ColorArray;

/**
 *
 * @author doubleD
 */
public class D9 extends SuperB {

    {
        drs = true;
        platzHeight = 5;
        slenderS = true;
    }

    public D9() {
        super();
    }

    public D9(int layer) {
        super(layer);
    }

    public D9(ColorArray colorSwitch) {
        super(colorSwitch);
    }

    public D9(int layer, ColorArray colorSwitch) {
        super(layer, colorSwitch);
    }

    public void draw(int x, int y, GraphicsMap g2d) {
        if (step < 8) {
            paintBOT2(x, 0, g2d);
            paintBOT1(x, 0, g2d);
        } else {
            paintBOT1(x, 0, g2d);
            paintBOT2(x, 0, g2d);
        }
    }

    public void paintBOT1(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(119 + x, 76 + y, 2, 1);
        g2d.fillRect(107 + x, 77 + y, 3, 1);
        g2d.fillRect(114 + x, 77 + y, 5, 1);
        g2d.fillRect(121 + x, 77 + y, 1, 3);
        g2d.fillRect(105 + x, 78 + y, 2, 1);
        g2d.fillRect(110 + x, 78 + y, 4, 1);
        g2d.fillRect(122 + x, 80 + y, 1, 2);
        g2d.fillRect(120 + x, 97 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(122 + x, 82 + y, 1, 8);
        g2d.fillRect(121 + x, 91 + y, 1, 6);
        g2d.fillRect(112 + x, 93 + y, 1, 3);
        g2d.fillRect(111 + x, 96 + y, 1, 4);
        g2d.fillRect(120 + x, 99 + y, 1, 3);
        g2d.fillRect(110 + x, 100 + y, 1, 9);
        g2d.fillRect(119 + x, 102 + y, 1, 3);
        g2d.fillRect(118 + x, 106 + y, 1, 4);
        g2d.fillRect(109 + x, 109 + y, 1, 18);
        g2d.fillRect(117 + x, 110 + y, 1, 3);
        g2d.fillRect(116 + x, 113 + y, 1, 10);
        g2d.fillRect(117 + x, 115 + y, 1, 14);
        g2d.fillRect(118 + x, 125 + y, 1, 12);
        g2d.fillRect(108 + x, 127 + y, 1, 8);
        g2d.fillRect(115 + x, 131 + y, 1, 17);
        g2d.fillRect(119 + x, 131 + y, 1, 9);
        g2d.fillRect(107 + x, 135 + y, 1, 8);
        g2d.fillRect(120 + x, 137 + y, 1, 6);
        g2d.fillRect(106 + x, 138 + y, 1, 9);
        g2d.fillRect(105 + x, 139 + y, 1, 12);
        g2d.fillRect(104 + x, 140 + y, 1, 16);
        g2d.fillRect(121 + x, 140 + y, 1, 5);
        g2d.fillRect(103 + x, 141 + y, 1, 9);
        g2d.fillRect(122 + x, 141 + y, 1, 6);
        g2d.fillRect(102 + x, 142 + y, 1, 3);
        g2d.fillRect(123 + x, 142 + y, 1, 6);
        g2d.fillRect(101 + x, 143 + y, 1, 3);
        g2d.fillRect(124 + x, 143 + y, 1, 2);
        g2d.fillRect(100 + x, 144 + y, 1, 3);
        g2d.fillRect(125 + x, 144 + y, 1, 2);
        g2d.fillRect(99 + x, 145 + y, 1, 3);
        g2d.fillRect(117 + x, 145 + y, 1, 6);
        g2d.fillRect(126 + x, 145 + y, 1, 2);
        g2d.fillRect(98 + x, 146 + y, 1, 2);
        g2d.fillRect(120 + x, 146 + y, 1, 2);
        g2d.fillRect(124 + x, 146 + y, 1, 3);
        g2d.fillRect(127 + x, 146 + y, 2, 1);
        g2d.fillRect(97 + x, 147 + y, 1, 6);
        g2d.fillRect(102 + x, 147 + y, 1, 3);
        g2d.fillRect(125 + x, 147 + y, 1, 3);
        g2d.fillRect(128 + x, 147 + y, 3, 1);
        g2d.fillRect(114 + x, 148 + y, 1, 10);
        g2d.fillRect(121 + x, 148 + y, 1, 1);
        g2d.fillRect(126 + x, 148 + y, 1, 4);
        g2d.fillRect(130 + x, 148 + y, 2, 1);
        g2d.fillRect(101 + x, 149 + y, 1, 3);
        g2d.fillRect(122 + x, 149 + y, 1, 2);
        g2d.fillRect(127 + x, 149 + y, 1, 4);
        g2d.fillRect(131 + x, 149 + y, 1, 4);
        g2d.fillRect(132 + x, 149 + y, 1, 3);
        g2d.fillRect(98 + x, 150 + y, 1, 6);
        g2d.fillRect(128 + x, 150 + y, 1, 4);
        g2d.fillRect(100 + x, 151 + y, 1, 3);
        g2d.fillRect(103 + x, 151 + y, 1, 7);
        g2d.fillRect(118 + x, 151 + y, 1, 3);
        g2d.fillRect(123 + x, 151 + y, 1, 1);
        g2d.fillRect(130 + x, 151 + y, 1, 5);
        g2d.fillRect(99 + x, 152 + y, 1, 3);
        g2d.fillRect(124 + x, 152 + y, 1, 1);
        g2d.fillRect(129 + x, 152 + y, 1, 5);
        g2d.fillRect(125 + x, 153 + y, 1, 1);
        g2d.fillRect(119 + x, 154 + y, 1, 3);
        g2d.fillRect(97 + x, 155 + y, 1, 3);
        g2d.fillRect(128 + x, 155 + y, 1, 3);
        g2d.fillRect(102 + x, 156 + y, 1, 5);
        g2d.fillRect(127 + x, 156 + y, 1, 3);
        g2d.fillRect(98 + x, 157 + y, 1, 2);
        g2d.fillRect(120 + x, 157 + y, 1, 1);
        g2d.fillRect(126 + x, 157 + y, 1, 3);
        g2d.fillRect(99 + x, 158 + y, 1, 2);
        g2d.fillRect(101 + x, 158 + y, 1, 4);
        g2d.fillRect(113 + x, 158 + y, 1, 4);
        g2d.fillRect(121 + x, 158 + y, 1, 1);
        g2d.fillRect(124 + x, 158 + y, 1, 3);
        g2d.fillRect(125 + x, 158 + y, 1, 2);
        g2d.fillRect(100 + x, 159 + y, 1, 5);
        g2d.fillRect(123 + x, 160 + y, 1, 2);
        g2d.fillRect(122 + x, 161 + y, 1, 2);
        g2d.fillRect(121 + x, 162 + y, 1, 2);
        g2d.fillRect(101 + x, 163 + y, 1, 1);
        g2d.fillRect(118 + x, 163 + y, 1, 2);
        g2d.fillRect(119 + x, 163 + y, 1, 2);
        g2d.fillRect(120 + x, 163 + y, 1, 2);
        g2d.fillRect(102 + x, 164 + y, 2, 1);
        g2d.fillRect(108 + x, 164 + y, 1, 2);
        g2d.fillRect(109 + x, 164 + y, 1, 2);
        g2d.fillRect(110 + x, 164 + y, 1, 2);
        g2d.fillRect(111 + x, 164 + y, 1, 2);
        g2d.fillRect(112 + x, 164 + y, 1, 2);
        g2d.fillRect(113 + x, 164 + y, 1, 2);
        g2d.fillRect(114 + x, 164 + y, 1, 2);
        g2d.fillRect(115 + x, 164 + y, 1, 2);
        g2d.fillRect(116 + x, 164 + y, 1, 2);
        g2d.fillRect(117 + x, 164 + y, 1, 2);
        g2d.fillRect(105 + x, 165 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(119 + x, 77 + y, 1, 2);
        g2d.fillRect(120 + x, 77 + y, 1, 7);
        g2d.fillRect(107 + x, 78 + y, 1, 2);
        g2d.fillRect(108 + x, 78 + y, 1, 3);
        g2d.fillRect(109 + x, 78 + y, 1, 3);
        g2d.fillRect(114 + x, 78 + y, 1, 4);
        g2d.fillRect(115 + x, 78 + y, 1, 4);
        g2d.fillRect(116 + x, 78 + y, 1, 3);
        g2d.fillRect(117 + x, 78 + y, 1, 3);
        g2d.fillRect(118 + x, 78 + y, 1, 2);
        g2d.fillRect(103 + x, 79 + y, 1, 5);
        g2d.fillRect(104 + x, 79 + y, 1, 5);
        g2d.fillRect(110 + x, 79 + y, 1, 3);
        g2d.fillRect(111 + x, 79 + y, 1, 3);
        g2d.fillRect(112 + x, 79 + y, 1, 3);
        g2d.fillRect(113 + x, 79 + y, 1, 3);
        g2d.fillRect(119 + x, 80 + y, 1, 5);
        g2d.fillRect(121 + x, 80 + y, 1, 11);
        g2d.fillRect(105 + x, 81 + y, 1, 4);
        g2d.fillRect(118 + x, 83 + y, 1, 4);
        g2d.fillRect(106 + x, 84 + y, 1, 3);
        g2d.fillRect(117 + x, 84 + y, 1, 1);
        g2d.fillRect(107 + x, 85 + y, 1, 9);
        g2d.fillRect(108 + x, 85 + y, 1, 1);
        g2d.fillRect(117 + x, 86 + y, 1, 3);
        g2d.fillRect(108 + x, 87 + y, 1, 7);
        g2d.fillRect(109 + x, 88 + y, 1, 14);
        g2d.fillRect(116 + x, 88 + y, 1, 5);
        g2d.fillRect(120 + x, 88 + y, 1, 9);
        g2d.fillRect(112 + x, 89 + y, 1, 4);
        g2d.fillRect(113 + x, 89 + y, 1, 12);
        g2d.fillRect(110 + x, 91 + y, 1, 9);
        g2d.fillRect(114 + x, 91 + y, 1, 8);
        g2d.fillRect(115 + x, 91 + y, 1, 3);
        g2d.fillRect(112 + x, 96 + y, 1, 11);
        g2d.fillRect(119 + x, 97 + y, 1, 5);
        g2d.fillRect(111 + x, 100 + y, 1, 13);
        g2d.fillRect(118 + x, 101 + y, 1, 5);
        g2d.fillRect(117 + x, 103 + y, 1, 7);
        g2d.fillRect(110 + x, 109 + y, 1, 4);
        g2d.fillRect(116 + x, 109 + y, 1, 4);
        g2d.fillRect(115 + x, 111 + y, 1, 20);
        g2d.fillRect(110 + x, 117 + y, 1, 23);
        g2d.fillRect(114 + x, 119 + y, 1, 29);
        g2d.fillRect(116 + x, 123 + y, 1, 25);
        g2d.fillRect(109 + x, 127 + y, 1, 20);
        g2d.fillRect(117 + x, 129 + y, 1, 4);
        g2d.fillRect(108 + x, 135 + y, 1, 16);
        g2d.fillRect(118 + x, 137 + y, 1, 3);
        g2d.fillRect(113 + x, 139 + y, 1, 19);
        g2d.fillRect(119 + x, 140 + y, 1, 2);
        g2d.fillRect(107 + x, 143 + y, 1, 12);
        g2d.fillRect(120 + x, 143 + y, 1, 3);
        g2d.fillRect(117 + x, 144 + y, 1, 1);
        g2d.fillRect(121 + x, 145 + y, 1, 3);
        g2d.fillRect(124 + x, 145 + y, 1, 1);
        g2d.fillRect(102 + x, 146 + y, 1, 1);
        g2d.fillRect(112 + x, 146 + y, 1, 18);
        g2d.fillRect(118 + x, 146 + y, 1, 5);
        g2d.fillRect(125 + x, 146 + y, 1, 1);
        g2d.fillRect(101 + x, 147 + y, 1, 2);
        g2d.fillRect(106 + x, 147 + y, 1, 11);
        g2d.fillRect(122 + x, 147 + y, 1, 2);
        g2d.fillRect(126 + x, 147 + y, 1, 1);
        g2d.fillRect(98 + x, 148 + y, 1, 2);
        g2d.fillRect(115 + x, 148 + y, 1, 16);
        g2d.fillRect(120 + x, 148 + y, 1, 1);
        g2d.fillRect(123 + x, 148 + y, 1, 3);
        g2d.fillRect(127 + x, 148 + y, 1, 1);
        g2d.fillRect(129 + x, 148 + y, 1, 1);
        g2d.fillRect(100 + x, 149 + y, 1, 2);
        g2d.fillRect(121 + x, 149 + y, 1, 1);
        g2d.fillRect(124 + x, 149 + y, 1, 3);
        g2d.fillRect(128 + x, 149 + y, 1, 1);
        g2d.fillRect(130 + x, 149 + y, 1, 2);
        g2d.fillRect(99 + x, 150 + y, 1, 2);
        g2d.fillRect(103 + x, 150 + y, 1, 1);
        g2d.fillRect(125 + x, 150 + y, 1, 3);
        g2d.fillRect(105 + x, 151 + y, 1, 9);
        g2d.fillRect(117 + x, 151 + y, 1, 5);
        g2d.fillRect(119 + x, 151 + y, 1, 3);
        g2d.fillRect(122 + x, 151 + y, 1, 2);
        g2d.fillRect(129 + x, 151 + y, 1, 1);
        g2d.fillRect(102 + x, 152 + y, 1, 4);
        g2d.fillRect(120 + x, 152 + y, 1, 5);
        g2d.fillRect(123 + x, 152 + y, 1, 2);
        g2d.fillRect(126 + x, 152 + y, 1, 5);
        g2d.fillRect(124 + x, 153 + y, 1, 2);
        g2d.fillRect(127 + x, 153 + y, 1, 3);
        g2d.fillRect(100 + x, 154 + y, 1, 1);
        g2d.fillRect(118 + x, 154 + y, 1, 5);
        g2d.fillRect(125 + x, 154 + y, 1, 4);
        g2d.fillRect(128 + x, 154 + y, 1, 1);
        g2d.fillRect(99 + x, 155 + y, 1, 1);
        g2d.fillRect(98 + x, 156 + y, 1, 1);
        g2d.fillRect(101 + x, 156 + y, 1, 2);
        g2d.fillRect(104 + x, 156 + y, 1, 9);
        g2d.fillRect(121 + x, 156 + y, 1, 2);
        g2d.fillRect(123 + x, 156 + y, 1, 4);
        g2d.fillRect(124 + x, 156 + y, 1, 2);
        g2d.fillRect(99 + x, 157 + y, 2, 1);
        g2d.fillRect(111 + x, 157 + y, 1, 7);
        g2d.fillRect(119 + x, 157 + y, 1, 6);
        g2d.fillRect(122 + x, 157 + y, 1, 4);
        g2d.fillRect(100 + x, 158 + y, 1, 1);
        g2d.fillRect(103 + x, 158 + y, 1, 6);
        g2d.fillRect(114 + x, 158 + y, 1, 6);
        g2d.fillRect(120 + x, 158 + y, 1, 5);
        g2d.fillRect(121 + x, 159 + y, 1, 3);
        g2d.fillRect(102 + x, 161 + y, 1, 3);
        g2d.fillRect(105 + x, 161 + y, 1, 4);
        g2d.fillRect(118 + x, 161 + y, 1, 2);
        g2d.fillRect(101 + x, 162 + y, 1, 1);
        g2d.fillRect(106 + x, 162 + y, 1, 3);
        g2d.fillRect(107 + x, 162 + y, 1, 3);
        g2d.fillRect(113 + x, 162 + y, 1, 2);
        g2d.fillRect(116 + x, 162 + y, 1, 2);
        g2d.fillRect(117 + x, 162 + y, 1, 2);
        g2d.fillRect(108 + x, 163 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(105 + x, 79 + y, 1, 2);
        g2d.fillRect(106 + x, 79 + y, 1, 5);
        g2d.fillRect(119 + x, 79 + y, 1, 1);
        g2d.fillRect(107 + x, 80 + y, 1, 5);
        g2d.fillRect(118 + x, 80 + y, 1, 3);
        g2d.fillRect(108 + x, 81 + y, 2, 1);
        g2d.fillRect(116 + x, 81 + y, 2, 1);
        g2d.fillRect(109 + x, 82 + y, 7, 1);
        g2d.fillRect(117 + x, 82 + y, 1, 2);
        g2d.fillRect(108 + x, 83 + y, 1, 2);
        g2d.fillRect(111 + x, 83 + y, 4, 1);
        g2d.fillRect(116 + x, 84 + y, 1, 4);
        g2d.fillRect(120 + x, 84 + y, 1, 4);
        g2d.fillRect(117 + x, 85 + y, 1, 1);
        g2d.fillRect(119 + x, 85 + y, 1, 1);
        g2d.fillRect(108 + x, 86 + y, 2, 1);
        g2d.fillRect(109 + x, 87 + y, 1, 1);
        g2d.fillRect(110 + x, 88 + y, 1, 3);
        g2d.fillRect(115 + x, 88 + y, 1, 3);
        g2d.fillRect(119 + x, 88 + y, 1, 9);
        g2d.fillRect(111 + x, 89 + y, 1, 7);
        g2d.fillRect(114 + x, 89 + y, 1, 2);
        g2d.fillRect(117 + x, 89 + y, 1, 7);
        g2d.fillRect(116 + x, 93 + y, 1, 4);
        g2d.fillRect(115 + x, 94 + y, 1, 7);
        g2d.fillRect(114 + x, 99 + y, 1, 5);
        g2d.fillRect(118 + x, 99 + y, 1, 2);
        g2d.fillRect(113 + x, 101 + y, 1, 7);
        g2d.fillRect(117 + x, 102 + y, 1, 1);
        g2d.fillRect(112 + x, 107 + y, 1, 5);
        g2d.fillRect(115 + x, 110 + y, 1, 1);
        g2d.fillRect(110 + x, 113 + y, 1, 4);
        g2d.fillRect(111 + x, 113 + y, 1, 6);
        g2d.fillRect(113 + x, 119 + y, 1, 20);
        g2d.fillRect(112 + x, 133 + y, 1, 13);
        g2d.fillRect(117 + x, 133 + y, 1, 11);
        g2d.fillRect(110 + x, 140 + y, 1, 2);
        g2d.fillRect(118 + x, 140 + y, 1, 1);
        g2d.fillRect(119 + x, 142 + y, 1, 3);
        g2d.fillRect(102 + x, 145 + y, 1, 1);
        g2d.fillRect(111 + x, 145 + y, 1, 12);
        g2d.fillRect(118 + x, 145 + y, 1, 1);
        g2d.fillRect(101 + x, 146 + y, 1, 1);
        g2d.fillRect(100 + x, 147 + y, 1, 2);
        g2d.fillRect(109 + x, 147 + y, 1, 5);
        g2d.fillRect(127 + x, 147 + y, 1, 1);
        g2d.fillRect(99 + x, 148 + y, 1, 2);
        g2d.fillRect(116 + x, 148 + y, 1, 6);
        g2d.fillRect(128 + x, 148 + y, 1, 1);
        g2d.fillRect(120 + x, 149 + y, 1, 1);
        g2d.fillRect(129 + x, 149 + y, 1, 2);
        g2d.fillRect(102 + x, 150 + y, 1, 2);
        g2d.fillRect(119 + x, 150 + y, 1, 1);
        g2d.fillRect(121 + x, 150 + y, 1, 1);
        g2d.fillRect(108 + x, 151 + y, 1, 4);
        g2d.fillRect(101 + x, 152 + y, 1, 4);
        g2d.fillRect(110 + x, 153 + y, 1, 10);
        g2d.fillRect(122 + x, 153 + y, 1, 1);
        g2d.fillRect(123 + x, 154 + y, 1, 2);
        g2d.fillRect(100 + x, 155 + y, 1, 2);
        g2d.fillRect(107 + x, 155 + y, 1, 5);
        g2d.fillRect(121 + x, 155 + y, 1, 1);
        g2d.fillRect(124 + x, 155 + y, 1, 1);
        g2d.fillRect(99 + x, 156 + y, 1, 1);
        g2d.fillRect(117 + x, 156 + y, 1, 2);
        g2d.fillRect(122 + x, 156 + y, 1, 1);
        g2d.fillRect(106 + x, 158 + y, 1, 4);
        g2d.fillRect(118 + x, 159 + y, 1, 2);
        g2d.fillRect(105 + x, 160 + y, 1, 1);
        g2d.fillRect(116 + x, 160 + y, 1, 2);
        g2d.fillRect(107 + x, 161 + y, 1, 1);
        g2d.fillRect(109 + x, 161 + y, 1, 2);
        g2d.fillRect(117 + x, 161 + y, 1, 1);
        g2d.fillRect(108 + x, 162 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(108 + x, 82 + y, 1, 1);
        g2d.fillRect(116 + x, 82 + y, 1, 2);
        g2d.fillRect(109 + x, 83 + y, 1, 3);
        g2d.fillRect(110 + x, 83 + y, 1, 5);
        g2d.fillRect(115 + x, 83 + y, 1, 5);
        g2d.fillRect(111 + x, 84 + y, 1, 5);
        g2d.fillRect(112 + x, 84 + y, 1, 5);
        g2d.fillRect(113 + x, 84 + y, 1, 5);
        g2d.fillRect(114 + x, 84 + y, 1, 5);
        g2d.fillRect(119 + x, 86 + y, 1, 2);
        g2d.fillRect(118 + x, 87 + y, 1, 12);
        g2d.fillRect(117 + x, 96 + y, 1, 6);
        g2d.fillRect(116 + x, 97 + y, 1, 12);
        g2d.fillRect(115 + x, 101 + y, 1, 9);
        g2d.fillRect(114 + x, 104 + y, 1, 15);
        g2d.fillRect(113 + x, 108 + y, 1, 11);
        g2d.fillRect(112 + x, 112 + y, 1, 21);
        g2d.fillRect(111 + x, 119 + y, 1, 26);
        g2d.fillRect(118 + x, 141 + y, 1, 4);
        g2d.fillRect(110 + x, 142 + y, 1, 11);
        g2d.fillRect(119 + x, 145 + y, 1, 5);
        g2d.fillRect(120 + x, 150 + y, 1, 2);
        g2d.fillRect(121 + x, 151 + y, 1, 4);
        g2d.fillRect(109 + x, 152 + y, 1, 9);
        g2d.fillRect(116 + x, 154 + y, 1, 6);
        g2d.fillRect(122 + x, 154 + y, 1, 2);
        g2d.fillRect(108 + x, 155 + y, 1, 7);
        g2d.fillRect(117 + x, 158 + y, 1, 3);
        g2d.fillRect(107 + x, 160 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
    }

    public void paintBOT2(int x, int y, GraphicsMap g2d) {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(102 + x, 76 + y, 2, 1);
        g2d.fillRect(101 + x, 77 + y, 1, 3);
        g2d.fillRect(104 + x, 77 + y, 1, 1);
        g2d.fillRect(100 + x, 80 + y, 1, 2);
        g2d.fillRect(102 + x, 97 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(100 + x, 82 + y, 1, 8);
        g2d.fillRect(101 + x, 91 + y, 1, 6);
        g2d.fillRect(110 + x, 93 + y, 1, 3);
        g2d.fillRect(111 + x, 96 + y, 1, 4);
        g2d.fillRect(102 + x, 99 + y, 1, 3);
        g2d.fillRect(112 + x, 100 + y, 1, 9);
        g2d.fillRect(103 + x, 102 + y, 1, 3);
        g2d.fillRect(104 + x, 106 + y, 1, 4);
        g2d.fillRect(113 + x, 109 + y, 1, 18);
        g2d.fillRect(105 + x, 110 + y, 1, 3);
        g2d.fillRect(114 + x, 112 + y, 1, 23);
        g2d.fillRect(106 + x, 113 + y, 1, 10);
        g2d.fillRect(105 + x, 115 + y, 1, 14);
        g2d.fillRect(115 + x, 118 + y, 1, 25);
        g2d.fillRect(116 + x, 123 + y, 1, 24);
        g2d.fillRect(104 + x, 125 + y, 1, 12);
        g2d.fillRect(103 + x, 131 + y, 1, 9);
        g2d.fillRect(107 + x, 131 + y, 1, 17);
        g2d.fillRect(117 + x, 133 + y, 1, 18);
        g2d.fillRect(102 + x, 137 + y, 1, 6);
        g2d.fillRect(101 + x, 140 + y, 1, 5);
        g2d.fillRect(100 + x, 141 + y, 1, 6);
        g2d.fillRect(99 + x, 142 + y, 1, 6);
        g2d.fillRect(98 + x, 143 + y, 1, 2);
        g2d.fillRect(97 + x, 144 + y, 1, 2);
        g2d.fillRect(118 + x, 144 + y, 1, 12);
        g2d.fillRect(96 + x, 145 + y, 1, 2);
        g2d.fillRect(105 + x, 145 + y, 1, 6);
        g2d.fillRect(94 + x, 146 + y, 1, 2);
        g2d.fillRect(95 + x, 146 + y, 1, 1);
        g2d.fillRect(98 + x, 146 + y, 1, 3);
        g2d.fillRect(102 + x, 146 + y, 1, 2);
        g2d.fillRect(92 + x, 147 + y, 1, 2);
        g2d.fillRect(93 + x, 147 + y, 1, 1);
        g2d.fillRect(97 + x, 147 + y, 1, 3);
        g2d.fillRect(91 + x, 148 + y, 1, 5);
        g2d.fillRect(96 + x, 148 + y, 1, 4);
        g2d.fillRect(101 + x, 148 + y, 1, 1);
        g2d.fillRect(108 + x, 148 + y, 1, 10);
        g2d.fillRect(90 + x, 149 + y, 1, 3);
        g2d.fillRect(95 + x, 149 + y, 1, 4);
        g2d.fillRect(100 + x, 149 + y, 1, 2);
        g2d.fillRect(94 + x, 150 + y, 1, 4);
        g2d.fillRect(92 + x, 151 + y, 1, 5);
        g2d.fillRect(99 + x, 151 + y, 1, 1);
        g2d.fillRect(104 + x, 151 + y, 1, 3);
        g2d.fillRect(119 + x, 151 + y, 1, 7);
        g2d.fillRect(93 + x, 152 + y, 1, 5);
        g2d.fillRect(98 + x, 152 + y, 1, 1);
        g2d.fillRect(97 + x, 153 + y, 1, 1);
        g2d.fillRect(103 + x, 154 + y, 1, 3);
        g2d.fillRect(94 + x, 155 + y, 1, 3);
        g2d.fillRect(95 + x, 156 + y, 1, 3);
        g2d.fillRect(120 + x, 156 + y, 1, 5);
        g2d.fillRect(96 + x, 157 + y, 1, 3);
        g2d.fillRect(102 + x, 157 + y, 1, 1);
        g2d.fillRect(97 + x, 158 + y, 1, 2);
        g2d.fillRect(98 + x, 158 + y, 1, 3);
        g2d.fillRect(101 + x, 158 + y, 1, 1);
        g2d.fillRect(109 + x, 158 + y, 1, 4);
        g2d.fillRect(121 + x, 158 + y, 1, 4);
        g2d.fillRect(99 + x, 160 + y, 1, 2);
        g2d.fillRect(122 + x, 160 + y, 1, 4);
        g2d.fillRect(100 + x, 161 + y, 1, 2);
        g2d.fillRect(101 + x, 162 + y, 1, 2);
        g2d.fillRect(102 + x, 163 + y, 1, 2);
        g2d.fillRect(103 + x, 163 + y, 1, 2);
        g2d.fillRect(104 + x, 163 + y, 1, 2);
        g2d.fillRect(121 + x, 163 + y, 1, 1);
        g2d.fillRect(105 + x, 164 + y, 1, 2);
        g2d.fillRect(106 + x, 164 + y, 1, 2);
        g2d.fillRect(107 + x, 164 + y, 1, 2);
        g2d.fillRect(108 + x, 164 + y, 1, 2);
        g2d.fillRect(109 + x, 164 + y, 1, 2);
        g2d.fillRect(110 + x, 164 + y, 1, 2);
        g2d.fillRect(111 + x, 164 + y, 1, 2);
        g2d.fillRect(112 + x, 164 + y, 1, 2);
        g2d.fillRect(113 + x, 164 + y, 1, 2);
        g2d.fillRect(114 + x, 164 + y, 1, 2);
        g2d.fillRect(119 + x, 164 + y, 2, 1);
        g2d.fillRect(115 + x, 165 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(102 + x, 77 + y, 1, 7);
        g2d.fillRect(103 + x, 77 + y, 1, 8);
        g2d.fillRect(104 + x, 78 + y, 1, 2);
        g2d.fillRect(101 + x, 80 + y, 1, 11);
        g2d.fillRect(104 + x, 83 + y, 1, 4);
        g2d.fillRect(105 + x, 85 + y, 1, 4);
        g2d.fillRect(106 + x, 87 + y, 1, 6);
        g2d.fillRect(102 + x, 88 + y, 1, 9);
        g2d.fillRect(107 + x, 91 + y, 1, 3);
        g2d.fillRect(108 + x, 91 + y, 1, 8);
        g2d.fillRect(109 + x, 91 + y, 1, 10);
        g2d.fillRect(110 + x, 91 + y, 1, 2);
        g2d.fillRect(110 + x, 96 + y, 1, 11);
        g2d.fillRect(103 + x, 97 + y, 1, 5);
        g2d.fillRect(111 + x, 100 + y, 1, 13);
        g2d.fillRect(104 + x, 101 + y, 1, 5);
        g2d.fillRect(105 + x, 103 + y, 1, 7);
        g2d.fillRect(106 + x, 109 + y, 1, 4);
        g2d.fillRect(112 + x, 109 + y, 1, 4);
        g2d.fillRect(107 + x, 111 + y, 1, 20);
        g2d.fillRect(112 + x, 117 + y, 1, 23);
        g2d.fillRect(108 + x, 119 + y, 1, 29);
        g2d.fillRect(106 + x, 123 + y, 1, 25);
        g2d.fillRect(113 + x, 127 + y, 1, 20);
        g2d.fillRect(105 + x, 129 + y, 1, 4);
        g2d.fillRect(114 + x, 135 + y, 1, 16);
        g2d.fillRect(104 + x, 137 + y, 1, 3);
        g2d.fillRect(109 + x, 139 + y, 1, 19);
        g2d.fillRect(103 + x, 140 + y, 1, 2);
        g2d.fillRect(102 + x, 143 + y, 1, 3);
        g2d.fillRect(115 + x, 143 + y, 1, 12);
        g2d.fillRect(105 + x, 144 + y, 1, 1);
        g2d.fillRect(98 + x, 145 + y, 1, 1);
        g2d.fillRect(101 + x, 145 + y, 1, 3);
        g2d.fillRect(97 + x, 146 + y, 1, 1);
        g2d.fillRect(104 + x, 146 + y, 1, 5);
        g2d.fillRect(110 + x, 146 + y, 1, 18);
        g2d.fillRect(96 + x, 147 + y, 1, 1);
        g2d.fillRect(100 + x, 147 + y, 1, 2);
        g2d.fillRect(116 + x, 147 + y, 1, 11);
        g2d.fillRect(93 + x, 148 + y, 1, 1);
        g2d.fillRect(95 + x, 148 + y, 1, 1);
        g2d.fillRect(99 + x, 148 + y, 1, 3);
        g2d.fillRect(102 + x, 148 + y, 1, 1);
        g2d.fillRect(107 + x, 148 + y, 1, 16);
        g2d.fillRect(92 + x, 149 + y, 1, 2);
        g2d.fillRect(94 + x, 149 + y, 1, 1);
        g2d.fillRect(98 + x, 149 + y, 1, 3);
        g2d.fillRect(101 + x, 149 + y, 1, 1);
        g2d.fillRect(97 + x, 150 + y, 1, 3);
        g2d.fillRect(93 + x, 151 + y, 1, 1);
        g2d.fillRect(100 + x, 151 + y, 1, 2);
        g2d.fillRect(103 + x, 151 + y, 1, 3);
        g2d.fillRect(105 + x, 151 + y, 1, 5);
        g2d.fillRect(117 + x, 151 + y, 1, 9);
        g2d.fillRect(96 + x, 152 + y, 1, 5);
        g2d.fillRect(99 + x, 152 + y, 1, 2);
        g2d.fillRect(102 + x, 152 + y, 1, 5);
        g2d.fillRect(95 + x, 153 + y, 1, 3);
        g2d.fillRect(98 + x, 153 + y, 1, 2);
        g2d.fillRect(94 + x, 154 + y, 1, 1);
        g2d.fillRect(97 + x, 154 + y, 1, 4);
        g2d.fillRect(104 + x, 154 + y, 1, 5);
        g2d.fillRect(98 + x, 156 + y, 1, 2);
        g2d.fillRect(99 + x, 156 + y, 1, 4);
        g2d.fillRect(101 + x, 156 + y, 1, 2);
        g2d.fillRect(118 + x, 156 + y, 1, 9);
        g2d.fillRect(100 + x, 157 + y, 1, 4);
        g2d.fillRect(103 + x, 157 + y, 1, 6);
        g2d.fillRect(111 + x, 157 + y, 1, 7);
        g2d.fillRect(102 + x, 158 + y, 1, 5);
        g2d.fillRect(108 + x, 158 + y, 1, 6);
        g2d.fillRect(119 + x, 158 + y, 1, 6);
        g2d.fillRect(101 + x, 159 + y, 1, 3);
        g2d.fillRect(104 + x, 161 + y, 1, 2);
        g2d.fillRect(117 + x, 161 + y, 1, 4);
        g2d.fillRect(120 + x, 161 + y, 1, 3);
        g2d.fillRect(105 + x, 162 + y, 1, 2);
        g2d.fillRect(106 + x, 162 + y, 1, 2);
        g2d.fillRect(109 + x, 162 + y, 1, 2);
        g2d.fillRect(115 + x, 162 + y, 1, 3);
        g2d.fillRect(116 + x, 162 + y, 1, 3);
        g2d.fillRect(121 + x, 162 + y, 1, 1);
        g2d.fillRect(112 + x, 163 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(102 + x, 84 + y, 1, 4);
        g2d.fillRect(103 + x, 85 + y, 1, 1);
        g2d.fillRect(103 + x, 88 + y, 1, 9);
        g2d.fillRect(105 + x, 89 + y, 1, 7);
        g2d.fillRect(111 + x, 91 + y, 1, 5);
        g2d.fillRect(106 + x, 93 + y, 1, 4);
        g2d.fillRect(107 + x, 94 + y, 1, 7);
        g2d.fillRect(104 + x, 99 + y, 1, 2);
        g2d.fillRect(108 + x, 99 + y, 1, 5);
        g2d.fillRect(109 + x, 101 + y, 1, 7);
        g2d.fillRect(105 + x, 102 + y, 1, 1);
        g2d.fillRect(110 + x, 107 + y, 1, 5);
        g2d.fillRect(107 + x, 110 + y, 1, 1);
        g2d.fillRect(111 + x, 113 + y, 1, 6);
        g2d.fillRect(112 + x, 113 + y, 1, 4);
        g2d.fillRect(109 + x, 119 + y, 1, 20);
        g2d.fillRect(105 + x, 133 + y, 1, 11);
        g2d.fillRect(110 + x, 133 + y, 1, 13);
        g2d.fillRect(104 + x, 140 + y, 1, 1);
        g2d.fillRect(112 + x, 140 + y, 1, 2);
        g2d.fillRect(103 + x, 142 + y, 1, 3);
        g2d.fillRect(104 + x, 145 + y, 1, 1);
        g2d.fillRect(111 + x, 145 + y, 1, 12);
        g2d.fillRect(95 + x, 147 + y, 1, 1);
        g2d.fillRect(113 + x, 147 + y, 1, 5);
        g2d.fillRect(94 + x, 148 + y, 1, 1);
        g2d.fillRect(106 + x, 148 + y, 1, 6);
        g2d.fillRect(93 + x, 149 + y, 1, 2);
        g2d.fillRect(102 + x, 149 + y, 1, 1);
        g2d.fillRect(101 + x, 150 + y, 1, 1);
        g2d.fillRect(103 + x, 150 + y, 1, 1);
        g2d.fillRect(114 + x, 151 + y, 1, 4);
        g2d.fillRect(100 + x, 153 + y, 1, 1);
        g2d.fillRect(112 + x, 153 + y, 1, 10);
        g2d.fillRect(99 + x, 154 + y, 1, 2);
        g2d.fillRect(98 + x, 155 + y, 1, 1);
        g2d.fillRect(101 + x, 155 + y, 1, 1);
        g2d.fillRect(115 + x, 155 + y, 1, 5);
        g2d.fillRect(100 + x, 156 + y, 1, 1);
        g2d.fillRect(105 + x, 156 + y, 1, 2);
        g2d.fillRect(116 + x, 158 + y, 1, 4);
        g2d.fillRect(104 + x, 159 + y, 1, 2);
        g2d.fillRect(106 + x, 160 + y, 1, 2);
        g2d.fillRect(117 + x, 160 + y, 1, 1);
        g2d.fillRect(105 + x, 161 + y, 1, 1);
        g2d.fillRect(113 + x, 161 + y, 1, 2);
        g2d.fillRect(115 + x, 161 + y, 1, 1);
        g2d.fillRect(114 + x, 162 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(103 + x, 86 + y, 1, 2);
        g2d.fillRect(104 + x, 87 + y, 1, 12);
        g2d.fillRect(105 + x, 96 + y, 1, 6);
        g2d.fillRect(106 + x, 97 + y, 1, 12);
        g2d.fillRect(107 + x, 101 + y, 1, 9);
        g2d.fillRect(108 + x, 104 + y, 1, 15);
        g2d.fillRect(109 + x, 108 + y, 1, 11);
        g2d.fillRect(110 + x, 112 + y, 1, 21);
        g2d.fillRect(111 + x, 119 + y, 1, 26);
        g2d.fillRect(104 + x, 141 + y, 1, 4);
        g2d.fillRect(112 + x, 142 + y, 1, 11);
        g2d.fillRect(103 + x, 145 + y, 1, 5);
        g2d.fillRect(102 + x, 150 + y, 1, 2);
        g2d.fillRect(101 + x, 151 + y, 1, 4);
        g2d.fillRect(113 + x, 152 + y, 1, 9);
        g2d.fillRect(100 + x, 154 + y, 1, 2);
        g2d.fillRect(106 + x, 154 + y, 1, 6);
        g2d.fillRect(114 + x, 155 + y, 1, 7);
        g2d.fillRect(105 + x, 158 + y, 1, 3);
        g2d.fillRect(115 + x, 160 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
    }

    public void drawBody(b.Bd bd) {
        bd.paintLegs = false;
    }
}
