/*
 * LeftLeg.java
 */
package b;

import util.GraphicsMap;

/**
 *
 * @author doubleD
 */
public class LeftLeg {
    //ImageUtilities leg = null;
    int step = 0;
    Bd b = null;

    /** Creates a new instance of LeftLeg */
    public LeftLeg(Bd b) {
        this.b = b;
    }

    public void setStep(int step) {
        this.step = step;
    }

    private void draw0(int x, int y, GraphicsMap g2d) {
        x = x + 84;
        if (step == 0 || step == 1 || step == 7 || step == 8) {
            g2d.setColor(b.outlineColor);
            g2d.fillRect(17 + x, 87 + y, 1, 7);
            g2d.fillRect(18 + x, 94 + y, 1, 7);
            g2d.fillRect(19 + x, 101 + y, 1, 4);
            g2d.fillRect(20 + x, 105 + y, 1, 3);
            g2d.fillRect(21 + x, 108 + y, 1, 3);
            g2d.fillRect(21 + x, 115 + y, 1, 10);
            g2d.fillRect(22 + x, 111 + y, 1, 4);
            g2d.fillRect(22 + x, 125 + y, 1, 4);
            g2d.fillRect(23 + x, 129 + y, 1, 7);
            g2d.fillRect(24 + x, 136 + y, 1, 11);
            g2d.fillRect(25 + x, 88 + y, 1, 6);
            g2d.fillRect(25 + x, 147 + y, 1, 15);
            g2d.fillRect(26 + x, 94 + y, 1, 8);
            g2d.fillRect(26 + x, 161 + y, 1, 1);
            g2d.fillRect(27 + x, 102 + y, 1, 11);
            g2d.fillRect(27 + x, 161 + y, 1, 2);
            g2d.fillRect(28 + x, 113 + y, 1, 3);
            g2d.fillRect(28 + x, 125 + y, 1, 20);
            g2d.fillRect(28 + x, 162 + y, 1, 1);
            g2d.fillRect(29 + x, 116 + y, 1, 9);
            g2d.fillRect(29 + x, 145 + y, 1, 1);
            g2d.fillRect(29 + x, 162 + y, 1, 1);
            g2d.fillRect(30 + x, 146 + y, 1, 8);
            g2d.fillRect(30 + x, 161 + y, 1, 2);
            g2d.fillRect(31 + x, 154 + y, 1, 3);
            g2d.fillRect(31 + x, 161 + y, 1, 1);
            g2d.fillRect(32 + x, 157 + y, 1, 5);
            g2d.setColor(b.highlightColor);
            g2d.fillRect(18 + x, 87 + y, 1, 7);
            g2d.fillRect(19 + x, 87 + y, 1, 14);
            g2d.fillRect(20 + x, 94 + y, 1, 11);
            g2d.fillRect(21 + x, 101 + y, 1, 7);
            g2d.fillRect(22 + x, 105 + y, 1, 6);
            g2d.fillRect(22 + x, 115 + y, 1, 10);
            g2d.fillRect(23 + x, 111 + y, 1, 5);
            g2d.fillRect(23 + x, 125 + y, 1, 4);
            g2d.fillRect(24 + x, 87 + y, 1, 11);
            g2d.fillRect(24 + x, 129 + y, 1, 7);
            g2d.fillRect(25 + x, 87 + y, 1, 1);
            g2d.fillRect(25 + x, 94 + y, 1, 9);
            g2d.fillRect(25 + x, 136 + y, 1, 11);
            g2d.fillRect(26 + x, 102 + y, 1, 11);
            g2d.fillRect(26 + x, 147 + y, 1, 14);
            g2d.fillRect(27 + x, 113 + y, 1, 3);
            g2d.fillRect(27 + x, 125 + y, 1, 20);
            g2d.fillRect(27 + x, 160 + y, 1, 1);
            g2d.fillRect(28 + x, 116 + y, 1, 9);
            g2d.fillRect(28 + x, 145 + y, 1, 3);
            g2d.fillRect(28 + x, 160 + y, 1, 2);
            g2d.fillRect(29 + x, 146 + y, 1, 9);
            g2d.fillRect(29 + x, 160 + y, 1, 2);
            g2d.fillRect(30 + x, 154 + y, 1, 4);
            g2d.fillRect(30 + x, 160 + y, 1, 1);
            g2d.fillRect(31 + x, 157 + y, 1, 4);
            g2d.setColor(b.fillColor);
            g2d.fillRect(20 + x, 87 + y, 1, 7);
            g2d.fillRect(21 + x, 87 + y, 1, 14);
            g2d.fillRect(22 + x, 87 + y, 1, 18);
            g2d.fillRect(23 + x, 87 + y, 1, 24);
            g2d.fillRect(23 + x, 116 + y, 1, 9);
            g2d.fillRect(24 + x, 98 + y, 1, 31);
            g2d.fillRect(25 + x, 103 + y, 1, 33);
            g2d.fillRect(26 + x, 113 + y, 1, 34);
            g2d.fillRect(27 + x, 116 + y, 1, 9);
            g2d.fillRect(27 + x, 145 + y, 1, 15);
            g2d.fillRect(28 + x, 148 + y, 1, 12);
            g2d.fillRect(29 + x, 155 + y, 1, 5);
            g2d.fillRect(30 + x, 158 + y, 1, 2);
        } else if (step == 2 || step == 6) {
            g2d.setColor(b.outlineColor);
            g2d.fillRect(17 + x, 87 + y, 1, 14);
            g2d.fillRect(18 + x, 101 + y, 1, 4);
            g2d.fillRect(19 + x, 105 + y, 1, 3);
            g2d.fillRect(20 + x, 108 + y, 1, 3);
            g2d.fillRect(20 + x, 115 + y, 1, 10);
            g2d.fillRect(21 + x, 111 + y, 1, 4);
            g2d.fillRect(21 + x, 125 + y, 1, 4);
            g2d.fillRect(22 + x, 129 + y, 1, 7);
            g2d.fillRect(23 + x, 136 + y, 1, 11);
            g2d.fillRect(24 + x, 147 + y, 1, 15);
            g2d.fillRect(25 + x, 88 + y, 1, 14);
            g2d.fillRect(25 + x, 161 + y, 1, 1);
            g2d.fillRect(26 + x, 102 + y, 1, 11);
            g2d.fillRect(26 + x, 161 + y, 1, 2);
            g2d.fillRect(27 + x, 113 + y, 1, 3);
            g2d.fillRect(27 + x, 125 + y, 1, 20);
            g2d.fillRect(27 + x, 162 + y, 1, 1);
            g2d.fillRect(28 + x, 116 + y, 1, 9);
            g2d.fillRect(28 + x, 145 + y, 1, 1);
            g2d.fillRect(28 + x, 162 + y, 1, 1);
            g2d.fillRect(29 + x, 146 + y, 1, 8);
            g2d.fillRect(29 + x, 161 + y, 1, 2);
            g2d.fillRect(30 + x, 154 + y, 1, 3);
            g2d.fillRect(30 + x, 161 + y, 1, 1);
            g2d.fillRect(31 + x, 157 + y, 1, 5);
            g2d.setColor(b.highlightColor);
            g2d.fillRect(18 + x, 87 + y, 1, 14);
            g2d.fillRect(19 + x, 87 + y, 1, 18);
            g2d.fillRect(20 + x, 101 + y, 1, 7);
            g2d.fillRect(21 + x, 105 + y, 1, 6);
            g2d.fillRect(21 + x, 115 + y, 1, 10);
            g2d.fillRect(22 + x, 111 + y, 1, 5);
            g2d.fillRect(22 + x, 125 + y, 1, 4);
            g2d.fillRect(23 + x, 94 + y, 1, 4);
            g2d.fillRect(23 + x, 129 + y, 1, 7);
            g2d.fillRect(24 + x, 87 + y, 1, 16);
            g2d.fillRect(24 + x, 136 + y, 1, 11);
            g2d.fillRect(25 + x, 87 + y, 1, 1);
            g2d.fillRect(25 + x, 102 + y, 1, 11);
            g2d.fillRect(25 + x, 147 + y, 1, 14);
            g2d.fillRect(26 + x, 113 + y, 1, 3);
            g2d.fillRect(26 + x, 125 + y, 1, 20);
            g2d.fillRect(26 + x, 160 + y, 1, 1);
            g2d.fillRect(27 + x, 116 + y, 1, 9);
            g2d.fillRect(27 + x, 145 + y, 1, 3);
            g2d.fillRect(27 + x, 160 + y, 1, 2);
            g2d.fillRect(28 + x, 146 + y, 1, 9);
            g2d.fillRect(28 + x, 160 + y, 1, 2);
            g2d.fillRect(29 + x, 154 + y, 1, 4);
            g2d.fillRect(29 + x, 160 + y, 1, 1);
            g2d.fillRect(30 + x, 157 + y, 1, 4);
            g2d.setColor(b.fillColor);
            g2d.fillRect(20 + x, 87 + y, 1, 14);
            g2d.fillRect(21 + x, 87 + y, 1, 18);
            g2d.fillRect(22 + x, 87 + y, 1, 24);
            g2d.fillRect(22 + x, 116 + y, 1, 9);
            g2d.fillRect(23 + x, 87 + y, 1, 7);
            g2d.fillRect(23 + x, 98 + y, 1, 31);
            g2d.fillRect(24 + x, 103 + y, 1, 33);
            g2d.fillRect(25 + x, 113 + y, 1, 34);
            g2d.fillRect(26 + x, 116 + y, 1, 9);
            g2d.fillRect(26 + x, 145 + y, 1, 15);
            g2d.fillRect(27 + x, 148 + y, 1, 12);
            g2d.fillRect(28 + x, 155 + y, 1, 5);
            g2d.fillRect(29 + x, 158 + y, 1, 2);
        } else if (step == 3 || step == 4 || step == 5) {
            g2d.setColor(b.outlineColor);
            g2d.fillRect(17 + x, 87 + y, 1, 18);
            g2d.fillRect(18 + x, 105 + y, 1, 3);
            g2d.fillRect(19 + x, 108 + y, 1, 3);
            g2d.fillRect(19 + x, 115 + y, 1, 10);
            g2d.fillRect(20 + x, 111 + y, 1, 4);
            g2d.fillRect(20 + x, 125 + y, 1, 4);
            g2d.fillRect(21 + x, 129 + y, 1, 7);
            g2d.fillRect(22 + x, 136 + y, 1, 11);
            g2d.fillRect(23 + x, 147 + y, 1, 15);
            g2d.fillRect(24 + x, 161 + y, 1, 1);
            g2d.fillRect(25 + x, 89 + y, 1, 24);
            g2d.fillRect(25 + x, 161 + y, 1, 2);
            g2d.fillRect(26 + x, 113 + y, 1, 3);
            g2d.fillRect(26 + x, 125 + y, 1, 20);
            g2d.fillRect(26 + x, 162 + y, 1, 1);
            g2d.fillRect(27 + x, 116 + y, 1, 9);
            g2d.fillRect(27 + x, 145 + y, 1, 1);
            g2d.fillRect(27 + x, 162 + y, 1, 1);
            g2d.fillRect(28 + x, 146 + y, 1, 8);
            g2d.fillRect(28 + x, 161 + y, 1, 2);
            g2d.fillRect(29 + x, 154 + y, 1, 3);
            g2d.fillRect(29 + x, 161 + y, 1, 1);
            g2d.fillRect(30 + x, 157 + y, 1, 5);
            g2d.setColor(b.highlightColor);
            g2d.fillRect(18 + x, 87 + y, 1, 18);
            g2d.fillRect(19 + x, 87 + y, 1, 21);
            g2d.fillRect(20 + x, 105 + y, 1, 6);
            g2d.fillRect(20 + x, 115 + y, 1, 10);
            g2d.fillRect(21 + x, 111 + y, 1, 5);
            g2d.fillRect(21 + x, 125 + y, 1, 4);
            g2d.fillRect(22 + x, 129 + y, 1, 7);
            g2d.fillRect(23 + x, 94 + y, 1, 4);
            g2d.fillRect(23 + x, 136 + y, 1, 11);
            g2d.fillRect(24 + x, 87 + y, 1, 26);
            g2d.fillRect(24 + x, 147 + y, 1, 14);
            g2d.fillRect(25 + x, 87 + y, 1, 2);
            g2d.fillRect(25 + x, 113 + y, 1, 3);
            g2d.fillRect(25 + x, 125 + y, 1, 20);
            g2d.fillRect(25 + x, 160 + y, 1, 1);
            g2d.fillRect(26 + x, 116 + y, 1, 9);
            g2d.fillRect(26 + x, 145 + y, 1, 3);
            g2d.fillRect(26 + x, 160 + y, 1, 2);
            g2d.fillRect(27 + x, 146 + y, 1, 9);
            g2d.fillRect(27 + x, 160 + y, 1, 2);
            g2d.fillRect(28 + x, 154 + y, 1, 4);
            g2d.fillRect(28 + x, 160 + y, 1, 1);
            g2d.fillRect(29 + x, 157 + y, 1, 4);
            g2d.setColor(b.fillColor);
            g2d.fillRect(20 + x, 87 + y, 1, 18);
            g2d.fillRect(21 + x, 87 + y, 1, 24);
            g2d.fillRect(21 + x, 116 + y, 1, 9);
            g2d.fillRect(22 + x, 87 + y, 1, 42);
            g2d.fillRect(23 + x, 87 + y, 1, 7);
            g2d.fillRect(23 + x, 98 + y, 1, 38);
            g2d.fillRect(24 + x, 113 + y, 1, 34);
            g2d.fillRect(25 + x, 116 + y, 1, 9);
            g2d.fillRect(25 + x, 145 + y, 1, 15);
            g2d.fillRect(26 + x, 148 + y, 1, 12);
            g2d.fillRect(27 + x, 155 + y, 1, 5);
            g2d.fillRect(28 + x, 158 + y, 1, 2);
        } else if (step == 9 || step == 15) {
            g2d.setColor(b.outlineColor);
            g2d.fillRect(17 + x, 87 + y, 1, 13);
            g2d.fillRect(18 + x, 100 + y, 1, 4);
            g2d.fillRect(19 + x, 104 + y, 1, 2);
            g2d.fillRect(20 + x, 106 + y, 1, 3);
            g2d.fillRect(20 + x, 113 + y, 1, 9);
            g2d.fillRect(21 + x, 109 + y, 1, 4);
            g2d.fillRect(21 + x, 122 + y, 1, 4);
            g2d.fillRect(22 + x, 126 + y, 1, 7);
            g2d.fillRect(23 + x, 133 + y, 1, 10);
            g2d.fillRect(24 + x, 143 + y, 1, 15);
            g2d.fillRect(25 + x, 89 + y, 1, 12);
            g2d.fillRect(25 + x, 157 + y, 1, 1);
            g2d.fillRect(26 + x, 101 + y, 1, 10);
            g2d.fillRect(26 + x, 157 + y, 1, 2);
            g2d.fillRect(27 + x, 111 + y, 1, 3);
            g2d.fillRect(27 + x, 122 + y, 1, 19);
            g2d.fillRect(27 + x, 158 + y, 1, 1);
            g2d.fillRect(28 + x, 114 + y, 1, 8);
            g2d.fillRect(28 + x, 141 + y, 1, 1);
            g2d.fillRect(28 + x, 158 + y, 1, 1);
            g2d.fillRect(29 + x, 142 + y, 1, 8);
            g2d.fillRect(29 + x, 157 + y, 1, 2);
            g2d.fillRect(30 + x, 150 + y, 1, 3);
            g2d.fillRect(30 + x, 157 + y, 1, 1);
            g2d.fillRect(31 + x, 153 + y, 1, 5);
            g2d.setColor(b.highlightColor);
            g2d.fillRect(18 + x, 87 + y, 1, 13);
            g2d.fillRect(19 + x, 87 + y, 1, 17);
            g2d.fillRect(20 + x, 100 + y, 1, 6);
            g2d.fillRect(21 + x, 104 + y, 1, 5);
            g2d.fillRect(21 + x, 113 + y, 1, 9);
            g2d.fillRect(22 + x, 109 + y, 1, 5);
            g2d.fillRect(22 + x, 122 + y, 1, 4);
            g2d.fillRect(23 + x, 94 + y, 1, 3);
            g2d.fillRect(23 + x, 126 + y, 1, 7);
            g2d.fillRect(24 + x, 87 + y, 1, 15);
            g2d.fillRect(24 + x, 133 + y, 1, 10);
            g2d.fillRect(25 + x, 87 + y, 1, 2);
            g2d.fillRect(25 + x, 101 + y, 1, 10);
            g2d.fillRect(25 + x, 143 + y, 1, 14);
            g2d.fillRect(26 + x, 111 + y, 1, 3);
            g2d.fillRect(26 + x, 122 + y, 1, 19);
            g2d.fillRect(26 + x, 156 + y, 1, 1);
            g2d.fillRect(27 + x, 114 + y, 1, 8);
            g2d.fillRect(27 + x, 141 + y, 1, 3);
            g2d.fillRect(27 + x, 156 + y, 1, 2);
            g2d.fillRect(28 + x, 142 + y, 1, 9);
            g2d.fillRect(28 + x, 156 + y, 1, 2);
            g2d.fillRect(29 + x, 150 + y, 1, 4);
            g2d.fillRect(29 + x, 156 + y, 1, 1);
            g2d.fillRect(30 + x, 153 + y, 1, 4);
            g2d.setColor(b.fillColor);
            g2d.fillRect(20 + x, 87 + y, 1, 13);
            g2d.fillRect(21 + x, 87 + y, 1, 17);
            g2d.fillRect(22 + x, 87 + y, 1, 22);
            g2d.fillRect(22 + x, 114 + y, 1, 8);
            g2d.fillRect(23 + x, 87 + y, 1, 7);
            g2d.fillRect(23 + x, 97 + y, 1, 29);
            g2d.fillRect(24 + x, 102 + y, 1, 31);
            g2d.fillRect(25 + x, 111 + y, 1, 32);
            g2d.fillRect(26 + x, 114 + y, 1, 8);
            g2d.fillRect(26 + x, 141 + y, 1, 15);
            g2d.fillRect(27 + x, 144 + y, 1, 12);
            g2d.fillRect(28 + x, 151 + y, 1, 5);
            g2d.fillRect(29 + x, 154 + y, 1, 2);
        } else if (step == 10 || step == 14) {
            g2d.setColor(b.outlineColor);
            g2d.fillRect(17 + x, 87 + y, 1, 11);
            g2d.fillRect(18 + x, 98 + y, 1, 4);
            g2d.fillRect(19 + x, 102 + y, 1, 2);
            g2d.fillRect(20 + x, 104 + y, 1, 3);
            g2d.fillRect(20 + x, 110 + y, 1, 9);
            g2d.fillRect(21 + x, 107 + y, 1, 3);
            g2d.fillRect(21 + x, 119 + y, 1, 4);
            g2d.fillRect(22 + x, 123 + y, 1, 6);
            g2d.fillRect(23 + x, 129 + y, 1, 10);
            g2d.fillRect(24 + x, 139 + y, 1, 15);
            g2d.fillRect(25 + x, 89 + y, 1, 10);
            g2d.fillRect(25 + x, 153 + y, 1, 1);
            g2d.fillRect(26 + x, 99 + y, 1, 9);
            g2d.fillRect(26 + x, 153 + y, 1, 2);
            g2d.fillRect(27 + x, 108 + y, 1, 3);
            g2d.fillRect(27 + x, 119 + y, 1, 18);
            g2d.fillRect(27 + x, 154 + y, 1, 1);
            g2d.fillRect(28 + x, 111 + y, 1, 8);
            g2d.fillRect(28 + x, 137 + y, 1, 1);
            g2d.fillRect(28 + x, 154 + y, 1, 1);
            g2d.fillRect(29 + x, 138 + y, 1, 8);
            g2d.fillRect(29 + x, 153 + y, 1, 2);
            g2d.fillRect(30 + x, 146 + y, 1, 3);
            g2d.fillRect(30 + x, 153 + y, 1, 1);
            g2d.fillRect(31 + x, 149 + y, 1, 5);
            g2d.setColor(b.highlightColor);
            g2d.fillRect(18 + x, 87 + y, 1, 11);
            g2d.fillRect(19 + x, 87 + y, 1, 15);
            g2d.fillRect(20 + x, 98 + y, 1, 6);
            g2d.fillRect(21 + x, 102 + y, 1, 5);
            g2d.fillRect(21 + x, 110 + y, 1, 9);
            g2d.fillRect(22 + x, 107 + y, 1, 4);
            g2d.fillRect(22 + x, 119 + y, 1, 4);
            g2d.fillRect(23 + x, 94 + y, 1, 1);
            g2d.fillRect(23 + x, 123 + y, 1, 6);
            g2d.fillRect(24 + x, 87 + y, 1, 13);
            g2d.fillRect(24 + x, 129 + y, 1, 10);
            g2d.fillRect(25 + x, 87 + y, 1, 2);
            g2d.fillRect(25 + x, 99 + y, 1, 9);
            g2d.fillRect(25 + x, 139 + y, 1, 14);
            g2d.fillRect(26 + x, 108 + y, 1, 3);
            g2d.fillRect(26 + x, 119 + y, 1, 18);
            g2d.fillRect(26 + x, 152 + y, 1, 1);
            g2d.fillRect(27 + x, 111 + y, 1, 8);
            g2d.fillRect(27 + x, 137 + y, 1, 3);
            g2d.fillRect(27 + x, 152 + y, 1, 2);
            g2d.fillRect(28 + x, 138 + y, 1, 9);
            g2d.fillRect(28 + x, 152 + y, 1, 2);
            g2d.fillRect(29 + x, 146 + y, 1, 4);
            g2d.fillRect(29 + x, 152 + y, 1, 1);
            g2d.fillRect(30 + x, 149 + y, 1, 4);
            g2d.setColor(b.fillColor);
            g2d.fillRect(20 + x, 87 + y, 1, 11);
            g2d.fillRect(21 + x, 87 + y, 1, 15);
            g2d.fillRect(22 + x, 87 + y, 1, 20);
            g2d.fillRect(22 + x, 111 + y, 1, 8);
            g2d.fillRect(23 + x, 87 + y, 1, 7);
            g2d.fillRect(23 + x, 95 + y, 1, 28);
            g2d.fillRect(24 + x, 100 + y, 1, 29);
            g2d.fillRect(25 + x, 108 + y, 1, 31);
            g2d.fillRect(26 + x, 111 + y, 1, 8);
            g2d.fillRect(26 + x, 137 + y, 1, 15);
            g2d.fillRect(27 + x, 140 + y, 1, 12);
            g2d.fillRect(28 + x, 147 + y, 1, 5);
            g2d.fillRect(29 + x, 150 + y, 1, 2);
        } else if (step == 11 || step == 13) {
            g2d.setColor(b.outlineColor);
            g2d.fillRect(17 + x, 87 + y, 1, 12);
            g2d.fillRect(18 + x, 99 + y, 1, 2);
            g2d.fillRect(19 + x, 101 + y, 1, 3);
            g2d.fillRect(19 + x, 107 + y, 1, 8);
            g2d.fillRect(20 + x, 104 + y, 1, 3);
            g2d.fillRect(20 + x, 115 + y, 1, 4);
            g2d.fillRect(21 + x, 119 + y, 1, 5);
            g2d.fillRect(22 + x, 124 + y, 1, 9);
            g2d.fillRect(23 + x, 133 + y, 1, 15);
            g2d.fillRect(24 + x, 147 + y, 1, 1);
            g2d.fillRect(25 + x, 89 + y, 1, 16);
            g2d.fillRect(25 + x, 147 + y, 1, 2);
            g2d.fillRect(26 + x, 105 + y, 1, 3);
            g2d.fillRect(26 + x, 115 + y, 1, 16);
            g2d.fillRect(26 + x, 148 + y, 1, 1);
            g2d.fillRect(27 + x, 108 + y, 1, 7);
            g2d.fillRect(27 + x, 131 + y, 1, 1);
            g2d.fillRect(27 + x, 148 + y, 1, 1);
            g2d.fillRect(28 + x, 132 + y, 1, 8);
            g2d.fillRect(28 + x, 147 + y, 1, 2);
            g2d.fillRect(29 + x, 140 + y, 1, 3);
            g2d.fillRect(29 + x, 147 + y, 1, 1);
            g2d.fillRect(30 + x, 143 + y, 1, 5);
            g2d.setColor(b.highlightColor);
            g2d.fillRect(18 + x, 87 + y, 1, 12);
            g2d.fillRect(19 + x, 87 + y, 1, 14);
            g2d.fillRect(20 + x, 99 + y, 1, 5);
            g2d.fillRect(20 + x, 107 + y, 1, 8);
            g2d.fillRect(21 + x, 104 + y, 1, 4);
            g2d.fillRect(21 + x, 115 + y, 1, 4);
            g2d.fillRect(22 + x, 119 + y, 1, 5);
            g2d.fillRect(23 + x, 124 + y, 1, 9);
            g2d.fillRect(24 + x, 87 + y, 1, 18);
            g2d.fillRect(24 + x, 133 + y, 1, 14);
            g2d.fillRect(25 + x, 87 + y, 1, 2);
            g2d.fillRect(25 + x, 105 + y, 1, 3);
            g2d.fillRect(25 + x, 115 + y, 1, 16);
            g2d.fillRect(25 + x, 146 + y, 1, 1);
            g2d.fillRect(26 + x, 108 + y, 1, 7);
            g2d.fillRect(26 + x, 131 + y, 1, 3);
            g2d.fillRect(26 + x, 146 + y, 1, 2);
            g2d.fillRect(27 + x, 132 + y, 1, 9);
            g2d.fillRect(27 + x, 146 + y, 1, 2);
            g2d.fillRect(28 + x, 140 + y, 1, 4);
            g2d.fillRect(28 + x, 146 + y, 1, 1);
            g2d.fillRect(29 + x, 143 + y, 1, 4);
            g2d.setColor(b.fillColor);
            g2d.fillRect(20 + x, 87 + y, 1, 12);
            g2d.fillRect(21 + x, 87 + y, 1, 17);
            g2d.fillRect(21 + x, 108 + y, 1, 7);
            g2d.fillRect(22 + x, 87 + y, 1, 32);
            g2d.fillRect(23 + x, 87 + y, 1, 37);
            g2d.fillRect(24 + x, 105 + y, 1, 28);
            g2d.fillRect(25 + x, 108 + y, 1, 7);
            g2d.fillRect(25 + x, 131 + y, 1, 15);
            g2d.fillRect(26 + x, 134 + y, 1, 12);
            g2d.fillRect(27 + x, 141 + y, 1, 5);
            g2d.fillRect(28 + x, 144 + y, 1, 2);
        } else if (step == 12) {
            g2d.setColor(b.outlineColor);
            g2d.fillRect(17 + x, 87 + y, 1, 8);
            g2d.fillRect(18 + x, 95 + y, 1, 2);
            g2d.fillRect(18 + x, 103 + y, 1, 8);
            g2d.fillRect(19 + x, 97 + y, 1, 3);
            g2d.fillRect(19 + x, 101 + y, 1, 2);
            g2d.fillRect(19 + x, 111 + y, 1, 4);
            g2d.fillRect(20 + x, 100 + y, 1, 1);
            g2d.fillRect(20 + x, 115 + y, 1, 5);
            g2d.fillRect(21 + x, 120 + y, 1, 9);
            g2d.fillRect(22 + x, 129 + y, 1, 15);
            g2d.fillRect(23 + x, 143 + y, 1, 1);
            g2d.fillRect(24 + x, 143 + y, 1, 2);
            g2d.fillRect(25 + x, 88 + y, 1, 16);
            g2d.fillRect(25 + x, 111 + y, 1, 16);
            g2d.fillRect(25 + x, 144 + y, 1, 1);
            g2d.fillRect(26 + x, 104 + y, 1, 7);
            g2d.fillRect(26 + x, 127 + y, 1, 1);
            g2d.fillRect(26 + x, 144 + y, 1, 1);
            g2d.fillRect(27 + x, 128 + y, 1, 8);
            g2d.fillRect(27 + x, 143 + y, 1, 2);
            g2d.fillRect(28 + x, 136 + y, 1, 3);
            g2d.fillRect(28 + x, 143 + y, 1, 1);
            g2d.fillRect(29 + x, 139 + y, 1, 5);
            g2d.setColor(b.highlightColor);
            g2d.fillRect(18 + x, 87 + y, 1, 8);
            g2d.fillRect(19 + x, 87 + y, 1, 10);
            g2d.fillRect(19 + x, 103 + y, 1, 8);
            g2d.fillRect(20 + x, 95 + y, 1, 5);
            g2d.fillRect(20 + x, 101 + y, 1, 3);
            g2d.fillRect(20 + x, 111 + y, 1, 4);
            g2d.fillRect(21 + x, 100 + y, 1, 1);
            g2d.fillRect(21 + x, 115 + y, 1, 5);
            g2d.fillRect(22 + x, 120 + y, 1, 9);
            g2d.fillRect(23 + x, 129 + y, 1, 14);
            g2d.fillRect(24 + x, 87 + y, 1, 17);
            g2d.fillRect(24 + x, 111 + y, 1, 16);
            g2d.fillRect(24 + x, 142 + y, 1, 1);
            g2d.fillRect(25 + x, 87 + y, 1, 1);
            g2d.fillRect(25 + x, 104 + y, 1, 7);
            g2d.fillRect(25 + x, 127 + y, 1, 3);
            g2d.fillRect(25 + x, 142 + y, 1, 2);
            g2d.fillRect(26 + x, 128 + y, 1, 9);
            g2d.fillRect(26 + x, 142 + y, 1, 2);
            g2d.fillRect(27 + x, 136 + y, 1, 4);
            g2d.fillRect(27 + x, 142 + y, 1, 1);
            g2d.fillRect(28 + x, 139 + y, 1, 4);
            g2d.setColor(b.fillColor);
            g2d.fillRect(20 + x, 87 + y, 1, 8);
            g2d.fillRect(20 + x, 104 + y, 1, 7);
            g2d.fillRect(21 + x, 87 + y, 1, 13);
            g2d.fillRect(21 + x, 101 + y, 1, 14);
            g2d.fillRect(22 + x, 87 + y, 1, 33);
            g2d.fillRect(23 + x, 87 + y, 1, 42);
            g2d.fillRect(24 + x, 104 + y, 1, 7);
            g2d.fillRect(24 + x, 127 + y, 1, 15);
            g2d.fillRect(25 + x, 130 + y, 1, 12);
            g2d.fillRect(26 + x, 137 + y, 1, 5);
            g2d.fillRect(27 + x, 140 + y, 1, 2);
        }
    }

