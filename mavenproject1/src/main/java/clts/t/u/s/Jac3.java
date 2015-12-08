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

public class Jac3 extends SuperTU
{
    public Jac3()
    {
        super();
        containsTL = true;
    }

    /** Creates a new instance of GenericClothes */
    public Jac3(String middle)
    {
        super(middle);
        containsTL = true;
    }

    public Jac3(String middle, ColorArray colorSwitch)
    {
        super(middle, colorSwitch);
        containsTL = true;
    }

    public void drawSleevesLeft0(int x, int y, GraphicsMap g2d)
    {}
    public void drawSleevesRight0(int x, int y, GraphicsMap g2d)
    {}

    public void drawB(int x, int y, GraphicsMap g2d)
    {
        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_6));
        g2d.fillRect(106 + x, 71 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_5));
        g2d.fillRect(102 + x, 38 + y, 1, 1);
        g2d.fillRect(114 + x, 40 + y, 1, 1);
        g2d.fillRect(104 + x, 41 + y, 1, 2);
        g2d.fillRect(96 + x, 44 + y, 1, 1);
        g2d.fillRect(119 + x, 44 + y, 1, 1);
        g2d.fillRect(118 + x, 45 + y, 1, 1);
        g2d.fillRect(98 + x, 46 + y, 1, 1);
        g2d.fillRect(103 + x, 46 + y, 1, 1);
        g2d.fillRect(114 + x, 46 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_4));
        g2d.fillRect(107 + x, 70 + y, 1, 1);
        g2d.fillRect(112 + x, 70 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_3));
        g2d.fillRect(103 + x, 38 + y, 1, 1);
        g2d.fillRect(99 + x, 39 + y, 2, 1);
        g2d.fillRect(102 + x, 39 + y, 1, 2);
        g2d.fillRect(104 + x, 39 + y, 1, 2);
        g2d.fillRect(115 + x, 39 + y, 1, 1);
        g2d.fillRect(100 + x, 40 + y, 1, 1);
        g2d.fillRect(116 + x, 40 + y, 1, 1);
        g2d.fillRect(97 + x, 41 + y, 1, 2);
        g2d.fillRect(99 + x, 41 + y, 1, 1);
        g2d.fillRect(101 + x, 41 + y, 1, 1);
        g2d.fillRect(112 + x, 41 + y, 1, 3);
        g2d.fillRect(114 + x, 41 + y, 1, 2);
        g2d.fillRect(117 + x, 41 + y, 2, 1);
        g2d.fillRect(95 + x, 42 + y, 1, 4);
        g2d.fillRect(96 + x, 42 + y, 1, 1);
        g2d.fillRect(103 + x, 42 + y, 1, 4);
        g2d.fillRect(119 + x, 42 + y, 1, 1);
        g2d.fillRect(100 + x, 43 + y, 2, 1);
        g2d.fillRect(104 + x, 43 + y, 1, 3);
        g2d.fillRect(113 + x, 43 + y, 1, 1);
        g2d.fillRect(97 + x, 44 + y, 1, 1);
        g2d.fillRect(101 + x, 44 + y, 2, 1);
        g2d.fillRect(105 + x, 44 + y, 1, 1);
        g2d.fillRect(114 + x, 44 + y, 1, 1);
        g2d.fillRect(116 + x, 44 + y, 1, 2);
        g2d.fillRect(120 + x, 44 + y, 1, 2);
        g2d.fillRect(96 + x, 45 + y, 1, 1);
        g2d.fillRect(99 + x, 45 + y, 2, 1);
        g2d.fillRect(113 + x, 45 + y, 1, 1);
        g2d.fillRect(115 + x, 45 + y, 1, 1);
        g2d.fillRect(117 + x, 45 + y, 1, 1);
        g2d.fillRect(97 + x, 46 + y, 1, 1);
        g2d.fillRect(100 + x, 46 + y, 1, 2);
        g2d.fillRect(102 + x, 46 + y, 1, 1);
        g2d.fillRect(98 + x, 47 + y, 2, 1);
        g2d.fillRect(101 + x, 47 + y, 1, 2);
        g2d.fillRect(103 + x, 47 + y, 2, 1);
        g2d.fillRect(99 + x, 48 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_2));
        g2d.fillRect(101 + x, 38 + y, 1, 1);
        g2d.fillRect(103 + x, 39 + y, 1, 3);
        g2d.fillRect(114 + x, 39 + y, 1, 1);
        g2d.fillRect(98 + x, 40 + y, 1, 1);
        g2d.fillRect(101 + x, 40 + y, 1, 1);
        g2d.fillRect(113 + x, 40 + y, 1, 3);
        g2d.fillRect(115 + x, 40 + y, 1, 5);
        g2d.fillRect(96 + x, 41 + y, 1, 1);
        g2d.fillRect(102 + x, 41 + y, 1, 3);
        g2d.fillRect(98 + x, 42 + y, 1, 3);
        g2d.fillRect(100 + x, 42 + y, 2, 1);
        g2d.fillRect(117 + x, 42 + y, 1, 1);
        g2d.fillRect(96 + x, 43 + y, 1, 1);
        g2d.fillRect(114 + x, 43 + y, 1, 1);
        g2d.fillRect(116 + x, 43 + y, 1, 1);
        g2d.fillRect(118 + x, 43 + y, 2, 1);
        g2d.fillRect(99 + x, 44 + y, 2, 1);
        g2d.fillRect(113 + x, 44 + y, 1, 1);
        g2d.fillRect(117 + x, 44 + y, 1, 1);
        g2d.fillRect(97 + x, 45 + y, 1, 1);
        g2d.fillRect(101 + x, 45 + y, 1, 2);
        g2d.fillRect(102 + x, 45 + y, 1, 1);
        g2d.fillRect(114 + x, 45 + y, 1, 1);
        g2d.fillRect(119 + x, 45 + y, 1, 1);
        g2d.fillRect(96 + x, 46 + y, 1, 1);
        g2d.fillRect(99 + x, 46 + y, 1, 1);
        g2d.fillRect(97 + x, 47 + y, 1, 1);
        g2d.fillRect(98 + x, 48 + y, 1, 1);
        g2d.fillRect(100 + x, 48 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(102 + x, 47 + y, 1, 1);
        g2d.fillRect(104 + x, 49 + y, 2, 1);
        g2d.fillRect(106 + x, 50 + y, 1, 1);
        g2d.fillRect(98 + x, 57 + y, 1, 1);
        g2d.fillRect(121 + x, 58 + y, 1, 1);
        g2d.fillRect(99 + x, 59 + y, 1, 2);
        g2d.fillRect(113 + x, 59 + y, 1, 1);
        g2d.fillRect(120 + x, 59 + y, 1, 1);
        g2d.fillRect(106 + x, 60 + y, 1, 1);
        g2d.fillRect(119 + x, 60 + y, 1, 1);
        g2d.fillRect(108 + x, 61 + y, 1, 1);
        g2d.fillRect(111 + x, 61 + y, 1, 1);
        g2d.fillRect(113 + x, 61 + y, 1, 1);
        g2d.fillRect(111 + x, 71 + y, 1, 2);
        g2d.fillRect(119 + x, 75 + y, 1, 2);
        g2d.fillRect(120 + x, 76 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(94 + x, 43 + y, 1, 1);
        g2d.fillRect(121 + x, 44 + y, 1, 2);
        g2d.fillRect(93 + x, 45 + y, 1, 1);
        g2d.fillRect(106 + x, 45 + y, 1, 1);
        g2d.fillRect(113 + x, 46 + y, 1, 2);
        g2d.fillRect(116 + x, 46 + y, 5, 1);
        g2d.fillRect(118 + x, 47 + y, 1, 1);
        g2d.fillRect(120 + x, 47 + y, 1, 4);
        g2d.fillRect(103 + x, 48 + y, 3, 1);
        g2d.fillRect(109 + x, 48 + y, 1, 1);
        g2d.fillRect(112 + x, 48 + y, 1, 1);
        g2d.fillRect(117 + x, 48 + y, 1, 1);
        g2d.fillRect(106 + x, 49 + y, 1, 1);
        g2d.fillRect(110 + x, 49 + y, 1, 1);
        g2d.fillRect(116 + x, 49 + y, 1, 1);
        g2d.fillRect(107 + x, 50 + y, 1, 1);
        g2d.fillRect(111 + x, 50 + y, 1, 1);
        g2d.fillRect(115 + x, 50 + y, 1, 1);
        g2d.fillRect(108 + x, 51 + y, 1, 1);
        g2d.fillRect(112 + x, 51 + y, 1, 2);
        g2d.fillRect(99 + x, 52 + y, 1, 7);
        g2d.fillRect(109 + x, 52 + y, 1, 1);
        g2d.fillRect(114 + x, 52 + y, 1, 1);
        g2d.fillRect(121 + x, 52 + y, 1, 1);
        g2d.fillRect(112 + x, 54 + y, 2, 1);
        g2d.fillRect(113 + x, 55 + y, 1, 1);
        g2d.fillRect(98 + x, 56 + y, 1, 1);
        g2d.fillRect(121 + x, 56 + y, 1, 2);
        g2d.fillRect(98 + x, 58 + y, 1, 7);
        g2d.fillRect(120 + x, 58 + y, 1, 1);
        g2d.fillRect(100 + x, 59 + y, 1, 4);
        g2d.fillRect(119 + x, 59 + y, 1, 1);
        g2d.fillRect(118 + x, 60 + y, 1, 2);
        g2d.fillRect(117 + x, 61 + y, 1, 1);
        g2d.fillRect(115 + x, 64 + y, 1, 6);
        g2d.fillRect(117 + x, 65 + y, 1, 4);
        g2d.fillRect(101 + x, 66 + y, 1, 3);
        g2d.fillRect(92 + x, 69 + y, 1, 4);
        g2d.fillRect(114 + x, 70 + y, 1, 9);
        g2d.fillRect(124 + x, 71 + y, 1, 1);
        g2d.fillRect(97 + x, 72 + y, 1, 2);
        g2d.fillRect(118 + x, 72 + y, 1, 1);
        g2d.fillRect(120 + x, 72 + y, 1, 1);
        g2d.fillRect(101 + x, 73 + y, 1, 3);
        g2d.fillRect(119 + x, 73 + y, 1, 2);
        g2d.fillRect(91 + x, 74 + y, 1, 2);
        g2d.fillRect(92 + x, 74 + y, 1, 2);
        g2d.fillRect(124 + x, 74 + y, 2, 1);
        g2d.fillRect(97 + x, 75 + y, 1, 3);
        g2d.fillRect(120 + x, 75 + y, 2, 1);
        g2d.fillRect(125 + x, 75 + y, 1, 1);
        g2d.fillRect(96 + x, 76 + y, 1, 1);
        g2d.fillRect(100 + x, 76 + y, 1, 2);
        g2d.fillRect(118 + x, 77 + y, 3, 1);
        g2d.fillRect(96 + x, 78 + y, 1, 2);
        g2d.fillRect(103 + x, 78 + y, 1, 1);
        g2d.fillRect(113 + x, 78 + y, 1, 1);
        g2d.fillRect(117 + x, 78 + y, 1, 1);
        g2d.fillRect(119 + x, 78 + y, 3, 1);
        g2d.fillRect(94 + x, 79 + y, 2, 1);
        g2d.fillRect(97 + x, 79 + y, 1, 1);
        g2d.fillRect(106 + x, 79 + y, 1, 1);
        g2d.fillRect(125 + x, 79 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_1));
        g2d.fillRect(108 + x, 60 + y, 1, 1);
        g2d.fillRect(113 + x, 60 + y, 1, 1);
        g2d.fillRect(107 + x, 61 + y, 1, 1);
        g2d.fillRect(112 + x, 61 + y, 1, 1);
        g2d.fillRect(108 + x, 71 + y, 1, 1);
        g2d.fillRect(113 + x, 71 + y, 1, 1);
        g2d.fillRect(107 + x, 72 + y, 1, 1);
        g2d.fillRect(112 + x, 72 + y, 1, 1);
        g2d.fillRect(119 + x, 72 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_2));
        g2d.fillRect(101 + x, 39 + y, 1, 1);
        g2d.fillRect(99 + x, 40 + y, 1, 1);
        g2d.fillRect(117 + x, 40 + y, 1, 1);
        g2d.fillRect(98 + x, 41 + y, 1, 1);
        g2d.fillRect(100 + x, 41 + y, 1, 1);
        g2d.fillRect(116 + x, 41 + y, 1, 2);
        g2d.fillRect(99 + x, 42 + y, 1, 2);
        g2d.fillRect(118 + x, 42 + y, 1, 1);
        g2d.fillRect(97 + x, 43 + y, 1, 1);
        g2d.fillRect(117 + x, 43 + y, 1, 1);
        g2d.fillRect(120 + x, 43 + y, 1, 1);
        g2d.fillRect(118 + x, 44 + y, 1, 1);
        g2d.fillRect(98 + x, 45 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_3));
        g2d.fillRect(94 + x, 44 + y, 1, 2);
        g2d.fillRect(105 + x, 45 + y, 1, 1);
        g2d.fillRect(93 + x, 46 + y, 1, 2);
        g2d.fillRect(107 + x, 46 + y, 1, 1);
        g2d.fillRect(108 + x, 47 + y, 1, 1);
        g2d.fillRect(119 + x, 47 + y, 1, 5);
        g2d.fillRect(102 + x, 48 + y, 1, 2);
        g2d.fillRect(93 + x, 49 + y, 1, 3);
        g2d.fillRect(103 + x, 49 + y, 1, 1);
        g2d.fillRect(109 + x, 49 + y, 1, 1);
        g2d.fillRect(112 + x, 49 + y, 1, 2);
        g2d.fillRect(99 + x, 50 + y, 1, 2);
        g2d.fillRect(110 + x, 50 + y, 1, 1);
        g2d.fillRect(107 + x, 51 + y, 1, 1);
        g2d.fillRect(111 + x, 51 + y, 1, 2);
        g2d.fillRect(114 + x, 51 + y, 1, 1);
        g2d.fillRect(120 + x, 51 + y, 1, 2);
        g2d.fillRect(121 + x, 51 + y, 1, 1);
        g2d.fillRect(113 + x, 52 + y, 1, 2);
        g2d.fillRect(98 + x, 53 + y, 1, 3);
        g2d.fillRect(110 + x, 53 + y, 1, 1);
        g2d.fillRect(112 + x, 53 + y, 1, 1);
        g2d.fillRect(121 + x, 53 + y, 1, 3);
        g2d.fillRect(111 + x, 54 + y, 1, 1);
        g2d.fillRect(112 + x, 55 + y, 1, 1);
        g2d.fillRect(120 + x, 55 + y, 1, 3);
        g2d.fillRect(97 + x, 56 + y, 1, 16);
        g2d.fillRect(100 + x, 56 + y, 1, 3);
        g2d.fillRect(113 + x, 56 + y, 2, 1);
        g2d.fillRect(114 + x, 57 + y, 1, 3);
        g2d.fillRect(119 + x, 58 + y, 1, 1);
        g2d.fillRect(115 + x, 60 + y, 1, 4);
        g2d.fillRect(101 + x, 61 + y, 1, 5);
        g2d.fillRect(117 + x, 62 + y, 1, 3);
        g2d.fillRect(116 + x, 63 + y, 1, 16);
        g2d.fillRect(93 + x, 64 + y, 1, 10);
        g2d.fillRect(118 + x, 65 + y, 1, 7);
        g2d.fillRect(102 + x, 66 + y, 1, 4);
        g2d.fillRect(96 + x, 67 + y, 1, 7);
        g2d.fillRect(119 + x, 67 + y, 1, 5);
        g2d.fillRect(117 + x, 69 + y, 1, 2);
        g2d.fillRect(115 + x, 70 + y, 1, 9);
        g2d.fillRect(102 + x, 72 + y, 1, 4);
        g2d.fillRect(124 + x, 72 + y, 1, 2);
        g2d.fillRect(91 + x, 73 + y, 2, 1);
        g2d.fillRect(120 + x, 73 + y, 1, 2);
        g2d.fillRect(121 + x, 73 + y, 3, 1);
        g2d.fillRect(97 + x, 74 + y, 1, 1);
        g2d.fillRect(122 + x, 75 + y, 1, 1);
        g2d.fillRect(91 + x, 76 + y, 1, 1);
        g2d.fillRect(101 + x, 76 + y, 1, 2);
        g2d.fillRect(113 + x, 76 + y, 1, 2);
        g2d.fillRect(121 + x, 76 + y, 1, 1);
        g2d.fillRect(123 + x, 76 + y, 2, 1);
        g2d.fillRect(90 + x, 77 + y, 1, 2);
        g2d.fillRect(95 + x, 77 + y, 2, 1);
        g2d.fillRect(125 + x, 77 + y, 1, 2);
        g2d.fillRect(91 + x, 78 + y, 1, 1);
        g2d.fillRect(112 + x, 78 + y, 1, 2);
        g2d.fillRect(122 + x, 78 + y, 1, 1);
        g2d.fillRect(92 + x, 79 + y, 2, 1);
        g2d.fillRect(109 + x, 79 + y, 3, 1);
        g2d.fillRect(123 + x, 79 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_4));
        g2d.fillRect(94 + x, 46 + y, 1, 3);
        g2d.fillRect(95 + x, 46 + y, 1, 1);
        g2d.fillRect(104 + x, 46 + y, 1, 1);
        g2d.fillRect(96 + x, 47 + y, 1, 1);
        g2d.fillRect(105 + x, 47 + y, 1, 1);
        g2d.fillRect(114 + x, 47 + y, 1, 3);
        g2d.fillRect(115 + x, 47 + y, 1, 2);
        g2d.fillRect(116 + x, 47 + y, 1, 1);
        g2d.fillRect(95 + x, 48 + y, 1, 2);
        g2d.fillRect(106 + x, 48 + y, 1, 1);
        g2d.fillRect(113 + x, 48 + y, 1, 4);
        g2d.fillRect(118 + x, 48 + y, 1, 4);
        g2d.fillRect(96 + x, 49 + y, 1, 2);
        g2d.fillRect(99 + x, 49 + y, 3, 1);
        g2d.fillRect(107 + x, 49 + y, 1, 1);
        g2d.fillRect(117 + x, 49 + y, 1, 2);
        g2d.fillRect(94 + x, 50 + y, 1, 2);
        g2d.fillRect(97 + x, 50 + y, 1, 6);
        g2d.fillRect(98 + x, 50 + y, 1, 3);
        g2d.fillRect(100 + x, 50 + y, 1, 6);
        g2d.fillRect(101 + x, 50 + y, 1, 11);
        g2d.fillRect(102 + x, 50 + y, 4, 1);
        g2d.fillRect(108 + x, 50 + y, 2, 1);
        g2d.fillRect(103 + x, 51 + y, 4, 1);
        g2d.fillRect(109 + x, 51 + y, 2, 1);
        g2d.fillRect(115 + x, 51 + y, 1, 4);
        g2d.fillRect(116 + x, 51 + y, 1, 6);
        g2d.fillRect(93 + x, 52 + y, 1, 12);
        g2d.fillRect(96 + x, 52 + y, 1, 15);
        g2d.fillRect(105 + x, 52 + y, 4, 1);
        g2d.fillRect(110 + x, 52 + y, 1, 1);
        g2d.fillRect(117 + x, 52 + y, 1, 1);
        g2d.fillRect(119 + x, 52 + y, 1, 6);
        g2d.fillRect(106 + x, 53 + y, 4, 1);
        g2d.fillRect(111 + x, 53 + y, 1, 1);
        g2d.fillRect(114 + x, 53 + y, 1, 3);
        g2d.fillRect(118 + x, 53 + y, 1, 1);
        g2d.fillRect(120 + x, 53 + y, 1, 2);
        g2d.fillRect(107 + x, 54 + y, 2, 1);
        g2d.fillRect(110 + x, 54 + y, 1, 1);
        g2d.fillRect(117 + x, 54 + y, 1, 2);
        g2d.fillRect(108 + x, 55 + y, 2, 1);
        g2d.fillRect(111 + x, 55 + y, 1, 1);
        g2d.fillRect(109 + x, 56 + y, 1, 1);
        g2d.fillRect(112 + x, 56 + y, 1, 1);
        g2d.fillRect(113 + x, 57 + y, 1, 2);
        g2d.fillRect(95 + x, 59 + y, 1, 16);
        g2d.fillRect(102 + x, 59 + y, 1, 7);
        g2d.fillRect(103 + x, 59 + y, 1, 19);
        g2d.fillRect(104 + x, 59 + y, 1, 2);
        g2d.fillRect(105 + x, 59 + y, 1, 2);
        g2d.fillRect(106 + x, 59 + y, 7, 1);
        g2d.fillRect(115 + x, 59 + y, 4, 1);
        g2d.fillRect(121 + x, 59 + y, 1, 2);
        g2d.fillRect(109 + x, 60 + y, 2, 1);
        g2d.fillRect(116 + x, 60 + y, 1, 3);
        g2d.fillRect(117 + x, 60 + y, 1, 1);
        g2d.fillRect(119 + x, 61 + y, 1, 6);
        g2d.fillRect(112 + x, 62 + y, 1, 8);
        g2d.fillRect(113 + x, 62 + y, 1, 9);
        g2d.fillRect(118 + x, 62 + y, 1, 3);
        g2d.fillRect(111 + x, 63 + y, 1, 2);
        g2d.fillRect(122 + x, 63 + y, 1, 1);
        g2d.fillRect(94 + x, 64 + y, 1, 4);
        g2d.fillRect(110 + x, 64 + y, 1, 2);
        g2d.fillRect(109 + x, 65 + y, 1, 2);
        g2d.fillRect(120 + x, 65 + y, 1, 7);
        g2d.fillRect(108 + x, 66 + y, 1, 2);
        g2d.fillRect(107 + x, 67 + y, 1, 3);
        g2d.fillRect(106 + x, 68 + y, 1, 3);
        g2d.fillRect(121 + x, 68 + y, 1, 5);
        g2d.fillRect(94 + x, 70 + y, 1, 1);
        g2d.fillRect(102 + x, 70 + y, 1, 2);
        g2d.fillRect(108 + x, 70 + y, 4, 1);
        g2d.fillRect(109 + x, 71 + y, 1, 4);
        g2d.fillRect(110 + x, 71 + y, 1, 8);
        g2d.fillRect(117 + x, 71 + y, 1, 6);
        g2d.fillRect(122 + x, 71 + y, 1, 1);
        g2d.fillRect(106 + x, 72 + y, 1, 2);
        g2d.fillRect(108 + x, 72 + y, 1, 3);
        g2d.fillRect(113 + x, 72 + y, 1, 1);
        g2d.fillRect(111 + x, 73 + y, 1, 4);
        g2d.fillRect(112 + x, 73 + y, 1, 3);
        g2d.fillRect(96 + x, 74 + y, 1, 1);
        g2d.fillRect(107 + x, 74 + y, 1, 2);
        g2d.fillRect(123 + x, 74 + y, 1, 1);
        g2d.fillRect(94 + x, 75 + y, 1, 1);
        g2d.fillRect(104 + x, 75 + y, 1, 2);
        g2d.fillRect(106 + x, 75 + y, 1, 1);
        g2d.fillRect(95 + x, 76 + y, 1, 1);
        g2d.fillRect(102 + x, 76 + y, 1, 2);
        g2d.fillRect(105 + x, 76 + y, 1, 1);
        g2d.fillRect(122 + x, 76 + y, 1, 2);
        g2d.fillRect(93 + x, 77 + y, 2, 1);
        g2d.fillRect(121 + x, 77 + y, 1, 1);
        g2d.fillRect(92 + x, 78 + y, 1, 1);
        g2d.fillRect(104 + x, 78 + y, 6, 1);
        g2d.fillRect(111 + x, 78 + y, 1, 1);
        g2d.fillRect(123 + x, 78 + y, 2, 1);
        g2d.fillRect(107 + x, 79 + y, 2, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY_5));
        g2d.fillRect(105 + x, 46 + y, 2, 1);
        g2d.fillRect(95 + x, 47 + y, 1, 1);
        g2d.fillRect(106 + x, 47 + y, 2, 1);
        g2d.fillRect(117 + x, 47 + y, 1, 1);
        g2d.fillRect(93 + x, 48 + y, 1, 1);
        g2d.fillRect(96 + x, 48 + y, 2, 1);
        g2d.fillRect(107 + x, 48 + y, 2, 1);
        g2d.fillRect(116 + x, 48 + y, 1, 1);
        g2d.fillRect(94 + x, 49 + y, 1, 1);
        g2d.fillRect(97 + x, 49 + y, 2, 1);
        g2d.fillRect(108 + x, 49 + y, 1, 1);
        g2d.fillRect(115 + x, 49 + y, 1, 1);
        g2d.fillRect(95 + x, 50 + y, 1, 9);
        g2d.fillRect(114 + x, 50 + y, 1, 1);
        g2d.fillRect(116 + x, 50 + y, 1, 1);
        g2d.fillRect(96 + x, 51 + y, 1, 1);
        g2d.fillRect(102 + x, 51 + y, 1, 8);
        g2d.fillRect(117 + x, 51 + y, 1, 1);
        g2d.fillRect(94 + x, 52 + y, 1, 12);
        g2d.fillRect(103 + x, 52 + y, 1, 7);
        g2d.fillRect(104 + x, 52 + y, 1, 7);
        g2d.fillRect(118 + x, 52 + y, 1, 1);
        g2d.fillRect(105 + x, 53 + y, 1, 6);
        g2d.fillRect(117 + x, 53 + y, 1, 1);
        g2d.fillRect(106 + x, 54 + y, 1, 5);
        g2d.fillRect(109 + x, 54 + y, 1, 1);
        g2d.fillRect(118 + x, 54 + y, 1, 5);
        g2d.fillRect(107 + x, 55 + y, 1, 4);
        g2d.fillRect(110 + x, 55 + y, 1, 4);
        g2d.fillRect(115 + x, 55 + y, 1, 4);
        g2d.fillRect(108 + x, 56 + y, 1, 3);
        g2d.fillRect(111 + x, 56 + y, 1, 3);
        g2d.fillRect(117 + x, 56 + y, 1, 3);
        g2d.fillRect(109 + x, 57 + y, 1, 2);
        g2d.fillRect(112 + x, 57 + y, 1, 2);
        g2d.fillRect(116 + x, 57 + y, 1, 2);
        g2d.fillRect(107 + x, 60 + y, 1, 1);
        g2d.fillRect(111 + x, 60 + y, 2, 1);
        g2d.fillRect(114 + x, 60 + y, 1, 10);
        g2d.fillRect(120 + x, 60 + y, 1, 5);
        g2d.fillRect(104 + x, 61 + y, 1, 14);
        g2d.fillRect(105 + x, 61 + y, 1, 15);
        g2d.fillRect(106 + x, 61 + y, 1, 7);
        g2d.fillRect(109 + x, 61 + y, 1, 4);
        g2d.fillRect(110 + x, 61 + y, 1, 3);
        g2d.fillRect(121 + x, 61 + y, 1, 7);
        g2d.fillRect(107 + x, 62 + y, 1, 5);
        g2d.fillRect(108 + x, 62 + y, 1, 4);
        g2d.fillRect(111 + x, 62 + y, 1, 1);
        g2d.fillRect(122 + x, 64 + y, 1, 7);
        g2d.fillRect(111 + x, 65 + y, 1, 5);
        g2d.fillRect(110 + x, 66 + y, 1, 4);
        g2d.fillRect(109 + x, 67 + y, 1, 3);
        g2d.fillRect(94 + x, 68 + y, 1, 2);
        g2d.fillRect(108 + x, 68 + y, 1, 2);
        g2d.fillRect(123 + x, 68 + y, 1, 5);
        g2d.fillRect(94 + x, 71 + y, 1, 4);
        g2d.fillRect(107 + x, 71 + y, 1, 1);
        g2d.fillRect(112 + x, 71 + y, 1, 1);
        g2d.fillRect(122 + x, 72 + y, 1, 1);
        g2d.fillRect(107 + x, 73 + y, 1, 1);
        g2d.fillRect(113 + x, 73 + y, 1, 3);
        g2d.fillRect(118 + x, 73 + y, 1, 4);
        g2d.fillRect(93 + x, 74 + y, 1, 3);
        g2d.fillRect(106 + x, 74 + y, 1, 1);
        g2d.fillRect(121 + x, 74 + y, 2, 1);
        g2d.fillRect(95 + x, 75 + y, 2, 1);
        g2d.fillRect(108 + x, 75 + y, 1, 3);
        g2d.fillRect(109 + x, 75 + y, 1, 3);
        g2d.fillRect(123 + x, 75 + y, 2, 1);
        g2d.fillRect(92 + x, 76 + y, 1, 2);
        g2d.fillRect(94 + x, 76 + y, 1, 1);
        g2d.fillRect(106 + x, 76 + y, 1, 2);
        g2d.fillRect(107 + x, 76 + y, 1, 2);
        g2d.fillRect(112 + x, 76 + y, 1, 2);
        g2d.fillRect(125 + x, 76 + y, 1, 1);
        g2d.fillRect(91 + x, 77 + y, 1, 1);
        g2d.fillRect(104 + x, 77 + y, 2, 1);
        g2d.fillRect(111 + x, 77 + y, 1, 1);
        g2d.fillRect(117 + x, 77 + y, 1, 1);
        g2d.fillRect(123 + x, 77 + y, 2, 1);
        g2d.fillRect(93 + x, 78 + y, 3, 1);
    }

    public void drawUpper(int x, int y, GraphicsMap g2d)
    {
        g2d.setColorSpray(colorSprayHue, colorSpraySaturation, colorSprayBrightness, colorSprayType, colorSprayFrequency);
        if(middle.equalsIgnoreCase("b"))
        {
            drawB(x,0,g2d);
        }
    }

    public void paintVeryBack(int offsetX, int offsetY, GraphicsMap g2d) {
    }

    public void paintBack(int offsetX, int offsetY, GraphicsMap g2d) {
    }

    public void paintMiddle(int offsetX, int offsetY, GraphicsMap g2d)
    {
    }

    public void paintFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
        drawUpper(offsetX, offsetY, g2d);
    }

    public void paintVeryFront(int offsetX, int offsetY, GraphicsMap g2d) {
    }

    public void paintStationaryFront(int offsetX, int offsetY, GraphicsMap g2d)
    {
    }
}
