/*
 * GenericClothes.java
 *
 * Created on February 23, 2007, 8:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package clts.b.a;

import clts.SuperB;
import clts.SuperC;
import util.GraphicsMap;
import util.ColorArray;
import util.ImageUtilities;

/**
 *
 * @author doubleD
 */
public class Sitting extends SuperB
{
    b.Bd bd = new b.Bd();
    /** Creates a new instance of GenericClothes */
    public Sitting()
    {
        super();
    }

    public Sitting(int layer)
    {
        super(layer);
    }

    public Sitting(ColorArray colorSwitch)
    {
        super(colorSwitch);
    }

    public Sitting(int layer, ColorArray colorSwitch)
    {
        super(layer, colorSwitch);
    }

    public void paintMiddle(int offsetX, int offsetY, GraphicsMap g2d)
    {
        super.paintMiddle(offsetX, offsetY, g2d);
        paintB(offsetX, offsetY, g2d);
        
        
        paintBody(offsetX, offsetY, g2d);
    }
    
    public void paintBack(int offsetX, int offsetY, GraphicsMap g2d)
    {
        super.paintMiddle(offsetX, offsetY, g2d);
        paintB(offsetX, offsetY, g2d);
        
        
        paintBackBody(offsetX, offsetY, g2d);
    }

    
    public void drawBody(b.Bd bd, int offsetX, int offsetY, GraphicsMap g2d)
    {
        this.bd = bd;
    }

    public void drawBody(b.Bd bd)
    {
        this.bd = bd;
        bd.paintLegs = false;
    }
    
    public void paintB(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(COLORS.get(ImageUtilities.NEG_GREY_1));
        g2d.fillRect(102 + x, 80 + y, 1, 2);
        g2d.fillRect(103 + x, 80 + y, 1, 2);
        g2d.fillRect(104 + x, 80 + y, 6, 1);
        g2d.fillRect(100 + x, 81 + y, 1, 2);
        g2d.fillRect(101 + x, 81 + y, 1, 1);


        g2d.setColor(COLORS.get(ImageUtilities.GREY));
        g2d.fillRect(102 + x, 79 + y, 9, 1);
        g2d.fillRect(100 + x, 80 + y, 2, 1);
        g2d.fillRect(104 + x, 81 + y, 5, 1);
        g2d.fillRect(101 + x, 82 + y, 3, 1);
        g2d.fillRect(99 + x, 83 + y, 2, 1);
    }

    
    public void paintBody(int offsetX, int offsetY, GraphicsMap g2d)
    {
        g2d.setColorSpray(0, 0, 0, 0, 0);
        
        if(step != prevStep)
        {
            paintFB2(offsetX, offsetY, g2d);
            paintF(offsetX, offsetY, g2d);
        }else if(step == 0)
        {
            paintFB1(offsetX, offsetY, g2d);
            paintF(offsetX, offsetY, g2d);
        }
        else if(step == 8)
        {
            paintBodyB(offsetX, offsetY, g2d);
            paintF(offsetX, offsetY, g2d);
        }
    }
    
    public void paintBackBody(int offsetX, int offsetY, GraphicsMap g2d)
    {
        g2d.setColorSpray(0, 0, 0, 0, 0);
        
        if(step != prevStep)
        {
            paintBodyB(offsetX, offsetY, g2d);
        }else if(step == 0)
        {
            paintBodyB(offsetX, offsetY, g2d);
        }
        else if(step == 8)
        {
            paintFB1(offsetX, offsetY, g2d);
        }
        prevStep = step;
    }
    
    int prevStep = 0;
    