    public void paint(int x, int y, GraphicsMap g2d) {
        if (step == 0 || step == 1 || step == 7 || step == 8) {
            draw0(x, y, g2d, b.legLength);
        } else if (step == 2 || step == 6) {
            draw1(x, y, g2d, b.legLength);
        } else if (step == 3 || step == 4 || step == 5) {
            draw2(x, y, g2d, b.legLength);
        } else if (step == 9 || step == 15) {
            draw3(x, y, g2d, b.legLength);
        } else if (step == 10 || step == 14) {
            draw4(x, y, g2d, b.legLength);
        } else if (step == 11 || step == 13) {
            draw5(x, y, g2d, b.legLength);
        } else if (step == 12) {
            draw6(x, y, g2d, b.legLength);
        }

    }

    private void draw0(int x, int y, GraphicsMap g2d, int length) {
        paint1U(x, y, g2d, length);
        paintB(x, y, g2d, length);
    }

    private void draw1(int x, int y, GraphicsMap g2d, int length) {
        paint2U(x, y, g2d, length);
        paintB(x - 1, y, g2d, length);
    }

    private void draw2(int x, int y, GraphicsMap g2d, int length) {
        paint3U(x, y, g2d, length);
        paintB(x - 2, y, g2d, length);
    }

    private void draw3(int x, int y, GraphicsMap g2d, int length) {
        paint4U(x, y, g2d, length);
        paintB(x - 1, y - 4, g2d, length);
    }

