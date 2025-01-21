import java.util.Scanner;

class Handletur{
    public static void main(String[] args) {
        int total;
        int broed = 20;
        int melk = 15;
        int ost = 40;
        int youghurt = 12;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Hei! Velkommen til IFI-butikken");
        System.out.println("Hvor mange brød vil du ha?");
        total = broed * input.nextInt();
        System.out.println("Hvor mange melk vil du ha?");
        total += melk * input.nextInt();
        System.out.println("Hvor mange ost vil du ha?");
        total += ost * input.nextInt();
        System.out.println("Hvor mange youghurt vil du ha?");
        total += youghurt * input.nextInt();

        input.close();

        System.out.println("Du skal betale: "+total+" kr.");
    }
}