    public void paintFB2(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(bd.getOutlineColor());
        g2d.fillRect(175 + x, 55 + y, 3, 1);
        g2d.fillRect(170 + x, 57 + y, 1, 1);
        g2d.fillRect(155 + x, 59 + y, 1, 1);
        g2d.fillRect(157 + x, 59 + y, 4, 1);
        g2d.fillRect(138 + x, 60 + y, 1, 1);
        g2d.fillRect(133 + x, 61 + y, 1, 1);
        g2d.fillRect(131 + x, 62 + y, 2, 1);
        g2d.fillRect(129 + x, 63 + y, 1, 2);
        g2d.fillRect(159 + x, 63 + y, 3, 1);
        g2d.fillRect(155 + x, 64 + y, 1, 1);
        g2d.fillRect(157 + x, 64 + y, 2, 1);
        g2d.fillRect(154 + x, 65 + y, 1, 1);
        g2d.fillRect(135 + x, 70 + y, 2, 1);
        g2d.fillRect(139 + x, 70 + y, 2, 1);
        g2d.fillRect(142 + x, 70 + y, 2, 1);
        g2d.fillRect(133 + x, 71 + y, 2, 1);
        g2d.fillRect(132 + x, 72 + y, 1, 1);
        g2d.fillRect(131 + x, 73 + y, 1, 1);


        g2d.setColor(bd.getOutlineColor());
        g2d.fillRect(173 + x, 56 + y, 2, 1);
        g2d.fillRect(166 + x, 57 + y, 4, 1);
        g2d.fillRect(171 + x, 57 + y, 2, 1);
        g2d.fillRect(161 + x, 58 + y, 5, 1);
        g2d.fillRect(148 + x, 59 + y, 7, 1);
        g2d.fillRect(156 + x, 59 + y, 1, 1);
        g2d.fillRect(139 + x, 60 + y, 9, 1);
        g2d.fillRect(134 + x, 61 + y, 4, 1);
        g2d.fillRect(162 + x, 62 + y, 8, 1);
        g2d.fillRect(130 + x, 63 + y, 1, 1);
        g2d.fillRect(156 + x, 64 + y, 1, 1);
        g2d.fillRect(151 + x, 65 + y, 3, 1);
        g2d.fillRect(149 + x, 66 + y, 2, 1);
        g2d.fillRect(148 + x, 67 + y, 1, 1);
        g2d.fillRect(146 + x, 68 + y, 2, 1);
        g2d.fillRect(137 + x, 69 + y, 2, 1);
        g2d.fillRect(144 + x, 69 + y, 2, 1);
        g2d.fillRect(141 + x, 70 + y, 1, 1);


        g2d.setColor(bd.getHighlightColor());
        g2d.fillRect(175 + x, 56 + y, 2, 1);
        g2d.fillRect(166 + x, 58 + y, 3, 1);
        g2d.fillRect(161 + x, 59 + y, 1, 1);
        g2d.fillRect(148 + x, 60 + y, 1, 2);
        g2d.fillRect(149 + x, 60 + y, 4, 1);
        g2d.fillRect(138 + x, 61 + y, 10, 1);
        g2d.fillRect(162 + x, 61 + y, 8, 1);
        g2d.fillRect(133 + x, 62 + y, 1, 2);
        g2d.fillRect(134 + x, 62 + y, 4, 1);
        g2d.fillRect(159 + x, 62 + y, 3, 1);
        g2d.fillRect(131 + x, 63 + y, 1, 2);
        g2d.fillRect(132 + x, 63 + y, 1, 1);
        g2d.fillRect(155 + x, 63 + y, 4, 1);
        g2d.fillRect(130 + x, 64 + y, 1, 2);
        g2d.fillRect(151 + x, 64 + y, 4, 1);
        g2d.fillRect(128 + x, 65 + y, 2, 1);
        g2d.fillRect(149 + x, 65 + y, 2, 1);
        g2d.fillRect(148 + x, 66 + y, 1, 1);
        g2d.fillRect(146 + x, 67 + y, 2, 1);
        g2d.fillRect(136 + x, 68 + y, 1, 2);
        g2d.fillRect(137 + x, 68 + y, 2, 1);
        g2d.fillRect(144 + x, 68 + y, 2, 1);
        g2d.fillRect(135 + x, 69 + y, 1, 1);
        g2d.fillRect(139 + x, 69 + y, 5, 1);
        g2d.fillRect(133 + x, 70 + y, 2, 1);
        g2d.fillRect(132 + x, 71 + y, 1, 1);
        g2d.fillRect(131 + x, 72 + y, 1, 1);
        g2d.fillRect(130 + x, 73 + y, 1, 1);


        g2d.setColor(bd.getFillColor());
        g2d.fillRect(177 + x, 56 + y, 1, 3);
        g2d.fillRect(173 + x, 57 + y, 1, 3);
        g2d.fillRect(174 + x, 57 + y, 1, 3);
        g2d.fillRect(175 + x, 57 + y, 1, 3);
        g2d.fillRect(176 + x, 57 + y, 1, 3);
        g2d.fillRect(169 + x, 58 + y, 1, 3);
        g2d.fillRect(170 + x, 58 + y, 1, 3);
        g2d.fillRect(171 + x, 58 + y, 1, 2);
        g2d.fillRect(172 + x, 58 + y, 1, 2);
        g2d.fillRect(162 + x, 59 + y, 1, 2);
        g2d.fillRect(163 + x, 59 + y, 1, 2);
        g2d.fillRect(164 + x, 59 + y, 1, 2);
        g2d.fillRect(165 + x, 59 + y, 1, 2);
        g2d.fillRect(166 + x, 59 + y, 1, 2);
        g2d.fillRect(167 + x, 59 + y, 1, 2);
        g2d.fillRect(168 + x, 59 + y, 1, 2);
        g2d.fillRect(153 + x, 60 + y, 1, 4);
        g2d.fillRect(154 + x, 60 + y, 1, 4);
        g2d.fillRect(155 + x, 60 + y, 1, 3);
        g2d.fillRect(156 + x, 60 + y, 1, 3);
        g2d.fillRect(157 + x, 60 + y, 1, 3);
        g2d.fillRect(158 + x, 60 + y, 1, 3);
        g2d.fillRect(159 + x, 60 + y, 1, 2);
        g2d.fillRect(160 + x, 60 + y, 1, 2);
        g2d.fillRect(161 + x, 60 + y, 1, 2);
        g2d.fillRect(149 + x, 61 + y, 1, 4);
        g2d.fillRect(150 + x, 61 + y, 1, 4);
        g2d.fillRect(151 + x, 61 + y, 1, 3);
        g2d.fillRect(152 + x, 61 + y, 1, 3);
        g2d.fillRect(138 + x, 62 + y, 1, 6);
        g2d.fillRect(139 + x, 62 + y, 1, 7);
        g2d.fillRect(140 + x, 62 + y, 1, 7);
        g2d.fillRect(141 + x, 62 + y, 1, 7);
        g2d.fillRect(142 + x, 62 + y, 1, 7);
        g2d.fillRect(143 + x, 62 + y, 1, 7);
        g2d.fillRect(144 + x, 62 + y, 1, 6);
        g2d.fillRect(145 + x, 62 + y, 1, 6);
        g2d.fillRect(146 + x, 62 + y, 1, 5);
        g2d.fillRect(147 + x, 62 + y, 1, 5);
        g2d.fillRect(148 + x, 62 + y, 1, 4);
        g2d.fillRect(134 + x, 63 + y, 1, 7);
        g2d.fillRect(135 + x, 63 + y, 1, 6);
        g2d.fillRect(136 + x, 63 + y, 1, 5);
        g2d.fillRect(137 + x, 63 + y, 1, 5);
        g2d.fillRect(132 + x, 64 + y, 1, 7);
        g2d.fillRect(133 + x, 64 + y, 1, 6);
        g2d.fillRect(131 + x, 65 + y, 1, 7);
        g2d.fillRect(128 + x, 66 + y, 1, 6);
        g2d.fillRect(129 + x, 66 + y, 1, 6);
        g2d.fillRect(130 + x, 66 + y, 1, 6);
        g2d.fillRect(127 + x, 70 + y, 1, 1);
    }