    private void draw4(int x, int y, GraphicsMap g2d, int length) {
        paint5U(x, y, g2d, length);
        paintB(x - 1, y - 8, g2d, length);
    }

    private void draw5(int x, int y, GraphicsMap g2d, int length) {
        paint6U(x, y, g2d, length);
        paintB(x - 2, y - 14, g2d, length);
    }

    private void draw6(int x, int y, GraphicsMap g2d, int length) {
        paint7U(x, y, g2d, length);
        paintB(x - 3, y - 18, g2d, length);
    }

    public void paint7U(int x, int y, GraphicsMap g2d, int length) {


        g2d.setColor(b.getOutlineColor());
        g2d.fillRect(101 + x, 87 + y, 1, 6);
        g2d.fillRect(109 + x, 90 + y, 1, 3);


        g2d.setColor(b.getOutlineColor());
        g2d.fillRect(101 + x, 93 + y, 1, 2);
        g2d.fillRect(109 + x, 93 + y, 1, 11);
        g2d.fillRect(102 + x, 95 + y, 1, 2);
        g2d.fillRect(103 + x, 97 + y, 1, 3);
        g2d.fillRect(104 + x, 100 + y, 1, 1);
        g2d.fillRect(103 + x, 101 + y, 1, 2);
        g2d.fillRect(102 + x, 103 + y, 1, 8);
        g2d.fillRect(110 + x, 104 + y, 1, 7);
        g2d.fillRect(103 + x, 111 + y, 1, 4);
        g2d.fillRect(109 + x, 111 + y, 1, 16);
        g2d.fillRect(104 + x, 115 + y, 1, 5);
        g2d.fillRect(105 + x, 120 + y, 1, 7);


        g2d.setColor(b.getHighlightColor());
        g2d.fillRect(102 + x, 87 + y, 1, 6);
        g2d.fillRect(103 + x, 87 + y, 1, 6);
        g2d.fillRect(108 + x, 87 + y, 1, 6);
        g2d.fillRect(109 + x, 87 + y, 1, 3);


        g2d.setColor(b.getHighlightColor());
        g2d.fillRect(102 + x, 93 + y, 1, 2);
        g2d.fillRect(103 + x, 93 + y, 1, 4);
        g2d.fillRect(108 + x, 93 + y, 1, 11);
        g2d.fillRect(104 + x, 95 + y, 1, 5);
        g2d.fillRect(105 + x, 100 + y, 1, 1);
        g2d.fillRect(104 + x, 101 + y, 1, 3);
        g2d.fillRect(103 + x, 103 + y, 1, 8);
        g2d.fillRect(109 + x, 104 + y, 1, 7);
        g2d.fillRect(104 + x, 111 + y, 1, 4);
        g2d.fillRect(108 + x, 111 + y, 1, 16);
        g2d.fillRect(105 + x, 115 + y, 1, 5);
        g2d.fillRect(106 + x, 120 + y, 1, 7);


        g2d.setColor(b.getFillColor());
        g2d.fillRect(104 + x, 87 + y, 1, 6);
        g2d.fillRect(105 + x, 87 + y, 1, 6);
        g2d.fillRect(106 + x, 87 + y, 1, 6);
        g2d.fillRect(107 + x, 87 + y, 1, 6);


        g2d.setColor(b.getFillColor());
        g2d.fillRect(104 + x, 93 + y, 1, 2);
        g2d.fillRect(105 + x, 93 + y, 1, 7);
        g2d.fillRect(106 + x, 93 + y, 1, 27);
        g2d.fillRect(107 + x, 93 + y, 1, 34);
        g2d.fillRect(105 + x, 101 + y, 1, 14);
        g2d.fillRect(104 + x, 104 + y, 1, 7);
        g2d.fillRect(108 + x, 104 + y, 1, 7);
    }

