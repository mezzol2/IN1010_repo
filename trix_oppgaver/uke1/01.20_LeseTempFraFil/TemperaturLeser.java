import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class TemperaturLeser{
    public static void main(String[] args){
        String[] temps = new String[12];
        Scanner file = null;
        
        try{
            file = new Scanner(new File("Temp.txt"));
        } catch (FileNotFoundException e){
            System.out.println("File not Found");
            System.exit(1);
        }

        int i = 0;
        while(file.hasNextLine()){
            String line = file.nextLine();
            temps[i] = line;
            i++;
        }

        for (String temp : temps){
            System.out.println(temp);
        }
    }
}