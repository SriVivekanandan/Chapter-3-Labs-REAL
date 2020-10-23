import java.util.Scanner;
/**
 * This program will calculate your weight on another planet chosen by the user
 *
 * @Sri Vivekanandan (your name)
 * @10-20-2020 (a version number or a date)
 */
public class SolarSystem
{
    public static void main(String[] args){
        double new_weight = 0.0;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your weight in pounds: ");
        double weight = input.nextDouble();

        System.out.println(
                "Planet Menu \n\n" +
                "Earth ------- e \n" +
                "Jupiter ----- j \n" +
                "Neptune ----- n \n" +
                "Mars -------- m \n" +
                "Uranus ------ u \n" +
                "Venus ------- v \n" +
                "Saturn ------ s \n" +
                "Mercury ----- me \n"
        );

        System.out.println("Please enter which planet you would like to use (enter the corresponding letter): ");
        // read the newline character automatically because input.nextDouble ignores the \n character
        input.nextLine();
        // get the user choice
        String choice = input.nextLine();
        System.out.println("choice: " + choice);

        switch (choice){
            case "e":
                System.out.println("You have chosen: Earth");
                new_weight = weight * 1;
                System.out.println("Your weight on Earth is " + new_weight + "lbs.");
                break;
            case "j":
                System.out.println("You have chosen: Jupiter");
                new_weight = weight * 2.34;
                System.out.println("Your weight on Jupiter is " + new_weight + "lbs.");
                break;
            case "n":
                System.out.println("You have chosen: Neptune");
                new_weight = weight * 1.19;
                System.out.println("Your weight on Neptune is " + new_weight + "lbs.");
                break;
            case "m":
                System.out.println("You have chosen: Mars");
                new_weight = weight * 0.38;
                System.out.println("Your weight on Mars is " + new_weight + "lbs.");
                break;
            case "u":
                System.out.println("You have chosen: Uranus");
                new_weight = weight * 0.92;
                System.out.println("Your weight on Uranus is " + new_weight + "lbs.");
                break;
            case "v":
                System.out.println("You have chosen: Venus");
                new_weight = weight * 0.91;
                System.out.println("Your weight on Venus is " + new_weight + "lbs.");
                break;
            case "s":
                System.out.println("You have chosen: Saturn");
                new_weight = weight * 1.06;
                System.out.println("Your weight on Saturn is " + new_weight + "lbs.");
                break;
            case "me":
                System.out.println("You have chosen: Mercury");
                new_weight = weight * 0.38;
                System.out.println("Your weight on Mercury is " + new_weight + "lbs.");
                break;

        }


    }
}
