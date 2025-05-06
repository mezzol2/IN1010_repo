import java.util.Scanner;

class Utskrift{
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        String input = user.nextLine();
        utskrift(input);
        printNume(100,50);

        user.close();
    }

    public static void utskrift(String tekst){
        System.out.println(tekst);
    }

    public static void printNume(int n, int n2){
        System.out.println(n+n2);
    }
    
}