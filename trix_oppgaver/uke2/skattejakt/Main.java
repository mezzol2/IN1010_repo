import java.io.File;
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Skattekart sk = null;
        try { File file = new File(args[0]);
            
            sk = Skattekart.lesInn(file);


        } catch (Exception e) {
            System.out.println("File not found.");
            System.exit(1);
        }

        sk.skrivUt();
        System.out.println();
        System.out.println("Find the treasure! Guess the coordiantes (column row) (q to Quit)");

        boolean found = false;

        Scanner user = new Scanner(System.in);

        while (!found){

            String input = user.nextLine();

            try{
                String[] inputSplit = input.split(" ");
                int x = Integer.parseInt(inputSplit[0]);
                int y = Integer.parseInt(inputSplit[1]);

                if (sk.sjekk(x, y)){
                    found = true;
                    System.out.println("You found the treasure!");
                    sk.skrivUt();
                } else{
                    System.out.println("No treausure there!");
                    sk.skrivUt();
                }
            } catch (Exception e){
                System.out.println("Invalid Coordinates");
            }

        }
        user.close();

    }

}