// CS211 HW4 - Sierpinski Carpet
// Alexander Funai

// This program utilizes recursion to print different levels of the Sierpinski Fractal (Wallis Sieve).


import java.awt.Color;
import java.awt.Graphics;

public class SierpinskiCarpet {
    public static void main(String[] args) {
        SierpinskiCarpet t = new SierpinskiCarpet(800, 800);
        t.draw(0);
    }

    private Graphics g;
    private int totalWidth, totalHeight;

    public SierpinskiCarpet(int totalWidth, int totalHeight) {
        this.totalWidth = totalWidth;
        this.totalHeight = totalHeight;

        DrawingPanel panel = new DrawingPanel(totalWidth, totalHeight);
        g = panel.getGraphics();
        g.setColor(Color.BLACK);
    }

    public void draw(int level) {
        drawHelper(level, 0, 0, totalWidth, totalHeight);
    }

    private void drawHelper(int level, int startX, int startY, int width, int height) {

        int tempWidth = width / 3;
        int tempHeight = height / 3;

        if (level >= 1) {
            g.fillRect(startX + width / 3, startY + height / 3, width / 3, height / 3); //Top Left
            drawHelper(level - 1, startX, startY, width / 3, height / 3);   //Top Center
            drawHelper(level - 1, startX + width / 3, startY, width / 3, height / 3); //Top Right
            drawHelper(level - 1, startX + 2 * (width / 3), startY, width / 3, height / 3);   //Center Left
            drawHelper(level - 1, startX, startY + height / 3, width / 3, height / 3);    //Center Right
            drawHelper(level - 1, startX + 2 * (width / 3), startY + height / 3, width / 3, height / 3); //Bottom Left
            drawHelper(level - 1, startX, startY + 2 * (height / 3), width / 3, height / 3);  //Bottom Center
            drawHelper(level - 1, startX + width / 3, startY + 2 * (height / 3), width / 3, height / 3);  //Bottom Right
            drawHelper(level - 1, startX + 2 * (width / 3), startY + 2 * (height / 3), width / 3, height / 3);
        }
    }
}