    public void paint7B(int x, int y, GraphicsMap g2d, int length) {
        y += length;


        g2d.setColor(b.getOutlineColor());
        g2d.fillRect(105 + x, 127 + y - length, 1, 2 + length);
        g2d.fillRect(110 + x, 127 + y - length, 1, 1 + length);
        g2d.fillRect(111 + x, 128 + y, 1, 8);
        g2d.fillRect(106 + x, 129 + y, 1, 15);
        g2d.fillRect(112 + x, 136 + y, 1, 3);
        g2d.fillRect(113 + x, 139 + y, 1, 5);
        g2d.fillRect(107 + x, 143 + y, 2, 1);
        g2d.fillRect(111 + x, 143 + y, 1, 2);
        g2d.fillRect(112 + x, 143 + y, 1, 1);
        g2d.fillRect(108 + x, 144 + y, 3, 1);


        g2d.setColor(b.getHighlightColor());
        g2d.fillRect(106 + x, 127 + y - length, 1, 2 + length);
        g2d.fillRect(109 + x, 127 + y - length, 1, 3 + length);
        g2d.fillRect(110 + x, 128 + y, 1, 9);
        g2d.fillRect(107 + x, 129 + y, 1, 14);
        g2d.fillRect(111 + x, 136 + y, 1, 4);
        g2d.fillRect(112 + x, 139 + y, 1, 4);
        g2d.fillRect(108 + x, 142 + y, 4, 1);
        g2d.fillRect(109 + x, 143 + y, 2, 1);


        g2d.setColor(b.getFillColor());
        g2d.fillRect(107 + x, 127 + y - length, 1, 2 + length);
        g2d.fillRect(108 + x, 127 + y - length, 1, 15 + length);
        g2d.fillRect(109 + x, 130 + y, 1, 12);
        g2d.fillRect(110 + x, 137 + y, 1, 5);
        g2d.fillRect(111 + x, 140 + y, 1, 2);
    }

