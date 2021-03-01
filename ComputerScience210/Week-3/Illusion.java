// CS210 Assignment #3 "Circles"
// Alexander Funai

import java.awt.*;


public class Illusion {

    public static void main(String[] args) {
        drawFigures();
    }

    public static void drawFigures() {
        
        // Initializing and drawing main panel.
        DrawingPanel panel = new DrawingPanel(500,400);
        panel.setBackground(Color.cyan);
        Graphics g = panel.getGraphics();
        
        // Calling circles method and inputting coordinates and dimensions.
        g.setColor(Color.BLACK);
        Circle(0, 0, 90, g, 3);
        Circle(120, 10, 90, g, 3);
        Circle(250, 50, 90, g, 5);
        
        // Calling rectangles and input coordinates and dimensions.
        Rectangle(350, 20, 120, 120, 40, g, 5);
        Rectangle(10, 120, 200, 200, 100, g, 10);
        Rectangle(240, 160, 200, 200, 50, g, 5);    
    }
 
    // Declaring black circles to be printed
 public static void Circle1(Graphics g, int x, int y, int z) {
  x = x - (z/2);
  y = y -(z/2);
  g.setColor(Color.black);
  g.drawOval(x,y,z,z);
}

// Declaring inner circles to be printed.
public static void  SubCircles(int x , int y, int z, Graphics g)
{
    int cX = x + (z/2);
    int cY = y + (z/2);
   
   // Settings constant color yellow circle figures.
   g.drawOval(x,y, z,z);
    g.setColor(Color.YELLOW);
    g.fillOval(x,y,z,z);
  
    // Drawing basic diamond figures.
    g.setColor(Color.BLACK);
    g.drawLine(cX+ z/2, cY,cX, cY+ z/2);
    g.drawLine(cX - z/2, cY, cX,cY - z/2);
    g.drawLine(cX,cY + z/2,cX - z/2,cY);
    g.drawLine(cX,  cY - z/2,  cX+ z/2, cY);
}

// Declaring and defining incrementing for loop to print circles.
public static void Circle(int x, int y,int z, Graphics g,int num)
{
    int cY = y + (z/2);
    int cX = x + (z/2);
    
     SubCircles (x,y,z,g);
    
    int ratio = z/ num;
    for(int i = 0; i < num; i ++)
    {
        Circle1(g,cX,cY,z - ratio * i);
        
    }
}

// Declaring and defining rectangular grid.
public static void Rectangle(int x, int y, int w, int l,int z, Graphics g,int num) {
   int Row  = w /z;
   int Column = l / z;
   g.setColor(Color.LIGHT_GRAY);
   g.fillRect(x,y, w, l);
   g.setColor(Color.RED);
   g.drawRect(x, y, w, l);
   
   // Initializing loop for grid to print multiple circles.
   for(int i = 0; i < Row; i ++)
   {
       for(int j =0; j < Column; j++)
       {
           Circle(x + ( z * i), y + (z*j),z,g,num);
       } 
   }
}
}