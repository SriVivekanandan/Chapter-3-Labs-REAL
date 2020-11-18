import java.util.Scanner;
/**
 * This program will compute your tax in 1913 based on your income
 *
 * Sri Vivekanandan
 * @version (a version number or a date)
 */
public class Taxes
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter your income: ");
        double income = input.nextDouble();
        double taxRate = 0.0;
        double tax = 0.0;
        if(income > 50000 && income < 75000){
            taxRate = .02;
        }else if(income > 75000 && income < 100000){
            taxRate = .03;
        }else if(income > 100000 && income < 250000){
            taxRate = .04;
        }else if(income > 250000 && income < 500000){
            taxRate = .05;
        }else if(income > 500000){
            taxRate = .06;
        }else{
            taxRate = .01;
        }
        tax = income * taxRate;
        System.out.println("Income of: " + income + " Tax: " + tax);
        
        
    
    
    
    }
}
//Please enter your income: 
//85000
//Income of: 85000.0 Tax: 2550.0