    public void paintB(int x, int y, GraphicsMap g2d, int length) {
        y += length;


        g2d.setColor(b.getOutlineColor());
        g2d.fillRect(108 + x, 145 + y - length, 1, 2 + length);
        g2d.fillRect(113 + x, 145 + y, 1, 1);
        g2d.fillRect(114 + x, 146 + y, 1, 8);
        g2d.fillRect(109 + x, 147 + y, 1, 15);
        g2d.fillRect(115 + x, 154 + y, 1, 3);
        g2d.fillRect(116 + x, 157 + y, 1, 5);
        g2d.fillRect(110 + x, 161 + y, 2, 1);
        g2d.fillRect(114 + x, 161 + y, 1, 2);
        g2d.fillRect(115 + x, 161 + y, 1, 1);
        g2d.fillRect(111 + x, 162 + y, 3, 1);


        g2d.setColor(b.getHighlightColor());
        g2d.fillRect(109 + x, 145 + y - length, 1, 2 + length);
        g2d.fillRect(112 + x, 145 + y, 1, 3);
        g2d.fillRect(113 + x, 146 + y, 1, 9);
        g2d.fillRect(110 + x, 147 + y, 1, 14);
        g2d.fillRect(114 + x, 154 + y, 1, 4);
        g2d.fillRect(115 + x, 157 + y, 1, 4);
        g2d.fillRect(111 + x, 160 + y, 4, 1);
        g2d.fillRect(112 + x, 161 + y, 2, 1);


        g2d.setColor(b.getFillColor());
        g2d.fillRect(110 + x, 145 + y - length, 1, 2 + length);
        g2d.fillRect(111 + x, 145 + y, 1, 15);
        g2d.fillRect(112 + x, 148 + y, 1, 12);
        g2d.fillRect(113 + x, 155 + y, 1, 5);
        g2d.fillRect(114 + x, 158 + y, 1, 2);


        if (length > 0) {

            g2d.setColor(b.getOutlineColor());
            g2d.fillRect(112 + x, 145 + y - length, 1, length);

            g2d.setColor(b.getHighlightColor());
            g2d.fillRect(111 + x, 145 + y - length, 1, length);
        }
    }

    public void paint1U(int x, int y, GraphicsMap g2d, int length) {


        g2d.setColor(b.getOutlineColor());
        g2d.fillRect(101 + x, 87 + y, 1, 7);
        g2d.fillRect(109 + x, 90 + y, 1, 4);
        g2d.fillRect(102 + x, 94 + y, 1, 3);
        g2d.fillRect(110 + x, 94 + y, 1, 3);


        g2d.setColor(b.getOutlineColor());
        g2d.fillRect(102 + x, 97 + y, 1, 4);
        g2d.fillRect(110 + x, 97 + y, 1, 5);
        g2d.fillRect(103 + x, 101 + y, 1, 4);
        g2d.fillRect(111 + x, 102 + y, 1, 11);
        g2d.fillRect(104 + x, 105 + y, 1, 3);
        g2d.fillRect(105 + x, 108 + y, 1, 3);
        g2d.fillRect(106 + x, 111 + y, 1, 4);
        g2d.fillRect(112 + x, 113 + y, 1, 3);
        g2d.fillRect(105 + x, 115 + y, 1, 10);
        g2d.fillRect(113 + x, 116 + y, 1, 9);
        g2d.fillRect(106 + x, 125 + y, 1, 4);
        g2d.fillRect(112 + x, 125 + y, 1, 20);
        g2d.fillRect(107 + x, 129 + y, 1, 7);
        g2d.fillRect(108 + x, 136 + y, 1, 9);


        g2d.setColor(b.getHighlightColor());
        g2d.fillRect(102 + x, 87 + y, 1, 7);
        g2d.fillRect(103 + x, 87 + y, 1, 10);
        g2d.fillRect(108 + x, 87 + y, 1, 10);
        g2d.fillRect(109 + x, 87 + y, 1, 3);
        g2d.fillRect(104 + x, 94 + y, 1, 3);
        g2d.fillRect(109 + x, 94 + y, 1, 3);


        g2d.setColor(b.getHighlightColor());
        g2d.fillRect(103 + x, 97 + y, 1, 4);
        g2d.fillRect(104 + x, 97 + y, 1, 8);
        g2d.fillRect(108 + x, 97 + y, 2, 1);
        g2d.fillRect(109 + x, 98 + y, 1, 5);
        g2d.fillRect(105 + x, 101 + y, 1, 7);
        g2d.fillRect(110 + x, 102 + y, 1, 11);
        g2d.fillRect(106 + x, 105 + y, 1, 6);
        g2d.fillRect(107 + x, 111 + y, 1, 5);
        g2d.fillRect(111 + x, 113 + y, 1, 3);
        g2d.fillRect(106 + x, 115 + y, 1, 10);
        g2d.fillRect(112 + x, 116 + y, 1, 9);
        g2d.fillRect(107 + x, 125 + y, 1, 4);
        g2d.fillRect(111 + x, 125 + y, 1, 20);
        g2d.fillRect(108 + x, 129 + y, 1, 7);
        g2d.fillRect(109 + x, 136 + y, 1, 9);


        g2d.setColor(b.getFillColor());
        g2d.fillRect(104 + x, 87 + y, 1, 7);
        g2d.fillRect(105 + x, 87 + y, 1, 10);
        g2d.fillRect(106 + x, 87 + y, 1, 10);
        g2d.fillRect(107 + x, 87 + y, 1, 10);


        g2d.setColor(b.getFillColor());
        g2d.fillRect(105 + x, 97 + y, 1, 4);
        g2d.fillRect(106 + x, 97 + y, 1, 8);
        g2d.fillRect(107 + x, 97 + y, 1, 14);
        g2d.fillRect(108 + x, 98 + y, 1, 31);
        g2d.fillRect(109 + x, 103 + y, 1, 33);
        g2d.fillRect(110 + x, 113 + y, 1, 32);
        g2d.fillRect(107 + x, 116 + y, 1, 9);
        g2d.fillRect(111 + x, 116 + y, 1, 9);
    }

