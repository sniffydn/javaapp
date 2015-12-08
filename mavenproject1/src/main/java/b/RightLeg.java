/*
 * RightLeg.java
 */
package b;

import util.GraphicsMap;

/**
 *
 * @author doubleD
 */
public class RightLeg {
    //ImageUtilities leg = null;
    int step = 0;

    /** Creates a new instance of LeftLeg */
    public RightLeg(Bd b) {
        this.b = b;
    }
    Bd b = null;

    public void setStep(int step) {
        this.step = step;
    }

    private void draw0(int x, int y, GraphicsMap g2d) {
        x = x + 84;
        if (step == 0 || step == 8 || step == 9 || step == 15) {
            g2d.setColor(b.outlineColor);
            g2d.fillRect(22 + x, 157 + y, 1, 5);
            g2d.fillRect(23 + x, 154 + y, 1, 3);
            g2d.fillRect(23 + x, 161 + y, 1, 1);
            g2d.fillRect(24 + x, 146 + y, 1, 8);
            g2d.fillRect(24 + x, 161 + y, 1, 2);
            g2d.fillRect(25 + x, 116 + y, 1, 9);
            g2d.fillRect(25 + x, 145 + y, 1, 1);
            g2d.fillRect(25 + x, 162 + y, 1, 1);
            g2d.fillRect(26 + x, 113 + y, 1, 3);
            g2d.fillRect(26 + x, 125 + y, 1, 20);
            g2d.fillRect(26 + x, 162 + y, 1, 1);
            g2d.fillRect(27 + x, 102 + y, 1, 11);
            g2d.fillRect(27 + x, 161 + y, 1, 2);
            g2d.fillRect(28 + x, 94 + y, 1, 8);
            g2d.fillRect(28 + x, 161 + y, 1, 1);
            g2d.fillRect(29 + x, 88 + y, 1, 6);
            g2d.fillRect(29 + x, 147 + y, 1, 15);
            g2d.fillRect(30 + x, 136 + y, 1, 11);
            g2d.fillRect(31 + x, 129 + y, 1, 7);
            g2d.fillRect(32 + x, 111 + y, 1, 4);
            g2d.fillRect(32 + x, 125 + y, 1, 4);
            g2d.fillRect(33 + x, 108 + y, 1, 3);
            g2d.fillRect(33 + x, 115 + y, 1, 10);
            g2d.fillRect(34 + x, 105 + y, 1, 3);
            g2d.fillRect(35 + x, 101 + y, 1, 4);
            g2d.fillRect(36 + x, 94 + y, 1, 7);
            g2d.fillRect(37 + x, 87 + y, 1, 7);
            g2d.setColor(b.highlightColor);
            g2d.fillRect(23 + x, 157 + y, 1, 4);
            g2d.fillRect(24 + x, 154 + y, 1, 4);
            g2d.fillRect(24 + x, 160 + y, 1, 1);
            g2d.fillRect(25 + x, 146 + y, 1, 9);
            g2d.fillRect(25 + x, 160 + y, 1, 2);
            g2d.fillRect(26 + x, 116 + y, 1, 9);
            g2d.fillRect(26 + x, 145 + y, 1, 3);
            g2d.fillRect(26 + x, 160 + y, 1, 2);
            g2d.fillRect(27 + x, 113 + y, 1, 3);
            g2d.fillRect(27 + x, 125 + y, 1, 20);
            g2d.fillRect(27 + x, 160 + y, 1, 1);
            g2d.fillRect(28 + x, 102 + y, 1, 11);
            g2d.fillRect(28 + x, 147 + y, 1, 14);
            g2d.fillRect(29 + x, 87 + y, 1, 1);
            g2d.fillRect(29 + x, 94 + y, 1, 9);
            g2d.fillRect(29 + x, 136 + y, 1, 11);
            g2d.fillRect(30 + x, 87 + y, 1, 11);
            g2d.fillRect(30 + x, 129 + y, 1, 7);
            g2d.fillRect(31 + x, 111 + y, 1, 5);
            g2d.fillRect(31 + x, 125 + y, 1, 4);
            g2d.fillRect(32 + x, 105 + y, 1, 6);
            g2d.fillRect(32 + x, 115 + y, 1, 10);
            g2d.fillRect(33 + x, 101 + y, 1, 7);
            g2d.fillRect(34 + x, 94 + y, 1, 11);
            g2d.fillRect(35 + x, 87 + y, 1, 14);
            g2d.fillRect(36 + x, 87 + y, 1, 7);
            g2d.setColor(b.fillColor);
            g2d.fillRect(24 + x, 158 + y, 1, 2);
            g2d.fillRect(25 + x, 155 + y, 1, 5);
            g2d.fillRect(26 + x, 148 + y, 1, 12);
            g2d.fillRect(27 + x, 116 + y, 1, 9);
            g2d.fillRect(27 + x, 145 + y, 1, 15);
            g2d.fillRect(28 + x, 113 + y, 1, 34);
            g2d.fillRect(29 + x, 103 + y, 1, 33);
            g2d.fillRect(30 + x, 98 + y, 1, 31);
            g2d.fillRect(31 + x, 87 + y, 1, 24);
            g2d.fillRect(31 + x, 116 + y, 1, 9);
            g2d.fillRect(32 + x, 87 + y, 1, 18);
            g2d.fillRect(33 + x, 87 + y, 1, 14);
            g2d.fillRect(34 + x, 87 + y, 1, 7);
        } else if (step == 1 || step == 7) {
            g2d.setColor(b.outlineColor);
            g2d.fillRect(23 + x, 153 + y, 1, 5);
            g2d.fillRect(24 + x, 150 + y, 1, 3);
            g2d.fillRect(24 + x, 157 + y, 1, 1);
            g2d.fillRect(25 + x, 142 + y, 1, 8);
            g2d.fillRect(25 + x, 157 + y, 1, 2);
            g2d.fillRect(26 + x, 114 + y, 1, 8);
            g2d.fillRect(26 + x, 141 + y, 1, 1);
            g2d.fillRect(26 + x, 158 + y, 1, 1);
            g2d.fillRect(27 + x, 111 + y, 1, 3);
            g2d.fillRect(27 + x, 122 + y, 1, 19);
            g2d.fillRect(27 + x, 158 + y, 1, 1);
            g2d.fillRect(28 + x, 101 + y, 1, 10);
            g2d.fillRect(28 + x, 157 + y, 1, 2);
            g2d.fillRect(29 + x, 89 + y, 1, 12);
            g2d.fillRect(29 + x, 157 + y, 1, 1);
            g2d.fillRect(30 + x, 143 + y, 1, 15);
            g2d.fillRect(31 + x, 133 + y, 1, 10);
            g2d.fillRect(32 + x, 126 + y, 1, 7);
            g2d.fillRect(33 + x, 109 + y, 1, 4);
            g2d.fillRect(33 + x, 122 + y, 1, 4);
            g2d.fillRect(34 + x, 106 + y, 1, 3);
            g2d.fillRect(34 + x, 113 + y, 1, 9);
            g2d.fillRect(35 + x, 104 + y, 1, 2);
            g2d.fillRect(36 + x, 100 + y, 1, 4);
            g2d.fillRect(37 + x, 87 + y, 1, 13);
            g2d.setColor(b.highlightColor);
            g2d.fillRect(24 + x, 153 + y, 1, 4);
            g2d.fillRect(25 + x, 150 + y, 1, 4);
            g2d.fillRect(25 + x, 156 + y, 1, 1);
            g2d.fillRect(26 + x, 142 + y, 1, 9);
            g2d.fillRect(26 + x, 156 + y, 1, 2);
            g2d.fillRect(27 + x, 114 + y, 1, 8);
            g2d.fillRect(27 + x, 141 + y, 1, 3);
            g2d.fillRect(27 + x, 156 + y, 1, 2);
            g2d.fillRect(28 + x, 111 + y, 1, 3);
            g2d.fillRect(28 + x, 122 + y, 1, 19);
            g2d.fillRect(28 + x, 156 + y, 1, 1);
            g2d.fillRect(29 + x, 87 + y, 1, 2);
            g2d.fillRect(29 + x, 101 + y, 1, 10);
            g2d.fillRect(29 + x, 143 + y, 1, 14);
            g2d.fillRect(30 + x, 87 + y, 1, 15);
            g2d.fillRect(30 + x, 133 + y, 1, 10);
            g2d.fillRect(31 + x, 94 + y, 1, 3);
            g2d.fillRect(31 + x, 126 + y, 1, 7);
            g2d.fillRect(32 + x, 109 + y, 1, 5);
            g2d.fillRect(32 + x, 122 + y, 1, 4);
            g2d.fillRect(33 + x, 104 + y, 1, 5);
            g2d.fillRect(33 + x, 113 + y, 1, 9);
            g2d.fillRect(34 + x, 100 + y, 1, 6);
            g2d.fillRect(35 + x, 87 + y, 1, 17);
            g2d.fillRect(36 + x, 87 + y, 1, 13);
            g2d.setColor(b.fillColor);
            g2d.fillRect(25 + x, 154 + y, 1, 2);
            g2d.fillRect(26 + x, 151 + y, 1, 5);
            g2d.fillRect(27 + x, 144 + y, 1, 12);
            g2d.fillRect(28 + x, 114 + y, 1, 8);
            g2d.fillRect(28 + x, 141 + y, 1, 15);
            g2d.fillRect(29 + x, 111 + y, 1, 32);
            g2d.fillRect(30 + x, 102 + y, 1, 31);
            g2d.fillRect(31 + x, 87 + y, 1, 7);
            g2d.fillRect(31 + x, 97 + y, 1, 29);
            g2d.fillRect(32 + x, 87 + y, 1, 22);
            g2d.fillRect(32 + x, 114 + y, 1, 8);
            g2d.fillRect(33 + x, 87 + y, 1, 17);
            g2d.fillRect(34 + x, 87 + y, 1, 13);
        } else if (step == 2 || step == 6) {
            g2d.setColor(b.outlineColor);
            g2d.fillRect(23 + x, 149 + y, 1, 5);
            g2d.fillRect(24 + x, 146 + y, 1, 3);
            g2d.fillRect(24 + x, 153 + y, 1, 1);
            g2d.fillRect(25 + x, 138 + y, 1, 8);
            g2d.fillRect(25 + x, 153 + y, 1, 2);
            g2d.fillRect(26 + x, 111 + y, 1, 8);
            g2d.fillRect(26 + x, 137 + y, 1, 1);
            g2d.fillRect(26 + x, 154 + y, 1, 1);
            g2d.fillRect(27 + x, 108 + y, 1, 3);
            g2d.fillRect(27 + x, 119 + y, 1, 18);
            g2d.fillRect(27 + x, 154 + y, 1, 1);
            g2d.fillRect(28 + x, 99 + y, 1, 9);
            g2d.fillRect(28 + x, 153 + y, 1, 2);
            g2d.fillRect(29 + x, 89 + y, 1, 10);
            g2d.fillRect(29 + x, 153 + y, 1, 1);
            g2d.fillRect(30 + x, 139 + y, 1, 15);
            g2d.fillRect(31 + x, 129 + y, 1, 10);
            g2d.fillRect(32 + x, 123 + y, 1, 6);
            g2d.fillRect(33 + x, 107 + y, 1, 3);
            g2d.fillRect(33 + x, 119 + y, 1, 4);
            g2d.fillRect(34 + x, 104 + y, 1, 3);
            g2d.fillRect(34 + x, 110 + y, 1, 9);
            g2d.fillRect(35 + x, 102 + y, 1, 2);
            g2d.fillRect(36 + x, 98 + y, 1, 4);
            g2d.fillRect(37 + x, 87 + y, 1, 11);
            g2d.setColor(b.highlightColor);
            g2d.fillRect(24 + x, 149 + y, 1, 4);
            g2d.fillRect(25 + x, 146 + y, 1, 4);
            g2d.fillRect(25 + x, 152 + y, 1, 1);
            g2d.fillRect(26 + x, 138 + y, 1, 9);
            g2d.fillRect(26 + x, 152 + y, 1, 2);
            g2d.fillRect(27 + x, 111 + y, 1, 8);
            g2d.fillRect(27 + x, 137 + y, 1, 3);
            g2d.fillRect(27 + x, 152 + y, 1, 2);
            g2d.fillRect(28 + x, 108 + y, 1, 3);
            g2d.fillRect(28 + x, 119 + y, 1, 18);
            g2d.fillRect(28 + x, 152 + y, 1, 1);
            g2d.fillRect(29 + x, 87 + y, 1, 2);
            g2d.fillRect(29 + x, 99 + y, 1, 9);
            g2d.fillRect(29 + x, 139 + y, 1, 14);
            g2d.fillRect(30 + x, 87 + y, 1, 13);
            g2d.fillRect(30 + x, 129 + y, 1, 10);
            g2d.fillRect(31 + x, 94 + y, 1, 1);
            g2d.fillRect(31 + x, 123 + y, 1, 6);
            g2d.fillRect(32 + x, 107 + y, 1, 4);
            g2d.fillRect(32 + x, 119 + y, 1, 4);
            g2d.fillRect(33 + x, 102 + y, 1, 5);
            g2d.fillRect(33 + x, 110 + y, 1, 9);
            g2d.fillRect(34 + x, 98 + y, 1, 6);
            g2d.fillRect(35 + x, 87 + y, 1, 15);
            g2d.fillRect(36 + x, 87 + y, 1, 11);
            g2d.setColor(b.fillColor);
            g2d.fillRect(25 + x, 150 + y, 1, 2);
            g2d.fillRect(26 + x, 147 + y, 1, 5);
            g2d.fillRect(27 + x, 140 + y, 1, 12);
            g2d.fillRect(28 + x, 111 + y, 1, 8);
            g2d.fillRect(28 + x, 137 + y, 1, 15);
            g2d.fillRect(29 + x, 108 + y, 1, 31);
            g2d.fillRect(30 + x, 100 + y, 1, 29);
            g2d.fillRect(31 + x, 87 + y, 1, 7);
            g2d.fillRect(31 + x, 95 + y, 1, 28);
            g2d.fillRect(32 + x, 87 + y, 1, 20);
            g2d.fillRect(32 + x, 111 + y, 1, 8);
            g2d.fillRect(33 + x, 87 + y, 1, 15);
            g2d.fillRect(34 + x, 87 + y, 1, 11);
        } else if (step == 3 || step == 5) {
            g2d.setColor(b.outlineColor);
            g2d.fillRect(24 + x, 143 + y, 1, 5);
            g2d.fillRect(25 + x, 140 + y, 1, 3);
            g2d.fillRect(25 + x, 147 + y, 1, 1);
            g2d.fillRect(26 + x, 132 + y, 1, 8);
            g2d.fillRect(26 + x, 147 + y, 1, 2);
            g2d.fillRect(27 + x, 108 + y, 1, 7);
            g2d.fillRect(27 + x, 131 + y, 1, 1);
            g2d.fillRect(27 + x, 148 + y, 1, 1);
            g2d.fillRect(28 + x, 105 + y, 1, 3);
            g2d.fillRect(28 + x, 115 + y, 1, 16);
            g2d.fillRect(28 + x, 148 + y, 1, 1);
            g2d.fillRect(29 + x, 89 + y, 1, 16);
            g2d.fillRect(29 + x, 147 + y, 1, 2);
            g2d.fillRect(30 + x, 147 + y, 1, 1);
            g2d.fillRect(31 + x, 133 + y, 1, 15);
            g2d.fillRect(32 + x, 124 + y, 1, 9);
            g2d.fillRect(33 + x, 119 + y, 1, 5);
            g2d.fillRect(34 + x, 104 + y, 1, 3);
            g2d.fillRect(34 + x, 115 + y, 1, 4);
            g2d.fillRect(35 + x, 101 + y, 1, 3);
            g2d.fillRect(35 + x, 107 + y, 1, 8);
            g2d.fillRect(36 + x, 99 + y, 1, 2);
            g2d.fillRect(37 + x, 87 + y, 1, 12);
            g2d.setColor(b.highlightColor);
            g2d.fillRect(25 + x, 143 + y, 1, 4);
            g2d.fillRect(26 + x, 140 + y, 1, 4);
            g2d.fillRect(26 + x, 146 + y, 1, 1);
            g2d.fillRect(27 + x, 132 + y, 1, 9);
            g2d.fillRect(27 + x, 146 + y, 1, 2);
            g2d.fillRect(28 + x, 108 + y, 1, 7);
            g2d.fillRect(28 + x, 131 + y, 1, 3);
            g2d.fillRect(28 + x, 146 + y, 1, 2);
            g2d.fillRect(29 + x, 87 + y, 1, 2);
            g2d.fillRect(29 + x, 105 + y, 1, 3);
            g2d.fillRect(29 + x, 115 + y, 1, 16);
            g2d.fillRect(29 + x, 146 + y, 1, 1);
            g2d.fillRect(30 + x, 87 + y, 1, 18);
            g2d.fillRect(30 + x, 133 + y, 1, 14);
            g2d.fillRect(31 + x, 124 + y, 1, 9);
            g2d.fillRect(32 + x, 119 + y, 1, 5);
            g2d.fillRect(33 + x, 104 + y, 1, 4);
            g2d.fillRect(33 + x, 115 + y, 1, 4);
            g2d.fillRect(34 + x, 99 + y, 1, 5);
            g2d.fillRect(34 + x, 107 + y, 1, 8);
            g2d.fillRect(35 + x, 87 + y, 1, 14);
            g2d.fillRect(36 + x, 87 + y, 1, 12);
            g2d.setColor(b.fillColor);
            g2d.fillRect(26 + x, 144 + y, 1, 2);
            g2d.fillRect(27 + x, 141 + y, 1, 5);
            g2d.fillRect(28 + x, 134 + y, 1, 12);
            g2d.fillRect(29 + x, 108 + y, 1, 7);
            g2d.fillRect(29 + x, 131 + y, 1, 15);
            g2d.fillRect(30 + x, 105 + y, 1, 28);
            g2d.fillRect(31 + x, 87 + y, 1, 37);
            g2d.fillRect(32 + x, 87 + y, 1, 32);
            g2d.fillRect(33 + x, 87 + y, 1, 17);
            g2d.fillRect(33 + x, 108 + y, 1, 7);
            g2d.fillRect(34 + x, 87 + y, 1, 12);
        } else if (step == 4) {
            g2d.setColor(b.outlineColor);
            g2d.fillRect(25 + x, 139 + y, 1, 5);
            g2d.fillRect(26 + x, 136 + y, 1, 3);
            g2d.fillRect(26 + x, 143 + y, 1, 1);
            g2d.fillRect(27 + x, 128 + y, 1, 8);
            g2d.fillRect(27 + x, 143 + y, 1, 2);
            g2d.fillRect(28 + x, 104 + y, 1, 7);
            g2d.fillRect(28 + x, 127 + y, 1, 1);
            g2d.fillRect(28 + x, 144 + y, 1, 1);
            g2d.fillRect(29 + x, 88 + y, 1, 16);
            g2d.fillRect(29 + x, 111 + y, 1, 16);
            g2d.fillRect(29 + x, 144 + y, 1, 1);
            g2d.fillRect(30 + x, 143 + y, 1, 2);
            g2d.fillRect(31 + x, 143 + y, 1, 1);
            g2d.fillRect(32 + x, 129 + y, 1, 15);
            g2d.fillRect(33 + x, 120 + y, 1, 9);
            g2d.fillRect(34 + x, 100 + y, 1, 1);
            g2d.fillRect(34 + x, 115 + y, 1, 5);
            g2d.fillRect(35 + x, 97 + y, 1, 3);
            g2d.fillRect(35 + x, 101 + y, 1, 2);
            g2d.fillRect(35 + x, 111 + y, 1, 4);
            g2d.fillRect(36 + x, 95 + y, 1, 2);
            g2d.fillRect(36 + x, 103 + y, 1, 8);
            g2d.fillRect(37 + x, 87 + y, 1, 8);
            g2d.setColor(b.highlightColor);
            g2d.fillRect(26 + x, 139 + y, 1, 4);
            g2d.fillRect(27 + x, 136 + y, 1, 4);
            g2d.fillRect(27 + x, 142 + y, 1, 1);
            g2d.fillRect(28 + x, 128 + y, 1, 9);
            g2d.fillRect(28 + x, 142 + y, 1, 2);
            g2d.fillRect(29 + x, 87 + y, 1, 1);
            g2d.fillRect(29 + x, 104 + y, 1, 7);
            g2d.fillRect(29 + x, 127 + y, 1, 3);
            g2d.fillRect(29 + x, 142 + y, 1, 2);
            g2d.fillRect(30 + x, 87 + y, 1, 17);
            g2d.fillRect(30 + x, 111 + y, 1, 16);
            g2d.fillRect(30 + x, 142 + y, 1, 1);
            g2d.fillRect(31 + x, 129 + y, 1, 14);
            g2d.fillRect(32 + x, 120 + y, 1, 9);
            g2d.fillRect(33 + x, 100 + y, 1, 1);
            g2d.fillRect(33 + x, 115 + y, 1, 5);
            g2d.fillRect(34 + x, 95 + y, 1, 5);
            g2d.fillRect(34 + x, 101 + y, 1, 3);
            g2d.fillRect(34 + x, 111 + y, 1, 4);
            g2d.fillRect(35 + x, 87 + y, 1, 10);
            g2d.fillRect(35 + x, 103 + y, 1, 8);
            g2d.fillRect(36 + x, 87 + y, 1, 8);
            g2d.setColor(b.fillColor);
            g2d.fillRect(27 + x, 140 + y, 1, 2);
            g2d.fillRect(28 + x, 137 + y, 1, 5);
            g2d.fillRect(29 + x, 130 + y, 1, 12);
            g2d.fillRect(30 + x, 104 + y, 1, 7);
            g2d.fillRect(30 + x, 127 + y, 1, 15);
            g2d.fillRect(31 + x, 87 + y, 1, 42);
            g2d.fillRect(32 + x, 87 + y, 1, 33);
            g2d.fillRect(33 + x, 87 + y, 1, 13);
            g2d.fillRect(33 + x, 101 + y, 1, 14);
            g2d.fillRect(34 + x, 87 + y, 1, 8);
            g2d.fillRect(34 + x, 104 + y, 1, 7);
        } else if (step == 10 || step == 14) {
            g2d.setColor(b.outlineColor);
            g2d.fillRect(23 + x, 157 + y, 1, 5);
            g2d.fillRect(24 + x, 154 + y, 1, 3);
            g2d.fillRect(24 + x, 161 + y, 1, 1);
            g2d.fillRect(25 + x, 146 + y, 1, 8);
            g2d.fillRect(25 + x, 161 + y, 1, 2);
            g2d.fillRect(26 + x, 116 + y, 1, 9);
            g2d.fillRect(26 + x, 145 + y, 1, 1);
            g2d.fillRect(26 + x, 162 + y, 1, 1);
            g2d.fillRect(27 + x, 113 + y, 1, 3);
            g2d.fillRect(27 + x, 125 + y, 1, 20);
            g2d.fillRect(27 + x, 162 + y, 1, 1);
            g2d.fillRect(28 + x, 102 + y, 1, 11);
            g2d.fillRect(28 + x, 161 + y, 1, 2);
            g2d.fillRect(29 + x, 88 + y, 1, 14);
            g2d.fillRect(29 + x, 161 + y, 1, 1);
            g2d.fillRect(30 + x, 147 + y, 1, 15);
            g2d.fillRect(31 + x, 136 + y, 1, 11);
            g2d.fillRect(32 + x, 129 + y, 1, 7);
            g2d.fillRect(33 + x, 111 + y, 1, 4);
            g2d.fillRect(33 + x, 125 + y, 1, 4);
            g2d.fillRect(34 + x, 108 + y, 1, 3);
            g2d.fillRect(34 + x, 115 + y, 1, 10);
            g2d.fillRect(35 + x, 105 + y, 1, 3);
            g2d.fillRect(36 + x, 101 + y, 1, 4);
            g2d.fillRect(37 + x, 87 + y, 1, 14);
            g2d.setColor(b.highlightColor);
            g2d.fillRect(24 + x, 157 + y, 1, 4);
            g2d.fillRect(25 + x, 154 + y, 1, 4);
            g2d.fillRect(25 + x, 160 + y, 1, 1);
            g2d.fillRect(26 + x, 146 + y, 1, 9);
            g2d.fillRect(26 + x, 160 + y, 1, 2);
            g2d.fillRect(27 + x, 116 + y, 1, 9);
            g2d.fillRect(27 + x, 145 + y, 1, 3);
            g2d.fillRect(27 + x, 160 + y, 1, 2);
            g2d.fillRect(28 + x, 113 + y, 1, 3);
            g2d.fillRect(28 + x, 125 + y, 1, 20);
            g2d.fillRect(28 + x, 160 + y, 1, 1);
            g2d.fillRect(29 + x, 87 + y, 1, 1);
            g2d.fillRect(29 + x, 102 + y, 1, 11);
            g2d.fillRect(29 + x, 147 + y, 1, 14);
            g2d.fillRect(30 + x, 87 + y, 1, 16);
            g2d.fillRect(30 + x, 136 + y, 1, 11);
            g2d.fillRect(31 + x, 94 + y, 1, 4);
            g2d.fillRect(31 + x, 129 + y, 1, 7);
            g2d.fillRect(32 + x, 111 + y, 1, 5);
            g2d.fillRect(32 + x, 125 + y, 1, 4);
            g2d.fillRect(33 + x, 105 + y, 1, 6);
            g2d.fillRect(33 + x, 115 + y, 1, 10);
            g2d.fillRect(34 + x, 101 + y, 1, 7);
            g2d.fillRect(35 + x, 87 + y, 1, 18);
            g2d.fillRect(36 + x, 87 + y, 1, 14);
            g2d.setColor(b.fillColor);
            g2d.fillRect(25 + x, 158 + y, 1, 2);
            g2d.fillRect(26 + x, 155 + y, 1, 5);
            g2d.fillRect(27 + x, 148 + y, 1, 12);
            g2d.fillRect(28 + x, 116 + y, 1, 9);
            g2d.fillRect(28 + x, 145 + y, 1, 15);
            g2d.fillRect(29 + x, 113 + y, 1, 34);
            g2d.fillRect(30 + x, 103 + y, 1, 33);
            g2d.fillRect(31 + x, 87 + y, 1, 7);
            g2d.fillRect(31 + x, 98 + y, 1, 31);
            g2d.fillRect(32 + x, 87 + y, 1, 24);
            g2d.fillRect(32 + x, 116 + y, 1, 9);
            g2d.fillRect(33 + x, 87 + y, 1, 18);
            g2d.fillRect(34 + x, 87 + y, 1, 14);
        } else if (step == 11 || step == 12 || step == 13) {
            g2d.setColor(b.outlineColor);
            g2d.fillRect(24 + x, 157 + y, 1, 5);
            g2d.fillRect(25 + x, 154 + y, 1, 3);
            g2d.fillRect(25 + x, 161 + y, 1, 1);
            g2d.fillRect(26 + x, 146 + y, 1, 8);
            g2d.fillRect(26 + x, 161 + y, 1, 2);
            g2d.fillRect(27 + x, 116 + y, 1, 9);
            g2d.fillRect(27 + x, 145 + y, 1, 1);
            g2d.fillRect(27 + x, 162 + y, 1, 1);
            g2d.fillRect(28 + x, 113 + y, 1, 3);
            g2d.fillRect(28 + x, 125 + y, 1, 20);
            g2d.fillRect(28 + x, 162 + y, 1, 1);
            g2d.fillRect(29 + x, 88 + y, 1, 25);
            g2d.fillRect(29 + x, 161 + y, 1, 2);
            g2d.fillRect(30 + x, 161 + y, 1, 1);
            g2d.fillRect(31 + x, 147 + y, 1, 15);
            g2d.fillRect(32 + x, 136 + y, 1, 11);
            g2d.fillRect(33 + x, 129 + y, 1, 7);
            g2d.fillRect(34 + x, 111 + y, 1, 4);
            g2d.fillRect(34 + x, 125 + y, 1, 4);
            g2d.fillRect(35 + x, 108 + y, 1, 3);
            g2d.fillRect(35 + x, 115 + y, 1, 10);
            g2d.fillRect(36 + x, 105 + y, 1, 3);
            g2d.fillRect(37 + x, 87 + y, 1, 18);
            g2d.setColor(b.highlightColor);
            g2d.fillRect(25 + x, 157 + y, 1, 4);
            g2d.fillRect(26 + x, 154 + y, 1, 4);
            g2d.fillRect(26 + x, 160 + y, 1, 1);
            g2d.fillRect(27 + x, 146 + y, 1, 9);
            g2d.fillRect(27 + x, 160 + y, 1, 2);
            g2d.fillRect(28 + x, 116 + y, 1, 9);
            g2d.fillRect(28 + x, 145 + y, 1, 3);
            g2d.fillRect(28 + x, 160 + y, 1, 2);
            g2d.fillRect(29 + x, 87 + y, 1, 1);
            g2d.fillRect(29 + x, 113 + y, 1, 3);
            g2d.fillRect(29 + x, 125 + y, 1, 20);
            g2d.fillRect(29 + x, 160 + y, 1, 1);
            g2d.fillRect(30 + x, 87 + y, 1, 26);
            g2d.fillRect(30 + x, 147 + y, 1, 14);
            g2d.fillRect(31 + x, 94 + y, 1, 4);
            g2d.fillRect(31 + x, 136 + y, 1, 11);
            g2d.fillRect(32 + x, 129 + y, 1, 7);
            g2d.fillRect(33 + x, 111 + y, 1, 5);
            g2d.fillRect(33 + x, 125 + y, 1, 4);
            g2d.fillRect(34 + x, 105 + y, 1, 6);
            g2d.fillRect(34 + x, 115 + y, 1, 10);
            g2d.fillRect(35 + x, 87 + y, 1, 21);
            g2d.fillRect(36 + x, 87 + y, 1, 18);
            g2d.setColor(b.fillColor);
            g2d.fillRect(26 + x, 158 + y, 1, 2);
            g2d.fillRect(27 + x, 155 + y, 1, 5);
            g2d.fillRect(28 + x, 148 + y, 1, 12);
            g2d.fillRect(29 + x, 116 + y, 1, 9);
            g2d.fillRect(29 + x, 145 + y, 1, 15);
            g2d.fillRect(30 + x, 113 + y, 1, 34);
            g2d.fillRect(31 + x, 87 + y, 1, 7);
            g2d.fillRect(31 + x, 98 + y, 1, 38);
            g2d.fillRect(32 + x, 87 + y, 1, 42);
            g2d.fillRect(33 + x, 87 + y, 1, 24);
            g2d.fillRect(33 + x, 116 + y, 1, 9);
            g2d.fillRect(34 + x, 87 + y, 1, 18);
        }
    }

