import java.util.Scanner;
import java.util.ArrayList;

class Main{
    public static void main(String[] args){
        // Buss b = new Buss("1", "Ford", "John", 20);
        // b.printInfo();

        // System.out.println();

        // Car c = new Car("2", "Volvo", "Rick", 5);
        // c.printInfo();

        // System.out.println();

        // Truck t = new Truck("3", "GM", "Sarah", 1000);
        // t.printInfo();

        boolean cont = true;
        Scanner user = new Scanner(System.in);
        String input;
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        String regNum;
        String brand;
        String owner;
        //otherNum can be either seating capacity or load capacity
        int otherNum;


        while (cont){
            System.out.println("New Vehicle? [y/n]");
            input = user.nextLine().toLowerCase();

            if (input.equals("y")){

                Boolean checkInput = true;
                while (checkInput){
                    System.out.println("Bus, car, or truck?");
                    input = user.nextLine().toLowerCase();

                    //bus
                    if (input.equals("bus")){
                        System.out.println("What is the reigistration number?");
                        regNum = user.nextLine();
                        System.out.println("Brand?");
                        brand = user.nextLine();
                        System.out.println("Owner?");
                        owner = user.nextLine();
                        //ensure the user input an integer for the seating capacity
                        while (checkInput) {
                            System.out.println("Seating capacity?");
                            input = user.nextLine();
                            
                            try {
                                otherNum = Integer.parseInt(input);
                                checkInput = false;
                                Buss b = new Buss(regNum, brand, owner, otherNum);
                                vehicles.add(b);
                            } catch (Exception e) {
                                System.out.println("Enter an integer.");
                            }

                        }
                        
                    } else if (input.equals("car")){
                        System.out.println("What is the reigistration number?");
                        regNum = user.nextLine();
                        System.out.println("Brand?");
                        brand = user.nextLine();
                        System.out.println("Owner?");
                        owner = user.nextLine();
                        //ensure the user input an integer for the seating capacity
                        while (checkInput) {
                            System.out.println("Seating capacity?");
                            input = user.nextLine();
                            
                            try {
                                otherNum = Integer.parseInt(input);
                                checkInput = false;
                                Car c = new Car(regNum, brand, owner, otherNum);
                                vehicles.add(c);
                            } catch (Exception e) {
                                System.out.println("Enter an integer.");
                            }

                        }
                        
                    } else if (input.equals("truck")){
                        System.out.println("What is the reigistration number?");
                        regNum = user.nextLine();
                        System.out.println("Brand?");
                        brand = user.nextLine();
                        System.out.println("Owner?");
                        owner = user.nextLine();
                        //ensure the user input an integer for the seating capacity
                        while (checkInput) {
                            System.out.println("Load capacity?");
                            input = user.nextLine();
                            
                            try {
                                otherNum = Integer.parseInt(input);
                                checkInput = false;
                                Truck t = new Truck(regNum, brand, owner, otherNum);
                                vehicles.add(t);
                            } catch (Exception e) {
                                System.out.println("Enter an integer.");
                            }

                        }
                        
                    } else {
                        System.out.println("Invalid Vehicle type");
                    }
                }
                



            } else if (input.equals("n")){
                cont = false;
            } else {
                System.out.println("Invalid Input");
            }
        }

        for (Vehicle v : vehicles){
            System.out.println();
            v.printInfo();
        }

        System.out.println("Whose fees to check?");
        input = user.nextLine();
        int fees = 0;


        for (Vehicle v : vehicles){
            if (v.getOwner().equals(input)){
                fees += v.getFee();
            }
        }
        System.out.println(input +" must pay "+fees);
       
            
        user.close();
    }
}