import java.io.*;
import java.util.ArrayList;
/**
 * Write a description of class Speeches here.
 *
 * Sri Vivekanandan(your name)
 * @11-20-2020 (a version number or a date)
 */
public class Speeches
{
    public static void main(String[] args)  throws IOException{
        File fileSpeech =  new File("C:\\APCS\\Chapter 3 Labs\\speeches\\Abraham Lincoln A House Divided.txt");
        BufferedReader reader = new BufferedReader(new FileReader(fileSpeech));
        ArrayList <String> lines = new ArrayList<String>();

        String line;
        String date = reader.readLine(); //get date

        String name = reader.readLine(); //get name

        int i = 0;
        int wordCount = 0; //count all words in array
        int wordLength;
        int wordLengthCounter = 0;

        int peopleCounter = 0;
        int governmentCounter = 0;
        int unitedCounter = 0;
        int ourCounter = 0;

        while((line = reader.readLine()) != null) //loop to add each line to an array
        {
            lines.add(line);


        }
        //String lineArray[] = new String[lines.size()];
        for (int x = 0; x < lines.size(); x++){

            String lineItem = (String)lines.get(x);
            lineItem = lineItem.replace(",","");
            lineItem = lineItem.replace(".","");
            lineItem = lineItem.replace("--"," ");
            lineItem = lineItem.replace("\"","");
            lineItem = lineItem.replace("?"," ");

            String  words[] = lineItem.split(" ",0);

            for(int k =0 ; k < words.length ; k++){ //for loop to take each individual word
                //System.out.println(words[k]);
                wordLength = words[k].length();
                wordLengthCounter += wordLength;
                String testWord = words[k];

                //if statements to check how many times each word is occuring in the speech
                if(testWord.compareToIgnoreCase("people") == 0)
                {
                    peopleCounter++;
                }
                else if (testWord.compareToIgnoreCase("government")==0 )
                {
                    governmentCounter++;
                }
                else if(testWord.compareToIgnoreCase("united") == 0){
                    unitedCounter++;

                }
                else if(testWord.compareToIgnoreCase("our") == 0){
                    ourCounter++;
                }


            }

            wordCount += words.length; //calculate how many words are in speech

          
        }
        //System.out.println(wordLengthCounter);
        System.out.println("Name: " + name);
        System.out.println("Date: " + date);
        System.out.println("Number of words: " + wordCount);
        int averageWordLength = wordLengthCounter / wordCount;
        System.out.println("Average Word Length: " + averageWordLength);

        System.out.println("People occured " + peopleCounter + " times.");
        double peoplePercent = (new Double(peopleCounter)/new Double(wordCount))*100; //calculate the the percentage of how many times it occurs
        System.out.format("People Occurance: %f", peoplePercent);

        System.out.println(" ");
        System.out.println(" ");

        System.out.println("Government occured " + governmentCounter + " times.");
        double governmentPercent = (new Double(governmentCounter)/new Double(wordCount))*100; //calculate the the percentage of how many times it occurs
        System.out.format("Government Occurance: %f", governmentPercent);

        System.out.println(" ");
        System.out.println(" ");

        System.out.println("United occured " + unitedCounter + " times.");
        double unitedPercent = (new Double(unitedCounter)/new Double(wordCount))*100; //calculate the the percentage of how many times it occurs
        System.out.format("United Occurance: %f", unitedPercent);

        System.out.println(" ");
        System.out.println(" ");

        System.out.println("Our occured " + ourCounter + " times.");
        double ourPercent = (new Double(ourCounter)/new Double(wordCount))*100; //calculate the the percentage of how many times it occurs
        System.out.format("Our Occurance: %f", ourPercent);

    }
}