    public void paint(int x, int y, GraphicsMap g2d) {

        if (step == 0 || step == 8 || step == 9 || step == 15) {
            draw0(x, y, g2d, b.legLength);
        } else if (step == 1 || step == 7) {
            draw1(x, y, g2d, b.legLength);
        } else if (step == 2 || step == 6) {
            draw2(x, y, g2d, b.legLength);
        } else if (step == 3 || step == 5) {
            draw3(x, y, g2d, b.legLength);
        } else if (step == 4) {
            draw4(x, y, g2d, b.legLength);
        } else if (step == 10 || step == 14) {
            draw5(x, y, g2d, b.legLength);
        } else if (step == 11 || step == 12 || step == 13) {
            draw6(x, y, g2d, b.legLength);
        }

    }

    private void draw0(int x, int y, GraphicsMap g2d, int length) {
        paint1U(x, y, g2d, length);
        paintB(x, y, g2d, length);
    }

    private void draw1(int x, int y, GraphicsMap g2d, int length) {
        paint4U(x, y, g2d, length);
        paintB(x + 1, y - 4, g2d, length);
    }

    private void draw2(int x, int y, GraphicsMap g2d, int length) {
        paint5U(x, y, g2d, length);
        paintB(x + 1, y - 8, g2d, length);
    }

