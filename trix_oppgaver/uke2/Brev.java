import java.util.ArrayList;

class Brev{
    private String avsender;
    private String mottaker;
    private ArrayList<String> linjer = new ArrayList<String>();

    public Brev(String a, String m){
        avsender = a;
        mottaker = m;
    }

    public void skrivLinje(String linje){
        linjer.add(linje);
    }

    public void lesBrev(){
        System.out.println("Hei, "+mottaker+"\n");
        for (String linje : linjer){
            System.out.println(linje);
        }
        System.out.println("\nHilsen fra,");
        System.out.println(avsender);
    }
}