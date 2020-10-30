


import TurtleGraphics.StandardPen;
import java.util.Random;
import java.awt.*;

public class DrawSquare
{
public static void main(String[] args)
{
    Random gen = new Random();
    StandardPen pen = new StandardPen();

    // pen jumps to center of the graphics window
    //without drawing and points north
    pen.home();

    
  
    // Making the Square
    pen.move(30);
    pen.turn(90);
    pen.move(30);
    pen.turn(90);
    pen.move(30);
    pen.turn(90);
    pen.move(30);
    
    // Making the Triangle
    pen.up();
    pen.move(30);
    pen.down();
    pen.move(30);
    pen.turn(120);
    pen.move(30);
    pen.turn(120);
    pen.move(30);
    
  
    

}
}