    private void draw3(int x, int y, GraphicsMap g2d, int length) {
        paint6U(x, y, g2d, length);
        paintB(x + 2, y - 14, g2d, length);
    }

    private void draw4(int x, int y, GraphicsMap g2d, int length) {
        paint7U(x, y, g2d, length);
        paintB(x + 3, y - 18, g2d, length);
    }

    private void draw5(int x, int y, GraphicsMap g2d, int length) {
        paint2U(x, y, g2d, length);
        paintB(x + 1, y, g2d, length);
    }

    private void draw6(int x, int y, GraphicsMap g2d, int length) {
        paint3U(x, y, g2d, length);
        paintB(x + 2, y, g2d, length);
    }

    public void paint2U(int x, int y, GraphicsMap g2d, int length) {


        g2d.setColor(b.getOutlineColor());
        g2d.fillRect(121 + x, 87 + y, 1, 10);
        g2d.fillRect(113 + x, 90 + y, 1, 7);


        g2d.setColor(b.getOutlineColor());
        g2d.fillRect(113 + x, 97 + y, 1, 5);
        g2d.fillRect(121 + x, 97 + y, 1, 4);
        g2d.fillRect(120 + x, 101 + y, 1, 4);
        g2d.fillRect(112 + x, 102 + y, 1, 11);
        g2d.fillRect(119 + x, 105 + y, 1, 3);
        g2d.fillRect(118 + x, 108 + y, 1, 3);
        g2d.fillRect(117 + x, 111 + y, 1, 4);
        g2d.fillRect(111 + x, 113 + y, 1, 3);
        g2d.fillRect(118 + x, 115 + y, 1, 10);
        g2d.fillRect(110 + x, 116 + y, 1, 9);
        g2d.fillRect(111 + x, 125 + y, 1, 20);
        g2d.fillRect(117 + x, 125 + y, 1, 4);
        g2d.fillRect(116 + x, 129 + y, 1, 7);
        g2d.fillRect(115 + x, 136 + y, 1, 9);


        g2d.setColor(b.getHighlightColor());
        g2d.fillRect(113 + x, 87 + y, 1, 3);
        g2d.fillRect(114 + x, 87 + y, 1, 10);
        g2d.fillRect(119 + x, 87 + y, 1, 10);
        g2d.fillRect(120 + x, 87 + y, 1, 10);
        g2d.fillRect(115 + x, 94 + y, 1, 3);


        g2d.setColor(b.getHighlightColor());
        g2d.fillRect(114 + x, 97 + y, 1, 6);
        g2d.fillRect(115 + x, 97 + y, 1, 1);
        g2d.fillRect(119 + x, 97 + y, 1, 8);
        g2d.fillRect(120 + x, 97 + y, 1, 4);
        g2d.fillRect(118 + x, 101 + y, 1, 7);
        g2d.fillRect(113 + x, 102 + y, 1, 11);
        g2d.fillRect(117 + x, 105 + y, 1, 6);
        g2d.fillRect(116 + x, 111 + y, 1, 5);
        g2d.fillRect(112 + x, 113 + y, 1, 3);
        g2d.fillRect(117 + x, 115 + y, 1, 10);
        g2d.fillRect(111 + x, 116 + y, 1, 9);
        g2d.fillRect(112 + x, 125 + y, 1, 20);
        g2d.fillRect(116 + x, 125 + y, 1, 4);
        g2d.fillRect(115 + x, 129 + y, 1, 7);
        g2d.fillRect(114 + x, 136 + y, 1, 9);


        g2d.setColor(b.getFillColor());
        g2d.fillRect(115 + x, 87 + y, 1, 7);
        g2d.fillRect(116 + x, 87 + y, 1, 10);
        g2d.fillRect(117 + x, 87 + y, 1, 10);
        g2d.fillRect(118 + x, 87 + y, 1, 10);


        g2d.setColor(b.getFillColor());
        g2d.fillRect(116 + x, 97 + y, 1, 14);
        g2d.fillRect(117 + x, 97 + y, 1, 8);
        g2d.fillRect(118 + x, 97 + y, 1, 4);
        g2d.fillRect(115 + x, 98 + y, 1, 31);
        g2d.fillRect(114 + x, 103 + y, 1, 33);
        g2d.fillRect(113 + x, 113 + y, 1, 32);
        g2d.fillRect(112 + x, 116 + y, 1, 9);
        g2d.fillRect(116 + x, 116 + y, 1, 9);
    }

