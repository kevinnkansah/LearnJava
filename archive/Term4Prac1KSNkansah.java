import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class COS101Term4Prac1Memo {
    static char [] maxBBT = new char[7];
    static char [] minBBT = new char[7];
    static char [] midBBT = new char[7];

    public static String readTextFile(String filename){
        String data = null;
        try {
            File myObj = new File(filename);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                data = myReader.nextLine();
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return data;
    }

    public static void getMin_Max_Occurance(String str, int counter){
        int[] freq = new int[str.length()];
        char minChar = str.charAt(0), maxChar = str.charAt(0), midChar = str.charAt(0);
        int i, j, min, max;

        //Converts given string into character array
        char string[] = str.toCharArray();

        //Count each word in given string and store in array freq
        for(i = 0; i < string.length; i++) {
            freq[i] = 1;
            for(j = i+1; j < string.length; j++) {
                if(string[i] == string[j] && string[i] != ' ' && string[i] != '0') {
                    freq[i]++;

                    //Set string[j] to 0 to avoid printing visited character
                    string[j] = '0';
                }
            }
        }

        //Determine minimum and maximum occurring characters
        min = max = freq[0];
        for(i = 0; i <freq.length; i++) {

            //If min is greater than frequency of a character
            //then, store frequency in min and corresponding character in minChar
            if(min > freq[i] && freq[i] != '0') {
                min = freq[i];
                //System.out.println[("this is what is found in freq "+freq[i]);
                minChar = string[i];
            }
            //If max is less than frequency of a character
            //then, store frequency in max and corresponding character in maxChar
            if(max < freq[i]) {
                max = freq[i];
                maxChar = string[i];
            }
            if (i==5){
                midChar = string[i];
            }
        }
        maxBBT[counter] = maxChar;
        minBBT[counter] = minChar;
        midBBT[counter] = midChar;
    }

    public static void main(String[] args) throws Exception
    {
        int counter = 0;
        String bbtMaxCharacter, bbtMinCharacter, bbtMidCharacter;
        while(counter < 7){
            String retrievedString = readTextFile("cipher"+(counter+1)+".txt");
            getMin_Max_Occurance(retrievedString, counter);
            counter++;
        }
        bbtMaxCharacter = new String(maxBBT);
        bbtMinCharacter = new String(minBBT);
        bbtMidCharacter = new String(midBBT);

        StringBuilder reverseTurnAround = new StringBuilder();
        reverseTurnAround.append(bbtMidCharacter);
        reverseTurnAround.reverse();

        System.out.println("Big Bang Theory Character 1: "+bbtMaxCharacter +" hofstadter. Marries Penney.");
        System.out.println("Big Bang Theory Character 2: "+bbtMinCharacter +" cooper. His favourite number is 73.");
        System.out.println("Big Bang Theory Character 3: "+reverseTurnAround+" hofstadter. Leonard's mom.");
    }
}