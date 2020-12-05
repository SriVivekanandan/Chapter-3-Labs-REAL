import TurtleGraphics.StandardPen;
import java.awt.*;
/**
 * This program will draw a four-leaved rose .
 *
 * @Sri Vivekanandan (your name)
 * @12-4-2020 (a version number or a date)
 */
public class FourLeafRose
{
    public static void main (String [] args){
        StandardPen pen = new StandardPen();
        
        
        //z is theta
        double x = 0;
        double y = 0;
        double z = 0; // theta
        double r = 0;
        int steps = 100;
        
        //(x,y) x and y variable being used as x and y coordinates
        for(int i = 0; i <= steps; i++){
            //must calculate theta first
            
            z = ((2 * Math.PI)/100) * i; //theta goes from 0 to 2pi in 100 steps
            //System.out.println("Theta: " + z); //print for testing
            
            r = Math.cos(2 * z); //equation given in instructions
            x = (Math.cos(z) *r) * 100; //must multiply by 100 or else too small to see
            y = (Math.sin(z) * r) * 100;
            
            pen.down();
            pen.move(x,y); //moving pen to calculated coordinates
            pen.up();
        
        }
        
    }
}
