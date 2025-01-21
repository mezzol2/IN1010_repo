import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class FraFil{
    public static void main(String[] args) {
        try{
            File text = new File("tekst.txt");
            Scanner fileReader = new Scanner(text);
            while (fileReader.hasNextLine()){
                String line = fileReader.nextLine();
                System.out.println(line);
            }    
            fileReader.close();
        } catch (FileNotFoundException e){
            System.out.println("An error has occurred.");
        }
    }
}