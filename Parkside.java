import java.util.Scanner;
import java.util.ArrayList;
public class Parkside {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = 0; // variable for the number of columns
        int seed = 0;// variable for the starting value in column 1
        ArrayList <String> array = new ArrayList<String>();
        //ArrayList <String> line =
        System.out.println("Please enter the size: ");
        size = input.nextInt();
        System.out.println("Please enter the seed: ");
        seed = input.nextInt();
        String line = "";


        System.out.println("Size " + size + ", Seed " + seed);
        int row = 0;
        String seed_String = String.valueOf(seed); //convert to string so it can be added to array
        //
        //2 dimensional array
        // (x,y)
        //
        int value = seed;
        String value_String = " ";

        for (int i = 0; i < size; i++){ //for loop to create the lines in the array
            array.add(" ");
        }

        for (int x = 0; x < size; x++) { //x axis

            for (int y = 0; y < size; y++){ // y axis
                if (x >= y){
                    line = array.get(y);
                    value_String = String.valueOf(value); //must do this because you cannot add integer to String array
                   // line = line.add(value_String);
                    line = line + value_String; //adding the number to the horizontal line
                    value++;
                }else{
                    line = array.get(y) +  " ";
                }
                if(value >= 10){
                    value = 1;
                }
               
                 //add line to array
                array.set(y,line); //have to replace the number that is already there that's why it is (y,...)
            }


        }


        for (int q = 0; q < size; q++){ //for loop to display
            System.out.println(array.get(q));

        }
            //this method did not work
           /* array.add(" "); // add the number of rows there will be

            for (int x = 0; x <= size; x++){
                array.add(seed_String);
                seed++;
                seed_String = String.valueOf(seed);
            }

        for (int z = 0; z <= size; z++){
            System.out.println(array.get(z));

        }*/





    }
}

//Please enter the size: 
//4
//Please enter the seed: 
//1
//Size 4, Seed 1
 //1247
  //358
   //69
    //1
