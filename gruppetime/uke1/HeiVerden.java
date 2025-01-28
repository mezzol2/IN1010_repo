import java.util.Scanner;

class HeiVerden{
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Hei! Hva heter du?");
        String input = inputScanner.nextLine();
        System.out.println("Hei "+input+"!  Velkommen til IN1010.");

        inputScanner.close();
    }
}