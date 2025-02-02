import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class Gruppeoppmoete {
    private String[] navn = new String[14];
    private boolean[] oppmoete = new boolean[14];

    public Gruppeoppmoete(String fileName){
        
        try{Scanner file = new Scanner(new File(fileName));
        


        for (int i = 0;i<14;i++){
            String line = file.nextLine();
            navn[i] = line.trim();
        }

        file.close();

        } catch (FileNotFoundException e){
            System.out.println("File not Found");
            System.exit(1);
        }
    }

    public void printInfo(){
        for (int i = 0; i<14; i++){
            if (oppmoete[i]){
                System.out.println(navn[i]+" was present");
            } else{
                System.out.println(navn[i] +" was absent.");
            }
        }
    }

    public void register(){
        int i = 0;
        Scanner user = new Scanner(System.in);
        while (i< 14){

            System.out.println("Did "+navn[i]+ " show up? [y/n]");

            String input = user.nextLine().toLowerCase();

            if (input.equals("y")){
                oppmoete[i] = true;
                i++;
            } else if (input.equals("n")){
                oppmoete[i] = false;
                i++;
            } else{
                System.out.println("Invalid Input");
            }
        }
        user.close();
    }
}