    public void paintBodyB(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(bd.getOutlineColor());
        g2d.fillRect(140 + x, 85 + y, 2, 1);
        g2d.fillRect(142 + x, 87 + y, 1, 2);
        g2d.fillRect(143 + x, 89 + y, 1, 1);
        g2d.fillRect(144 + x, 94 + y, 1, 1);
        g2d.fillRect(134 + x, 96 + y, 1, 1);
        g2d.fillRect(134 + x, 98 + y, 1, 2);
        g2d.fillRect(139 + x, 110 + y, 1, 1);
        g2d.fillRect(140 + x, 111 + y, 1, 1);
        g2d.fillRect(145 + x, 111 + y, 1, 1);
        g2d.fillRect(140 + x, 113 + y, 1, 2);
        g2d.fillRect(145 + x, 113 + y, 1, 4);
        g2d.fillRect(141 + x, 115 + y, 1, 3);
        g2d.fillRect(147 + x, 126 + y, 1, 1);
        g2d.fillRect(149 + x, 130 + y, 1, 2);


        g2d.setColor(bd.getOutlineColor());
        g2d.fillRect(124 + x, 82 + y, 10, 1);
        g2d.fillRect(134 + x, 83 + y, 4, 1);
        g2d.fillRect(138 + x, 84 + y, 2, 1);
        g2d.fillRect(141 + x, 86 + y, 1, 1);
        g2d.fillRect(143 + x, 90 + y, 1, 4);
        g2d.fillRect(114 + x, 92 + y, 21, 1);
        g2d.fillRect(135 + x, 93 + y, 1, 2);
        g2d.fillRect(134 + x, 95 + y, 1, 1);
        g2d.fillRect(144 + x, 95 + y, 1, 9);
        g2d.fillRect(134 + x, 97 + y, 1, 1);
        g2d.fillRect(135 + x, 100 + y, 1, 2);
        g2d.fillRect(136 + x, 102 + y, 1, 2);
        g2d.fillRect(137 + x, 104 + y, 1, 1);
        g2d.fillRect(145 + x, 104 + y, 1, 7);
        g2d.fillRect(138 + x, 105 + y, 1, 2);
        g2d.fillRect(139 + x, 107 + y, 1, 3);
        g2d.fillRect(140 + x, 112 + y, 1, 1);
        g2d.fillRect(145 + x, 112 + y, 1, 1);
        g2d.fillRect(146 + x, 117 + y, 1, 5);
        g2d.fillRect(142 + x, 118 + y, 1, 9);
        g2d.fillRect(147 + x, 122 + y, 1, 4);
        g2d.fillRect(147 + x, 127 + y, 1, 1);
        g2d.fillRect(148 + x, 128 + y, 1, 2);
        g2d.fillRect(149 + x, 132 + y, 1, 1);


        g2d.setColor(bd.getHighlightColor());
        g2d.fillRect(123 + x, 83 + y, 1, 3);
        g2d.fillRect(124 + x, 83 + y, 1, 2);
        g2d.fillRect(125 + x, 83 + y, 1, 2);
        g2d.fillRect(126 + x, 83 + y, 8, 1);
        g2d.fillRect(122 + x, 84 + y, 1, 3);
        g2d.fillRect(131 + x, 84 + y, 7, 1);
        g2d.fillRect(121 + x, 85 + y, 1, 3);
        g2d.fillRect(134 + x, 85 + y, 6, 1);
        g2d.fillRect(120 + x, 86 + y, 1, 3);
        g2d.fillRect(136 + x, 86 + y, 5, 1);
        g2d.fillRect(119 + x, 87 + y, 1, 5);
        g2d.fillRect(139 + x, 87 + y, 3, 1);
        g2d.fillRect(118 + x, 88 + y, 1, 4);
        g2d.fillRect(141 + x, 88 + y, 1, 2);
        g2d.fillRect(117 + x, 89 + y, 1, 3);
        g2d.fillRect(142 + x, 89 + y, 1, 5);
        g2d.fillRect(116 + x, 90 + y, 1, 2);
        g2d.fillRect(120 + x, 90 + y, 1, 2);
        g2d.fillRect(121 + x, 90 + y, 1, 2);
        g2d.fillRect(133 + x, 90 + y, 1, 2);
        g2d.fillRect(134 + x, 90 + y, 1, 2);
        g2d.fillRect(135 + x, 90 + y, 1, 3);
        g2d.fillRect(115 + x, 91 + y, 1, 1);
        g2d.fillRect(122 + x, 91 + y, 11, 1);
        g2d.fillRect(136 + x, 91 + y, 1, 5);
        g2d.fillRect(113 + x, 92 + y, 1, 1);
        g2d.fillRect(137 + x, 92 + y, 1, 2);
        g2d.fillRect(143 + x, 94 + y, 1, 11);
        g2d.fillRect(135 + x, 95 + y, 1, 5);
        g2d.fillRect(136 + x, 100 + y, 1, 2);
        g2d.fillRect(137 + x, 102 + y, 1, 2);
        g2d.fillRect(138 + x, 104 + y, 1, 1);
        g2d.fillRect(144 + x, 104 + y, 1, 5);
        g2d.fillRect(139 + x, 105 + y, 1, 2);
        g2d.fillRect(140 + x, 107 + y, 1, 4);
        g2d.fillRect(141 + x, 111 + y, 1, 4);
        g2d.fillRect(142 + x, 115 + y, 1, 3);
        g2d.fillRect(145 + x, 117 + y, 1, 1);
        g2d.fillRect(143 + x, 118 + y, 1, 9);
        g2d.fillRect(146 + x, 122 + y, 1, 3);
        g2d.fillRect(147 + x, 128 + y, 1, 1);
        g2d.fillRect(148 + x, 130 + y, 1, 3);


        g2d.setColor(bd.getFillColor());
        g2d.fillRect(126 + x, 84 + y, 1, 7);
        g2d.fillRect(127 + x, 84 + y, 1, 7);
        g2d.fillRect(128 + x, 84 + y, 1, 7);
        g2d.fillRect(129 + x, 84 + y, 1, 7);
        g2d.fillRect(130 + x, 84 + y, 1, 7);
        g2d.fillRect(124 + x, 85 + y, 1, 6);
        g2d.fillRect(125 + x, 85 + y, 1, 6);
        g2d.fillRect(131 + x, 85 + y, 1, 6);
        g2d.fillRect(132 + x, 85 + y, 1, 6);
        g2d.fillRect(133 + x, 85 + y, 1, 5);
        g2d.fillRect(123 + x, 86 + y, 1, 5);
        g2d.fillRect(134 + x, 86 + y, 1, 4);
        g2d.fillRect(135 + x, 86 + y, 1, 4);
        g2d.fillRect(122 + x, 87 + y, 1, 4);
        g2d.fillRect(136 + x, 87 + y, 1, 4);
        g2d.fillRect(137 + x, 87 + y, 1, 5);
        g2d.fillRect(138 + x, 87 + y, 1, 17);
        g2d.fillRect(121 + x, 88 + y, 1, 2);
        g2d.fillRect(139 + x, 88 + y, 1, 17);
        g2d.fillRect(140 + x, 88 + y, 1, 19);
        g2d.fillRect(120 + x, 89 + y, 1, 1);
        g2d.fillRect(141 + x, 90 + y, 1, 21);
        g2d.fillRect(137 + x, 94 + y, 1, 8);
        g2d.fillRect(142 + x, 94 + y, 1, 21);
        g2d.fillRect(136 + x, 96 + y, 1, 4);
        g2d.fillRect(143 + x, 105 + y, 1, 13);
        g2d.fillRect(144 + x, 109 + y, 1, 18);
        g2d.fillRect(145 + x, 118 + y, 1, 15);
        g2d.fillRect(146 + x, 125 + y, 1, 9);
        g2d.fillRect(147 + x, 129 + y, 1, 5);
        g2d.fillRect(148 + x, 133 + y, 1, 1);
    }





