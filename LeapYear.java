import java.util.Scanner;
/**
 * This program will determine whether or not a year is a leap year or not
 *
 * Sri Vivekanandan
 * 10/16/2020
 */
public class LeapYear
{
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       int year = 0;

       System.out.println("Please enter the year number you would like to check: ");
       year = input.nextInt();

       if(year%4 == 0 && year%100 == 0 && year%400 != 0) {  // check if divisible by 100 but not 400
           System.out.println(year + " is NOT a leap year!");

       }else if(year < 1582){ //check if in gregorian calendar
           System.out.println(year + " is NOT in the Gregorian Calendar!");
        }
               
       else{
            System.out.println(year + " is a leap year!");
       }
   }

}



/* Please enter the year number you would like to check: 
1900
1900 is NOT a leap year!
Please enter the year number you would like to check: 
1984
1984 is a leap year!
Please enter the year number you would like to check: 
2000
2000 is a leap year!*/

