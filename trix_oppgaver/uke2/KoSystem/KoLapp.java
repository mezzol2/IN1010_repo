public class KoLapp{

    private int lappNum;

    //Konstruktor
    public KoLapp(int nummer){
        lappNum = nummer;
    }

    //Returnerer et tildelt nummer paa kolappen.    
    public int hentNummer(){
        return lappNum;
    }
}