    public void paintF(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(bd.getOutlineColor());
        g2d.fillRect(128 + x, 76 + y, 1, 1);
        g2d.fillRect(126 + x, 79 + y, 1, 1);
        g2d.fillRect(110 + x, 80 + y, 1, 1);
        g2d.fillRect(125 + x, 80 + y, 1, 1);
        g2d.fillRect(124 + x, 81 + y, 1, 1);
        g2d.fillRect(100 + x, 89 + y, 1, 1);


        g2d.setColor(bd.getOutlineColor());
        g2d.fillRect(127 + x, 64 + y, 5, 1);
        g2d.fillRect(125 + x, 65 + y, 2, 1);
        g2d.fillRect(124 + x, 66 + y, 1, 1);
        g2d.fillRect(123 + x, 67 + y, 1, 1);
        g2d.fillRect(122 + x, 68 + y, 1, 1);
        g2d.fillRect(121 + x, 69 + y, 1, 1);
        g2d.fillRect(120 + x, 70 + y, 1, 1);
        g2d.fillRect(119 + x, 71 + y, 1, 1);
        g2d.fillRect(118 + x, 72 + y, 1, 1);
        g2d.fillRect(117 + x, 73 + y, 1, 1);
        g2d.fillRect(130 + x, 73 + y, 1, 2);
        g2d.fillRect(116 + x, 74 + y, 1, 1);
        g2d.fillRect(115 + x, 75 + y, 1, 1);
        g2d.fillRect(129 + x, 75 + y, 1, 1);
        g2d.fillRect(114 + x, 76 + y, 1, 1);
        g2d.fillRect(113 + x, 77 + y, 1, 1);
        g2d.fillRect(128 + x, 77 + y, 1, 1);
        g2d.fillRect(112 + x, 78 + y, 1, 1);
        g2d.fillRect(127 + x, 78 + y, 1, 1);
        g2d.fillRect(111 + x, 79 + y, 1, 1);
        g2d.fillRect(123 + x, 82 + y, 1, 1);
        g2d.fillRect(99 + x, 83 + y, 1, 5);
        g2d.fillRect(122 + x, 83 + y, 1, 1);
        g2d.fillRect(121 + x, 84 + y, 1, 1);
        g2d.fillRect(120 + x, 85 + y, 1, 1);
        g2d.fillRect(119 + x, 86 + y, 1, 1);
        g2d.fillRect(118 + x, 87 + y, 1, 1);
        g2d.fillRect(100 + x, 88 + y, 1, 1);
        g2d.fillRect(117 + x, 88 + y, 1, 1);
        g2d.fillRect(116 + x, 89 + y, 1, 1);
        g2d.fillRect(101 + x, 90 + y, 1, 1);
        g2d.fillRect(115 + x, 90 + y, 1, 1);
        g2d.fillRect(102 + x, 91 + y, 1, 1);
        g2d.fillRect(113 + x, 91 + y, 2, 1);
        g2d.fillRect(103 + x, 92 + y, 10, 1);


        g2d.setColor(bd.getHighlightColor());
        g2d.fillRect(127 + x, 65 + y, 1, 2);
        g2d.fillRect(128 + x, 65 + y, 1, 2);
        g2d.fillRect(129 + x, 65 + y, 3, 1);
        g2d.fillRect(125 + x, 66 + y, 1, 2);
        g2d.fillRect(126 + x, 66 + y, 1, 2);
        g2d.fillRect(124 + x, 67 + y, 1, 2);
        g2d.fillRect(123 + x, 68 + y, 1, 2);
        g2d.fillRect(120 + x, 69 + y, 1, 1);
        g2d.fillRect(122 + x, 69 + y, 1, 2);
        g2d.fillRect(119 + x, 70 + y, 1, 1);
        g2d.fillRect(121 + x, 70 + y, 1, 2);
        g2d.fillRect(118 + x, 71 + y, 1, 1);
        g2d.fillRect(120 + x, 71 + y, 1, 2);
        g2d.fillRect(117 + x, 72 + y, 1, 1);
        g2d.fillRect(119 + x, 72 + y, 1, 2);
        g2d.fillRect(130 + x, 72 + y, 1, 1);
        g2d.fillRect(116 + x, 73 + y, 1, 1);
        g2d.fillRect(118 + x, 73 + y, 1, 2);
        g2d.fillRect(129 + x, 73 + y, 1, 2);
        g2d.fillRect(115 + x, 74 + y, 1, 1);
        g2d.fillRect(117 + x, 74 + y, 1, 2);
        g2d.fillRect(128 + x, 74 + y, 1, 2);
        g2d.fillRect(114 + x, 75 + y, 1, 1);
        g2d.fillRect(116 + x, 75 + y, 1, 2);
        g2d.fillRect(127 + x, 75 + y, 1, 3);
        g2d.fillRect(113 + x, 76 + y, 1, 1);
        g2d.fillRect(115 + x, 76 + y, 1, 2);
        g2d.fillRect(126 + x, 76 + y, 1, 3);
        g2d.fillRect(114 + x, 77 + y, 1, 1);
        g2d.fillRect(125 + x, 77 + y, 1, 3);
        g2d.fillRect(113 + x, 78 + y, 1, 1);
        g2d.fillRect(112 + x, 79 + y, 1, 1);
        g2d.fillRect(124 + x, 79 + y, 1, 2);
        g2d.fillRect(123 + x, 80 + y, 1, 2);
        g2d.fillRect(109 + x, 81 + y, 1, 1);
        g2d.fillRect(108 + x, 82 + y, 1, 1);
        g2d.fillRect(122 + x, 82 + y, 1, 1);
        g2d.fillRect(100 + x, 83 + y, 1, 5);
        g2d.fillRect(101 + x, 83 + y, 1, 1);
        g2d.fillRect(121 + x, 83 + y, 1, 1);
        g2d.fillRect(120 + x, 84 + y, 1, 1);
        g2d.fillRect(119 + x, 85 + y, 1, 1);
        g2d.fillRect(118 + x, 86 + y, 1, 1);
        g2d.fillRect(101 + x, 87 + y, 1, 3);
        g2d.fillRect(116 + x, 87 + y, 1, 2);
        g2d.fillRect(117 + x, 87 + y, 1, 1);
        g2d.fillRect(115 + x, 88 + y, 1, 2);
        g2d.fillRect(102 + x, 89 + y, 1, 2);
        g2d.fillRect(113 + x, 89 + y, 1, 2);
        g2d.fillRect(114 + x, 89 + y, 1, 2);
        g2d.fillRect(103 + x, 90 + y, 1, 2);
        g2d.fillRect(111 + x, 90 + y, 1, 2);
        g2d.fillRect(112 + x, 90 + y, 1, 2);
        g2d.fillRect(104 + x, 91 + y, 7, 1);


        g2d.setColor(bd.getFillColor());
        g2d.fillRect(129 + x, 66 + y, 1, 7);
        g2d.fillRect(130 + x, 66 + y, 1, 6);
        g2d.fillRect(131 + x, 66 + y, 1, 4);
        g2d.fillRect(127 + x, 67 + y, 1, 8);
        g2d.fillRect(128 + x, 67 + y, 1, 7);
        g2d.fillRect(125 + x, 68 + y, 1, 9);
        g2d.fillRect(126 + x, 68 + y, 1, 8);
        g2d.fillRect(124 + x, 69 + y, 1, 10);
        g2d.fillRect(123 + x, 70 + y, 1, 10);
        g2d.fillRect(122 + x, 71 + y, 1, 11);
        g2d.fillRect(121 + x, 72 + y, 1, 11);
        g2d.fillRect(120 + x, 73 + y, 1, 11);
        g2d.fillRect(119 + x, 74 + y, 1, 11);
        g2d.fillRect(118 + x, 75 + y, 1, 11);
        g2d.fillRect(117 + x, 76 + y, 1, 11);
        g2d.fillRect(116 + x, 77 + y, 1, 10);
        g2d.fillRect(114 + x, 78 + y, 1, 11);
        g2d.fillRect(115 + x, 78 + y, 1, 10);
        g2d.fillRect(113 + x, 79 + y, 1, 10);
        g2d.fillRect(111 + x, 80 + y, 1, 10);
        g2d.fillRect(112 + x, 80 + y, 1, 10);
        g2d.fillRect(110 + x, 81 + y, 1, 10);
        g2d.fillRect(109 + x, 82 + y, 1, 9);
        g2d.fillRect(102 + x, 83 + y, 1, 6);
        g2d.fillRect(103 + x, 83 + y, 1, 7);
        g2d.fillRect(104 + x, 83 + y, 1, 8);
        g2d.fillRect(105 + x, 83 + y, 1, 8);
        g2d.fillRect(106 + x, 83 + y, 1, 8);
        g2d.fillRect(107 + x, 83 + y, 1, 8);
        g2d.fillRect(108 + x, 83 + y, 1, 8);
        g2d.fillRect(101 + x, 84 + y, 1, 3);
    }





