import java.util.Scanner;

public class MindreStorre {
    public static void main(String[] args) {
        System.out.println("Tast inn et tall:");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        input.close();

        if (x < 10){
            System.out.println("Tallet er under 10.");
        } else if (x <= 20) {
            System.out.println("Tallet er mellom 10 og 20 (inklusiv).");
        } else{
            System.out.println("Tallet er over 20.");
        }
    }
}