//import java.util.ArrayList;

class TestOrdbeholder{
    public static void main(String[] args){
        
        Ordbeholder words = new Ordbeholder();

        //Test pop with an empty list
        if (words.pop()==null){
            System.out.println("Success!");
        } else{
            System.out.println("Uh oh, there's a problem!");
        }

        if (words.settInn("First!") == true){
            System.out.println("Success 2!");
        } else{
            System.out.println("Quit being a dumbass");
        }

        words.settInn("test");
        if (words.settInn("test")==false){
            System.out.println("Success 3!");
        } else{
            System.out.println("Oh my god, quit being an absolute tool!");
        }

        words.settInn("another one");
        words.settInn("memes are my pride and joy");
        if (words.antallOrd()==4){
            System.out.println("Success 4!");
        } else {
            System.out.println("FAILURE");
        }

        if (words.pop().equals("memes are my pride and joy")){
            System.out.println("Success 5!");
        } else{
            System.out.println("oh no");
        }

        if (words.antallOrd()==3){
            System.out.println("Success 6!");
        } else {
            System.out.println("fuck");
        }
    }
}