import java.util.Scanner;
/**
 * This program will display whether a string is a palindrome or not
 *
 * @Sri Vivekanandan (your name)
 * @11-19-2020 (a version number or a date)
 */
public class Palindrome
{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        String reverse = "";
        System.out.println("Please enter the string you wish to check: ");
        String user_input = input.nextLine();
        String no_space_input = user_input.replace(" ","");
        String forward = no_space_input.toLowerCase();
        //System.out.println(no_space_input);
        
        
        for (int i = forward.length()-1; i >= 0; i--){ //for loop to take each character of forward string and reverse it into new reversed string
            char temp = forward.charAt(i);
            reverse = reverse + temp;
                                  
        } 
        //System.out.println(reverse);
        System.out.println("Forward String: " + forward + " Reversed String: " + reverse);
        if(reverse.equals(forward)){
            System.out.println("It is a palindrome!");
        }else{
            System.out.println("It's not a palindrome.");
        }
    }
}