    public void paint3U(int x, int y, GraphicsMap g2d, int length) {


        g2d.setColor(b.getOutlineColor());
        g2d.fillRect(121 + x, 87 + y, 1, 10);
        g2d.fillRect(113 + x, 90 + y, 1, 7);


        g2d.setColor(b.getOutlineColor());
        g2d.fillRect(113 + x, 97 + y, 1, 16);
        g2d.fillRect(121 + x, 97 + y, 1, 8);
        g2d.fillRect(120 + x, 105 + y, 1, 3);
        g2d.fillRect(119 + x, 108 + y, 1, 3);
        g2d.fillRect(118 + x, 111 + y, 1, 4);
        g2d.fillRect(112 + x, 113 + y, 1, 3);
        g2d.fillRect(119 + x, 115 + y, 1, 10);
        g2d.fillRect(111 + x, 116 + y, 1, 9);
        g2d.fillRect(112 + x, 125 + y, 1, 20);
        g2d.fillRect(118 + x, 125 + y, 1, 4);
        g2d.fillRect(117 + x, 129 + y, 1, 7);
        g2d.fillRect(116 + x, 136 + y, 1, 9);


        g2d.setColor(b.getHighlightColor());
        g2d.fillRect(113 + x, 87 + y, 1, 3);
        g2d.fillRect(114 + x, 87 + y, 1, 10);
        g2d.fillRect(119 + x, 87 + y, 1, 10);
        g2d.fillRect(120 + x, 87 + y, 1, 10);
        g2d.fillRect(115 + x, 94 + y, 1, 3);


        g2d.setColor(b.getHighlightColor());
        g2d.fillRect(114 + x, 97 + y, 1, 16);
        g2d.fillRect(115 + x, 97 + y, 1, 1);
        g2d.fillRect(119 + x, 97 + y, 1, 11);
        g2d.fillRect(120 + x, 97 + y, 1, 8);
        g2d.fillRect(118 + x, 105 + y, 1, 6);
        g2d.fillRect(117 + x, 111 + y, 1, 5);
        g2d.fillRect(113 + x, 113 + y, 1, 3);
        g2d.fillRect(118 + x, 115 + y, 1, 10);
        g2d.fillRect(112 + x, 116 + y, 1, 9);
        g2d.fillRect(113 + x, 125 + y, 1, 20);
        g2d.fillRect(117 + x, 125 + y, 1, 4);
        g2d.fillRect(116 + x, 129 + y, 1, 7);
        g2d.fillRect(115 + x, 136 + y, 1, 9);


        g2d.setColor(b.getFillColor());
        g2d.fillRect(115 + x, 87 + y, 1, 7);
        g2d.fillRect(116 + x, 87 + y, 1, 10);
        g2d.fillRect(117 + x, 87 + y, 1, 10);
        g2d.fillRect(118 + x, 87 + y, 1, 10);


        g2d.setColor(b.getFillColor());
        g2d.fillRect(116 + x, 97 + y, 1, 32);
        g2d.fillRect(117 + x, 97 + y, 1, 14);
        g2d.fillRect(118 + x, 97 + y, 1, 8);
        g2d.fillRect(115 + x, 98 + y, 1, 38);
        g2d.fillRect(114 + x, 113 + y, 1, 32);
        g2d.fillRect(113 + x, 116 + y, 1, 9);
        g2d.fillRect(117 + x, 116 + y, 1, 9);
    }

