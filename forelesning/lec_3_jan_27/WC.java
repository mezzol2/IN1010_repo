import java.util.Scanner;
import java.io.File;

class WC {
    public static void main(String[] args){
        if (args.length != 1){
            System.out.println("Bruk: java WC fil");
            System.exit(1);
        }
        //System.out.println("Arg: " + args[0]);

        try {Scanner fil = new Scanner(new File(args[0]));
            lesFil(fil);
            fil.close();
        } catch (Exception e){
            System.out.println("Kan ikke lese "+ args[0]);
            System.out.println("You did a stupid :P");
            System.exit(1);
        }

    }

    private static void lesFil (Scanner s){
        int antLinjer = 0,antTegn = 0, antOrd = 0;
        boolean erIOrd = false;
        while (s.hasNextLine()){
            String linje = s.nextLine();
            System.out.println(linje);
            antLinjer++; antTegn += linje.length();
            // antOrd += linje.split(" ").length;
            erIOrd = false;
            for (int i = 0; i< linje.length(); ++i){
                char c = linje.charAt(i);
                if (Character.isWhitespace(c)){
                    erIOrd = false;
                } else {
                    if (! erIOrd) {++antOrd;}
                    erIOrd = true;
                }
            }
        }
        System.out.println(antLinjer + " linjer," + antTegn + " tegn," + antOrd + "ord");
    }
}