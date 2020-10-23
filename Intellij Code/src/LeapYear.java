import java.util.Scanner;
/**
 * This program will determine whether or not a year is a leap year or not
 *
 * SRi Vivekanandan
 * 10/16/2020
 */
public class LeapYear
{
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       int year = 0;

       System.out.println("Please enter the year number you would like to check: ");
       year = input.nextInt();

       if(year%4 == 0 && year%100 == 0 && year%400 != 0) {
           System.out.println(year + " is NOT a leap year!");

       }
       else{
            System.out.println(year + " is a leap year!");
       }
   }

}