    public void paint4U(int x, int y, GraphicsMap g2d, int length) {


        g2d.setColor(b.getOutlineColor());
        g2d.fillRect(121 + x, 87 + y, 1, 10);
        g2d.fillRect(113 + x, 90 + y, 1, 7);


        g2d.setColor(b.getOutlineColor());
        g2d.fillRect(113 + x, 97 + y, 1, 4);
        g2d.fillRect(121 + x, 97 + y, 1, 3);
        g2d.fillRect(120 + x, 100 + y, 1, 4);
        g2d.fillRect(112 + x, 101 + y, 1, 10);
        g2d.fillRect(119 + x, 104 + y, 1, 2);
        g2d.fillRect(118 + x, 106 + y, 1, 3);
        g2d.fillRect(117 + x, 109 + y, 1, 4);
        g2d.fillRect(111 + x, 111 + y, 1, 3);
        g2d.fillRect(118 + x, 113 + y, 1, 9);
        g2d.fillRect(110 + x, 114 + y, 1, 8);
        g2d.fillRect(111 + x, 122 + y, 1, 19);
        g2d.fillRect(117 + x, 122 + y, 1, 4);
        g2d.fillRect(116 + x, 126 + y, 1, 7);
        g2d.fillRect(115 + x, 133 + y, 1, 8);


        g2d.setColor(b.getHighlightColor());
        g2d.fillRect(113 + x, 87 + y, 1, 3);
        g2d.fillRect(114 + x, 87 + y, 1, 10);
        g2d.fillRect(119 + x, 87 + y, 1, 10);
        g2d.fillRect(120 + x, 87 + y, 1, 10);
        g2d.fillRect(115 + x, 94 + y, 1, 3);


        g2d.setColor(b.getHighlightColor());
        g2d.fillRect(114 + x, 97 + y, 1, 5);
        g2d.fillRect(119 + x, 97 + y, 1, 7);
        g2d.fillRect(120 + x, 97 + y, 1, 3);
        g2d.fillRect(118 + x, 100 + y, 1, 6);
        g2d.fillRect(113 + x, 101 + y, 1, 10);
        g2d.fillRect(117 + x, 104 + y, 1, 5);
        g2d.fillRect(116 + x, 109 + y, 1, 5);
        g2d.fillRect(112 + x, 111 + y, 1, 3);
        g2d.fillRect(117 + x, 113 + y, 1, 9);
        g2d.fillRect(111 + x, 114 + y, 1, 8);
        g2d.fillRect(112 + x, 122 + y, 1, 19);
        g2d.fillRect(116 + x, 122 + y, 1, 4);
        g2d.fillRect(115 + x, 126 + y, 1, 7);
        g2d.fillRect(114 + x, 133 + y, 1, 8);


        g2d.setColor(b.getFillColor());
        g2d.fillRect(115 + x, 87 + y, 1, 7);
        g2d.fillRect(116 + x, 87 + y, 1, 10);
        g2d.fillRect(117 + x, 87 + y, 1, 10);
        g2d.fillRect(118 + x, 87 + y, 1, 10);


        g2d.setColor(b.getFillColor());
        g2d.fillRect(115 + x, 97 + y, 1, 29);
        g2d.fillRect(116 + x, 97 + y, 1, 12);
        g2d.fillRect(117 + x, 97 + y, 1, 7);
        g2d.fillRect(118 + x, 97 + y, 1, 3);
        g2d.fillRect(114 + x, 102 + y, 1, 31);
        g2d.fillRect(113 + x, 111 + y, 1, 30);
        g2d.fillRect(112 + x, 114 + y, 1, 8);
        g2d.fillRect(116 + x, 114 + y, 1, 8);
    }

