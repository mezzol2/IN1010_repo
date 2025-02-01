import java.util.HashMap;
import java.util.Scanner;

class Telefonbok{
    public static void main(String[] args){
        //a
        HashMap<String,String> telephonebook = new HashMap<String,String>();

        //b
        telephonebook.put("Arne", "22334455");
        telephonebook.put("Lisa","95959595");
        telephonebook.put("Jonas", "97959795");
        telephonebook.put("Peder", "123456678");

        //c
        Scanner user = new Scanner(System.in);
        Boolean cont = true;

        while (cont) {
            System.out.println("Whose number would you like to check?");
            String input = user.nextLine();

            if (telephonebook.containsKey(input)){
                System.out.println(telephonebook.get(input));
            } else{
                System.out.println(input +" was not found in the telephone book.");
            }
            
            Boolean invalidInput = true;
            while(invalidInput){
                System.out.println("Would you like to check another? [y/n]");
                input = user.nextLine().toLowerCase();
                
                if (input.equals("y")){
                    invalidInput = false;
                } else if (input.equals("n")){
                    cont = false;
                    invalidInput = false;
                } else{
                    System.out.println("That input is invalid.");
                }
            }
        }
            
        user.close();

        //d
        for (String name: telephonebook.keySet()){
            System.out.println(name +": "+telephonebook.get(name));
        }
        
    }
}