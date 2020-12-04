import TurtleGraphics.StandardPen;
import java.awt.*;

public class Spiral
{
    public static void main(String [] args){
        StandardPen pen = new StandardPen();
        
        pen.down();
        for(int i = 0; i <=100; i++){ //this loop will create each layer of the spiral
            pen.move(10 * i ); //controls the spacing in between each spiral layer
            pen.turn(90); //get the turtle to turn each time in order to make spiral
        }
        
    }
    
}
