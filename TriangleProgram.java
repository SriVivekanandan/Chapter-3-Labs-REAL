import java.util.Scanner;
/**
 * This program will determine whether 3 triangle sides are scalene isosceles, or equilateral
 *
 * @Sri Vivekanandan (your name)
 * @10-20-2020 (a version number or a date)
 */
public class TriangleProgram
{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int side1 = 0;
        int side2 = 0;
        int side3 = 0;
        int angle1 = 0;
        int angle2 = 0;
        int angle3 = 0;

        System.out.println("Do you wish to enter side lengths or angles? (s or a): ");
        String choice = input.nextLine();
        
        
        //if user chooses to enter side lengths
        if (choice.equals("s")){
            System.out.println("Please enter the three side of the triangle: ");
            side1 = input.nextInt();
            side2 = input.nextInt();
            side3 = input.nextInt();

            System.out.println("Triangle Side Lengths: " + side1 + " " + side2 + " " + side3);

            if (side1 == side2 || side2 == side3 || side1 == side3){
                if (side1 == 0 || side2 == 0 || side3 == 0){
                    System.out.println("This triangle does not exist");
                }else{
                    System.out.println("This triangle is an isosceles triangle");

                }
            }else if(side1 == side3 && side1 == side2){
                if (side1 == 0 || side2 == 0 || side3 == 0){
                    System.out.println("This triangle does not exist");
                }else{
                    System.out.println("This triangle is an equilateral triangle");

                }

            }else if(side1 != side2 && side1 != side3 && side2 != side3){
                if (side1 == 0 || side2 == 0 || side3 == 0){
                    System.out.println("This triangle does not exist");
                }else if(((side1 * side1) + (side2*side2)) != (side3 * side3)){ //if a^2 + b^2 = c^2 doesn't work when all 
                    System.out.println("This triangle does not exist");

                 
                }else{
                    System.out.println("This triangle is an scalene triangle");

                }

            }else{
                System.out.println("This triangle does not exist.");
            }



         //if user chooses to enter Angles
        }else if(choice.equals("a")){
            System.out.println("Please enter the three angles of the triangle: ");
            angle1 = input.nextInt();
            angle2 = input.nextInt();
            angle3 = input.nextInt();
            
            System.out.println("Triangle Angle Measures: " + angle1 + " " + angle2 + " " + angle3);
            
            if ((angle1 == 90 && angle2 != 90 && angle3 != 90) || (angle2 == 90 && angle1 != 90 && angle3 != 90) || (angle3 == 90 && angle1 != 90 && angle2 != 90)){
                if(angle1 ==0 || angle2 == 0 || angle3 == 0){ 
                    System.out.println("This triangle does not exist");
                }else{
                    System.out.println("This triangle is an right triangle");
                }

            }else if(angle1 == angle2 || angle1 == angle3 || angle2 == angle3){ // check for if two are equal
                if(angle1 ==0 || angle2 == 0 || angle3 == 0){
                    System.out.println("This triangle does not exist");
                }else{
                    System.out.println("This traingle is an isoceles triangle");
                }

            }else if(angle1 == angle2 && angle1 == angle3 && angle2 == angle3 ) {  // check for if all angles are equal
                if(angle1 ==0 || angle2 == 0 || angle3 == 0){
                    System.out.println("This triangle does not exist");
                }else{
                    System.out.println("This triangle is an equilateral triangle");
                }

            }else{
                System.out.println("This triangle does not exist");
            }
        }else{
            System.out.println("Sorry That Isn't An Option");
        }

    }

}




/*
Do you wish to enter side lengths or angles? (s or a): 
a
Please enter the three angles of the triangle: 
90 90 0
Triangle Angle Measures: 90 90 0
This triangle does not exist
Do you wish to enter side lengths or angles? (s or a): 
s
Please enter the three side of the triangle: 
30 30 15
Triangle Side Lengths: 30 30 15
This triangle is an isosceles triangle

 */




 