    public void paint5U(int x, int y, GraphicsMap g2d, int length) {


        g2d.setColor(b.getOutlineColor());
        g2d.fillRect(121 + x, 87 + y, 1, 8);
        g2d.fillRect(113 + x, 90 + y, 1, 5);


        g2d.setColor(b.getOutlineColor());
        g2d.fillRect(113 + x, 95 + y, 1, 4);
        g2d.fillRect(121 + x, 95 + y, 1, 3);
        g2d.fillRect(120 + x, 98 + y, 1, 4);
        g2d.fillRect(112 + x, 99 + y, 1, 9);
        g2d.fillRect(119 + x, 102 + y, 1, 2);
        g2d.fillRect(118 + x, 104 + y, 1, 3);
        g2d.fillRect(117 + x, 107 + y, 1, 3);
        g2d.fillRect(111 + x, 108 + y, 1, 3);
        g2d.fillRect(118 + x, 110 + y, 1, 9);
        g2d.fillRect(110 + x, 111 + y, 1, 8);
        g2d.fillRect(111 + x, 119 + y, 1, 18);
        g2d.fillRect(117 + x, 119 + y, 1, 4);
        g2d.fillRect(116 + x, 123 + y, 1, 6);
        g2d.fillRect(115 + x, 129 + y, 1, 8);


        g2d.setColor(b.getHighlightColor());
        g2d.fillRect(113 + x, 87 + y, 1, 3);
        g2d.fillRect(114 + x, 87 + y, 1, 8);
        g2d.fillRect(119 + x, 87 + y, 1, 8);
        g2d.fillRect(120 + x, 87 + y, 1, 8);
        g2d.fillRect(115 + x, 94 + y, 1, 1);


        g2d.setColor(b.getHighlightColor());
        g2d.fillRect(114 + x, 95 + y, 1, 5);
        g2d.fillRect(119 + x, 95 + y, 1, 7);
        g2d.fillRect(120 + x, 95 + y, 1, 3);
        g2d.fillRect(118 + x, 98 + y, 1, 6);
        g2d.fillRect(113 + x, 99 + y, 1, 9);
        g2d.fillRect(117 + x, 102 + y, 1, 5);
        g2d.fillRect(116 + x, 107 + y, 1, 4);
        g2d.fillRect(112 + x, 108 + y, 1, 3);
        g2d.fillRect(117 + x, 110 + y, 1, 9);
        g2d.fillRect(111 + x, 111 + y, 1, 8);
        g2d.fillRect(112 + x, 119 + y, 1, 18);
        g2d.fillRect(116 + x, 119 + y, 1, 4);
        g2d.fillRect(115 + x, 123 + y, 1, 6);
        g2d.fillRect(114 + x, 129 + y, 1, 8);


        g2d.setColor(b.getFillColor());
        g2d.fillRect(115 + x, 87 + y, 1, 7);
        g2d.fillRect(116 + x, 87 + y, 1, 8);
        g2d.fillRect(117 + x, 87 + y, 1, 8);
        g2d.fillRect(118 + x, 87 + y, 1, 8);


        g2d.setColor(b.getFillColor());
        g2d.fillRect(115 + x, 95 + y, 1, 28);
        g2d.fillRect(116 + x, 95 + y, 1, 12);
        g2d.fillRect(117 + x, 95 + y, 1, 7);
        g2d.fillRect(118 + x, 95 + y, 1, 3);
        g2d.fillRect(114 + x, 100 + y, 1, 29);
        g2d.fillRect(113 + x, 108 + y, 1, 29);
        g2d.fillRect(112 + x, 111 + y, 1, 8);
        g2d.fillRect(116 + x, 111 + y, 1, 8);
    }

