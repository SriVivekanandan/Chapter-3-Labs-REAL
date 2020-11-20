import java.util.Random;

public class MontyHall
{
   public static void main(String[] args)

   {

      int strategy1Count = 0;
      int strategy2Count = 0;
      int NUMBER_OF_RUNS = 1000;

      Random generator = new Random();

      // Simulate the game 1000 times
         // Host must pick a door that's not the player's door and not the
         // door with the car

           
       //strategy2Count will count all the wins when not changing door

        //strategy1Count will count all the wins when changing the door

        

         // player does not change door and sticks with picked door 

         for(int i = 0; i <= NUMBER_OF_RUNS; i++){

             int car_door = generator.nextInt(3);
             int picked_door = generator.nextInt(3);
             
            if(car_door == picked_door){
                strategy2Count = strategy2Count + 1;
            }
            }

        

         // player changes to the left over door after host picks goat door

         for (int i = 0; i <= NUMBER_OF_RUNS; i++){
            int car_door = generator.nextInt(3);
            int picked_door = generator.nextInt(3);

           
            // find goat door for host to open that has not been picked by player and
            // is not the car door
            int host_goat_door = 0;
    
            while((host_goat_door == car_door ) || ( picked_door == host_goat_door)){
                host_goat_door = generator.nextInt(3); //loop runs until host door is not a car door or a picked door
            }

            // remaining door

            int other_door =  3 - (picked_door + host_goat_door);

            // is remaining door car door

            if(other_door == car_door){
                strategy1Count++;
            }
            }

        

      System.out.printf("After %d runs, strategy 1 yielded %d wins while "
            + "strategy 2 yielded %d.%n", NUMBER_OF_RUNS, strategy1Count,
            strategy2Count);

   }

      

}

 