    public void paint2B(int x, int y, GraphicsMap g2d, int length) {
        y += length;


        g2d.setColor(b.getOutlineColor());
        g2d.fillRect(107 + x, 145 + y - length, 1, 2 + length);
        g2d.fillRect(112 + x, 145 + y - length, 1, 1 + length);
        g2d.fillRect(113 + x, 146 + y, 1, 8);
        g2d.fillRect(108 + x, 147 + y, 1, 15);
        g2d.fillRect(114 + x, 154 + y, 1, 3);
        g2d.fillRect(115 + x, 157 + y, 1, 5);
        g2d.fillRect(109 + x, 161 + y, 2, 1);
        g2d.fillRect(113 + x, 161 + y, 1, 2);
        g2d.fillRect(114 + x, 161 + y, 1, 1);
        g2d.fillRect(110 + x, 162 + y, 3, 1);


        g2d.setColor(b.getHighlightColor());
        g2d.fillRect(108 + x, 145 + y - length, 1, 2 + length);
        g2d.fillRect(111 + x, 145 + y - length, 1, 3 + length);
        g2d.fillRect(112 + x, 146 + y, 1, 9);
        g2d.fillRect(109 + x, 147 + y, 1, 14);
        g2d.fillRect(113 + x, 154 + y, 1, 4);
        g2d.fillRect(114 + x, 157 + y, 1, 4);
        g2d.fillRect(110 + x, 160 + y, 4, 1);
        g2d.fillRect(111 + x, 161 + y, 2, 1);


        g2d.setColor(b.getFillColor());
        g2d.fillRect(109 + x, 145 + y - length, 1, 2 + length);
        g2d.fillRect(110 + x, 145 + y - length, 1, 15 + length);
        g2d.fillRect(111 + x, 148 + y, 1, 12);
        g2d.fillRect(112 + x, 155 + y, 1, 5);
        g2d.fillRect(113 + x, 158 + y, 1, 2);
    }

    public void paint2U(int x, int y, GraphicsMap g2d, int length) {


        g2d.setColor(b.getOutlineColor());
        g2d.fillRect(101 + x, 87 + y, 1, 10);
        g2d.fillRect(109 + x, 90 + y, 1, 7);


        g2d.setColor(b.getOutlineColor());
        g2d.fillRect(101 + x, 97 + y, 1, 4);
        g2d.fillRect(109 + x, 97 + y, 1, 5);
        g2d.fillRect(102 + x, 101 + y, 1, 4);
        g2d.fillRect(110 + x, 102 + y, 1, 11);
        g2d.fillRect(103 + x, 105 + y, 1, 3);
        g2d.fillRect(104 + x, 108 + y, 1, 3);
        g2d.fillRect(105 + x, 111 + y, 1, 4);
        g2d.fillRect(111 + x, 113 + y, 1, 3);
        g2d.fillRect(104 + x, 115 + y, 1, 10);
        g2d.fillRect(112 + x, 116 + y, 1, 9);
        g2d.fillRect(105 + x, 125 + y, 1, 4);
        g2d.fillRect(111 + x, 125 + y, 1, 20);
        g2d.fillRect(106 + x, 129 + y, 1, 7);
        g2d.fillRect(107 + x, 136 + y, 1, 9);


        g2d.setColor(b.getHighlightColor());
        g2d.fillRect(102 + x, 87 + y, 1, 10);
        g2d.fillRect(103 + x, 87 + y, 1, 10);
        g2d.fillRect(108 + x, 87 + y, 1, 10);
        g2d.fillRect(109 + x, 87 + y, 1, 3);
        g2d.fillRect(107 + x, 94 + y, 1, 3);


        g2d.setColor(b.getHighlightColor());
        g2d.fillRect(102 + x, 97 + y, 1, 4);
        g2d.fillRect(103 + x, 97 + y, 1, 8);
        g2d.fillRect(107 + x, 97 + y, 2, 1);
        g2d.fillRect(108 + x, 98 + y, 1, 5);
        g2d.fillRect(104 + x, 101 + y, 1, 7);
        g2d.fillRect(109 + x, 102 + y, 1, 11);
        g2d.fillRect(105 + x, 105 + y, 1, 6);
        g2d.fillRect(106 + x, 111 + y, 1, 5);
        g2d.fillRect(110 + x, 113 + y, 1, 3);
        g2d.fillRect(105 + x, 115 + y, 1, 10);
        g2d.fillRect(111 + x, 116 + y, 1, 9);
        g2d.fillRect(106 + x, 125 + y, 1, 4);
        g2d.fillRect(110 + x, 125 + y, 1, 20);
        g2d.fillRect(107 + x, 129 + y, 1, 7);
        g2d.fillRect(108 + x, 136 + y, 1, 9);


        g2d.setColor(b.getFillColor());
        g2d.fillRect(104 + x, 87 + y, 1, 10);
        g2d.fillRect(105 + x, 87 + y, 1, 10);
        g2d.fillRect(106 + x, 87 + y, 1, 10);
        g2d.fillRect(107 + x, 87 + y, 1, 7);


        g2d.setColor(b.getFillColor());
        g2d.fillRect(104 + x, 97 + y, 1, 4);
        g2d.fillRect(105 + x, 97 + y, 1, 8);
        g2d.fillRect(106 + x, 97 + y, 1, 14);
        g2d.fillRect(107 + x, 98 + y, 1, 31);
        g2d.fillRect(108 + x, 103 + y, 1, 33);
        g2d.fillRect(109 + x, 113 + y, 1, 32);
        g2d.fillRect(106 + x, 116 + y, 1, 9);
        g2d.fillRect(110 + x, 116 + y, 1, 9);
    }

    public void paint3B(int x, int y, GraphicsMap g2d, int length) {
        y += length;


        g2d.setColor(b.getOutlineColor());
        g2d.fillRect(106 + x, 145 + y - length, 1, 2 + length);
        g2d.fillRect(111 + x, 145 + y - length, 1, 1 + length);
        g2d.fillRect(112 + x, 146 + y, 1, 8);
        g2d.fillRect(107 + x, 147 + y, 1, 15);
        g2d.fillRect(113 + x, 154 + y, 1, 3);
        g2d.fillRect(114 + x, 157 + y, 1, 5);
        g2d.fillRect(108 + x, 161 + y, 2, 1);
        g2d.fillRect(112 + x, 161 + y, 1, 2);
        g2d.fillRect(113 + x, 161 + y, 1, 1);
        g2d.fillRect(109 + x, 162 + y, 3, 1);


        g2d.setColor(b.getHighlightColor());
        g2d.fillRect(107 + x, 145 + y - length, 1, 2 + length);
        g2d.fillRect(110 + x, 145 + y - length, 1, 3 + length);
        g2d.fillRect(111 + x, 146 + y, 1, 9);
        g2d.fillRect(108 + x, 147 + y, 1, 14);
        g2d.fillRect(112 + x, 154 + y, 1, 4);
        g2d.fillRect(113 + x, 157 + y, 1, 4);
        g2d.fillRect(109 + x, 160 + y, 4, 1);
        g2d.fillRect(110 + x, 161 + y, 2, 1);


        g2d.setColor(b.getFillColor());
        g2d.fillRect(108 + x, 145 + y - length, 1, 2 + length);
        g2d.fillRect(109 + x, 145 + y - length, 1, 15 + length);
        g2d.fillRect(110 + x, 148 + y, 1, 12);
        g2d.fillRect(111 + x, 155 + y, 1, 5);
        g2d.fillRect(112 + x, 158 + y, 1, 2);
    }

    public void paint3U(int x, int y, GraphicsMap g2d, int length) {


        g2d.setColor(b.getOutlineColor());
        g2d.fillRect(101 + x, 87 + y, 1, 10);
        g2d.fillRect(109 + x, 90 + y, 1, 7);


        g2d.setColor(b.getOutlineColor());
        g2d.fillRect(101 + x, 97 + y, 1, 8);
        g2d.fillRect(109 + x, 97 + y, 1, 16);
        g2d.fillRect(102 + x, 105 + y, 1, 3);
        g2d.fillRect(103 + x, 108 + y, 1, 3);
        g2d.fillRect(104 + x, 111 + y, 1, 4);
        g2d.fillRect(110 + x, 113 + y, 1, 3);
        g2d.fillRect(103 + x, 115 + y, 1, 10);
        g2d.fillRect(111 + x, 116 + y, 1, 9);
        g2d.fillRect(104 + x, 125 + y, 1, 4);
        g2d.fillRect(110 + x, 125 + y, 1, 20);
        g2d.fillRect(105 + x, 129 + y, 1, 7);
        g2d.fillRect(106 + x, 136 + y, 1, 9);


        g2d.setColor(b.getHighlightColor());
        g2d.fillRect(102 + x, 87 + y, 1, 10);
        g2d.fillRect(103 + x, 87 + y, 1, 10);
        g2d.fillRect(108 + x, 87 + y, 1, 10);
        g2d.fillRect(109 + x, 87 + y, 1, 3);
        g2d.fillRect(107 + x, 94 + y, 1, 3);


        g2d.setColor(b.getHighlightColor());
        g2d.fillRect(102 + x, 97 + y, 1, 8);
        g2d.fillRect(103 + x, 97 + y, 1, 11);
        g2d.fillRect(107 + x, 97 + y, 2, 1);
        g2d.fillRect(108 + x, 98 + y, 1, 15);
        g2d.fillRect(104 + x, 105 + y, 1, 6);
        g2d.fillRect(105 + x, 111 + y, 1, 5);
        g2d.fillRect(109 + x, 113 + y, 1, 3);
        g2d.fillRect(104 + x, 115 + y, 1, 10);
        g2d.fillRect(110 + x, 116 + y, 1, 9);
        g2d.fillRect(105 + x, 125 + y, 1, 4);
        g2d.fillRect(109 + x, 125 + y, 1, 20);
        g2d.fillRect(106 + x, 129 + y, 1, 7);
        g2d.fillRect(107 + x, 136 + y, 1, 9);


        g2d.setColor(b.getFillColor());
        g2d.fillRect(104 + x, 87 + y, 1, 10);
        g2d.fillRect(105 + x, 87 + y, 1, 10);
        g2d.fillRect(106 + x, 87 + y, 1, 10);
        g2d.fillRect(107 + x, 87 + y, 1, 7);


        g2d.setColor(b.getFillColor());
        g2d.fillRect(104 + x, 97 + y, 1, 8);
        g2d.fillRect(105 + x, 97 + y, 1, 14);
        g2d.fillRect(106 + x, 97 + y, 1, 32);
        g2d.fillRect(107 + x, 98 + y, 1, 38);
        g2d.fillRect(108 + x, 113 + y, 1, 32);
        g2d.fillRect(105 + x, 116 + y, 1, 9);
        g2d.fillRect(109 + x, 116 + y, 1, 9);
    }

