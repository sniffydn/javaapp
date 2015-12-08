package clts.t.u.s;

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

public class Jac1 extends SuperTU {

    public Jac1() {
        super();
        containsTL = true;
    }

    /** Creates a new instance of GenericClothes */
    public Jac1(String middle) {
        super(middle);
        containsTL = true;
    }

    public Jac1(String middle, ColorArray colorSwitch) {
        super(middle, colorSwitch);
        containsTL = true;
    }

    public void drawSleevesLeft0(int x, int y, GraphicsMap g2d) {
    }

    public void drawSleevesRight0(int x, int y, GraphicsMap g2d) {
    }

    public void drawFluff(int x, int y, GraphicsMap g2d) {
        g2d.setColor(new Color(99, 99, 99, 255));
        g2d.fillRect(122 + x, 39 + y, 1, 1);
        g2d.fillRect(98 + x, 40 + y, 1, 1);
        g2d.fillRect(102 + x, 40 + y, 1, 1);
        g2d.fillRect(115 + x, 40 + y, 1, 2);
        g2d.fillRect(120 + x, 40 + y, 1, 1);
        g2d.fillRect(101 + x, 41 + y, 1, 1);
        g2d.fillRect(116 + x, 41 + y, 1, 2);
        g2d.fillRect(91 + x, 42 + y, 1, 2);
        g2d.fillRect(121 + x, 43 + y, 1, 2);
        g2d.fillRect(90 + x, 44 + y, 1, 1);
        g2d.fillRect(112 + x, 45 + y, 1, 1);
        g2d.fillRect(122 + x, 45 + y, 1, 1);
        g2d.fillRect(95 + x, 46 + y, 1, 2);
        g2d.fillRect(117 + x, 47 + y, 1, 1);
        g2d.fillRect(94 + x, 48 + y, 1, 1);
        g2d.fillRect(103 + x, 49 + y, 1, 1);
        g2d.fillRect(114 + x, 49 + y, 1, 1);
        g2d.fillRect(99 + x, 50 + y, 1, 1);
        g2d.fillRect(102 + x, 52 + y, 1, 1);
        g2d.fillRect(111 + x, 54 + y, 1, 1);


        g2d.setColor(new Color(148, 148, 148, 255));
        g2d.fillRect(93 + x, 39 + y, 1, 1);
        g2d.fillRect(95 + x, 39 + y, 1, 1);
        g2d.fillRect(98 + x, 39 + y, 2, 1);
        g2d.fillRect(116 + x, 39 + y, 1, 1);
        g2d.fillRect(120 + x, 39 + y, 1, 1);
        g2d.fillRect(122 + x, 40 + y, 1, 1);
        g2d.fillRect(96 + x, 41 + y, 1, 2);
        g2d.fillRect(113 + x, 41 + y, 1, 1);
        g2d.fillRect(117 + x, 41 + y, 1, 2);
        g2d.fillRect(120 + x, 41 + y, 1, 1);
        g2d.fillRect(123 + x, 41 + y, 1, 1);
        g2d.fillRect(114 + x, 42 + y, 2, 1);
        g2d.fillRect(93 + x, 43 + y, 1, 1);
        g2d.fillRect(115 + x, 43 + y, 1, 1);
        g2d.fillRect(119 + x, 43 + y, 1, 1);
        g2d.fillRect(123 + x, 43 + y, 1, 1);
        g2d.fillRect(92 + x, 44 + y, 1, 2);
        g2d.fillRect(96 + x, 44 + y, 2, 1);
        g2d.fillRect(102 + x, 44 + y, 1, 1);
        g2d.fillRect(91 + x, 45 + y, 1, 1);
        g2d.fillRect(97 + x, 45 + y, 1, 2);
        g2d.fillRect(99 + x, 45 + y, 1, 1);
        g2d.fillRect(114 + x, 45 + y, 1, 1);
        g2d.fillRect(93 + x, 46 + y, 1, 1);
        g2d.fillRect(98 + x, 46 + y, 1, 1);
        g2d.fillRect(104 + x, 46 + y, 1, 2);
        g2d.fillRect(105 + x, 46 + y, 1, 1);
        g2d.fillRect(118 + x, 47 + y, 1, 1);
        g2d.fillRect(105 + x, 48 + y, 1, 3);
        g2d.fillRect(106 + x, 49 + y, 1, 1);
        g2d.fillRect(112 + x, 49 + y, 1, 1);
        g2d.fillRect(116 + x, 49 + y, 3, 1);
        g2d.fillRect(110 + x, 50 + y, 1, 1);
        g2d.fillRect(115 + x, 50 + y, 1, 1);
        g2d.fillRect(117 + x, 50 + y, 1, 1);
        g2d.fillRect(106 + x, 51 + y, 1, 1);
        g2d.fillRect(108 + x, 51 + y, 1, 1);
        g2d.fillRect(116 + x, 51 + y, 1, 1);
        g2d.fillRect(100 + x, 52 + y, 1, 1);
        g2d.fillRect(104 + x, 52 + y, 1, 1);
        g2d.fillRect(106 + x, 53 + y, 1, 1);
        g2d.fillRect(110 + x, 53 + y, 1, 1);
        g2d.fillRect(108 + x, 54 + y, 2, 1);
        g2d.fillRect(109 + x, 55 + y, 1, 1);
        g2d.fillRect(106 + x, 56 + y, 1, 1);
        g2d.fillRect(108 + x, 56 + y, 1, 1);


        g2d.setColor(new Color(206, 206, 206, 255));
        g2d.fillRect(94 + x, 39 + y, 1, 2);
        g2d.fillRect(96 + x, 39 + y, 1, 1);
        g2d.fillRect(100 + x, 39 + y, 1, 1);
        g2d.fillRect(115 + x, 39 + y, 1, 1);
        g2d.fillRect(118 + x, 39 + y, 1, 5);
        g2d.fillRect(119 + x, 39 + y, 1, 2);
        g2d.fillRect(91 + x, 40 + y, 1, 2);
        g2d.fillRect(93 + x, 40 + y, 1, 3);
        g2d.fillRect(97 + x, 40 + y, 1, 1);
        g2d.fillRect(99 + x, 40 + y, 1, 1);
        g2d.fillRect(117 + x, 40 + y, 1, 1);
        g2d.fillRect(98 + x, 41 + y, 1, 2);
        g2d.fillRect(122 + x, 41 + y, 1, 1);
        g2d.fillRect(90 + x, 42 + y, 1, 2);
        g2d.fillRect(120 + x, 42 + y, 1, 1);
        g2d.fillRect(96 + x, 43 + y, 1, 1);
        g2d.fillRect(103 + x, 43 + y, 1, 1);
        g2d.fillRect(116 + x, 43 + y, 2, 1);
        g2d.fillRect(95 + x, 44 + y, 1, 2);
        g2d.fillRect(98 + x, 44 + y, 1, 2);
        g2d.fillRect(115 + x, 44 + y, 1, 3);
        g2d.fillRect(119 + x, 44 + y, 1, 1);
        g2d.fillRect(122 + x, 44 + y, 1, 1);
        g2d.fillRect(93 + x, 45 + y, 1, 1);
        g2d.fillRect(96 + x, 45 + y, 1, 1);
        g2d.fillRect(102 + x, 45 + y, 1, 2);
        g2d.fillRect(117 + x, 45 + y, 1, 2);
        g2d.fillRect(123 + x, 45 + y, 1, 1);
        g2d.fillRect(99 + x, 46 + y, 1, 1);
        g2d.fillRect(106 + x, 46 + y, 1, 1);
        g2d.fillRect(94 + x, 47 + y, 1, 1);
        g2d.fillRect(97 + x, 47 + y, 1, 1);
        g2d.fillRect(105 + x, 47 + y, 1, 1);
        g2d.fillRect(93 + x, 48 + y, 1, 1);
        g2d.fillRect(99 + x, 48 + y, 1, 2);
        g2d.fillRect(101 + x, 48 + y, 1, 2);
        g2d.fillRect(104 + x, 48 + y, 1, 1);
        g2d.fillRect(112 + x, 48 + y, 1, 1);
        g2d.fillRect(114 + x, 48 + y, 2, 1);
        g2d.fillRect(118 + x, 48 + y, 1, 1);
        g2d.fillRect(102 + x, 49 + y, 1, 1);
        g2d.fillRect(119 + x, 49 + y, 1, 2);
        g2d.fillRect(103 + x, 50 + y, 1, 1);
        g2d.fillRect(111 + x, 50 + y, 1, 3);
        g2d.fillRect(113 + x, 50 + y, 1, 1);
        g2d.fillRect(121 + x, 50 + y, 1, 1);
        g2d.fillRect(101 + x, 51 + y, 2, 1);
        g2d.fillRect(104 + x, 51 + y, 1, 1);
        g2d.fillRect(112 + x, 51 + y, 1, 1);
        g2d.fillRect(113 + x, 52 + y, 1, 1);
        g2d.fillRect(103 + x, 53 + y, 1, 1);
        g2d.fillRect(105 + x, 53 + y, 1, 3);
        g2d.fillRect(112 + x, 54 + y, 1, 1);
        g2d.fillRect(103 + x, 55 + y, 1, 1);
        g2d.fillRect(111 + x, 55 + y, 1, 1);


        g2d.setColor(new Color(255, 255, 255, 255));
        g2d.fillRect(92 + x, 39 + y, 1, 5);
        g2d.fillRect(97 + x, 39 + y, 1, 1);
        g2d.fillRect(117 + x, 39 + y, 1, 1);
        g2d.fillRect(121 + x, 39 + y, 1, 4);
        g2d.fillRect(95 + x, 40 + y, 1, 4);
        g2d.fillRect(96 + x, 40 + y, 1, 1);
        g2d.fillRect(116 + x, 40 + y, 1, 1);
        g2d.fillRect(94 + x, 41 + y, 1, 6);
        g2d.fillRect(97 + x, 41 + y, 1, 3);
        g2d.fillRect(99 + x, 41 + y, 1, 4);
        g2d.fillRect(100 + x, 41 + y, 1, 11);
        g2d.fillRect(119 + x, 41 + y, 1, 2);
        g2d.fillRect(101 + x, 42 + y, 1, 6);
        g2d.fillRect(122 + x, 42 + y, 1, 2);
        g2d.fillRect(123 + x, 42 + y, 1, 1);
        g2d.fillRect(98 + x, 43 + y, 1, 1);
        g2d.fillRect(107 + x, 43 + y, 1, 1);
        g2d.fillRect(114 + x, 43 + y, 1, 2);
        g2d.fillRect(120 + x, 43 + y, 1, 7);
        g2d.fillRect(91 + x, 44 + y, 1, 1);
        g2d.fillRect(93 + x, 44 + y, 1, 1);
        g2d.fillRect(105 + x, 44 + y, 1, 2);
        g2d.fillRect(106 + x, 44 + y, 1, 1);
        g2d.fillRect(116 + x, 44 + y, 1, 5);
        g2d.fillRect(117 + x, 44 + y, 2, 1);
        g2d.fillRect(103 + x, 45 + y, 1, 4);
        g2d.fillRect(104 + x, 45 + y, 1, 1);
        g2d.fillRect(118 + x, 45 + y, 1, 2);
        g2d.fillRect(119 + x, 45 + y, 1, 4);
        g2d.fillRect(121 + x, 45 + y, 1, 2);
        g2d.fillRect(92 + x, 46 + y, 1, 1);
        g2d.fillRect(96 + x, 46 + y, 1, 3);
        g2d.fillRect(113 + x, 46 + y, 1, 4);
        g2d.fillRect(114 + x, 46 + y, 1, 2);
        g2d.fillRect(122 + x, 46 + y, 1, 1);
        g2d.fillRect(98 + x, 47 + y, 1, 3);
        g2d.fillRect(99 + x, 47 + y, 1, 1);
        g2d.fillRect(102 + x, 47 + y, 1, 2);
        g2d.fillRect(115 + x, 47 + y, 1, 1);
        g2d.fillRect(95 + x, 48 + y, 1, 2);
        g2d.fillRect(97 + x, 48 + y, 1, 1);
        g2d.fillRect(117 + x, 48 + y, 1, 1);
        g2d.fillRect(94 + x, 49 + y, 1, 1);
        g2d.fillRect(104 + x, 49 + y, 1, 2);
        g2d.fillRect(115 + x, 49 + y, 1, 1);
        g2d.fillRect(101 + x, 50 + y, 2, 1);
        g2d.fillRect(106 + x, 50 + y, 1, 1);
        g2d.fillRect(112 + x, 50 + y, 1, 1);
        g2d.fillRect(114 + x, 50 + y, 1, 2);
        g2d.fillRect(103 + x, 51 + y, 1, 2);
        g2d.fillRect(113 + x, 51 + y, 1, 1);
        g2d.fillRect(112 + x, 52 + y, 1, 2);
        g2d.fillRect(104 + x, 53 + y, 1, 1);
        g2d.fillRect(111 + x, 53 + y, 1, 1);
        g2d.fillRect(110 + x, 54 + y, 1, 2);
        g2d.fillRect(108 + x, 55 + y, 1, 1);

    }