    public void paint6U(int x, int y, GraphicsMap g2d, int length) {


        g2d.setColor(b.getOutlineColor());
        g2d.fillRect(121 + x, 87 + y, 1, 7);
        g2d.fillRect(113 + x, 90 + y, 1, 4);


        g2d.setColor(b.getOutlineColor());
        g2d.fillRect(113 + x, 94 + y, 1, 11);
        g2d.fillRect(121 + x, 94 + y, 1, 5);
        g2d.fillRect(120 + x, 99 + y, 1, 2);
        g2d.fillRect(119 + x, 101 + y, 1, 3);
        g2d.fillRect(118 + x, 104 + y, 1, 3);
        g2d.fillRect(112 + x, 105 + y, 1, 3);
        g2d.fillRect(119 + x, 107 + y, 1, 8);
        g2d.fillRect(111 + x, 108 + y, 1, 7);
        g2d.fillRect(112 + x, 115 + y, 1, 16);
        g2d.fillRect(118 + x, 115 + y, 1, 4);
        g2d.fillRect(117 + x, 119 + y, 1, 5);
        g2d.fillRect(116 + x, 124 + y, 1, 7);


        g2d.setColor(b.getHighlightColor());
        g2d.fillRect(113 + x, 87 + y, 1, 3);
        g2d.fillRect(114 + x, 87 + y, 1, 7);
        g2d.fillRect(119 + x, 87 + y, 1, 7);
        g2d.fillRect(120 + x, 87 + y, 1, 7);


        g2d.setColor(b.getHighlightColor());
        g2d.fillRect(114 + x, 94 + y, 1, 11);
        g2d.fillRect(119 + x, 94 + y, 1, 7);
        g2d.fillRect(120 + x, 94 + y, 1, 5);
        g2d.fillRect(118 + x, 99 + y, 1, 5);
        g2d.fillRect(117 + x, 104 + y, 1, 4);
        g2d.fillRect(113 + x, 105 + y, 1, 3);
        g2d.fillRect(118 + x, 107 + y, 1, 8);
        g2d.fillRect(112 + x, 108 + y, 1, 7);
        g2d.fillRect(113 + x, 115 + y, 1, 16);
        g2d.fillRect(117 + x, 115 + y, 1, 4);
        g2d.fillRect(116 + x, 119 + y, 1, 5);
        g2d.fillRect(115 + x, 124 + y, 1, 7);


        g2d.setColor(b.getFillColor());
        g2d.fillRect(115 + x, 87 + y, 1, 7);
        g2d.fillRect(116 + x, 87 + y, 1, 7);
        g2d.fillRect(117 + x, 87 + y, 1, 7);
        g2d.fillRect(118 + x, 87 + y, 1, 7);


        g2d.setColor(b.getFillColor());
        g2d.fillRect(115 + x, 94 + y, 1, 30);
        g2d.fillRect(116 + x, 94 + y, 1, 25);
        g2d.fillRect(117 + x, 94 + y, 1, 10);
        g2d.fillRect(118 + x, 94 + y, 1, 5);
        g2d.fillRect(114 + x, 105 + y, 1, 26);
        g2d.fillRect(113 + x, 108 + y, 1, 7);
        g2d.fillRect(117 + x, 108 + y, 1, 7);
    }

    public void paint7U(int x, int y, GraphicsMap g2d, int length) {


        g2d.setColor(b.getOutlineColor());
        g2d.fillRect(121 + x, 87 + y, 1, 6);
        g2d.fillRect(113 + x, 90 + y, 1, 3);


        g2d.setColor(b.getOutlineColor());
        g2d.fillRect(113 + x, 93 + y, 1, 11);
        g2d.fillRect(121 + x, 93 + y, 1, 2);
        g2d.fillRect(120 + x, 95 + y, 1, 2);
        g2d.fillRect(119 + x, 97 + y, 1, 3);
        g2d.fillRect(118 + x, 100 + y, 1, 1);
        g2d.fillRect(119 + x, 101 + y, 1, 2);
        g2d.fillRect(120 + x, 103 + y, 1, 8);
        g2d.fillRect(112 + x, 104 + y, 1, 7);
        g2d.fillRect(113 + x, 111 + y, 1, 16);
        g2d.fillRect(119 + x, 111 + y, 1, 4);
        g2d.fillRect(118 + x, 115 + y, 1, 5);
        g2d.fillRect(117 + x, 120 + y, 1, 7);


        g2d.setColor(b.getHighlightColor());
        g2d.fillRect(113 + x, 87 + y, 1, 3);
        g2d.fillRect(114 + x, 87 + y, 1, 6);
        g2d.fillRect(119 + x, 87 + y, 1, 6);
        g2d.fillRect(120 + x, 87 + y, 1, 6);


        g2d.setColor(b.getHighlightColor());
        g2d.fillRect(114 + x, 93 + y, 1, 11);
        g2d.fillRect(119 + x, 93 + y, 1, 4);
        g2d.fillRect(120 + x, 93 + y, 1, 2);
        g2d.fillRect(118 + x, 95 + y, 1, 5);
        g2d.fillRect(117 + x, 100 + y, 1, 1);
        g2d.fillRect(118 + x, 101 + y, 1, 3);
        g2d.fillRect(119 + x, 103 + y, 1, 8);
        g2d.fillRect(113 + x, 104 + y, 1, 7);
        g2d.fillRect(114 + x, 111 + y, 1, 16);
        g2d.fillRect(118 + x, 111 + y, 1, 4);
        g2d.fillRect(117 + x, 115 + y, 1, 5);
        g2d.fillRect(116 + x, 120 + y, 1, 7);


        g2d.setColor(b.getFillColor());
        g2d.fillRect(115 + x, 87 + y, 1, 6);
        g2d.fillRect(116 + x, 87 + y, 1, 6);
        g2d.fillRect(117 + x, 87 + y, 1, 6);
        g2d.fillRect(118 + x, 87 + y, 1, 6);


        g2d.setColor(b.getFillColor());
        g2d.fillRect(115 + x, 93 + y, 1, 34);
        g2d.fillRect(116 + x, 93 + y, 1, 27);
        g2d.fillRect(117 + x, 93 + y, 1, 7);
        g2d.fillRect(118 + x, 93 + y, 1, 2);
        g2d.fillRect(117 + x, 101 + y, 1, 14);
        g2d.fillRect(114 + x, 104 + y, 1, 7);
        g2d.fillRect(118 + x, 104 + y, 1, 7);
    }

