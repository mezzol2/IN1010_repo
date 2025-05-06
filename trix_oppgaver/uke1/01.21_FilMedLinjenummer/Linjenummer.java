import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class Linjenummer{
    public static void main(String[] args){
        Scanner file = null;
        try{
            file = new Scanner(new File("text.txt"));
        } catch (FileNotFoundException e){
            System.out.println("File not found");
            System.exit(1);
        }

        while (file.hasNextLine()){
            System.out.println(file.nextLine());
        }
    }
}