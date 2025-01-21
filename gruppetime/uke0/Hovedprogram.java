import java.util.Scanner;

class Hovedprogram{
    public static void main (String[] args){
        System.out.println("Velkommen til IN1010");

        int tall1 = 12;
        int tall2 = -123;
        double tall3 = 4.5;
        char chr = 'a';
        boolean val = false;
        String str1 = "Hei!";

        if (tall1 > tall2) {
            System.out.println("Tallet " + tall1 + " er større enn tallet " + tall2);
        } else if (tall1 < tall2){
            System.out.println("Tallet " + tall1 + " er mindre enn tallet " + tall2);
        } else {
            System.out.println("Begge er like store.");
        }

        //for loop
        for (int i = 0; i < 10; i+=3){
            System.out.println(i);
        }

        //while loop
        int teller = 0;
        while (teller < 10){
            System.out.println(teller);
            teller ++;
        }

        System.out.println("The 'teller' number is " + teller);

        //make new scanner object and get input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hva heter du?");
        String input = scanner.nextLine();

        scanner.close();

        System.out.println("Hei, " + input);
    }
}