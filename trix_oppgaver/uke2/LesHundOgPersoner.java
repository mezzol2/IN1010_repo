import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

class LesHundOgPersoner {
    public static void main(String[] args){
        try {
            Scanner file = new Scanner(new File("navn.txt"));
            ArrayList<Person> personer = new ArrayList<Person>();
            ArrayList<Hund> hunder = new ArrayList<Hund>();

            while (file.hasNextLine()){
                String line = file.nextLine();
                String[] splitLine = line.split(" ");
                if (splitLine[0].equals("H")){
                    Hund nyHund = new Hund(splitLine[1]);
                    hunder.add(nyHund);
                } else if (splitLine[0].equals("P")){
                    String name = "";
                    for (int i = 1; i < splitLine.length; i++){
                        name += splitLine[i];
                        if (i + 1 != splitLine.length){
                            name += " ";
                        }
                    }
                    Person nyPerson = new Person(name);
                    personer.add(nyPerson);
                    
                }
            }

            System.out.println("The people:");
            for (Person p : personer){
                System.err.println(p.getNavn());
            }

            System.out.println();
            System.out.println("Release the Hounds!");
            for (Hund h : hunder){
                System.out.println(h.getNavn());
            }


            file.close();
        } catch (Exception e){
            System.out.println("We done fucked up, sir.");
            System.exit(1);
        }
    }
}
