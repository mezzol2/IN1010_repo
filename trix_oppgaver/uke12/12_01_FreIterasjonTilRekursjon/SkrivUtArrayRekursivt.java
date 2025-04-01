public class SkrivUtArrayRekursivt {
    public static void main(String[] args) {
        String[] strenger = {"IN1010", "er", "verdens", "beste", "fag!"};
        
        callMe(strenger, 0);
    }

    public static void callMe(String[] strenger, int i){

        System.out.print(strenger[i]+" ");

        i++;
        if( i < strenger.length){
            callMe(strenger, i);
        }
    }
}