    public void paint4B(int x, int y, GraphicsMap g2d, int length) {
        y += length;


        g2d.setColor(b.getOutlineColor());
        g2d.fillRect(107 + x, 141 + y - length, 1, 2 + length);
        g2d.fillRect(112 + x, 141 + y - length, 1, 1 + length);
        g2d.fillRect(113 + x, 142 + y, 1, 8);
        g2d.fillRect(108 + x, 143 + y, 1, 15);
        g2d.fillRect(114 + x, 150 + y, 1, 3);
        g2d.fillRect(115 + x, 153 + y, 1, 5);
        g2d.fillRect(109 + x, 157 + y, 2, 1);
        g2d.fillRect(113 + x, 157 + y, 1, 2);
        g2d.fillRect(114 + x, 157 + y, 1, 1);
        g2d.fillRect(110 + x, 158 + y, 3, 1);


        g2d.setColor(b.getHighlightColor());
        g2d.fillRect(108 + x, 141 + y - length, 1, 2 + length);
        g2d.fillRect(111 + x, 141 + y - length, 1, 3 + length);
        g2d.fillRect(112 + x, 142 + y, 1, 9);
        g2d.fillRect(109 + x, 143 + y, 1, 14);
        g2d.fillRect(113 + x, 150 + y, 1, 4);
        g2d.fillRect(114 + x, 153 + y, 1, 4);
        g2d.fillRect(110 + x, 156 + y, 4, 1);
        g2d.fillRect(111 + x, 157 + y, 2, 1);


        g2d.setColor(b.getFillColor());
        g2d.fillRect(109 + x, 141 + y - length, 1, 2 + length);
        g2d.fillRect(110 + x, 141 + y - length, 1, 15 + length);
        g2d.fillRect(111 + x, 144 + y, 1, 12);
        g2d.fillRect(112 + x, 151 + y, 1, 5);
        g2d.fillRect(113 + x, 154 + y, 1, 2);
    }

    public void paint4U(int x, int y, GraphicsMap g2d, int length) {


        g2d.setColor(b.getOutlineColor());
        g2d.fillRect(101 + x, 87 + y, 1, 10);
        g2d.fillRect(109 + x, 90 + y, 1, 7);


        g2d.setColor(b.getOutlineColor());
        g2d.fillRect(101 + x, 97 + y, 1, 3);
        g2d.fillRect(109 + x, 97 + y, 1, 4);
        g2d.fillRect(102 + x, 100 + y, 1, 4);
        g2d.fillRect(110 + x, 101 + y, 1, 10);
        g2d.fillRect(103 + x, 104 + y, 1, 2);
        g2d.fillRect(104 + x, 106 + y, 1, 3);
        g2d.fillRect(105 + x, 109 + y, 1, 4);
        g2d.fillRect(111 + x, 111 + y, 1, 3);
        g2d.fillRect(104 + x, 113 + y, 1, 9);
        g2d.fillRect(112 + x, 114 + y, 1, 8);
        g2d.fillRect(105 + x, 122 + y, 1, 4);
        g2d.fillRect(111 + x, 122 + y, 1, 19);
        g2d.fillRect(106 + x, 126 + y, 1, 7);
        g2d.fillRect(107 + x, 133 + y, 1, 8);


        g2d.setColor(b.getHighlightColor());
        g2d.fillRect(102 + x, 87 + y, 1, 10);
        g2d.fillRect(103 + x, 87 + y, 1, 10);
        g2d.fillRect(108 + x, 87 + y, 1, 10);
        g2d.fillRect(109 + x, 87 + y, 1, 3);
        g2d.fillRect(107 + x, 94 + y, 1, 3);


        g2d.setColor(b.getHighlightColor());
        g2d.fillRect(102 + x, 97 + y, 1, 3);
        g2d.fillRect(103 + x, 97 + y, 1, 7);
        g2d.fillRect(108 + x, 97 + y, 1, 5);
        g2d.fillRect(104 + x, 100 + y, 1, 6);
        g2d.fillRect(109 + x, 101 + y, 1, 10);
        g2d.fillRect(105 + x, 104 + y, 1, 5);
        g2d.fillRect(106 + x, 109 + y, 1, 5);
        g2d.fillRect(110 + x, 111 + y, 1, 3);
        g2d.fillRect(105 + x, 113 + y, 1, 9);
        g2d.fillRect(111 + x, 114 + y, 1, 8);
        g2d.fillRect(106 + x, 122 + y, 1, 4);
        g2d.fillRect(110 + x, 122 + y, 1, 19);
        g2d.fillRect(107 + x, 126 + y, 1, 7);
        g2d.fillRect(108 + x, 133 + y, 1, 8);


        g2d.setColor(b.getFillColor());
        g2d.fillRect(104 + x, 87 + y, 1, 10);
        g2d.fillRect(105 + x, 87 + y, 1, 10);
        g2d.fillRect(106 + x, 87 + y, 1, 10);
        g2d.fillRect(107 + x, 87 + y, 1, 7);


        g2d.setColor(b.getFillColor());
        g2d.fillRect(104 + x, 97 + y, 1, 3);
        g2d.fillRect(105 + x, 97 + y, 1, 7);
        g2d.fillRect(106 + x, 97 + y, 1, 12);
        g2d.fillRect(107 + x, 97 + y, 1, 29);
        g2d.fillRect(108 + x, 102 + y, 1, 31);
        g2d.fillRect(109 + x, 111 + y, 1, 30);
        g2d.fillRect(106 + x, 114 + y, 1, 8);
        g2d.fillRect(110 + x, 114 + y, 1, 8);
    }

    public void paint5B(int x, int y, GraphicsMap g2d, int length) {
        y += length;


        g2d.setColor(b.getOutlineColor());
        g2d.fillRect(107 + x, 137 + y - length, 1, 2 + length);
        g2d.fillRect(112 + x, 137 + y - length, 1, 1 + length);
        g2d.fillRect(113 + x, 138 + y, 1, 8);
        g2d.fillRect(108 + x, 139 + y, 1, 15);
        g2d.fillRect(114 + x, 146 + y, 1, 3);
        g2d.fillRect(115 + x, 149 + y, 1, 5);
        g2d.fillRect(109 + x, 153 + y, 2, 1);
        g2d.fillRect(113 + x, 153 + y, 1, 2);
        g2d.fillRect(114 + x, 153 + y, 1, 1);
        g2d.fillRect(110 + x, 154 + y, 3, 1);


        g2d.setColor(b.getHighlightColor());
        g2d.fillRect(108 + x, 137 + y - length, 1, 2 + length);
        g2d.fillRect(111 + x, 137 + y - length, 1, 3 + length);
        g2d.fillRect(112 + x, 138 + y, 1, 9);
        g2d.fillRect(109 + x, 139 + y, 1, 14);
        g2d.fillRect(113 + x, 146 + y, 1, 4);
        g2d.fillRect(114 + x, 149 + y, 1, 4);
        g2d.fillRect(110 + x, 152 + y, 4, 1);
        g2d.fillRect(111 + x, 153 + y, 2, 1);


        g2d.setColor(b.getFillColor());
        g2d.fillRect(109 + x, 137 + y - length, 1, 2 + length);
        g2d.fillRect(110 + x, 137 + y - length, 1, 15 + length);
        g2d.fillRect(111 + x, 140 + y, 1, 12);
        g2d.fillRect(112 + x, 147 + y, 1, 5);
        g2d.fillRect(113 + x, 150 + y, 1, 2);
    }