    public void drawLower(int x, int y, GraphicsMap g2d) {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(110 + x, 55 + y, 1, 3);
        g2d.fillRect(110 + x, 59 + y, 1, 12);
        g2d.fillRect(110 + x, 72 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(117 + x, 51 + y, 1, 1);
        g2d.fillRect(118 + x, 53 + y, 1, 1);
        g2d.fillRect(92 + x, 54 + y, 3, 1);
        g2d.fillRect(98 + x, 54 + y, 1, 3);
        g2d.fillRect(99 + x, 55 + y, 1, 7);
        g2d.fillRect(118 + x, 57 + y, 1, 1);
        g2d.fillRect(122 + x, 57 + y, 1, 2);
        g2d.fillRect(90 + x, 58 + y, 1, 2);
        g2d.fillRect(100 + x, 58 + y, 1, 1);
        g2d.fillRect(111 + x, 58 + y, 1, 5);
        g2d.fillRect(112 + x, 58 + y, 1, 2);
        g2d.fillRect(116 + x, 58 + y, 2, 1);
        g2d.fillRect(103 + x, 59 + y, 4, 1);
        g2d.fillRect(113 + x, 59 + y, 2, 1);
        g2d.fillRect(121 + x, 59 + y, 1, 1);
        g2d.fillRect(91 + x, 60 + y, 1, 2);
        g2d.fillRect(109 + x, 60 + y, 1, 4);
        g2d.fillRect(117 + x, 60 + y, 1, 5);
        g2d.fillRect(92 + x, 61 + y, 1, 1);
        g2d.fillRect(116 + x, 63 + y, 1, 1);
        g2d.fillRect(90 + x, 64 + y, 1, 4);
        g2d.fillRect(100 + x, 64 + y, 1, 2);
        g2d.fillRect(119 + x, 65 + y, 3, 1);
        g2d.fillRect(101 + x, 67 + y, 1, 1);
        g2d.fillRect(91 + x, 68 + y, 4, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(112 + x, 51 + y, 1, 2);
        g2d.fillRect(111 + x, 53 + y, 1, 1);
        g2d.fillRect(114 + x, 68 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(94 + x, 45 + y, 1, 3);
        g2d.fillRect(96 + x, 45 + y, 1, 2);
        g2d.fillRect(98 + x, 45 + y, 1, 1);
        g2d.fillRect(93 + x, 46 + y, 1, 3);
        g2d.fillRect(95 + x, 46 + y, 1, 2);
        g2d.fillRect(97 + x, 46 + y, 1, 1);
        g2d.fillRect(99 + x, 46 + y, 1, 1);
        g2d.fillRect(119 + x, 46 + y, 1, 2);
        g2d.fillRect(120 + x, 46 + y, 1, 4);
        g2d.fillRect(92 + x, 47 + y, 1, 4);
        g2d.fillRect(118 + x, 47 + y, 1, 2);
        g2d.fillRect(117 + x, 48 + y, 1, 3);
        g2d.fillRect(115 + x, 49 + y, 1, 2);
        g2d.fillRect(91 + x, 50 + y, 1, 10);
        g2d.fillRect(98 + x, 50 + y, 1, 4);
        g2d.fillRect(114 + x, 50 + y, 1, 1);
        g2d.fillRect(116 + x, 50 + y, 1, 1);
        g2d.fillRect(121 + x, 50 + y, 1, 3);
        g2d.fillRect(105 + x, 51 + y, 1, 1);
        g2d.fillRect(118 + x, 51 + y, 1, 2);
        g2d.fillRect(99 + x, 52 + y, 1, 3);
        g2d.fillRect(100 + x, 52 + y, 1, 6);
        g2d.fillRect(106 + x, 52 + y, 2, 1);
        g2d.fillRect(119 + x, 52 + y, 1, 5);
        g2d.fillRect(95 + x, 53 + y, 1, 3);
        g2d.fillRect(96 + x, 53 + y, 1, 3);
        g2d.fillRect(97 + x, 53 + y, 1, 3);
        g2d.fillRect(108 + x, 53 + y, 1, 7);
        g2d.fillRect(122 + x, 53 + y, 1, 4);
        g2d.fillRect(109 + x, 54 + y, 1, 6);
        g2d.fillRect(110 + x, 54 + y, 1, 1);
        g2d.fillRect(118 + x, 54 + y, 1, 3);
        g2d.fillRect(93 + x, 55 + y, 2, 1);
        g2d.fillRect(101 + x, 55 + y, 1, 4);
        g2d.fillRect(111 + x, 55 + y, 1, 3);
        g2d.fillRect(117 + x, 56 + y, 1, 2);
        g2d.fillRect(90 + x, 57 + y, 1, 1);
        g2d.fillRect(92 + x, 57 + y, 1, 4);
        g2d.fillRect(98 + x, 57 + y, 1, 6);
        g2d.fillRect(102 + x, 57 + y, 1, 3);
        g2d.fillRect(112 + x, 57 + y, 1, 1);
        g2d.fillRect(116 + x, 57 + y, 1, 1);
        g2d.fillRect(103 + x, 58 + y, 5, 1);
        g2d.fillRect(110 + x, 58 + y, 1, 1);
        g2d.fillRect(113 + x, 58 + y, 3, 1);
        g2d.fillRect(121 + x, 58 + y, 1, 1);
        g2d.fillRect(97 + x, 59 + y, 1, 2);
        g2d.fillRect(100 + x, 59 + y, 1, 5);
        g2d.fillRect(107 + x, 59 + y, 1, 1);
        g2d.fillRect(115 + x, 59 + y, 1, 1);
        g2d.fillRect(117 + x, 59 + y, 1, 1);
        g2d.fillRect(122 + x, 59 + y, 1, 1);
        g2d.fillRect(93 + x, 60 + y, 1, 2);
        g2d.fillRect(96 + x, 60 + y, 1, 1);
        g2d.fillRect(112 + x, 60 + y, 1, 1);
        g2d.fillRect(121 + x, 60 + y, 1, 1);
        g2d.fillRect(123 + x, 60 + y, 1, 8);
        g2d.fillRect(94 + x, 61 + y, 2, 1);
        g2d.fillRect(118 + x, 61 + y, 1, 5);
        g2d.fillRect(119 + x, 61 + y, 1, 1);
        g2d.fillRect(90 + x, 62 + y, 1, 2);
        g2d.fillRect(91 + x, 62 + y, 1, 6);
        g2d.fillRect(97 + x, 62 + y, 1, 6);
        g2d.fillRect(99 + x, 62 + y, 1, 4);
        g2d.fillRect(101 + x, 63 + y, 1, 2);
        g2d.fillRect(102 + x, 63 + y, 1, 2);
        g2d.fillRect(103 + x, 63 + y, 1, 3);
        g2d.fillRect(107 + x, 63 + y, 1, 2);
        g2d.fillRect(108 + x, 63 + y, 1, 1);
        g2d.fillRect(111 + x, 63 + y, 1, 5);
        g2d.fillRect(113 + x, 63 + y, 1, 2);
        g2d.fillRect(114 + x, 63 + y, 2, 1);
        g2d.fillRect(122 + x, 63 + y, 1, 3);
        g2d.fillRect(104 + x, 64 + y, 3, 1);
        g2d.fillRect(109 + x, 64 + y, 1, 1);
        g2d.fillRect(112 + x, 64 + y, 1, 1);
        g2d.fillRect(119 + x, 64 + y, 1, 1);
        g2d.fillRect(121 + x, 64 + y, 1, 1);
        g2d.fillRect(116 + x, 65 + y, 1, 3);
        g2d.fillRect(117 + x, 65 + y, 1, 3);
        g2d.fillRect(92 + x, 66 + y, 1, 2);
        g2d.fillRect(96 + x, 66 + y, 1, 6);
        g2d.fillRect(100 + x, 66 + y, 3, 1);
        g2d.fillRect(119 + x, 66 + y, 1, 3);
        g2d.fillRect(120 + x, 66 + y, 1, 1);
        g2d.fillRect(93 + x, 67 + y, 1, 1);
        g2d.fillRect(102 + x, 67 + y, 2, 1);
        g2d.fillRect(115 + x, 67 + y, 1, 1);
        g2d.fillRect(95 + x, 68 + y, 1, 1);
        g2d.fillRect(103 + x, 68 + y, 7, 1);
        g2d.fillRect(112 + x, 68 + y, 2, 1);
        g2d.fillRect(120 + x, 68 + y, 3, 1);
        g2d.fillRect(92 + x, 69 + y, 1, 3);
        g2d.fillRect(93 + x, 71 + y, 3, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(106 + x, 65 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(96 + x, 47 + y, 1, 2);
        g2d.fillRect(97 + x, 47 + y, 1, 2);
        g2d.fillRect(98 + x, 47 + y, 1, 2);
        g2d.fillRect(99 + x, 47 + y, 1, 2);
        g2d.fillRect(100 + x, 47 + y, 1, 5);
        g2d.fillRect(94 + x, 48 + y, 1, 2);
        g2d.fillRect(119 + x, 48 + y, 1, 2);
        g2d.fillRect(93 + x, 49 + y, 1, 2);
        g2d.fillRect(118 + x, 49 + y, 1, 2);
        g2d.fillRect(97 + x, 50 + y, 1, 1);
        g2d.fillRect(99 + x, 50 + y, 1, 2);
        g2d.fillRect(120 + x, 50 + y, 1, 4);
        g2d.fillRect(92 + x, 51 + y, 1, 3);
        g2d.fillRect(101 + x, 51 + y, 1, 1);
        g2d.fillRect(119 + x, 51 + y, 1, 1);
        g2d.fillRect(96 + x, 52 + y, 2, 1);
        g2d.fillRect(93 + x, 53 + y, 2, 1);
        g2d.fillRect(101 + x, 53 + y, 1, 2);
        g2d.fillRect(102 + x, 53 + y, 1, 2);
        g2d.fillRect(106 + x, 53 + y, 2, 1);
        g2d.fillRect(117 + x, 53 + y, 1, 2);
        g2d.fillRect(121 + x, 53 + y, 1, 4);
        g2d.fillRect(107 + x, 54 + y, 1, 1);
        g2d.fillRect(92 + x, 55 + y, 1, 2);
        g2d.fillRect(116 + x, 55 + y, 1, 2);
        g2d.fillRect(120 + x, 55 + y, 1, 2);
        g2d.fillRect(94 + x, 56 + y, 2, 1);
        g2d.fillRect(97 + x, 56 + y, 1, 1);
        g2d.fillRect(102 + x, 56 + y, 2, 1);
        g2d.fillRect(107 + x, 56 + y, 1, 2);
        g2d.fillRect(103 + x, 57 + y, 2, 1);
        g2d.fillRect(106 + x, 57 + y, 1, 1);
        g2d.fillRect(114 + x, 57 + y, 2, 1);
        g2d.fillRect(119 + x, 57 + y, 1, 2);
        g2d.fillRect(93 + x, 58 + y, 1, 1);
        g2d.fillRect(118 + x, 59 + y, 1, 2);
        g2d.fillRect(120 + x, 59 + y, 1, 1);
        g2d.fillRect(94 + x, 60 + y, 1, 1);
        g2d.fillRect(101 + x, 60 + y, 2, 1);
        g2d.fillRect(104 + x, 60 + y, 2, 1);
        g2d.fillRect(115 + x, 60 + y, 2, 1);
        g2d.fillRect(119 + x, 60 + y, 1, 1);
        g2d.fillRect(122 + x, 60 + y, 1, 2);
        g2d.fillRect(116 + x, 61 + y, 1, 2);
        g2d.fillRect(120 + x, 61 + y, 1, 1);
        g2d.fillRect(101 + x, 62 + y, 3, 1);
        g2d.fillRect(114 + x, 62 + y, 2, 1);
        g2d.fillRect(119 + x, 62 + y, 1, 1);
        g2d.fillRect(92 + x, 63 + y, 1, 3);
        g2d.fillRect(104 + x, 63 + y, 3, 1);
        g2d.fillRect(121 + x, 63 + y, 1, 1);
        g2d.fillRect(96 + x, 64 + y, 1, 2);
        g2d.fillRect(115 + x, 64 + y, 2, 1);
        g2d.fillRect(120 + x, 64 + y, 1, 1);
        g2d.fillRect(102 + x, 65 + y, 1, 1);
        g2d.fillRect(95 + x, 66 + y, 1, 2);
        g2d.fillRect(103 + x, 66 + y, 1, 1);
        g2d.fillRect(113 + x, 66 + y, 1, 2);
        g2d.fillRect(114 + x, 66 + y, 1, 2);
        g2d.fillRect(115 + x, 66 + y, 1, 1);
        g2d.fillRect(94 + x, 67 + y, 1, 1);
        g2d.fillRect(104 + x, 67 + y, 2, 1);
        g2d.fillRect(107 + x, 67 + y, 1, 1);
        g2d.fillRect(121 + x, 67 + y, 2, 1);
        g2d.fillRect(111 + x, 68 + y, 1, 1);
        g2d.fillRect(95 + x, 69 + y, 1, 2);
        g2d.fillRect(93 + x, 70 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(95 + x, 48 + y, 1, 5);
        g2d.fillRect(101 + x, 48 + y, 1, 3);
        g2d.fillRect(96 + x, 49 + y, 1, 3);
        g2d.fillRect(97 + x, 49 + y, 3, 1);
        g2d.fillRect(94 + x, 50 + y, 1, 3);
        g2d.fillRect(102 + x, 50 + y, 1, 3);
        g2d.fillRect(119 + x, 50 + y, 1, 1);
        g2d.fillRect(93 + x, 51 + y, 1, 2);
        g2d.fillRect(97 + x, 51 + y, 1, 1);
        g2d.fillRect(103 + x, 51 + y, 1, 5);
        g2d.fillRect(104 + x, 51 + y, 1, 6);
        g2d.fillRect(113 + x, 51 + y, 4, 1);
        g2d.fillRect(101 + x, 52 + y, 1, 1);
        g2d.fillRect(105 + x, 52 + y, 1, 6);
        g2d.fillRect(114 + x, 52 + y, 1, 5);
        g2d.fillRect(115 + x, 52 + y, 1, 5);
        g2d.fillRect(116 + x, 52 + y, 1, 3);
        g2d.fillRect(117 + x, 52 + y, 1, 1);
        g2d.fillRect(112 + x, 53 + y, 1, 4);
        g2d.fillRect(113 + x, 53 + y, 1, 5);
        g2d.fillRect(106 + x, 54 + y, 1, 3);
        g2d.fillRect(111 + x, 54 + y, 1, 1);
        g2d.fillRect(120 + x, 54 + y, 1, 1);
        g2d.fillRect(102 + x, 55 + y, 1, 1);
        g2d.fillRect(107 + x, 55 + y, 1, 1);
        g2d.fillRect(117 + x, 55 + y, 1, 1);
        g2d.fillRect(93 + x, 56 + y, 1, 2);
        g2d.fillRect(96 + x, 56 + y, 1, 4);
        g2d.fillRect(94 + x, 57 + y, 1, 3);
        g2d.fillRect(95 + x, 57 + y, 1, 4);
        g2d.fillRect(97 + x, 57 + y, 1, 2);
        g2d.fillRect(120 + x, 57 + y, 1, 2);
        g2d.fillRect(121 + x, 57 + y, 1, 1);
        g2d.fillRect(118 + x, 58 + y, 1, 1);
        g2d.fillRect(93 + x, 59 + y, 1, 1);
        g2d.fillRect(101 + x, 59 + y, 1, 1);
        g2d.fillRect(116 + x, 59 + y, 1, 1);
        g2d.fillRect(119 + x, 59 + y, 1, 1);
        g2d.fillRect(103 + x, 60 + y, 1, 2);
        g2d.fillRect(106 + x, 60 + y, 1, 3);
        g2d.fillRect(107 + x, 60 + y, 1, 3);
        g2d.fillRect(108 + x, 60 + y, 1, 3);
        g2d.fillRect(113 + x, 60 + y, 1, 3);
        g2d.fillRect(114 + x, 60 + y, 1, 2);
        g2d.fillRect(120 + x, 60 + y, 1, 1);
        g2d.fillRect(96 + x, 61 + y, 1, 3);
        g2d.fillRect(97 + x, 61 + y, 1, 1);
        g2d.fillRect(101 + x, 61 + y, 2, 1);
        g2d.fillRect(104 + x, 61 + y, 1, 2);
        g2d.fillRect(105 + x, 61 + y, 1, 2);
        g2d.fillRect(112 + x, 61 + y, 1, 3);
        g2d.fillRect(115 + x, 61 + y, 1, 1);
        g2d.fillRect(121 + x, 61 + y, 1, 2);
        g2d.fillRect(92 + x, 62 + y, 4, 1);
        g2d.fillRect(120 + x, 62 + y, 1, 2);
        g2d.fillRect(122 + x, 62 + y, 1, 1);
        g2d.fillRect(93 + x, 63 + y, 1, 4);
        g2d.fillRect(94 + x, 63 + y, 1, 4);
        g2d.fillRect(95 + x, 63 + y, 1, 3);
        g2d.fillRect(119 + x, 63 + y, 1, 1);
        g2d.fillRect(108 + x, 64 + y, 1, 4);
        g2d.fillRect(114 + x, 64 + y, 1, 2);
        g2d.fillRect(101 + x, 65 + y, 1, 1);
        g2d.fillRect(104 + x, 65 + y, 1, 2);
        g2d.fillRect(105 + x, 65 + y, 1, 2);
        g2d.fillRect(107 + x, 65 + y, 1, 2);
        g2d.fillRect(109 + x, 65 + y, 1, 3);
        g2d.fillRect(112 + x, 65 + y, 1, 3);
        g2d.fillRect(113 + x, 65 + y, 1, 1);
        g2d.fillRect(115 + x, 65 + y, 1, 1);
        g2d.fillRect(106 + x, 66 + y, 1, 2);
        g2d.fillRect(121 + x, 66 + y, 2, 1);
        g2d.fillRect(120 + x, 67 + y, 1, 1);
        g2d.fillRect(93 + x, 69 + y, 2, 1);
    }

    public void drawB(int x, int y, GraphicsMap g2d) {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(110 + x, 55 + y, 1, 2);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(117 + x, 51 + y, 1, 1);
        g2d.fillRect(98 + x, 54 + y, 1, 3);
        g2d.fillRect(99 + x, 55 + y, 1, 3);
        g2d.fillRect(100 + x, 58 + y, 1, 1);
        g2d.fillRect(112 + x, 58 + y, 1, 1);
        g2d.fillRect(119 + x, 58 + y, 1, 1);
        g2d.fillRect(113 + x, 59 + y, 2, 1);
        g2d.fillRect(118 + x, 59 + y, 1, 1);
        g2d.fillRect(102 + x, 60 + y, 3, 1);
        g2d.fillRect(116 + x, 60 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(112 + x, 51 + y, 1, 2);
        g2d.fillRect(111 + x, 53 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(117 + x, 48 + y, 1, 3);
        g2d.fillRect(118 + x, 48 + y, 1, 2);
        g2d.fillRect(115 + x, 49 + y, 1, 2);
        g2d.fillRect(119 + x, 49 + y, 1, 2);
        g2d.fillRect(114 + x, 50 + y, 1, 1);
        g2d.fillRect(116 + x, 50 + y, 1, 1);
        g2d.fillRect(120 + x, 50 + y, 1, 3);
        g2d.fillRect(105 + x, 51 + y, 1, 1);
        g2d.fillRect(118 + x, 51 + y, 1, 1);
        g2d.fillRect(98 + x, 52 + y, 1, 2);
        g2d.fillRect(99 + x, 52 + y, 1, 3);
        g2d.fillRect(100 + x, 52 + y, 1, 6);
        g2d.fillRect(106 + x, 52 + y, 2, 1);
        g2d.fillRect(119 + x, 52 + y, 1, 1);
        g2d.fillRect(121 + x, 52 + y, 1, 3);
        g2d.fillRect(108 + x, 53 + y, 1, 6);
        g2d.fillRect(109 + x, 54 + y, 1, 4);
        g2d.fillRect(110 + x, 54 + y, 1, 1);
        g2d.fillRect(118 + x, 54 + y, 1, 1);
        g2d.fillRect(120 + x, 54 + y, 1, 4);
        g2d.fillRect(101 + x, 55 + y, 1, 4);
        g2d.fillRect(111 + x, 55 + y, 1, 3);
        g2d.fillRect(119 + x, 56 + y, 1, 2);
        g2d.fillRect(102 + x, 57 + y, 1, 3);
        g2d.fillRect(112 + x, 57 + y, 1, 1);
        g2d.fillRect(118 + x, 57 + y, 1, 1);
        g2d.fillRect(103 + x, 58 + y, 1, 2);
        g2d.fillRect(104 + x, 58 + y, 1, 2);
        g2d.fillRect(106 + x, 58 + y, 1, 2);
        g2d.fillRect(107 + x, 58 + y, 1, 2);
        g2d.fillRect(113 + x, 58 + y, 2, 1);
        g2d.fillRect(116 + x, 58 + y, 2, 1);
        g2d.fillRect(105 + x, 59 + y, 1, 1);
        g2d.fillRect(115 + x, 59 + y, 1, 1);
        g2d.fillRect(117 + x, 59 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(100 + x, 48 + y, 1, 4);
        g2d.fillRect(99 + x, 50 + y, 1, 2);
        g2d.fillRect(118 + x, 50 + y, 1, 1);
        g2d.fillRect(101 + x, 51 + y, 1, 1);
        g2d.fillRect(119 + x, 51 + y, 1, 1);
        g2d.fillRect(101 + x, 53 + y, 1, 2);
        g2d.fillRect(102 + x, 53 + y, 1, 2);
        g2d.fillRect(106 + x, 53 + y, 2, 1);
        g2d.fillRect(120 + x, 53 + y, 1, 1);
        g2d.fillRect(107 + x, 54 + y, 1, 1);
        g2d.fillRect(119 + x, 54 + y, 1, 2);
        g2d.fillRect(121 + x, 55 + y, 1, 1);
        g2d.fillRect(102 + x, 56 + y, 2, 1);
        g2d.fillRect(107 + x, 56 + y, 1, 2);
        g2d.fillRect(118 + x, 56 + y, 1, 1);
        g2d.fillRect(103 + x, 57 + y, 2, 1);
        g2d.fillRect(106 + x, 57 + y, 1, 1);
        g2d.fillRect(116 + x, 57 + y, 2, 1);
        g2d.fillRect(105 + x, 58 + y, 1, 1);
        g2d.fillRect(115 + x, 58 + y, 1, 1);
        g2d.fillRect(105 + x, 60 + y, 1, 1);
        g2d.fillRect(115 + x, 60 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(101 + x, 48 + y, 1, 3);
        g2d.fillRect(99 + x, 49 + y, 1, 1);
        g2d.fillRect(102 + x, 50 + y, 1, 3);
        g2d.fillRect(103 + x, 51 + y, 1, 5);
        g2d.fillRect(104 + x, 51 + y, 1, 6);
        g2d.fillRect(113 + x, 51 + y, 1, 7);
        g2d.fillRect(114 + x, 51 + y, 1, 7);
        g2d.fillRect(115 + x, 51 + y, 1, 7);
        g2d.fillRect(116 + x, 51 + y, 1, 6);
        g2d.fillRect(101 + x, 52 + y, 1, 1);
        g2d.fillRect(105 + x, 52 + y, 1, 6);
        g2d.fillRect(117 + x, 52 + y, 1, 5);
        g2d.fillRect(118 + x, 52 + y, 1, 2);
        g2d.fillRect(112 + x, 53 + y, 1, 4);
        g2d.fillRect(119 + x, 53 + y, 1, 1);
        g2d.fillRect(106 + x, 54 + y, 1, 3);
        g2d.fillRect(111 + x, 54 + y, 1, 1);
        g2d.fillRect(102 + x, 55 + y, 1, 1);
        g2d.fillRect(107 + x, 55 + y, 1, 1);
        g2d.fillRect(118 + x, 55 + y, 1, 1);
        g2d.fillRect(118 + x, 58 + y, 1, 1);
        g2d.fillRect(101 + x, 59 + y, 1, 1);
        g2d.fillRect(116 + x, 59 + y, 1, 1);
    }

    public void drawUpper(int x, int y, GraphicsMap g2d) {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        if (middle.equalsIgnoreCase("b")) {
            drawB(x, y, g2d);
        }
        drawFluff(x, 0, g2d);
        drawLower(x, 0, g2d);
    }

    public void paintVeryBack(int offsetX, int offsetY, GraphicsMap g2d) {
    }

    public void paintBack(int offsetX, int offsetY, GraphicsMap g2d) {
    }

    public void paintMiddle(int offsetX, int offsetY, GraphicsMap g2d) {
    }

    public void paintFront(int offsetX, int offsetY, GraphicsMap g2d) {
        drawUpper(offsetX, offsetY, g2d);
    }

    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d) {
    }

    public void paintStationaryFront(int offsetX, int offsetY, GraphicsMap g2d) {
    }
}
