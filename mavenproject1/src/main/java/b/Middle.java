/*
 * Middle.java
 *
 * Created on March 29, 2007, 4:11 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package b;

import util.GraphicsMap;

/**
 *
 * @author doubleD
 */
public class Middle {
    String size = "c";
    /** Creates a new instance of Middle */
    public Middle(String size, Bd b)
    {
        this.size = size;
        this.b = b;
    }
    Bd b = null;

    void paint(int x, int y, GraphicsMap g2d)
    {
        if(size.equalsIgnoreCase("b"))
        {
            g2d.setColor(b.outlineColor);
            g2d.fillRect(101 + x, 47 + y, 1, 1);
            g2d.fillRect(113 + x, 47 + y, 1, 1);
            g2d.fillRect(100 + x, 48 + y, 1, 1);
            g2d.fillRect(108 + x, 48 + y, 1, 1);
            g2d.fillRect(112 + x, 48 + y, 1, 1);
            g2d.fillRect(118 + x, 48 + y, 1, 1);
            g2d.fillRect(99 + x, 49 + y, 1, 3);
            g2d.fillRect(109 + x, 49 + y, 1, 1);
            g2d.fillRect(111 + x, 49 + y, 1, 1);
            g2d.fillRect(119 + x, 49 + y, 1, 1);
            g2d.fillRect(110 + x, 50 + y, 1, 7);
            g2d.fillRect(120 + x, 50 + y, 1, 2);
            g2d.fillRect(98 + x, 52 + y, 1, 5);
            g2d.fillRect(121 + x, 52 + y, 1, 4);
            g2d.fillRect(104 + x, 53 + y, 1, 1);
            g2d.fillRect(116 + x, 53 + y, 1, 1);
            g2d.fillRect(120 + x, 56 + y, 1, 2);
            g2d.fillRect(99 + x, 57 + y, 1, 1);
            g2d.fillRect(109 + x, 57 + y, 1, 1);
            g2d.fillRect(111 + x, 57 + y, 1, 1);
            g2d.fillRect(100 + x, 58 + y, 1, 1);
            g2d.fillRect(108 + x, 58 + y, 1, 1);
            g2d.fillRect(112 + x, 58 + y, 1, 1);
            g2d.fillRect(119 + x, 58 + y, 1, 1);
            g2d.fillRect(101 + x, 59 + y, 1, 1);
            g2d.fillRect(106 + x, 59 + y, 2, 1);
            g2d.fillRect(113 + x, 59 + y, 2, 1);
            g2d.fillRect(118 + x, 59 + y, 1, 1);
            g2d.fillRect(102 + x, 60 + y, 4, 1);
            g2d.fillRect(115 + x, 60 + y, 3, 1);


            g2d.setColor(b.highlightColor);
            g2d.fillRect(101 + x, 48 + y, 1, 2);
            g2d.fillRect(117 + x, 48 + y, 1, 2);
            g2d.fillRect(100 + x, 49 + y, 1, 3);
            g2d.fillRect(108 + x, 49 + y, 1, 1);
            g2d.fillRect(112 + x, 49 + y, 1, 1);
            g2d.fillRect(118 + x, 49 + y, 1, 2);
            g2d.fillRect(109 + x, 50 + y, 1, 7);
            g2d.fillRect(111 + x, 50 + y, 1, 7);
            g2d.fillRect(119 + x, 50 + y, 1, 8);
            g2d.fillRect(99 + x, 52 + y, 1, 5);
            g2d.fillRect(120 + x, 52 + y, 1, 4);
            g2d.fillRect(103 + x, 53 + y, 1, 2);
            g2d.fillRect(117 + x, 53 + y, 1, 2);
            g2d.fillRect(104 + x, 54 + y, 1, 1);
            g2d.fillRect(116 + x, 54 + y, 1, 1);
            g2d.fillRect(100 + x, 56 + y, 1, 2);
            g2d.fillRect(118 + x, 56 + y, 1, 3);
            g2d.fillRect(101 + x, 57 + y, 1, 2);
            g2d.fillRect(108 + x, 57 + y, 1, 1);
            g2d.fillRect(112 + x, 57 + y, 1, 1);
            g2d.fillRect(117 + x, 57 + y, 1, 3);
            g2d.fillRect(102 + x, 58 + y, 1, 2);
            g2d.fillRect(103 + x, 58 + y, 1, 2);
            g2d.fillRect(104 + x, 58 + y, 1, 2);
            g2d.fillRect(105 + x, 58 + y, 1, 2);
            g2d.fillRect(106 + x, 58 + y, 2, 1);
            g2d.fillRect(113 + x, 58 + y, 4, 1);
            g2d.fillRect(115 + x, 59 + y, 2, 1);

            g2d.setColor(b.fillColor);
            g2d.fillRect(102 + x, 47 + y, 1, 11);
            g2d.fillRect(103 + x, 47 + y, 1, 6);
            g2d.fillRect(104 + x, 47 + y, 1, 6);
            g2d.fillRect(105 + x, 47 + y, 1, 11);
            g2d.fillRect(106 + x, 47 + y, 1, 11);
            g2d.fillRect(107 + x, 47 + y, 1, 11);
            g2d.fillRect(114 + x, 47 + y, 1, 11);
            g2d.fillRect(115 + x, 47 + y, 1, 11);
            g2d.fillRect(116 + x, 47 + y, 1, 6);
            g2d.fillRect(117 + x, 47 + y, 1, 1);
            g2d.fillRect(113 + x, 48 + y, 1, 10);
            g2d.fillRect(101 + x, 50 + y, 1, 7);
            g2d.fillRect(108 + x, 50 + y, 1, 7);
            g2d.fillRect(112 + x, 50 + y, 1, 7);
            g2d.fillRect(117 + x, 50 + y, 1, 3);
            g2d.fillRect(118 + x, 51 + y, 1, 5);
            g2d.fillRect(100 + x, 52 + y, 1, 4);
            g2d.fillRect(103 + x, 55 + y, 1, 3);
            g2d.fillRect(104 + x, 55 + y, 1, 3);
            g2d.fillRect(116 + x, 55 + y, 1, 3);
            g2d.fillRect(117 + x, 55 + y, 1, 2);

        }
        else if(size.equalsIgnoreCase("c"))
        {
            x = x + 84;
            g2d.setColor(b.outlineColor);
            g2d.fillRect(16 + x, 47 + y, 2, 1);
            g2d.fillRect(15 + x, 48 + y, 1, 1);
            g2d.fillRect(14 + x, 49 + y, 1, 1);
            g2d.fillRect(13 + x, 50 + y, 1, 1);
            g2d.fillRect(12 + x, 51 + y, 1, 6);
            g2d.fillRect(13 + x, 57 + y, 1, 2);
            g2d.fillRect(14 + x, 59 + y, 1, 1);
            g2d.fillRect(15 + x, 60 + y, 1, 1);
            g2d.fillRect(16 + x, 61 + y, 2, 1);
            g2d.fillRect(18 + x, 62 + y, 5, 1);
            g2d.fillRect(23 + x, 61 + y, 1, 1);
            g2d.fillRect(24 + x, 60 + y, 1, 1);
            g2d.fillRect(25 + x, 59 + y, 1, 1);
            g2d.fillRect(24 + x, 48 + y, 1, 1);
            g2d.fillRect(25 + x, 49 + y, 1, 1);
            g2d.fillRect(26 + x, 50 + y, 1, 9);
            g2d.fillRect(29 + x, 47 + y, 1, 1);
            g2d.fillRect(28 + x, 48 + y, 1, 1);
            g2d.fillRect(27 + x, 49 + y, 1, 1);
            g2d.fillRect(19 + x, 53 + y, 2, 2);
            g2d.fillRect(32 + x, 53 + y, 2, 2);
            g2d.fillRect(27 + x, 59 + y, 1, 1);
            g2d.fillRect(28 + x, 60 + y, 1, 1);
            g2d.fillRect(29 + x, 61 + y, 2, 1);
            g2d.fillRect(31 + x, 62 + y, 5, 1);
            g2d.fillRect(36 + x, 47 + y, 1, 1);
            g2d.fillRect(37 + x, 48 + y, 1, 1);
            g2d.fillRect(38 + x, 49 + y, 1, 1);
            g2d.fillRect(39 + x, 50 + y, 1, 2);
            g2d.fillRect(40 + x, 52 + y, 1, 5);
            g2d.fillRect(39 + x, 57 + y, 1, 2);
            g2d.fillRect(38 + x, 59 + y, 1, 1);
            g2d.fillRect(37 + x, 60 + y, 1, 1);
            g2d.fillRect(36 + x, 61 + y, 1, 1);

            g2d.setColor(b.highlightColor);
            g2d.fillRect(18 + x, 47 + y, 1, 1);
            g2d.fillRect(16 + x, 48 + y, 2, 1);
            g2d.fillRect(15 + x, 49 + y, 1, 1);
            g2d.fillRect(14 + x, 50 + y, 1, 1);
            g2d.fillRect(13 + x, 51 + y, 1, 6);
            g2d.fillRect(14 + x, 56 + y, 1, 3);
            g2d.fillRect(15 + x, 57 + y, 1, 3);
            g2d.fillRect(16 + x, 58 + y, 1, 3);
            g2d.fillRect(17 + x, 59 + y, 1, 2);
            g2d.fillRect(18 + x, 59 + y, 5, 3);
            g2d.fillRect(22 + x, 58 + y, 1, 1);
            g2d.fillRect(23 + x, 57 + y, 1, 4);
            g2d.fillRect(24 + x, 55 + y, 1, 5);
            g2d.fillRect(25 + x, 50 + y, 1, 9);
            g2d.fillRect(24 + x, 49 + y, 1, 1);
            g2d.fillRect(23 + x, 48 + y, 1, 1);
            g2d.fillRect(30 + x, 47 + y, 1, 1);
            g2d.fillRect(29 + x, 48 + y, 1, 1);
            g2d.fillRect(28 + x, 49 + y, 1, 1);
            g2d.fillRect(27 + x, 50 + y, 1, 9);
            g2d.fillRect(28 + x, 57 + y, 1, 3);
            g2d.fillRect(29 + x, 58 + y, 1, 3);
            g2d.fillRect(30 + x, 59 + y, 1, 2);
            g2d.fillRect(31 + x, 59 + y, 5, 3);
            g2d.fillRect(35 + x, 58 + y, 1, 1);
            g2d.fillRect(36 + x, 57 + y, 1, 4);
            g2d.fillRect(37 + x, 55 + y, 1, 5);
            g2d.fillRect(38 + x, 50 + y, 1, 9);
            g2d.fillRect(39 + x, 52 + y, 1, 5);
            g2d.fillRect(37 + x, 49 + y, 1, 1);
            g2d.fillRect(36 + x, 48 + y, 1, 1);
            g2d.fillRect(35 + x, 47 + y, 1, 1);

            g2d.setColor(b.fillColor);
            g2d.fillRect(14 + x, 51 + y, 1, 5);
            g2d.fillRect(15 + x, 50 + y, 1, 7);
            g2d.fillRect(16 + x, 49 + y, 1, 9);
            g2d.fillRect(17 + x, 49 + y, 1, 10);
            g2d.fillRect(18 + x, 48 + y, 1, 11);
            g2d.fillRect(19 + x, 47 + y, 2, 6);
            g2d.fillRect(19 + x, 55 + y, 2, 4);
            g2d.fillRect(21 + x, 47 + y, 1, 12);
            g2d.fillRect(22 + x, 47 + y, 1, 11);
            g2d.fillRect(23 + x, 49 + y, 1, 8);
            g2d.fillRect(24 + x, 50 + y, 1, 5);
            g2d.fillRect(28 + x, 50 + y, 1, 7);
            g2d.fillRect(29 + x, 49 + y, 1, 9);
            g2d.fillRect(30 + x, 48 + y, 1, 11);
            g2d.fillRect(31 + x, 47 + y, 1, 12);
            g2d.fillRect(32 + x, 47 + y, 2, 6);
            g2d.fillRect(32 + x, 55 + y, 2, 4);
            g2d.fillRect(34 + x, 47 + y, 1, 12);
            g2d.fillRect(35 + x, 48 + y, 1, 10);
            g2d.fillRect(36 + x, 49 + y, 1, 8);
            g2d.fillRect(37 + x, 50 + y, 1, 5);
        }
        else if(size.equalsIgnoreCase("d"))
        {
            x = x + 84;
            g2d.setColor(b.outlineColor);
            g2d.fillRect(15 + x, 46 + y, 2, 1);
            g2d.fillRect(14 + x, 47 + y, 1, 1);
            g2d.fillRect(13 + x, 48 + y, 1, 1);
            g2d.fillRect(12 + x, 49 + y, 1, 1);
            g2d.fillRect(11 + x, 50 + y, 1, 7);
            g2d.fillRect(12 + x, 57 + y, 1, 2);
            g2d.fillRect(13 + x, 59 + y, 1, 1);
            g2d.fillRect(14 + x, 60 + y, 1, 1);
            g2d.fillRect(15 + x, 61 + y, 2, 1);
            g2d.fillRect(17 + x, 62 + y, 6, 1);
            g2d.fillRect(24 + x, 47 + y, 1, 1);
            g2d.fillRect(25 + x, 48 + y, 1, 1);
            g2d.fillRect(26 + x, 49 + y, 1, 10);
            g2d.fillRect(25 + x, 59 + y, 1, 1);
            g2d.fillRect(24 + x, 60 + y, 1, 1);
            g2d.fillRect(23 + x, 61 + y, 1, 1);
            g2d.fillRect(18 + x, 53 + y, 2, 2);
            g2d.fillRect(29 + x, 46 + y, 1, 1);
            g2d.fillRect(28 + x, 47 + y, 1, 1);
            g2d.fillRect(27 + x, 48 + y, 1, 1);
            g2d.fillRect(27 + x, 59 + y, 1, 1);
            g2d.fillRect(28 + x, 60 + y, 1, 1);
            g2d.fillRect(29 + x, 61 + y, 2, 1);
            g2d.fillRect(31 + x, 62 + y, 6, 1);
            g2d.fillRect(37 + x, 46 + y, 1, 1);
            g2d.fillRect(38 + x, 47 + y, 1, 1);
            g2d.fillRect(39 + x, 48 + y, 1, 1);
            g2d.fillRect(40 + x, 49 + y, 1, 2);
            g2d.fillRect(41 + x, 51 + y, 1, 6);
            g2d.fillRect(40 + x, 57 + y, 1, 2);
            g2d.fillRect(39 + x, 59 + y, 1, 1);
            g2d.fillRect(38 + x, 60 + y, 1, 1);
            g2d.fillRect(37 + x, 61 + y, 1, 1);
            g2d.fillRect(33 + x, 53 + y, 2, 2);

            g2d.setColor(b.highlightColor);
            g2d.fillRect(17 + x, 46 + y, 1, 1);
            g2d.fillRect(15 + x, 47 + y, 2, 1);
            g2d.fillRect(14 + x, 48 + y, 1, 1);
            g2d.fillRect(13 + x, 49 + y, 1, 1);
            g2d.fillRect(12 + x, 50 + y, 1, 7);
            g2d.fillRect(13 + x, 56 + y, 1, 3);
            g2d.fillRect(14 + x, 57 + y, 1, 3);
            g2d.fillRect(15 + x, 58 + y, 1, 3);
            g2d.fillRect(16 + x, 59 + y, 1, 2);
            g2d.fillRect(17 + x, 59 + y, 6, 3);
            g2d.fillRect(22 + x, 58 + y, 1, 1);
            g2d.fillRect(23 + x, 57 + y, 1, 4);
            g2d.fillRect(24 + x, 55 + y, 1, 5);
            g2d.fillRect(25 + x, 49 + y, 1, 10);
            g2d.fillRect(24 + x, 48 + y, 1, 1);
            g2d.fillRect(23 + x, 47 + y, 1, 1);
            g2d.fillRect(30 + x, 46 + y, 1, 1);
            g2d.fillRect(29 + x, 47 + y, 1, 1);
            g2d.fillRect(28 + x, 48 + y, 1, 1);
            g2d.fillRect(27 + x, 49 + y, 1, 10);
            g2d.fillRect(28 + x, 57 + y, 1, 3);
            g2d.fillRect(29 + x, 58 + y, 1, 3);
            g2d.fillRect(30 + x, 59 + y, 1, 2);
            g2d.fillRect(31 + x, 59 + y, 6, 3);
            g2d.fillRect(36 + x, 58 + y, 1, 1);
            g2d.fillRect(37 + x, 57 + y, 1, 4);
            g2d.fillRect(38 + x, 54 + y, 1, 6);
            g2d.fillRect(39 + x, 49 + y, 1, 10);
            g2d.fillRect(40 + x, 51 + y, 1, 6);
            g2d.fillRect(38 + x, 48 + y, 1, 1);
            g2d.fillRect(37 + x, 47 + y, 1, 1);
            g2d.fillRect(36 + x, 46 + y, 1, 1);

            g2d.setColor(b.fillColor);
            g2d.fillRect(13 + x, 50 + y, 1, 6);
            g2d.fillRect(14 + x, 49 + y, 1, 8);
            g2d.fillRect(15 + x, 48 + y, 1, 10);
            g2d.fillRect(16 + x, 48 + y, 1, 11);
            g2d.fillRect(17 + x, 47 + y, 1, 12);
            g2d.fillRect(18 + x, 46 + y, 2, 7);
            g2d.fillRect(18 + x, 55 + y, 2, 4);
            g2d.fillRect(20 + x, 46 + y, 2, 13);
            g2d.fillRect(22 + x, 46 + y, 1, 12);
            g2d.fillRect(23 + x, 48 + y, 1, 9);
            g2d.fillRect(24 + x, 49 + y, 1, 6);
            g2d.fillRect(28 + x, 49 + y, 1, 8);
            g2d.fillRect(29 + x, 48 + y, 1, 10);
            g2d.fillRect(30 + x, 47 + y, 1, 12);
            g2d.fillRect(31 + x, 46 + y, 2, 13);
            g2d.fillRect(33 + x, 55 + y, 2, 4);
            g2d.fillRect(33 + x, 46 + y, 2, 7);
            g2d.fillRect(35 + x, 46 + y, 1, 13);
            g2d.fillRect(36 + x, 47 + y, 1, 11);
            g2d.fillRect(37 + x, 48 + y, 1, 9);
            g2d.fillRect(38 + x, 49 + y, 1, 5);
        }
    }

}