    public void paint5U(int x, int y, GraphicsMap g2d, int length) {


        g2d.setColor(b.getOutlineColor());
        g2d.fillRect(101 + x, 87 + y, 1, 8);
        g2d.fillRect(109 + x, 90 + y, 1, 5);


        g2d.setColor(b.getOutlineColor());
        g2d.fillRect(101 + x, 95 + y, 1, 3);
        g2d.fillRect(109 + x, 95 + y, 1, 4);
        g2d.fillRect(102 + x, 98 + y, 1, 4);
        g2d.fillRect(110 + x, 99 + y, 1, 9);
        g2d.fillRect(103 + x, 102 + y, 1, 2);
        g2d.fillRect(104 + x, 104 + y, 1, 3);
        g2d.fillRect(105 + x, 107 + y, 1, 3);
        g2d.fillRect(111 + x, 108 + y, 1, 3);
        g2d.fillRect(104 + x, 110 + y, 1, 9);
        g2d.fillRect(112 + x, 111 + y, 1, 8);
        g2d.fillRect(105 + x, 119 + y, 1, 4);
        g2d.fillRect(111 + x, 119 + y, 1, 18);
        g2d.fillRect(106 + x, 123 + y, 1, 6);
        g2d.fillRect(107 + x, 129 + y, 1, 8);


        g2d.setColor(b.getHighlightColor());
        g2d.fillRect(102 + x, 87 + y, 1, 8);
        g2d.fillRect(103 + x, 87 + y, 1, 8);
        g2d.fillRect(108 + x, 87 + y, 1, 8);
        g2d.fillRect(109 + x, 87 + y, 1, 3);
        g2d.fillRect(107 + x, 94 + y, 1, 1);


        g2d.setColor(b.getHighlightColor());
        g2d.fillRect(102 + x, 95 + y, 1, 3);
        g2d.fillRect(103 + x, 95 + y, 1, 7);
        g2d.fillRect(108 + x, 95 + y, 1, 5);
        g2d.fillRect(104 + x, 98 + y, 1, 6);
        g2d.fillRect(109 + x, 99 + y, 1, 9);
        g2d.fillRect(105 + x, 102 + y, 1, 5);
        g2d.fillRect(106 + x, 107 + y, 1, 4);
        g2d.fillRect(110 + x, 108 + y, 1, 3);
        g2d.fillRect(105 + x, 110 + y, 1, 9);
        g2d.fillRect(111 + x, 111 + y, 1, 8);
        g2d.fillRect(106 + x, 119 + y, 1, 4);
        g2d.fillRect(110 + x, 119 + y, 1, 18);
        g2d.fillRect(107 + x, 123 + y, 1, 6);
        g2d.fillRect(108 + x, 129 + y, 1, 8);


        g2d.setColor(b.getFillColor());
        g2d.fillRect(104 + x, 87 + y, 1, 8);
        g2d.fillRect(105 + x, 87 + y, 1, 8);
        g2d.fillRect(106 + x, 87 + y, 1, 8);
        g2d.fillRect(107 + x, 87 + y, 1, 7);


        g2d.setColor(b.getFillColor());
        g2d.fillRect(104 + x, 95 + y, 1, 3);
        g2d.fillRect(105 + x, 95 + y, 1, 7);
        g2d.fillRect(106 + x, 95 + y, 1, 12);
        g2d.fillRect(107 + x, 95 + y, 1, 28);
        g2d.fillRect(108 + x, 100 + y, 1, 29);
        g2d.fillRect(109 + x, 108 + y, 1, 29);
        g2d.fillRect(106 + x, 111 + y, 1, 8);
        g2d.fillRect(110 + x, 111 + y, 1, 8);
    }

    public void paint6B(int x, int y, GraphicsMap g2d, int length) {
        y += length;


        g2d.setColor(b.getOutlineColor());
        g2d.fillRect(106 + x, 131 + y - length, 1, 2 + length);
        g2d.fillRect(111 + x, 131 + y - length, 1, 1 + length);
        g2d.fillRect(112 + x, 132 + y, 1, 8);
        g2d.fillRect(107 + x, 133 + y, 1, 15);
        g2d.fillRect(113 + x, 140 + y, 1, 3);
        g2d.fillRect(114 + x, 143 + y, 1, 5);
        g2d.fillRect(108 + x, 147 + y, 2, 1);
        g2d.fillRect(112 + x, 147 + y, 1, 2);
        g2d.fillRect(113 + x, 147 + y, 1, 1);
        g2d.fillRect(109 + x, 148 + y, 3, 1);


        g2d.setColor(b.getHighlightColor());
        g2d.fillRect(107 + x, 131 + y - length, 1, 2 + length);
        g2d.fillRect(110 + x, 131 + y - length, 1, 3 + length);
        g2d.fillRect(111 + x, 132 + y, 1, 9);
        g2d.fillRect(108 + x, 133 + y, 1, 14);
        g2d.fillRect(112 + x, 140 + y, 1, 4);
        g2d.fillRect(113 + x, 143 + y, 1, 4);
        g2d.fillRect(109 + x, 146 + y, 4, 1);
        g2d.fillRect(110 + x, 147 + y, 2, 1);


        g2d.setColor(b.getFillColor());
        g2d.fillRect(108 + x, 131 + y - length, 1, 2 + length);
        g2d.fillRect(109 + x, 131 + y - length, 1, 15 + length);
        g2d.fillRect(110 + x, 134 + y, 1, 12);
        g2d.fillRect(111 + x, 141 + y, 1, 5);
        g2d.fillRect(112 + x, 144 + y, 1, 2);
    }

    public void paint6U(int x, int y, GraphicsMap g2d, int length) {


        g2d.setColor(b.getOutlineColor());
        g2d.fillRect(101 + x, 87 + y, 1, 7);
        g2d.fillRect(109 + x, 90 + y, 1, 4);


        g2d.setColor(b.getOutlineColor());
        g2d.fillRect(101 + x, 94 + y, 1, 5);
        g2d.fillRect(109 + x, 94 + y, 1, 11);
        g2d.fillRect(102 + x, 99 + y, 1, 2);
        g2d.fillRect(103 + x, 101 + y, 1, 3);
        g2d.fillRect(104 + x, 104 + y, 1, 3);
        g2d.fillRect(110 + x, 105 + y, 1, 3);
        g2d.fillRect(103 + x, 107 + y, 1, 8);
        g2d.fillRect(111 + x, 108 + y, 1, 7);
        g2d.fillRect(104 + x, 115 + y, 1, 4);
        g2d.fillRect(110 + x, 115 + y, 1, 16);
        g2d.fillRect(105 + x, 119 + y, 1, 5);
        g2d.fillRect(106 + x, 124 + y, 1, 7);


        g2d.setColor(b.getHighlightColor());
        g2d.fillRect(102 + x, 87 + y, 1, 7);
        g2d.fillRect(103 + x, 87 + y, 1, 7);
        g2d.fillRect(108 + x, 87 + y, 1, 7);
        g2d.fillRect(109 + x, 87 + y, 1, 3);


        g2d.setColor(b.getHighlightColor());
        g2d.fillRect(102 + x, 94 + y, 1, 5);
        g2d.fillRect(103 + x, 94 + y, 1, 7);
        g2d.fillRect(108 + x, 94 + y, 1, 11);
        g2d.fillRect(104 + x, 99 + y, 1, 5);
        g2d.fillRect(105 + x, 104 + y, 1, 4);
        g2d.fillRect(109 + x, 105 + y, 1, 3);
        g2d.fillRect(104 + x, 107 + y, 1, 8);
        g2d.fillRect(110 + x, 108 + y, 1, 7);
        g2d.fillRect(105 + x, 115 + y, 1, 4);
        g2d.fillRect(109 + x, 115 + y, 1, 16);
        g2d.fillRect(106 + x, 119 + y, 1, 5);
        g2d.fillRect(107 + x, 124 + y, 1, 7);


        g2d.setColor(b.getFillColor());
        g2d.fillRect(104 + x, 87 + y, 1, 7);
        g2d.fillRect(105 + x, 87 + y, 1, 7);
        g2d.fillRect(106 + x, 87 + y, 1, 7);
        g2d.fillRect(107 + x, 87 + y, 1, 7);


        g2d.setColor(b.getFillColor());
        g2d.fillRect(104 + x, 94 + y, 1, 5);
        g2d.fillRect(105 + x, 94 + y, 1, 10);
        g2d.fillRect(106 + x, 94 + y, 1, 25);
        g2d.fillRect(107 + x, 94 + y, 1, 30);
        g2d.fillRect(108 + x, 105 + y, 1, 26);
        g2d.fillRect(105 + x, 108 + y, 1, 7);
        g2d.fillRect(109 + x, 108 + y, 1, 7);
    }
}
