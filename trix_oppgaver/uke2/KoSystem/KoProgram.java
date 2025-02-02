import java.util.Scanner;

class KoProgram{
    public static void main(String[] args) {
        boolean cont = true;
        Scanner user = new Scanner(System.in);
        KoSystem koSystem = new KoSystem();


        while (cont){
            printMenu();
            int input = Integer.parseInt(user.nextLine());

            if (input ==1){
                koSystem.trekkKoLapp();
            } else if (input == 2){
                koSystem.betjenKunde();
            } else if (input ==3){
                System.out.println("There are "+koSystem.antKunder()+" people waiting.");
                System.out.println();
            } else if (input == 4){
                koSystem.printKunderIKo();
            } else if (input == 5){
                System.out.println("Program terminated");
                cont = false;
            } else{
                System.out.print("Invalid input\n\n");

            }
        }

        user.close();
    }

    public static void printMenu(){
        System.out.println("**OPTIONS MENU**");
        System.out.println("1 - New Ticket");
        System.out.println("2 - Servce customer");
        System.out.println("3 - Number of people waiting");
        System.out.println("4 - People in queue");
        System.out.println("5 - Quit");
        System.out.println();
    }
}