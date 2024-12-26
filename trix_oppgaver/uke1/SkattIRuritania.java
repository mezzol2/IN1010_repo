import java.util.Scanner;

class SkattIRuritania {
    public static void main(String[] args) {
        Scanner Inp = new Scanner(System.in);
        System.out.println("Skriv inntekt: ");
        double Inntekt = Inp.nextDouble();
        Inp.close();
        double Skatt;

        if (Inntekt < 10000) {
            Skatt = Inntekt * .1;
        }
        else {
            Skatt = 1000 + (Inntekt - 10000) * .3;
        }
        
        System.out.println("Du må betale " + Skatt + " i skatt.");
    }
}