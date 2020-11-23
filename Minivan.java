import java.util.Scanner;
/**
 * This program will take a code and use that code to tell which doors are open or which doors are closed
 *
 * Sri Vivekanandan (your name)
 * @version (a version number or a date)
 */
public class Minivan
{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String number_code = new String();
        boolean right = true;
        boolean left = true;
        System.out.println("Please enter the code: ");
        number_code = input.nextLine();
        
        //the gear letter will always be last in code
        //code length is 8 assuming the code length never changes
        //0 for off      1 for activated
        
        if(number_code.charAt(8) == 'P'){ //checking if car is in park
            if(number_code.charAt(4) == '1'){ //right door open
                right = true;
                
            } 
            if(number_code.charAt(7) == '1'){ //left door open
                left = true;
            }
        }
        
        if(left == true && right == true){
            System.out.println("Both doors are open.");
        }else if(left == true && right == false){
            System.out.println("Left door is open but right door is closed");
        }else if(right == true && left == false){
            System.out.println("Right door is open but left door is closed.");
        }else{
            System.out.println("Both doors are closed.");
        }
    }
    
}
//Please enter the code: 
//00011111P
//Both doors are open