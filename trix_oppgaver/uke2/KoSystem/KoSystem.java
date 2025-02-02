import java.util.ArrayList;

public class KoSystem{

    private ArrayList<KoLapp> koLapper = new ArrayList<KoLapp>();
    private int lappNum = 1;

    //Lager et nytt objekt av KoLapp, printer ut informasjon om den og legger den til i listen over koLapper.     
    public void trekkKoLapp(){
        KoLapp lapp = new KoLapp(lappNum);
        koLapper.add(lapp);
        System.out.println("New ticket number: "+lappNum);
        System.out.println("People before you:" +koLapper.indexOf(lapp));
        System.out.println();
        lappNum++;
    }

    //Henter ut, printer ut informasjon og fjerner den forste kolappen i lista. Gir feilmelding dersom ingen kunder staar i ko.
    public void betjenKunde(){
        if (koLapper.size() == 0){
            System.out.println("There are no customers in the queue.");
        } else{
            KoLapp nextLapp = koLapper.removeFirst();
            System.out.println("Now serving ticket number: "+nextLapp.hentNummer());
            System.out.println();
        }
    }

    //Returnerer antall kunder som er i ko.
    public int antKunder(){
        return koLapper.size();
    }

    //Printer alle kunder i ko
    public void printKunderIKo(){
        System.out.println("Currently waiting:");
        for (KoLapp k : koLapper){
            System.out.print(k.hentNummer()+" ");
        }
        System.out.println();
    }

}