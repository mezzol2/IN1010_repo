import java.util.Scanner;
import java.io.File;

class TemperaturLeser{
    public static void main(String[] args) 
    throws Exception
    {
        String[] myArray = new String[12];
        Scanner file = new Scanner(new File("Temperatur.txt"));

        int i = 0;
        while (file.hasNextLine()){
            String line = file.nextLine();
            myArray[i] = line;
            i++;
        }

        file.close();

        for (i = 0; i<myArray.length; i++){
            System.out.println(myArray[i]);
        }

    }
}