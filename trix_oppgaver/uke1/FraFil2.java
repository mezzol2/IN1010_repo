import java.util.Scanner;
import java.io.File;

class FraFil2{
    public static void main(String[] args) throws Exception{
        Scanner fil = new Scanner(new File("tekst.txt"));
         
        while(fil.hasNextLine()){
            String line = fil.nextLine();
            System.out.println(line);
        }
        fil.close();
    }
}