import java.util.Scanner;
import java.io.File;

class Skattekart{
    private char[][] map;
    private int height;
    private int width;
    private boolean found = false;

    Skattekart(int h, int w, char[][] m){
        height = h;
        width = w;
        map = m;
    }

    public static Skattekart lesInn(File f){
        try {Scanner file = new Scanner(f);

            String line = file.nextLine();
            String[] lineSplit = line.split(" ");
            int rows = Integer.parseInt(lineSplit[0]);
            int col = Integer.parseInt(lineSplit[1]);
            
            char[][] map = new char[rows][col];

            for (int i =0; i < rows; i++){
                line = file.nextLine();
                
                for (int j = 0;j < col;j++){
                    map[i][j] = line.charAt(j);
                }
            }
            
            file.close();
            Skattekart skattekart = new Skattekart(rows, col, map);

            return skattekart;

        } catch (Exception e){
            System.out.println("File not found");
            return null;
        }
    }

    public void skrivUt(){
        System.out.println();
        if (found){
            for (int i =0; i< height; i++){

                for (int j=0; j< width;j++){
                    System.out.print(map[i][j]);
                }
                System.out.println();
            }
        } else{
            for (int i =0; i< height; i++){

                for (int j=0; j< width;j++){
                    System.out.print("X");
                }
                System.out.println();
            }
        }
    }

    public boolean sjekk(int rad, int kol){
        if (map[rad][kol] == 'X'){
            found = true;
            return found;
        } else{
            return found;
        }
    }
}