    public void paintB(int x, int y, GraphicsMap g2d, int length) {
        y += length;


        g2d.setColor(b.getOutlineColor());
        g2d.fillRect(109 + x, 145 + y, 1, 1);
        g2d.fillRect(114 + x, 145 + y - length, 1, 2 + length);
        g2d.fillRect(108 + x, 146 + y, 1, 8);
        g2d.fillRect(113 + x, 147 + y, 1, 15);
        g2d.fillRect(107 + x, 154 + y, 1, 3);
        g2d.fillRect(106 + x, 157 + y, 1, 5);
        g2d.fillRect(107 + x, 161 + y, 2, 1);
        g2d.fillRect(111 + x, 161 + y, 1, 2);
        g2d.fillRect(112 + x, 161 + y, 1, 1);
        g2d.fillRect(108 + x, 162 + y, 3, 1);


        g2d.setColor(b.getHighlightColor());
        g2d.fillRect(110 + x, 145 + y, 1, 3);
        g2d.fillRect(113 + x, 145 + y - length, 1, 2 + length);
        g2d.fillRect(109 + x, 146 + y, 1, 9);
        g2d.fillRect(112 + x, 147 + y, 1, 14);
        g2d.fillRect(108 + x, 154 + y, 1, 4);
        g2d.fillRect(107 + x, 157 + y, 1, 4);
        g2d.fillRect(108 + x, 160 + y, 4, 1);
        g2d.fillRect(109 + x, 161 + y, 2, 1);


        g2d.setColor(b.getFillColor());
        g2d.fillRect(111 + x, 145 + y, 1, 15);
        g2d.fillRect(112 + x, 145 + y - length, 1, 2 + length);
        g2d.fillRect(110 + x, 148 + y, 1, 12);
        g2d.fillRect(109 + x, 155 + y, 1, 5);
        g2d.fillRect(108 + x, 158 + y, 1, 2);

        if (length > 0) {

            g2d.setColor(b.getOutlineColor());
            g2d.fillRect(110 + x, 145 + y - length, 1, length);

            g2d.setColor(b.getHighlightColor());
            g2d.fillRect(111 + x, 145 + y - length, 1, length);
        }
    }

    public void paint1U(int x, int y, GraphicsMap g2d, int length) {


        g2d.setColor(b.getOutlineColor());
        g2d.fillRect(121 + x, 87 + y, 1, 7);
        g2d.fillRect(113 + x, 90 + y, 1, 4);
        g2d.fillRect(112 + x, 94 + y, 1, 3);
        g2d.fillRect(120 + x, 94 + y, 1, 3);


        g2d.setColor(b.getOutlineColor());
        g2d.fillRect(112 + x, 97 + y, 1, 5);
        g2d.fillRect(120 + x, 97 + y, 1, 4);
        g2d.fillRect(119 + x, 101 + y, 1, 4);
        g2d.fillRect(111 + x, 102 + y, 1, 11);
        g2d.fillRect(118 + x, 105 + y, 1, 3);
        g2d.fillRect(117 + x, 108 + y, 1, 3);
        g2d.fillRect(116 + x, 111 + y, 1, 4);
        g2d.fillRect(110 + x, 113 + y, 1, 3);
        g2d.fillRect(117 + x, 115 + y, 1, 10);
        g2d.fillRect(109 + x, 116 + y, 1, 9);
        g2d.fillRect(110 + x, 125 + y, 1, 20);
        g2d.fillRect(116 + x, 125 + y, 1, 4);
        g2d.fillRect(115 + x, 129 + y, 1, 7);
        g2d.fillRect(114 + x, 136 + y, 1, 9);


        g2d.setColor(b.getHighlightColor());
        g2d.fillRect(113 + x, 87 + y, 1, 3);
        g2d.fillRect(114 + x, 87 + y, 1, 10);
        g2d.fillRect(119 + x, 87 + y, 1, 10);
        g2d.fillRect(120 + x, 87 + y, 1, 7);
        g2d.fillRect(113 + x, 94 + y, 1, 3);
        g2d.fillRect(118 + x, 94 + y, 1, 3);


        g2d.setColor(b.getHighlightColor());
        g2d.fillRect(113 + x, 97 + y, 1, 6);
        g2d.fillRect(114 + x, 97 + y, 1, 1);
        g2d.fillRect(118 + x, 97 + y, 1, 8);
        g2d.fillRect(119 + x, 97 + y, 1, 4);
        g2d.fillRect(117 + x, 101 + y, 1, 7);
        g2d.fillRect(112 + x, 102 + y, 1, 11);
        g2d.fillRect(116 + x, 105 + y, 1, 6);
        g2d.fillRect(115 + x, 111 + y, 1, 5);
        g2d.fillRect(111 + x, 113 + y, 1, 3);
        g2d.fillRect(116 + x, 115 + y, 1, 10);
        g2d.fillRect(110 + x, 116 + y, 1, 9);
        g2d.fillRect(111 + x, 125 + y, 1, 20);
        g2d.fillRect(115 + x, 125 + y, 1, 4);
        g2d.fillRect(114 + x, 129 + y, 1, 7);
        g2d.fillRect(113 + x, 136 + y, 1, 9);


        g2d.setColor(b.getFillColor());
        g2d.fillRect(115 + x, 87 + y, 1, 10);
        g2d.fillRect(116 + x, 87 + y, 1, 10);
        g2d.fillRect(117 + x, 87 + y, 1, 10);
        g2d.fillRect(118 + x, 87 + y, 1, 7);


        g2d.setColor(b.getFillColor());
        g2d.fillRect(115 + x, 97 + y, 1, 14);
        g2d.fillRect(116 + x, 97 + y, 1, 8);
        g2d.fillRect(117 + x, 97 + y, 1, 4);
        g2d.fillRect(114 + x, 98 + y, 1, 31);
        g2d.fillRect(113 + x, 103 + y, 1, 33);
        g2d.fillRect(112 + x, 113 + y, 1, 32);
        g2d.fillRect(111 + x, 116 + y, 1, 9);
        g2d.fillRect(115 + x, 116 + y, 1, 9);
    }
}
