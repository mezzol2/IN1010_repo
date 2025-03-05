import java.util.Iterator;

class Main {
    public static void main(String[] args) {
        EnkelArrayListe strings = new EnkelArrayListe(4);

        strings.leggTil("HI");
        strings.leggTil("THERE");
        strings.leggTil("whats");
        strings.leggTil("happening");
        //strings.leggTil("UH OH");

        Iterator<String> iterator = strings.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        
    }
}