    public void paintFB1(int x, int y, GraphicsMap g2d)
    {


        g2d.setColor(bd.getOutlineColor());
        g2d.fillRect(135 + x, 65 + y, 2, 1);
        g2d.fillRect(137 + x, 67 + y, 1, 2);
        g2d.fillRect(138 + x, 69 + y, 1, 1);
        g2d.fillRect(139 + x, 74 + y, 1, 1);
        g2d.fillRect(129 + x, 76 + y, 1, 1);
        g2d.fillRect(129 + x, 78 + y, 1, 2);
        g2d.fillRect(134 + x, 90 + y, 1, 1);
        g2d.fillRect(135 + x, 91 + y, 1, 1);
        g2d.fillRect(140 + x, 91 + y, 1, 1);
        g2d.fillRect(135 + x, 93 + y, 1, 2);
        g2d.fillRect(140 + x, 93 + y, 1, 4);
        g2d.fillRect(136 + x, 95 + y, 1, 3);
        g2d.fillRect(142 + x, 106 + y, 1, 1);
        g2d.fillRect(144 + x, 111 + y, 1, 3);


        g2d.setColor(bd.getOutlineColor());
        g2d.fillRect(128 + x, 64 + y, 7, 1);
        g2d.fillRect(136 + x, 66 + y, 1, 1);
        g2d.fillRect(138 + x, 70 + y, 1, 4);
        g2d.fillRect(130 + x, 73 + y, 1, 2);
        g2d.fillRect(139 + x, 75 + y, 1, 9);
        g2d.fillRect(129 + x, 77 + y, 1, 1);
        g2d.fillRect(130 + x, 80 + y, 1, 2);
        g2d.fillRect(131 + x, 82 + y, 1, 2);
        g2d.fillRect(132 + x, 84 + y, 1, 1);
        g2d.fillRect(140 + x, 84 + y, 1, 7);
        g2d.fillRect(133 + x, 85 + y, 1, 2);
        g2d.fillRect(134 + x, 87 + y, 1, 3);
        g2d.fillRect(135 + x, 92 + y, 1, 1);
        g2d.fillRect(140 + x, 92 + y, 1, 1);
        g2d.fillRect(141 + x, 97 + y, 1, 5);
        g2d.fillRect(137 + x, 98 + y, 1, 8);
        g2d.fillRect(142 + x, 102 + y, 1, 4);
        g2d.fillRect(142 + x, 107 + y, 1, 2);
        g2d.fillRect(143 + x, 109 + y, 1, 2);


        g2d.setColor(bd.getHighlightColor());
        g2d.fillRect(128 + x, 65 + y, 1, 2);
        g2d.fillRect(129 + x, 65 + y, 6, 1);
        g2d.fillRect(134 + x, 66 + y, 2, 1);
        g2d.fillRect(136 + x, 67 + y, 1, 1);
        g2d.fillRect(137 + x, 69 + y, 1, 5);
        g2d.fillRect(131 + x, 71 + y, 1, 4);
        g2d.fillRect(130 + x, 72 + y, 1, 1);
        g2d.fillRect(132 + x, 72 + y, 1, 2);
        g2d.fillRect(138 + x, 74 + y, 1, 11);
        g2d.fillRect(130 + x, 75 + y, 1, 5);
        g2d.fillRect(131 + x, 80 + y, 1, 2);
        g2d.fillRect(132 + x, 82 + y, 1, 2);
        g2d.fillRect(133 + x, 84 + y, 1, 1);
        g2d.fillRect(139 + x, 84 + y, 1, 5);
        g2d.fillRect(134 + x, 85 + y, 1, 2);
        g2d.fillRect(135 + x, 87 + y, 1, 4);
        g2d.fillRect(136 + x, 91 + y, 1, 4);
        g2d.fillRect(137 + x, 95 + y, 1, 3);
        g2d.fillRect(140 + x, 97 + y, 1, 1);
        g2d.fillRect(138 + x, 98 + y, 1, 8);
        g2d.fillRect(141 + x, 102 + y, 1, 3);
        g2d.fillRect(143 + x, 111 + y, 1, 2);


        g2d.setColor(bd.getFillColor());
        g2d.fillRect(129 + x, 66 + y, 1, 4);
        g2d.fillRect(130 + x, 66 + y, 1, 6);
        g2d.fillRect(131 + x, 66 + y, 1, 5);
        g2d.fillRect(132 + x, 66 + y, 1, 6);
        g2d.fillRect(133 + x, 66 + y, 1, 18);
        g2d.fillRect(128 + x, 67 + y, 1, 3);
        g2d.fillRect(134 + x, 67 + y, 1, 18);
        g2d.fillRect(135 + x, 67 + y, 1, 20);
        g2d.fillRect(136 + x, 68 + y, 1, 23);
        g2d.fillRect(132 + x, 74 + y, 1, 8);
        g2d.fillRect(137 + x, 74 + y, 1, 21);
        g2d.fillRect(131 + x, 75 + y, 1, 5);
        g2d.fillRect(138 + x, 85 + y, 1, 13);
        g2d.fillRect(139 + x, 89 + y, 1, 18);
        g2d.fillRect(140 + x, 98 + y, 1, 15);
        g2d.fillRect(141 + x, 105 + y, 1, 9);
        g2d.fillRect(142 + x, 109 + y, 1, 5);
        g2d.fillRect(143 + x, 113 + y, 1, 1);
    }
}
