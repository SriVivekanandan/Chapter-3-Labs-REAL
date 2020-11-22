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
        
        //caluclate tax based on income 
        if(income <= 75000){
            tax = ((income-50000) * .02 + 500);
        }else if(income <= 100000){
            tax = ((income-75000) * .03 + 1000);
        }else if(income <= 250000){
            tax = ((income - 100000) * .04 + 1750); //
        }else if(income <=500000){
            tax = ((income - 250000) * .05 + 7750);
        }else if(income > 500000){
            tax = ((income-500000) * .06 + 20250);
        }else{
            taxRate = .01;
        }
        
        System.out.println("Income of: " + income + " Tax: " + tax);
        
        
    
    
    
    }
}
//Please enter your income: 
//600000
//Income of: 600000.0 Tax: 26250.0
//Please enter your income: 
//110000
//Income of: 110000.0 Tax: 2150.0

